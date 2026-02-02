package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val CSS_BASICS = "css_basics"
const val CSS_SELECTORS = "css_selectors"
const val CSS_LAYOUT = "css_layout"
const val CSS_ADVANCED = "css_advanced"

/* ===============================
   HELPER FUNCTION
   =============================== */

private fun cssQuestion(
    id: String,
    categoryId: String,
    chapterId: String,
    questionText: String,
    options: List<String>,
    correctAnswer: String,
    explanation: String,
    difficulty: Difficulty,
    createdAt: String,
    questionType: QuestionType = QuestionType.MULTIPLE_CHOICE,
    timeLimit: Int = 30,
    points: Int = 10
): Question {
    return Question(
        id = id,
        categoryId = categoryId,
        chapterId = chapterId,
        questionText = questionText,
        options = options,
        correctAnswer = correctAnswer,
        explanation = explanation,
        difficulty = difficulty,
        questionType = questionType,
        timeLimit = timeLimit,
        points = points,
        createdAt = createdAt
    )
}

/* ===============================
   MAIN ENTRY FUNCTION
   =============================== */

fun getCssQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    /* ---------- CSS BASICS ---------- */
    val basics = listOf(
        cssQuestion(
            id = "css_basics_001",
            categoryId = categoryId,
            chapterId = CSS_BASICS,
            questionText = "What does CSS stand for?",
            options = listOf(
                "Creative Style Sheets",
                "Cascading Style Sheets",
                "Computer Style Sheets",
                "Colorful Style Sheets"
            ),
            correctAnswer = "Cascading Style Sheets",
            explanation = "CSS is used to style HTML documents.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        cssQuestion(
            id = "css_basics_002",
            categoryId = categoryId,
            chapterId = CSS_BASICS,
            questionText = "Which property changes text color?",
            options = listOf("text-color", "color", "font-color", "fgcolor"),
            correctAnswer = "color",
            explanation = "The color property defines text color.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- SELECTORS ---------- */
    val selectors = listOf(
        cssQuestion(
            id = "css_selectors_001",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "How do you select an element with id 'demo'?",
            options = listOf(".demo", "#demo", "demo", "*demo"),
            correctAnswer = "#demo",
            explanation = "# is used for ID selectors.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        cssQuestion(
            id = "css_selectors_002",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "How do you select elements with a class name?",
            options = listOf("#class", ".class", "class", "*class"),
            correctAnswer = ".class",
            explanation = ". is used for class selectors.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- LAYOUT ---------- */
    val layout = listOf(
        cssQuestion(
            id = "css_layout_001",
            categoryId = categoryId,
            chapterId = CSS_LAYOUT,
            questionText = "Which property enables Flexbox?",
            options = listOf(
                "display: flex;",
                "layout: flex;",
                "flex: on;",
                "box: flex;"
            ),
            correctAnswer = "display: flex;",
            explanation = "Flexbox starts with display:flex.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        cssQuestion(
            id = "css_layout_002",
            categoryId = categoryId,
            chapterId = CSS_LAYOUT,
            questionText = "Which property controls stacking order?",
            options = listOf("stack", "z-index", "order", "layer"),
            correctAnswer = "z-index",
            explanation = "z-index controls vertical stacking.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        )
    )

    /* ---------- ADVANCED ---------- */
    val advanced = listOf(
        cssQuestion(
            id = "css_advanced_001",
            categoryId = categoryId,
            chapterId = CSS_ADVANCED,
            questionText = "What does !important do?",
            options = listOf(
                "Deletes a style",
                "Overrides all other rules",
                "Improves performance",
                "Changes priority order"
            ),
            correctAnswer = "Overrides all other rules",
            explanation = "!important overrides normal specificity.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        ),
        cssQuestion(
            id = "css_advanced_002",
            categoryId = categoryId,
            chapterId = CSS_ADVANCED,
            questionText = "What is CSS Grid used for?",
            options = listOf(
                "Animations",
                "Two-dimensional layouts",
                "Text styling",
                "Color management"
            ),
            correctAnswer = "Two-dimensional layouts",
            explanation = "Grid allows row + column layouts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    return basics + selectors + layout + advanced
}
