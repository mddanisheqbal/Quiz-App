package com.example.quizapp.data

import com.example.quizapp.data.model.Achievement

val allAchievements = listOf(
    // 🎯 QUIZ PROGRESSION (TIERED)
    Achievement("quiz_1", "Getting Started", "Complete your first quiz", "🎯", "quiz", 20, 10, 1),
    Achievement("quiz_10", "Learner", "Complete 10 quizzes", "📚", "quiz", 60, 30, 10),
    Achievement("quiz_30", "Regular Player", "Complete 30 quizzes", "🎓", "quiz", 150, 75, 30),
    Achievement("quiz_75", "Quiz Expert", "Complete 75 quizzes", "🏆", "quiz", 400, 200, 75),

    // 🔥 STREAK
    Achievement("streak_3", "Consistency", "3 day streak", "🔥", "streak", 30, 15, 3),
    Achievement("streak_7", "On Fire", "7 day streak", "🔥", "streak", 100, 50, 7),
    Achievement("streak_14", "Focused", "14 day streak", "⚡", "streak", 250, 125, 14),
    Achievement("streak_30", "Unstoppable", "30 day streak", "🏔️", "streak", 600, 300, 30),

    // 🏆 SKILL (PERFECT SCORES & SPEED)
    Achievement("perfect_1", "Perfect Shot", "100% score in a quiz", "🎯", "skill", 50, 25, 1),
    Achievement("perfect_5", "Sharp Mind", "5 perfect quizzes", "🏆", "skill", 150, 75, 5),
    Achievement("perfect_20", "Precision Master", "20 perfect quizzes", "🥇", "skill", 400, 200, 20),

    Achievement("speed_1", "Quick Thinker", "Finish quiz under 60 sec", "⚡", "skill", 50, 25, 1),
    Achievement("speed_5", "Fast Solver", "5 speed completions", "🚀", "skill", 150, 75, 5),
    Achievement("speed_20", "Speed Master", "20 speed completions", "🛰️", "skill", 400, 200, 20),

    // 💰 ECONOMY
    Achievement("coins_100", "Starter Saver", "Earn 100 coins", "💰", "economy", 30, 10, 100),
    Achievement("coins_1000", "Smart Earner", "Earn 1000 coins", "💎", "economy", 150, 75, 1000),
    Achievement("coins_5000", "Wealth Builder", "Earn 5000 coins", "🏦", "economy", 400, 200, 5000),

    // ⭐ LEVEL
    Achievement("level_3", "Rising Star", "Reach Level 3", "⭐", "progress", 80, 40, 3),
    Achievement("level_5", "Skilled Player", "Reach Level 5", "🎖️", "progress", 150, 75, 5),
    Achievement("level_10", "Master Player", "Reach Level 10", "👑", "progress", 400, 200, 10)
)
