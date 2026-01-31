const express = require('express');
const router = express.Router();
const db = require('../config/database');
const authMiddleware = require('../middleware/auth');

// Apply auth middleware to all admin routes
router.use(authMiddleware);

// ========== CATEGORY MANAGEMENT ==========

// Create category
router.post('/categories', async (req, res) => {
    try {
        const { id, name, description, icon, colorHex } = req.body;
        
        const [result] = await db.query(
            'INSERT INTO categories (id, name, description, icon, color_hex) VALUES (?, ?, ?, ?, ?)',
            [id, name, description, icon || '', colorHex || '#6200EE']
        );
        
        res.status(201).json({
            id,
            name,
            description,
            icon: icon || '',
            colorHex: colorHex || '#6200EE',
            questionCount: 0
        });
    } catch (error) {
        console.error('Error creating category:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

// Update category
router.put('/categories/:id', async (req, res) => {
    try {
        const { name, description, icon, colorHex } = req.body;
        
        const [result] = await db.query(
            'UPDATE categories SET name = ?, description = ?, icon = ?, color_hex = ? WHERE id = ?',
            [name, description, icon || '', colorHex || '#6200EE', req.params.id]
        );
        
        if (result.affectedRows === 0) {
            return res.status(404).json({ 
                error: 'Not found',
                message: 'Category not found'
            });
        }
        
        res.json({
            id: req.params.id,
            name,
            description,
            icon: icon || '',
            colorHex: colorHex || '#6200EE'
        });
    } catch (error) {
        console.error('Error updating category:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

// Delete category
router.delete('/categories/:id', async (req, res) => {
    try {
        // Delete associated questions first
        await db.query('DELETE FROM questions WHERE category_id = ?', [req.params.id]);
        
        // Delete category
        const [result] = await db.query('DELETE FROM categories WHERE id = ?', [req.params.id]);
        
        if (result.affectedRows === 0) {
            return res.status(404).json({ 
                error: 'Not found',
                message: 'Category not found'
            });
        }
        
        res.json({ 
            success: true,
            message: 'Category deleted successfully'
        });
    } catch (error) {
        console.error('Error deleting category:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

// ========== QUESTION MANAGEMENT ==========

// Create question
router.post('/questions', async (req, res) => {
    try {
        const { 
            id,
            category_id: categoryId,
            question_text: questionText,
            question_type: questionType,
            options,
            correct_answer: correctAnswer,
            explanation,
            difficulty,
            time_limit: timeLimit,
            points
        } = req.body;
        
        const optionsJson = JSON.stringify(options || []);
        
        const [result] = await db.query(`
            INSERT INTO questions 
            (id, category_id, question_text, question_type, options, correct_answer, 
             explanation, difficulty, time_limit, points)
            VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)
        `, [
            id, categoryId, questionText, questionType, optionsJson,
            correctAnswer, explanation || '', difficulty || 'MEDIUM',
            timeLimit || 30, points || 10
        ]);
        
        res.status(201).json({
            id,
            categoryId,
            questionText,
            questionType,
            options: options || [],
            correctAnswer,
            explanation: explanation || '',
            difficulty: difficulty || 'MEDIUM',
            timeLimit: timeLimit || 30,
            points: points || 10
        });
    } catch (error) {
        console.error('Error creating question:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

// Update question
router.put('/questions/:id', async (req, res) => {
    try {
        const { 
            question_text: questionText,
            question_type: questionType,
            options,
            correct_answer: correctAnswer,
            explanation,
            difficulty,
            time_limit: timeLimit,
            points
        } = req.body;
        
        let optionsArray = options;
        if (typeof options === 'string') {
            optionsArray = options.split('\n').filter(opt => opt.trim() !== '');
        }
        const optionsJson = JSON.stringify(optionsArray || []);
        
        const [result] = await db.query(`
            UPDATE questions 
            SET question_text = ?, question_type = ?, options = ?, 
                correct_answer = ?, explanation = ?, difficulty = ?,
                time_limit = ?, points = ?
            WHERE id = ?
        `, [
            questionText, questionType, optionsJson, correctAnswer,
            explanation || '', difficulty || 'MEDIUM', 
            timeLimit || 30, points || 10, req.params.id
        ]);
        
        if (result.affectedRows === 0) {
            return res.status(404).json({ 
                error: 'Not found',
                message: 'Question not found'
            });
        }
        
        res.json({
            id: req.params.id,
            questionText,
            questionType,
            options: optionsArray || [],
            correctAnswer,
            explanation: explanation || '',
            difficulty: difficulty || 'MEDIUM',
            timeLimit: timeLimit || 30,
            points: points || 10
        });
    } catch (error) {
        console.error('Error updating question:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

// Delete question
router.delete('/questions/:id', async (req, res) => {
    try {
        const [result] = await db.query('DELETE FROM questions WHERE id = ?', [req.params.id]);
        
        if (result.affectedRows === 0) {
            return res.status(404).json({ 
                error: 'Not found',
                message: 'Question not found'
            });
        }
        
        res.json({ 
            success: true,
            message: 'Question deleted successfully'
        });
    } catch (error) {
        console.error('Error deleting question:', error);
        res.status(500).json({ 
            error: 'Server error',
            message: error.message
        });
    }
});

module.exports = router;