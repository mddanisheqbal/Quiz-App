const jwt = require('jsonwebtoken');

const authMiddleware = (req, res, next) => {
    try {
        const token = req.headers.authorization?.split(' ')[1]; // Bearer TOKEN
        
        if (!token) {
            return res.status(401).json({ 
                error: 'Authentication required',
                message: 'No token provided'
            });
        }
        
        const decoded = jwt.verify(token, process.env.JWT_SECRET || 'secret');
        req.user = decoded;
        
        // Check if user is admin
        if (!decoded.isAdmin) {
            return res.status(403).json({ 
                error: 'Forbidden',
                message: 'Admin access required'
            });
        }
        
        next();
    } catch (error) {
        return res.status(401).json({ 
            error: 'Invalid token',
            message: error.message
        });
    }
};

module.exports = authMiddleware;