const express = require('express');
const router = express.Router();
const db = require('../config/database');

// Get all categories
router.get('/', async (req, res) => {
    try {
        const [categories] = await db.query(`
            SELECT 
                c.*,
                COUNT(q.id) as questionCount
            FROM categories c
            LEFT JOIN questions q ON c.id = q.category_id
            GROUP BY c.id
            ORDER BY c.name
        `);
        
        res.json(categories);
    } catch (error) {
        console.error('Error fetching categories:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

// Get single category
router.get('/:id', async (req, res) => {
    try {
        const [categories] = await db.query(
            'SELECT * FROM categories WHERE id = ?',
            [req.params.id]
        );
        
        if (categories.length === 0) {
            return res.status(404).json({ 
                error: 'Not found',
                message: 'Category not found'
            });
        }
        
        res.json(categories[0]);
    } catch (error) {
        console.error('Error fetching category:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

module.exports = router;