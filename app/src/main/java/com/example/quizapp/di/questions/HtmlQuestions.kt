package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val HTML_INTRO = "html_introduction_to_html"
const val HTML_STRUCTURE = "html_html_structure"
const val HTML_TEXT = "html_text_formatting"
const val HTML_LINKS = "html_links_and_images"
const val HTML_LISTS = "html_lists"
const val HTML_TABLES = "html_tables"
const val HTML_FORMS = "html_forms"
const val HTML_SEMANTIC = "html_semantic_html"
const val HTML_MULTIMEDIA = "html_multimedia"
const val HTML5_FEATURES = "html_html5_features"

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

    /* ---------- INTRODUCTION TO HTML ---------- */
    val intro = listOf(
        htmlQuestion(
            id = "html_basics_001",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
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
            chapterId = HTML_INTRO,
            questionText = "Which HTML tag defines the largest heading?",
            options = listOf("<h6>", "<heading>", "<h1>", "<head>"),
            correctAnswer = "<h1>",
            explanation = "<h1> is the most important heading.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- FORMS ---------- */
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

    /* ---------- MULTIMEDIA ---------- */
    val media = listOf(
        htmlQuestion(
            id = "html_media_001",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag is used to insert an image?",
            options = listOf("<image>", "<img>", "<src>", "<pic>"),
            correctAnswer = "<img>",
            explanation = "<img> embeds images in a webpage.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        )
    )

    /* ---------- HTML5 FEATURES ---------- */
    val html5 = listOf(
        htmlQuestion(
            id = "html_advanced_001",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
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
            chapterId = HTML5_FEATURES,
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

    return intro + forms + media + html5
}
