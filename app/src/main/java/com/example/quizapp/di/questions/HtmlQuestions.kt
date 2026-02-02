package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val HTML_BASICS = "html_basics"
const val HTML_FORMS = "html_forms"
const val HTML_MEDIA = "html_media"
const val HTML_ADVANCED = "html_advanced"

/* ===============================
   HELPER FUNCTION
   =============================== */

private fun htmlQuestion(
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

fun getHtmlQuestions(
    categoryId: String,
    createdAt: String
): List<Question> {

    /* ---------- HTML BASICS ---------- */
    val basics = listOf(
        htmlQuestion(
            id = "html_basics_001",
            categoryId = categoryId,
            chapterId = HTML_BASICS,
            questionText = "What does HTML stand for?",
            options = listOf(
                "Hyper Text Markup Language",
                "Home Tool Markup Language",
                "Hyperlinks and Text Markup Language",
                "Hyper Tooling Markup Language"
            ),
            correctAnswer = "Hyper Text Markup Language",
            explanation = "HTML is the standard markup language for creating web pages.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_basics_002",
            categoryId = categoryId,
            chapterId = HTML_BASICS,
            questionText = "Which HTML tag defines the largest heading?",
            options = listOf("<h6>", "<heading>", "<h1>", "<head>"),
            correctAnswer = "<h1>",
            explanation = "<h1> is the most important heading.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- HTML FORMS ---------- */
    val forms = listOf(
        htmlQuestion(
            id = "html_forms_001",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which tag is used to create a dropdown list?",
            options = listOf("<list>", "<dropdown>", "<select>", "<input>"),
            correctAnswer = "<select>",
            explanation = "<select> creates a dropdown with <option> items.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_002",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute makes a field mandatory?",
            options = listOf("required", "readonly", "validate", "mandatory"),
            correctAnswer = "required",
            explanation = "Required prevents form submission without input.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt,
            points = 15
        )
    )

    /* ---------- HTML MEDIA ---------- */
    val media = listOf(
        htmlQuestion(
            id = "html_media_001",
            categoryId = categoryId,
            chapterId = HTML_MEDIA,
            questionText = "Which tag is used to insert an image?",
            options = listOf("<image>", "<img>", "<src>", "<pic>"),
            correctAnswer = "<img>",
            explanation = "<img> embeds images in a webpage.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_media_002",
            categoryId = categoryId,
            chapterId = HTML_MEDIA,
            questionText = "Which attribute enables lazy loading for images?",
            options = listOf("lazy", "defer", "loading='lazy'", "async"),
            correctAnswer = "loading='lazy'",
            explanation = "Lazy loading improves page performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    /* ---------- HTML ADVANCED ---------- */
    val advanced = listOf(
        htmlQuestion(
            id = "html_advanced_001",
            categoryId = categoryId,
            chapterId = HTML_ADVANCED,
            questionText = "What is the purpose of the Shadow DOM?",
            options = listOf(
                "Dark mode UI",
                "Encapsulated DOM subtree",
                "Hidden backup DOM",
                "SEO optimization"
            ),
            correctAnswer = "Encapsulated DOM subtree",
            explanation = "Shadow DOM isolates styles and scripts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        ),
        htmlQuestion(
            id = "html_advanced_002",
            categoryId = categoryId,
            chapterId = HTML_ADVANCED,
            questionText = "What does the 'aria-label' attribute do?",
            options = listOf(
                "Adds animation",
                "Improves SEO",
                "Labels elements for screen readers",
                "Creates tooltips"
            ),
            correctAnswer = "Labels elements for screen readers",
            explanation = "ARIA improves accessibility.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt,
            points = 25
        )
    )

    return basics + forms + media + advanced
}
