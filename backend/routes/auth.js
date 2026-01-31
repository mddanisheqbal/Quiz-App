const express = require('express');
const router = express.Router();
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
const db = require('../config/database'); // Corrected path
const { v4: uuidv4 } = require('uuid');

// --- User Sign-Up ---
router.post('/signup', async (req, res) => {
    try {
        const { email, password, displayName } = req.body;

        if (!email || !password || !displayName) {
            return res.status(400).json({ message: 'Please provide email, password, and display name.' });
        }

        // 1. Check if user already exists
        const [existingUsers] = await db.query('SELECT * FROM users WHERE email = ?', [email]);
        if (existingUsers.length > 0) {
            return res.status(409).json({ message: 'User with this email already exists.' });
        }

        // 2. Hash the password
        const salt = await bcrypt.genSalt(10);
        const hashedPassword = await bcrypt.hash(password, salt);

        // 3. Create the new user in your database
        const newUser = {
            id: uuidv4(),
            email,
            password: hashedPassword,
            display_name: displayName,
            is_admin: false
        };

        await db.query('INSERT INTO users SET ?', newUser);

        res.status(201).json({
            success: true,
            message: 'User created successfully',
            userId: newUser.id
        });

    } catch (error) {
        console.error('Sign-up error:', error);
        res.status(500).json({
            error: 'Server error',
            message: error.message
        });
    }
});

// --- User Sign-In ---
router.post('/signin', async (req, res) => {
    try {
        const { email, password } = req.body;

        if (!email || !password) {
            return res.status(400).json({ message: 'Please provide email and password.' });
        }

        // 1. Find the user by email
        const [users] = await db.query('SELECT * FROM users WHERE email = ?', [email]);
        if (users.length === 0) {
            return res.status(401).json({ message: 'Invalid credentials.' });
        }

        const user = users[0];

        // 2. Compare the hashed password
        const isMatch = await bcrypt.compare(password, user.password);
        if (!isMatch) {
            return res.status(401).json({ message: 'Invalid credentials.' });
        }

        // If credentials are valid, create a JWT token
        const token = jwt.sign(
            { userId: user.id, email: user.email, isAdmin: user.is_admin === 1 },
            process.env.JWT_SECRET || 'your_default_jwt_secret',
            { expiresIn: '24h' }
        );

        res.json({
            success: true,
            message: 'User signed in successfully',
            token: token,
            user: {
                id: user.id,
                email: user.email,
                display_name: user.display_name,
                isAdmin: user.is_admin === 1
            }
        });

    } catch (error) {
        console.error('Sign-in error:', error);
        res.status(500).json({
            error: 'Server error',
            message: error.message
        });
    }
});

// --- Admin Verification ---
router.post('/verify-admin', (req, res) => {
    try {
        const { email, password } = req.body;

        const adminEmail = process.env.ADMIN_EMAIL;
        const adminPassword = process.env.ADMIN_PASSWORD;

        if (email === adminEmail && password === adminPassword) {
            const token = jwt.sign(
                { email: adminEmail, isAdmin: true },
                process.env.JWT_SECRET || 'your_default_jwt_secret',
                { expiresIn: '24h' }
            );

            return res.json({
                success: true,
                message: 'Admin authenticated successfully',
                token: token
            });
        } else {
            return res.status(401).json({ message: 'Invalid admin credentials' });
        }
    } catch (error) {
        console.error('Admin verification error:', error);
        res.status(500).json({
            error: 'Server error',
            message: error.message
        });
    }
});


module.exports = router;
