const express = require('express');
const router = express.Router();
const db = require('../config/database');

// A robust function to parse the options field, which might be in various formats.
const parseOptions = (optionsData, questionId) => {
    // 1. If it's already a valid array, we're done.
    if (Array.isArray(optionsData)) {
        return optionsData;
    }

    // 2. If it's not a string or is an empty string, return an empty array.
    if (typeof optionsData !== 'string' || optionsData.trim() === '') {
        return [];
    }

    const optionsString = optionsData.trim();

    try {
        // 3. Assume it's a valid JSON string. This is the most likely format for new questions.
        const parsed = JSON.parse(optionsString);
        if (Array.isArray(parsed)) return parsed;
    } catch (e) {
        // Not valid JSON, so we continue to other methods.
    }

    try {
        // 4. Handle JSON-like strings with single quotes, e.g., "['a','b']"
        const validJsonString = optionsString.replace(/'/g, '"');
        const parsed = JSON.parse(validJsonString);
        if (Array.isArray(parsed)) return parsed;
    } catch (e) {
        // Still not parsable, move on.
    }
    
    // 5. Handle malformed array strings like "[ 'a', 'b' ]" by manually parsing.
    if (optionsString.startsWith('[') && optionsString.endsWith(']')) {
        const inner = optionsString.substring(1, optionsString.length - 1);
        return inner.split(',')
            .map(item => {
                const trimmed = item.trim();
                // Remove surrounding single or double quotes
                if ((trimmed.startsWith("'") && trimmed.endsWith("'")) || (trimmed.startsWith('"') && trimmed.endsWith('"'))) {
                    return trimmed.substring(1, trimmed.length - 1);
                }
                return trimmed;
            })
            .filter(item => item); // filter out any empty strings from parsing
    }

    // 6. Finally, fall back to splitting by newline for very old formats.
    console.warn(`Could not parse options for question ID ${questionId}. Falling back to newline split.`);
    return optionsString.split('\n').filter(opt => opt.trim() !== '');
};


// Get questions by category
router.get('/category/:categoryId', async (req, res) => {
    try {
        const [questions] = await db.query(
            'SELECT * FROM questions WHERE category_id = ? ORDER BY RAND()',
            [req.params.categoryId]
        );

        // Safely parse the options for each question.
        const parsedQuestions = questions.map(q => ({
            ...q,
            options: parseOptions(q.options, q.id)
        }));

        res.json(parsedQuestions);
    } catch (error) {
        console.error('Error fetching questions:', error);
        res.status(500).json({
            error: 'Server error',
            message: error.message
        });
    }
});

// Get single question
router.get('/:id', async (req, res) => {
    try {
        const [questions] = await db.query(
            'SELECT * FROM questions WHERE id = ?',
            [req.params.id]
        );

        if (questions.length === 0) {
            return res.status(404).json({
                error: 'Not found',
                message: 'Question not found'
            });
        }

        const question = questions[0];
        // Safely parse the options for the single question.
        question.options = parseOptions(question.options, question.id);

        res.json(question);
    } catch (error) {
        console.error('Error fetching question:', error);
        res.status(500).json({
            error: 'Server error',
            message: error.message
        });
    }
});

module.exports = router;