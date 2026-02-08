package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType

/* ===============================
   CHAPTER IDS (MUST MATCH TOPICS)
   =============================== */

const val CSS_INTRO = "css_introduction_to_css"
const val CSS_SELECTORS = "css_css_selectors"
const val CSS_COLORS = "css_colors_and_backgrounds"
const val CSS_BOX_MODEL = "css_box_model"
const val CSS_TEXT_FONTS = "css_text_and_fonts"
const val CSS_DISPLAY = "css_display_and_position"
const val CSS_FLEXBOX = "css_flexbox"
const val CSS_GRID = "css_grid"
const val CSS_RESPONSIVE = "css_responsive_design"
const val CSS_ANIMATIONS = "css_animations_and_transitions"

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

    /* ---------- INTRODUCTION TO CSS ---------- */
    return listOf(
        cssQuestion(
            id = "css_introduction_to_css_001",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "What does CSS stand for?",
            options = listOf(
                "Creative Style Sheets",
                "Cascading Style Sheets",
                "Computer Style Sheets",
                "Colorful StyCSS_INTRO"
            ),
            correctAnswer = "Cascading Style Sheets",
            explanation = "CSS stands for Cascading Style Sheets and is used to style web pages.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_002",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which HTML tag is used to write internal CSS?",
            options = listOf(
                "<css>",
                "<style>",
                "<script>",
                "<link>"
            ),
            correctAnswer = "<style>",
            explanation = "Internal CSS is written inside the <style> tag in the head section.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_003",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which attribute is used for inline CSS?",
            options = listOf(
                "class",
                "id",
                "style",
                "css"
            ),
            correctAnswer = "style",
            explanation = "Inline CSS is applied using the style attribute inside an HTML tag.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_004",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS property is used to change text color?",
            options = listOf(
                "text-color",
                "font-color",
                "color",
                "foreground"
            ),
            correctAnswer = "color",
            explanation = "The color property changes the color of text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_005",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which type of CSS has the highest priority?",
            options = listOf(
                "External CSS",
                "Internal CSS",
                "Inline CSS",
                "Browser default"
            ),
            correctAnswer = "Inline CSS",
            explanation = "Inline CSS overrides both internal and external CSS.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_006",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Where is an external CSS file linked in HTML?",
            options = listOf(
                "Inside <body>",
                "Inside <footer>",
                "Inside <head>",
                "Inside <title>"
            ),
            correctAnswer = "Inside <head>",
            explanation = "External CSS files are linked in the head section using the link tag.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_007",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which symbol is used for class selectors?",
            options = listOf(
                "#",
                ".",
                "*",
                "@"
            ),
            correctAnswer = ".",
            explanation = "A dot (.) is used to select elements by class name.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_008",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which symbol is used for ID selectors?",
            options = listOf(
                ".",
                "*",
                "#",
                "%"
            ),
            correctAnswer = "#",
            explanation = "The hash symbol (#) is used to select elements by ID.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_009",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS property controls text size?",
            options = listOf(
                "text-size",
                "font-size",
                "size",
                "font-style"
            ),
            correctAnswer = "font-size",
            explanation = "font-size controls the size of text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_010",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which unit is relative to the parent font size?",
            options = listOf(
                "px",
                "cm",
                "em",
                "pt"
            ),
            correctAnswer = "em",
            explanation = "em units are relative to the parent element’s font size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_011",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "What is the default position value of an element?",
            options = listOf(
                "relative",
                "absolute",
                "fixed",
                "static"
            ),
            correctAnswer = "static",
            explanation = "Elements are positioned as static by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_012",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property sets background color?",
            options = listOf(
                "bgcolor",
                "background-color",
                "color",
                "background-style"
            ),
            correctAnswer = "background-color",
            explanation = "background-color defines the background color of an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_013",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property makes text bold?",
            options = listOf(
                "font-style",
                "font-weight",
                "text-decoration",
                "bold"
            ),
            correctAnswer = "font-weight",
            explanation = "font-weight controls the thickness of text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_014",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property removes underline from links?",
            options = listOf(
                "font-style",
                "text-decoration",
                "text-transform",
                "link-style"
            ),
            correctAnswer = "text-decoration",
            explanation = "text-decoration: none removes underline from links.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_015",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which selector selects all elements?",
            options = listOf(
                ".all",
                "#all",
                "*",
                "all"
            ),
            correctAnswer = "*",
            explanation = "The universal selector (*) selects all elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_016",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property controls space inside an element?",
            options = listOf(
                "margin",
                "padding",
                "border",
                "spacing"
            ),
            correctAnswer = "padding",
            explanation = "Padding controls space between content and border.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_017",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property controls space outside an element?",
            options = listOf(
                "padding",
                "margin",
                "border",
                "outline"
            ),
            correctAnswer = "margin",
            explanation = "Margin controls space outside the border.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_018",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property sets font type?",
            options = listOf(
                "font-style",
                "font-family",
                "font-weight",
                "text-style"
            ),
            correctAnswer = "font-family",
            explanation = "font-family defines the typeface.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_019",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which value hides an element but keeps space?",
            options = listOf(
                "display: none",
                "visibility: hidden",
                "opacity: 0",
                "hidden"
            ),
            correctAnswer = "visibility: hidden",
            explanation = "visibility: hidden hides the element but preserves layout space.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_020",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS property changes the mouse cursor?",
            options = listOf(
                "mouse",
                "pointer",
                "cursor",
                "hover"
            ),
            correctAnswer = "cursor",
            explanation = "cursor controls the appearance of the mouse pointer.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_021",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which selector has the highest specificity?",
            options = listOf(
                "Element selector",
                "Class selector",
                "ID selector",
                "Universal selector"
            ),
            correctAnswer = "ID selector",
            explanation = "ID selectors override class and element selectors.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_022",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property controls line spacing?",
            options = listOf(
                "letter-spacing",
                "word-spacing",
                "line-height",
                "text-spacing"
            ),
            correctAnswer = "line-height",
            explanation = "line-height controls vertical spacing between lines.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_023",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which value removes an element from layout?",
            options = listOf(
                "visibility: hidden",
                "display: none",
                "opacity: 0",
                "hidden"
            ),
            correctAnswer = "display: none",
            explanation = "display: none removes the element completely from layout.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_024",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property aligns text horizontally?",
            options = listOf(
                "align",
                "text-align",
                "vertical-align",
                "position"
            ),
            correctAnswer = "text-align",
            explanation = "text-align aligns text left, center, or right.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_025",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which unit is relative to viewport width?",
            options = listOf(
                "em",
                "vh",
                "vw",
                "%"
            ),
            correctAnswer = "vw",
            explanation = "vw represents viewport width percentage.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_026",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property controls transparency?",
            options = listOf(
                "visibility",
                "opacity",
                "display",
                "filter"
            ),
            correctAnswer = "opacity",
            explanation = "opacity controls transparency from 0 to 1.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_027",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS rule forces priority over others?",
            options = listOf(
                "!important",
                "inline",
                "override",
                "priority"
            ),
            correctAnswer = "!important",
            explanation = "!important overrides normal cascading rules.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_028",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property rounds element corners?",
            options = listOf(
                "corner-radius",
                "border-radius",
                "radius",
                "round"
            ),
            correctAnswer = "border-radius",
            explanation = "border-radius creates rounded corners.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_029",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which unit is absolute?",
            options = listOf(
                "em",
                "rem",
                "%",
                "px"
            ),
            correctAnswer = "px",
            explanation = "px is an absolute unit.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_030",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property adds shadow to text?",
            options = listOf(
                "box-shadow",
                "text-shadow",
                "font-shadow",
                "shadow"
            ),
            correctAnswer = "text-shadow",
            explanation = "text-shadow adds shadow to text.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_031",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property sets background image?",
            options = listOf(
                "background",
                "image",
                "background-image",
                "img"
            ),
            correctAnswer = "background-image",
            explanation = "background-image sets an image as background.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_032",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS value repeats background image?",
            options = listOf(
                "no-repeat",
                "repeat",
                "cover",
                "contain"
            ),
            correctAnswer = "repeat",
            explanation = "repeat tiles the background image.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_033",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property sets element width?",
            options = listOf(
                "length",
                "size",
                "width",
                "element-width"
            ),
            correctAnswer = "width",
            explanation = "width defines horizontal size of an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_034",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property sets element height?",
            options = listOf(
                "length",
                "height",
                "size",
                "element-height"
            ),
            correctAnswer = "height",
            explanation = "height defines vertical size of an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_035",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "ICSS_INTROselects multiple elements?",
            options = listOf(
                "Group selector",
                "Universal selector",
                "Child selector",
                "Sibling selector"
            ),
            correctAnswer = "Group selector",
            explanation = "Group selectors apply styles to multiple selectors.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_036",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property controls font slant?",
            options = listOf(
                "font-style",
                "font-weight",
                "font-variant",
                "text-style"
            ),
            correctAnswer = "font-style",
            explanation = "font-style controls italic or normal text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_037",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS concept decides which rule applies?",
            options = listOf(
                "Inheritance",
                "Specificity",
                "Priority",
                "Ordering"
            ),
            correctAnswer = "Specificity",
            explanation = "Specificity determines which CSS rule wins.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_038",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property hides overflow content?",
            options = listOf(
                "overflow",
                "display",
                "visibility",
                "position"
            ),
            correctAnswer = "overflow",
            explanation = "overflow controls content exceeding box size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_039",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which overflow value hides extra content?",
            options = listOf(
                "scroll",
                "auto",
                "hidden",
                "visible"
            ),
            correctAnswer = "hidden",
            explanation = "hidden clips overflowing content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_040",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which property transforms text to uppercase?",
            options = listOf(
                "font-transform",
                "text-style",
                "text-transform",
                "uppercase"
            ),
            correctAnswer = "text-transform",
            explanation = "text-transform controls uppercase and lowercase.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_041",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which unit is relative to root font size?",
            options = listOf(
                "em",
                "rem",
                "px",
                "%"
            ),
            correctAnswer = "rem",
            explanation = "rem is relative to root element font size.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_042",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which value makes element fully transparent?",
            options = listOf(
                "opacity: 1",
                "opacity: 0",
                "visibility: hidden",
                "display: none"
            ),
            correctAnswer = "opacity: 0",
            explanation = "opacity: 0 makes element invisible but keeps space.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_043",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS property applies shadow to boxes?",
            options = listOf(
                "shadow",
                "box-shadow",
                "border-shadow",
                "outline-shadow"
            ),
            correctAnswer = "box-shadow",
            explanation = "box-shadow adds shadow around elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_044",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which keyword resets a property to default?",
            options = listOf(
                "inherit",
                "unset",
                "initial",
                "none"
            ),
            correctAnswer = "initial",
            explanation = "initial resets the property to default value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_introduction_to_css_045",
            categoryId = categoryId,
            chapterId = CSS_INTRO,
            questionText = "Which CSS is best for large websites?",
            options = listOf(
                "Inline CSS",
                "Internal CSS",
                "External CSS",
                "Embedded CSS"
            ),
            correctAnswer = "External CSS",
            explanation = "External CSS improves maintainability and performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_001",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which CSS selector selects all elements on a page?",
            options = listOf(
                ".all",
                "#all",
                "*",
                "all"
            ),
            correctAnswer = "*",
            explanation = "The universal selector (*) targets every element in the document.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_002",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector is used to select an element by its ID?",
            options = listOf(
                ".id",
                "#id",
                "id",
                "*id"
            ),
            correctAnswer = "#id",
            explanation = "The hash (#) symbol is used to select elements by their ID.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_003",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects elements with a specific class?",
            options = listOf(
                "#class",
                ".class",
                "class",
                "*class"
            ),
            correctAnswer = ".class",
            explanation = "Class selectors start with a dot followed by the class name.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_004",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector targets all <p> elements?",
            options = listOf(
                ".p",
                "#p",
                "p",
                "*p"
            ),
            correctAnswer = "p",
            explanation = "Element selectors use the tag name directly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_005",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects elements inside another element?",
            options = listOf(
                "Child selector",
                "Descendant selector",
                "Sibling selector",
                "Group selector"
            ),
            correctAnswer = "Descendant selector",
            explanation = "Descendant selectors target elements nested inside another element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_006",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which symbol is used for the child selector?",
            options = listOf(
                "+",
                "~",
                ">",
                "*"
            ),
            correctAnswer = ">",
            explanation = "The child selector (>) selects only direct children.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_007",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects the immediate next sibling?",
            options = listOf(
                "~",
                ">",
                "+",
                "*"
            ),
            correctAnswer = "+",
            explanation = "The adjacent sibling selector (+) selects the next sibling only.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_008",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects all siblings of an element?",
            options = listOf(
                "+",
                ">",
                "~",
                "*"
            ),
            correctAnswer = "~",
            explanation = "The general sibling selector (~) selects all matching siblings.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_009",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector allows applying same style to multiple selectors?",
            options = listOf(
                "Universal selector",
                "Group selector",
                "Class selector",
                "ID selector"
            ),
            correctAnswer = "Group selector",
            explanation = "Group selectors use commas to apply styles to multiple selectors.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_010",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which character separates selectors in a group selector?",
            options = listOf(
                ":",
                ";",
                ",",
                "."
            ),
            correctAnswer = ",",
            explanation = "Commas separate selectors in a group selector.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_011",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector has the highest specificity?",
            options = listOf(
                "Element selector",
                "Class selector",
                "ID selector",
                "Universal selector"
            ),
            correctAnswer = "ID selector",
            explanation = "ID selectors override class and element selectors.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_012",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector targets elements with a specific attribute?",
            options = listOf(
                "Class selector",
                "ID selector",
                "Attribute selector",
                "Universal selector"
            ),
            correctAnswer = "Attribute selector",
            explanation = "Attribute selectors match elements based on attributes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_013",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which syntax selects elements that have a title attribute?",
            options = listOf(
                ".title",
                "#title",
                "[title]",
                "title()"
            ),
            correctAnswer = "[title]",
            explanation = "Square brackets are used for attribute selectors.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_014",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which pseudo-class applies when the mouse is over an element?",
            options = listOf(
                ":active",
                ":hover",
                ":focus",
                "::before"
            ),
            correctAnswer = ":hover",
            explanation = ":hover activates when the mouse pointer is over an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_015",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector styles the first child of an element?",
            options = listOf(
                ":first-child",
                "::first-child",
                ":first-letter",
                "::before"
            ),
            correctAnswer = ":first-child",
            explanation = ":first-child selects the first child of its parent.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_016",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector styles the first letter of text?",
            options = listOf(
                ":first-letter",
                "::first-letter",
                ":first-child",
                "::before"
            ),
            correctAnswer = "::first-letter",
            explanation = "::first-letter styles only the first letter of text.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_017",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector targets checked checkboxes or radio buttons?",
            options = listOf(
                ":checked",
                ":active",
                ":hover",
                ":focus"
            ),
            correctAnswer = ":checked",
            explanation = ":checked applies to selected radio buttons and checkboxes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_018",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects empty elements?",
            options = listOf(
                ":blank",
                ":empty",
                ":null",
                ":none"
            ),
            correctAnswer = ":empty",
            explanation = ":empty selects elements with no child content.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_019",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which pseudo-class selects even elements?",
            options = listOf(
                ":even",
                ":nth-child(even)",
                ":nth(even)",
                "::even"
            ),
            correctAnswer = ":nth-child(even)",
            explanation = ":nth-child(even) selects even-positioned elements.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_020",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector negates another selector?",
            options = listOf(
                ":not()",
                ":exclude()",
                ":remove()",
                ":except()"
            ),
            correctAnswer = ":not()",
            explanation = ":not() excludes elements matching a selector.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_021",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector inserts content before an element?",
            options = listOf(
                ":before",
                "::before",
                ":first-child",
                "::first-letter"
            ),
            correctAnswer = "::before",
            explanation = "::before inserts generated content before an element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_022",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector inserts content after an element?",
            options = listOf(
                ":after",
                "::after",
                ":last-child",
                "::last-letter"
            ),
            correctAnswer = "::after",
            explanation = "::after inserts generated content after an element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_023",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects the last child of a parent?",
            options = listOf(
                ":last-child",
                "::last-child",
                ":last",
                "::last"
            ),
            correctAnswer = ":last-child",
            explanation = ":last-child selects the last child of a parent.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_024",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects elements based on language?",
            options = listOf(
                ":lang()",
                ":locale()",
                ":language()",
                ":country()"
            ),
            correctAnswer = ":lang()",
            explanation = ":lang() selects elements based on language.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_025",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector targets read-only inputs?",
            options = listOf(
                ":readonly",
                ":disabled",
                ":required",
                ":checked"
            ),
            correctAnswer = ":readonly",
            explanation = ":readonly applies to non-editable input fields.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_026",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector targets disabled form elements?",
            options = listOf(
                ":disabled",
                ":enabled",
                ":readonly",
                ":checked"
            ),
            correctAnswer = ":disabled",
            explanation = ":disabled selects disabled form elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_027",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects enabled form elements?",
            options = listOf(
                ":enabled",
                ":active",
                ":focus",
                ":checked"
            ),
            correctAnswer = ":enabled",
            explanation = ":enabled selects enabled input elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_028",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects invalid form inputs?",
            options = listOf(
                ":invalid",
                ":valid",
                ":required",
                ":focus"
            ),
            correctAnswer = ":invalid",
            explanation = ":invalid applies to inputs failing validation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_029",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects valid form inputs?",
            options = listOf(
                ":valid",
                ":checked",
                ":focus",
                ":enabled"
            ),
            correctAnswer = ":valid",
            explanation = ":valid applies to inputs passing validation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_030",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects required form fields?",
            options = listOf(
                ":required",
                ":optional",
                ":valid",
                ":focus"
            ),
            correctAnswer = ":required",
            explanation = ":required selects mandatory form fields.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_031",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects optional form fields?",
            options = listOf(
                ":optional",
                ":required",
                ":valid",
                ":checked"
            ),
            correctAnswer = ":optional",
            explanation = ":optional selects non-mandatory form fields.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_032",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector matches elements with exact attribute value?",
            options = listOf(
                "[attr]",
                "[attr=value]",
                "[attr~=value]",
                "[attr^=value]"
            ),
            correctAnswer = "[attr=value]",
            explanation = "[attr=value] matches exact attribute values.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_033",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector matches attribute containing a word?",
            options = listOf(
                "[attr=value]",
                "[attr~=value]",
                "[attr^=value]",
                "[attr$=value]"
            ),
            correctAnswer = "[attr~=value]",
            explanation = "~= matches whole words in attribute values.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_034",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector matches attribute starting with value?",
            options = listOf(
                "[attr^=value]",
                "[attr$=value]",
                "[attr~=value]",
                "[attr=value]"
            ),
            correctAnswer = "[attr^=value]",
            explanation = "^= matches attributes starting with a value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_035",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector matches attribute ending with value?",
            options = listOf(
                "[attr$=value]",
                "[attr^=value]",
                "[attr~=value]",
                "[attr=value]"
            ),
            correctAnswer = "[attr$=value]",
            explanation = "$= matches attributes ending with a value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_036",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects the first line of text?",
            options = listOf(
                ":first-line",
                "::first-line",
                ":line-first",
                "::line-first"
            ),
            correctAnswer = "::first-line",
            explanation = "::first-line styles only the first line of text.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_037",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects links that are unvisited?",
            options = listOf(
                ":link",
                ":visited",
                ":hover",
                ":active"
            ),
            correctAnswer = ":link",
            explanation = ":link applies to unvisited links.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_038",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects visited links?",
            options = listOf(
                ":hover",
                ":link",
                ":visited",
                ":active"
            ),
            correctAnswer = ":visited",
            explanation = ":visited applies to links already visited.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_039",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector applies while clicking an element?",
            options = listOf(
                ":hover",
                ":active",
                ":focus",
                ":visited"
            ),
            correctAnswer = ":active",
            explanation = ":active applies while the element is being clicked.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_040",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector applies when an input has focus?",
            options = listOf(
                ":hover",
                ":focus",
                ":active",
                ":checked"
            ),
            correctAnswer = ":focus",
            explanation = ":focus applies when an element gains focus.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_041",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects elements regardless of type?",
            options = listOf(
                "Class selector",
                "ID selector",
                "Universal selector",
                "Attribute selector"
            ),
            correctAnswer = "Universal selector",
            explanation = "The universal selector (*) selects all elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_042",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects only input elements?",
            options = listOf(
                "input",
                ".input",
                "#input",
                "*input"
            ),
            correctAnswer = "input",
            explanation = "The element selector input targets all input elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_043",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector selects nth child from the end?",
            options = listOf(
                ":nth-child()",
                ":nth-last-child()",
                ":last-child()",
                ":end-child()"
            ),
            correctAnswer = ":nth-last-child()",
            explanation = ":nth-last-child counts elements from the end.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_044",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector combines multiple simple selectors?",
            options = listOf(
                "Group selector",
                "Compound selector",
                "Universal selector",
                "Attribute selector"
            ),
            correctAnswer = "Compound selector",
            explanation = "Compound selectors combine multiple simple selectors.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_css_selectors_045",
            categoryId = categoryId,
            chapterId = CSS_SELECTORS,
            questionText = "Which selector applies styles based on element state?",
            options = listOf(
                "Pseudo-element",
                "Pseudo-class",
                "Attribute selector",
                "Universal selector"
            ),
            correctAnswer = "Pseudo-class",
            explanation = "Pseudo-classes apply styles based on element states.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_001",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS property is used to change the text color?",
            options = listOf(
                "text-color",
                "font-color",
                "color",
                "foreground"
            ),
            correctAnswer = "color",
            explanation = "The color property sets the color of text content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_002",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS property sets the background color of an element?",
            options = listOf(
                "background",
                "bgcolor",
                "background-color",
                "color"
            ),
            correctAnswer = "background-color",
            explanation = "background-color specifically defines the background color.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_003",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which color format uses hexadecimal values?",
            options = listOf(
                "rgb()",
                "rgba()",
                "#RRGGBB",
                "hsl()"
            ),
            correctAnswer = "#RRGGBB",
            explanation = "Hex colors start with # followed by six hexadecimal digits.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_004",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which function defines color using red, green, and blue?",
            options = listOf(
                "hex()",
                "rgb()",
                "hsl()",
                "color()"
            ),
            correctAnswer = "rgb()",
            explanation = "rgb() defines color using red, green, and blue values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_005",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which color model supports transparency?",
            options = listOf(
                "rgb()",
                "hex",
                "rgba()",
                "hsl()"
            ),
            correctAnswer = "rgba()",
            explanation = "rgba() includes an alpha value for transparency.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_006",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "What does the alpha value in rgba() represent?",
            options = listOf(
                "Brightness",
                "Transparency",
                "Saturation",
                "Contrast"
            ),
            correctAnswer = "Transparency",
            explanation = "Alpha controls opacity from 0 (transparent) to 1 (opaque).",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_007",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS property is used to set a background image?",
            options = listOf(
                "image",
                "background",
                "background-image",
                "img"
            ),
            correctAnswer = "background-image",
            explanation = "background-image sets an image as the background.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_008",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which value prevents background image repetition?",
            options = listOf(
                "repeat",
                "no-repeat",
                "cover",
                "contain"
            ),
            correctAnswer = "no-repeat",
            explanation = "no-repeat ensures the background image appears only once.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_009",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property controls background image repetition?",
            options = listOf(
                "background-style",
                "background-repeat",
                "background-position",
                "background-size"
            ),
            correctAnswer = "background-repeat",
            explanation = "background-repeat controls how background images repeat.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_010",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property sets the position of a background image?",
            options = listOf(
                "background-align",
                "background-position",
                "background-origin",
                "background-repeat"
            ),
            correctAnswer = "background-position",
            explanation = "background-position defines where the image is placed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_011",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which value scales the background image to cover the element?",
            options = listOf(
                "contain",
                "stretch",
                "cover",
                "auto"
            ),
            correctAnswer = "cover",
            explanation = "cover scales the image to cover the entire element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_012",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which value fits the entire background image inside an element?",
            options = listOf(
                "cover",
                "contain",
                "auto",
                "fill"
            ),
            correctAnswer = "contain",
            explanation = "contain ensures the whole image fits inside the element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_013",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property defines the background image size?",
            options = listOf(
                "background-dimension",
                "background-scale",
                "background-size",
                "background-fit"
            ),
            correctAnswer = "background-size",
            explanation = "background-size controls the size of background images.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_014",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which shorthand property sets all background properties?",
            options = listOf(
                "background-style",
                "background-all",
                "background",
                "bg"
            ),
            correctAnswer = "background",
            explanation = "background is a shorthand for multiple background properties.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_015",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which color model uses hue, saturation, and lightness?",
            options = listOf(
                "rgb()",
                "rgba()",
                "hex",
                "hsl()"
            ),
            correctAnswer = "hsl()",
            explanation = "hsl() defines colors using hue, saturation, and lightness.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_016",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which hsl() component controls brightness?",
            options = listOf(
                "Hue",
                "Saturation",
                "Lightness",
                "Alpha"
            ),
            correctAnswer = "Lightness",
            explanation = "Lightness controls how light or dark the color appears.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_017",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which keyword makes a background transparent?",
            options = listOf(
                "none",
                "clear",
                "transparent",
                "hidden"
            ),
            correctAnswer = "transparent",
            explanation = "transparent makes the background fully transparent.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_018",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property defines how far the background extends?",
            options = listOf(
                "background-clip",
                "background-origin",
                "background-size",
                "background-position"
            ),
            correctAnswer = "background-clip",
            explanation = "background-clip controls the painting area of the background.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_019",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which background-clip value excludes the border?",
            options = listOf(
                "border-box",
                "padding-box",
                "content-box",
                "inherit"
            ),
            correctAnswer = "padding-box",
            explanation = "padding-box clips the background to padding area only.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_020",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property controls where the background image starts?",
            options = listOf(
                "background-clip",
                "background-origin",
                "background-position",
                "background-size"
            ),
            correctAnswer = "background-origin",
            explanation = "background-origin sets the starting box for the image.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_021",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which background-origin value starts from content area?",
            options = listOf(
                "border-box",
                "padding-box",
                "content-box",
                "initial"
            ),
            correctAnswer = "content-box",
            explanation = "content-box starts the background from content area.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_022",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property controls background scroll behavior?",
            options = listOf(
                "background-scroll",
                "background-fixed",
                "background-attachment",
                "background-lock"
            ),
            correctAnswer = "background-attachment",
            explanation = "background-attachment defines scroll behavior of background.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_023",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which background-attachment value fixes the image to viewport?",
            options = listOf(
                "scroll",
                "fixed",
                "local",
                "static"
            ),
            correctAnswer = "fixed",
            explanation = "fixed keeps the background fixed during scrolling.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_024",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which of the following is a valid CSS color keyword?",
            options = listOf(
                "lightblack",
                "darkwhite",
                "transparent",
                "reddish"
            ),
            correctAnswer = "transparent",
            explanation = "transparent is a predefined CSS color keyword.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_025",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property allows multiple background images?",
            options = listOf(
                "background-image",
                "background-layer",
                "background-stack",
                "background-repeat"
            ),
            correctAnswer = "background-image",
            explanation = "Multiple images can be defined using comma-separated values.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_026",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS property is used to define gradients?",
            options = listOf(
                "background-color",
                "background-gradient",
                "background-image",
                "gradient"
            ),
            correctAnswer = "background-image",
            explanation = "Gradients are defined using background-image.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_027",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which gradient goes from top to bottom by default?",
            options = listOf(
                "radial-gradient",
                "linear-gradient",
                "conic-gradient",
                "box-gradient"
            ),
            correctAnswer = "linear-gradient",
            explanation = "linear-gradient defaults from top to bottom.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_028",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which gradient spreads outward from the center?",
            options = listOf(
                "linear-gradient",
                "radial-gradient",
                "conic-gradient",
                "angular-gradient"
            ),
            correctAnswer = "radial-gradient",
            explanation = "radial-gradient spreads from a central point outward.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_029",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which gradient rotates around a center point?",
            options = listOf(
                "linear-gradient",
                "radial-gradient",
                "conic-gradient",
                "box-gradient"
            ),
            correctAnswer = "conic-gradient",
            explanation = "conic-gradient rotates colors around a center.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_030",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which property blends background layers?",
            options = listOf(
                "background-merge",
                "background-mix",
                "background-blend-mode",
                "background-mode"
            ),
            correctAnswer = "background-blend-mode",
            explanation = "background-blend-mode controls how layers blend.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_031",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS value represents pure red?",
            options = listOf(
                "rgb(0,0,255)",
                "rgb(255,0,0)",
                "rgb(0,255,0)",
                "rgb(255,255,0)"
            ),
            correctAnswer = "rgb(255,0,0)",
            explanation = "Pure red has maximum red value and zero green and blue.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_032",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which hex code represents white?",
            options = listOf(
                "#000000",
                "#FFFFFF",
                "#FF0000",
                "#00FF00"
            ),
            correctAnswer = "#FFFFFF",
            explanation = "White has maximum RGB values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_033",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which hex code represents black?",
            options = listOf(
                "#FFFFFF",
                "#000000",
                "#111111",
                "#222222"
            ),
            correctAnswer = "#000000",
            explanation = "Black has zero RGB values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_034",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which rgba() alpha value makes element invisible?",
            options = listOf(
                "0",
                "0.5",
                "1",
                "255"
            ),
            correctAnswer = "0",
            explanation = "Alpha value 0 makes the color fully transparent.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_035",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS color value is invalid?",
            options = listOf(
                "rgb(255,0,0)",
                "rgb(256,0,0)",
                "#FF0000",
                "red"
            ),
            correctAnswer = "rgb(256,0,0)",
            explanation = "RGB values must be between 0 and 255.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_036",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which keyword inherits background from parent?",
            options = listOf(
                "transparent",
                "initial",
                "inherit",
                "unset"
            ),
            correctAnswer = "inherit",
            explanation = "inherit copies the parent’s background value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_037",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which keyword resets background to default?",
            options = listOf(
                "inherit",
                "unset",
                "initial",
                "transparent"
            ),
            correctAnswer = "initial",
            explanation = "initial resets the property to its default value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_038",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which background-attachment value scrolls inside element?",
            options = listOf(
                "fixed",
                "scroll",
                "local",
                "static"
            ),
            correctAnswer = "local",
            explanation = "local scrolls background with element content.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_039",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS property affects painting area order?",
            options = listOf(
                "background-clip",
                "background-origin",
                "background-size",
                "background-repeat"
            ),
            correctAnswer = "background-clip",
            explanation = "background-clip controls where background is painted.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_040",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which background property supports multiple layers?",
            options = listOf(
                "background-color",
                "background-image",
                "background",
                "background-repeat"
            ),
            correctAnswer = "background",
            explanation = "background shorthand supports multiple layered backgrounds.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_041",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which color unit is NOT valid in CSS?",
            options = listOf(
                "%",
                "deg",
                "px",
                "none"
            ),
            correctAnswer = "px",
            explanation = "px is a length unit, not a color unit.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_042",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which background-attachment value scrolls with page?",
            options = listOf(
                "fixed",
                "local",
                "scroll",
                "inherit"
            ),
            correctAnswer = "scroll",
            explanation = "scroll is the default behavior of background images.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_043",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS value makes background fully opaque?",
            options = listOf(
                "rgba(0,0,0,0)",
                "transparent",
                "rgba(0,0,0,1)",
                "none"
            ),
            correctAnswer = "rgba(0,0,0,1)",
            explanation = "Alpha value 1 makes the color fully opaque.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_044",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which color format supports transparency and hue?",
            options = listOf(
                "rgb()",
                "hex",
                "rgba()",
                "hsla()"
            ),
            correctAnswer = "hsla()",
            explanation = "hsla() supports hue, saturation, lightness, and alpha.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_colors_and_backgrounds_045",
            categoryId = categoryId,
            chapterId = CSS_COLORS,
            questionText = "Which CSS property defines how background images blend?",
            options = listOf(
                "background-mix",
                "background-merge",
                "background-blend-mode",
                "background-layer"
            ),
            correctAnswer = "background-blend-mode",
            explanation = "background-blend-mode controls blending of background layers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_001",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "What does the CSS box model consist of?",
            options = listOf(
                "Content, padding, border, margin",
                "Text, image, link, background",
                "Width, height, color, font",
                "Header, body, footer, sidebar"
            ),
            correctAnswer = "Content, padding, border, margin",
            explanation = "The CSS box model defines layout using content, padding, border, and margin.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_002",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which part of the box model contains text and images?",
            options = listOf(
                "Margin",
                "Border",
                "Padding",
                "Content"
            ),
            correctAnswer = "Content",
            explanation = "The content area holds actual text and images.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_003",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property creates space between content and border?",
            options = listOf(
                "margin",
                "padding",
                "border",
                "outline"
            ),
            correctAnswer = "padding",
            explanation = "Padding adds space inside the border around content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_004",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property controls space outside the border?",
            options = listOf(
                "padding",
                "margin",
                "outline",
                "spacing"
            ),
            correctAnswer = "margin",
            explanation = "Margin creates space outside the element’s border.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_005",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property defines border thickness?",
            options = listOf(
                "border-style",
                "border-width",
                "border-color",
                "border-radius"
            ),
            correctAnswer = "border-width",
            explanation = "border-width controls how thick the border is.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_006",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property defines border appearance?",
            options = listOf(
                "border-color",
                "border-style",
                "border-width",
                "outline-style"
            ),
            correctAnswer = "border-style",
            explanation = "border-style defines how the border looks (solid, dashed, etc).",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_007",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property defines border color?",
            options = listOf(
                "color",
                "border-color",
                "outline-color",
                "background-color"
            ),
            correctAnswer = "border-color",
            explanation = "border-color sets the color of the border.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_008",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which shorthand property sets all border properties?",
            options = listOf(
                "border",
                "border-style",
                "outline",
                "border-all"
            ),
            correctAnswer = "border",
            explanation = "border shorthand sets width, style, and color together.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_009",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property rounds the corners of an element?",
            options = listOf(
                "corner-radius",
                "border-radius",
                "outline-radius",
                "radius"
            ),
            correctAnswer = "border-radius",
            explanation = "border-radius creates rounded corners.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_010",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which part of the box model is always transparent?",
            options = listOf(
                "Content",
                "Padding",
                "Border",
                "Margin"
            ),
            correctAnswer = "Margin",
            explanation = "Margins are transparent and do not take background color.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_011",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property controls how width and height are calculated?",
            options = listOf(
                "display",
                "box-sizing",
                "overflow",
                "position"
            ),
            correctAnswer = "box-sizing",
            explanation = "box-sizing defines how element size is calculated.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_012",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "What is the default value of box-sizing?",
            options = listOf(
                "border-box",
                "content-box",
                "padding-box",
                "initial"
            ),
            correctAnswer = "content-box",
            explanation = "content-box excludes padding and border from width and height.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_013",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which box-sizing value includes padding and border in width?",
            options = listOf(
                "content-box",
                "border-box",
                "padding-box",
                "inherit"
            ),
            correctAnswer = "border-box",
            explanation = "border-box includes padding and border inside width.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_014",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which CSS property removes default margin?",
            options = listOf(
                "padding: 0",
                "margin: 0",
                "border: 0",
                "outline: 0"
            ),
            correctAnswer = "margin: 0",
            explanation = "margin: 0 removes default outer spacing.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_015",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property sets the width of an element?",
            options = listOf(
                "size",
                "width",
                "length",
                "element-width"
            ),
            correctAnswer = "width",
            explanation = "width defines the horizontal size of an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_016",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property sets the height of an element?",
            options = listOf(
                "size",
                "height",
                "length",
                "element-height"
            ),
            correctAnswer = "height",
            explanation = "height defines the vertical size of an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_017",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which margin shorthand sets all four sides?",
            options = listOf(
                "margin-all",
                "margin",
                "margin-block",
                "margin-inline"
            ),
            correctAnswer = "margin",
            explanation = "margin shorthand sets all margins at once.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_018",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which order is used in padding shorthand?",
            options = listOf(
                "Left, right, top, bottom",
                "Top, right, bottom, left",
                "Right, left, top, bottom",
                "Top, bottom, left, right"
            ),
            correctAnswer = "Top, right, bottom, left",
            explanation = "Padding shorthand follows clockwise order.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_019",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which value centers a block element horizontally?",
            options = listOf(
                "padding: auto",
                "margin: auto",
                "text-align: center",
                "position: center"
            ),
            correctAnswer = "margin: auto",
            explanation = "margin: auto centers block elements horizontally.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_020",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which phenomenon causes vertical margins to overlap?",
            options = listOf(
                "Padding collapsing",
                "Margin collapsing",
                "Border collapsing",
                "Box collapsing"
            ),
            correctAnswer = "Margin collapsing",
            explanation = "Vertical margins can collapse into one margin.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_021",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Margin collapsing occurs in which direction?",
            options = listOf(
                "Horizontal",
                "Vertical",
                "Diagonal",
                "All directions"
            ),
            correctAnswer = "Vertical",
            explanation = "Margin collapsing happens only vertically.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_022",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property draws outside the border without affecting layout?",
            options = listOf(
                "margin",
                "padding",
                "outline",
                "border"
            ),
            correctAnswer = "outline",
            explanation = "Outline does not take space and sits outside border.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_023",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property controls outline thickness?",
            options = listOf(
                "outline-style",
                "outline-width",
                "outline-color",
                "outline-radius"
            ),
            correctAnswer = "outline-width",
            explanation = "outline-width defines outline thickness.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_024",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property allows negative values?",
            options = listOf(
                "padding",
                "border",
                "margin",
                "outline"
            ),
            correctAnswer = "margin",
            explanation = "Margins can have negative values.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_025",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property increases total element size?",
            options = listOf(
                "color",
                "padding",
                "font-size",
                "text-align"
            ),
            correctAnswer = "padding",
            explanation = "Padding increases overall element size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_026",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property defines minimum width?",
            options = listOf(
                "width",
                "min-width",
                "max-width",
                "auto"
            ),
            correctAnswer = "min-width",
            explanation = "min-width prevents element from shrinking too much.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_027",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property defines maximum width?",
            options = listOf(
                "width",
                "min-width",
                "max-width",
                "auto"
            ),
            correctAnswer = "max-width",
            explanation = "max-width limits maximum width.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_028",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property defines minimum height?",
            options = listOf(
                "height",
                "min-height",
                "max-height",
                "auto"
            ),
            correctAnswer = "min-height",
            explanation = "min-height sets minimum vertical size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_029",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property defines maximum height?",
            options = listOf(
                "height",
                "min-height",
                "max-height",
                "auto"
            ),
            correctAnswer = "max-height",
            explanation = "max-height restricts maximum height.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_030",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which part of box model takes background color?",
            options = listOf(
                "Margin",
                "Padding",
                "Outline",
                "None"
            ),
            correctAnswer = "Padding",
            explanation = "Background extends into padding area.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_031",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property controls inner spacing shorthand?",
            options = listOf(
                "margin",
                "padding",
                "border",
                "outline"
            ),
            correctAnswer = "padding",
            explanation = "Padding shorthand controls inner spacing.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_032",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which unit is commonly used in box model?",
            options = listOf(
                "px",
                "deg",
                "s",
                "hz"
            ),
            correctAnswer = "px",
            explanation = "px is widely used for sizes in box model.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_033",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property controls content overflow?",
            options = listOf(
                "overflow",
                "display",
                "position",
                "visibility"
            ),
            correctAnswer = "overflow",
            explanation = "overflow controls extra content handling.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_034",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which overflow value hides extra content?",
            options = listOf(
                "scroll",
                "hidden",
                "auto",
                "visible"
            ),
            correctAnswer = "hidden",
            explanation = "hidden clips overflowing content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_035",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which overflow value always shows scrollbars?",
            options = listOf(
                "auto",
                "hidden",
                "scroll",
                "visible"
            ),
            correctAnswer = "scroll",
            explanation = "scroll always shows scrollbars.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_036",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which overflow value shows scrollbars only if needed?",
            options = listOf(
                "visible",
                "scroll",
                "auto",
                "hidden"
            ),
            correctAnswer = "auto",
            explanation = "auto adds scrollbars only when required.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_037",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which overflow value allows content to overflow?",
            options = listOf(
                "hidden",
                "scroll",
                "auto",
                "visible"
            ),
            correctAnswer = "visible",
            explanation = "visible allows content to overflow.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_038",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property affects total size the most?",
            options = listOf(
                "color",
                "padding",
                "text-align",
                "font-style"
            ),
            correctAnswer = "padding",
            explanation = "Padding adds space inside the element.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_039",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which CSS removes border completely?",
            options = listOf(
                "border: none",
                "border: hidden",
                "border: transparent",
                "border: 0 solid"
            ),
            correctAnswer = "border: none",
            explanation = "border: none removes the border entirely.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_040",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property adds shadow to boxes?",
            options = listOf(
                "shadow",
                "border-shadow",
                "box-shadow",
                "outline-shadow"
            ),
            correctAnswer = "box-shadow",
            explanation = "box-shadow adds shadow around elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_041",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which keyword creates inner shadow?",
            options = listOf(
                "inner",
                "inside",
                "inset",
                "shadow-in"
            ),
            correctAnswer = "inset",
            explanation = "Inset creates inner shadows in box-shadow.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_042",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which CSS concept explains element sizing?",
            options = listOf(
                "Positioning",
                "Display",
                "Box model",
                "Flexbox"
            ),
            correctAnswer = "Box model",
            explanation = "The box model explains sizing and spacing.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_043",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property sets left and right padding together?",
            options = listOf(
                "padding",
                "padding-left",
                "padding-inline",
                "padding-block"
            ),
            correctAnswer = "padding-inline",
            explanation = "padding-inline controls horizontal padding.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_044",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property sets top and bottom margins together?",
            options = listOf(
                "margin",
                "margin-top",
                "margin-block",
                "margin-inline"
            ),
            correctAnswer = "margin-block",
            explanation = "margin-block controls vertical margins.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_box_model_045",
            categoryId = categoryId,
            chapterId = CSS_BOX_MODEL,
            questionText = "Which property ensures predictable element sizing?",
            options = listOf(
                "display",
                "box-sizing: border-box",
                "overflow",
                "position"
            ),
            correctAnswer = "box-sizing: border-box",
            explanation = "border-box makes width calculations predictable.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_001",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which CSS property is used to change the text color?",
            options = listOf(
                "font-color",
                "text-color",
                "color",
                "foreground"
            ),
            correctAnswer = "color",
            explanation = "The color property defines the color of text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_002",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls the size of text?",
            options = listOf(
                "text-size",
                "font-size",
                "size",
                "font-style"
            ),
            correctAnswer = "font-size",
            explanation = "font-size sets the size of the text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_003",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property defines the typeface of text?",
            options = listOf(
                "font-style",
                "font-family",
                "font-weight",
                "text-style"
            ),
            correctAnswer = "font-family",
            explanation = "font-family specifies the font type.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_004",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property makes text bold?",
            options = listOf(
                "font-style",
                "font-weight",
                "text-transform",
                "font-variant"
            ),
            correctAnswer = "font-weight",
            explanation = "font-weight controls thickness of text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_005",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value of font-weight represents bold text?",
            options = listOf(
                "300",
                "400",
                "700",
                "100"
            ),
            correctAnswer = "700",
            explanation = "700 is commonly used for bold text.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_006",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property makes text italic?",
            options = listOf(
                "font-style",
                "font-weight",
                "text-decoration",
                "font-variant"
            ),
            correctAnswer = "font-style",
            explanation = "font-style controls italic or normal text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_007",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value of font-style makes text italic?",
            options = listOf(
                "bold",
                "italic",
                "oblique",
                "normal"
            ),
            correctAnswer = "italic",
            explanation = "italic slants the text slightly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_008",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property underlines text?",
            options = listOf(
                "text-style",
                "font-style",
                "text-decoration",
                "text-transform"
            ),
            correctAnswer = "text-decoration",
            explanation = "text-decoration controls underline, overline, and line-through.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_009",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value removes underline from links?",
            options = listOf(
                "none",
                "hidden",
                "remove",
                "no-line"
            ),
            correctAnswer = "none",
            explanation = "text-decoration: none removes underline.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_010",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property aligns text horizontally?",
            options = listOf(
                "vertical-align",
                "text-align",
                "align",
                "position"
            ),
            correctAnswer = "text-align",
            explanation = "text-align controls left, right, center alignment.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_011",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value centers text horizontally?",
            options = listOf(
                "left",
                "right",
                "center",
                "justify"
            ),
            correctAnswer = "center",
            explanation = "center aligns text to the middle.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_012",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls space between lines?",
            options = listOf(
                "letter-spacing",
                "word-spacing",
                "line-height",
                "text-spacing"
            ),
            correctAnswer = "line-height",
            explanation = "line-height controls vertical spacing between lines.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_013",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls spacing between letters?",
            options = listOf(
                "letter-spacing",
                "word-spacing",
                "line-height",
                "text-indent"
            ),
            correctAnswer = "letter-spacing",
            explanation = "letter-spacing increases or decreases space between letters.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_014",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls spacing between words?",
            options = listOf(
                "letter-spacing",
                "word-spacing",
                "line-height",
                "text-indent"
            ),
            correctAnswer = "word-spacing",
            explanation = "word-spacing adjusts space between words.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_015",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property indents the first line of text?",
            options = listOf(
                "margin-left",
                "padding-left",
                "text-indent",
                "line-height"
            ),
            correctAnswer = "text-indent",
            explanation = "text-indent indents the first line of text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_016",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property transforms text to uppercase?",
            options = listOf(
                "font-style",
                "text-transform",
                "text-decoration",
                "font-variant"
            ),
            correctAnswer = "text-transform",
            explanation = "text-transform changes text case.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_017",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value converts text to lowercase?",
            options = listOf(
                "capitalize",
                "lowercase",
                "uppercase",
                "none"
            ),
            correctAnswer = "lowercase",
            explanation = "lowercase converts all letters to small letters.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_018",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value capitalizes first letter of each word?",
            options = listOf(
                "uppercase",
                "capitalize",
                "lowercase",
                "small-caps"
            ),
            correctAnswer = "capitalize",
            explanation = "capitalize converts first letter of each word to uppercase.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_019",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property adds shadow to text?",
            options = listOf(
                "box-shadow",
                "font-shadow",
                "text-shadow",
                "shadow"
            ),
            correctAnswer = "text-shadow",
            explanation = "text-shadow adds shadow effects to text.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_020",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls text wrapping?",
            options = listOf(
                "white-space",
                "word-break",
                "overflow",
                "text-wrap"
            ),
            correctAnswer = "white-space",
            explanation = "white-space controls text wrapping behavior.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_021",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value prevents text wrapping?",
            options = listOf(
                "wrap",
                "nowrap",
                "pre",
                "normal"
            ),
            correctAnswer = "nowrap",
            explanation = "nowrap keeps text in a single line.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_022",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls text overflow behavior?",
            options = listOf(
                "overflow",
                "text-overflow",
                "white-space",
                "display"
            ),
            correctAnswer = "text-overflow",
            explanation = "text-overflow handles clipped text.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_023",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value shows ellipsis for clipped text?",
            options = listOf(
                "clip",
                "ellipsis",
                "hidden",
                "dots"
            ),
            correctAnswer = "ellipsis",
            explanation = "ellipsis shows three dots for overflow text.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_024",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls font style variants?",
            options = listOf(
                "font-style",
                "font-weight",
                "font-variant",
                "text-transform"
            ),
            correctAnswer = "font-variant",
            explanation = "font-variant controls small-caps styling.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_025",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value of font-variant enables small caps?",
            options = listOf(
                "uppercase",
                "capitalize",
                "small-caps",
                "lowercase"
            ),
            correctAnswer = "small-caps",
            explanation = "small-caps displays lowercase letters as small uppercase.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_026",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which unit is relative to parent font size?",
            options = listOf(
                "px",
                "em",
                "rem",
                "%"
            ),
            correctAnswer = "em",
            explanation = "em is relative to parent element font size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_027",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which unit is relative to root font size?",
            options = listOf(
                "px",
                "em",
                "rem",
                "%"
            ),
            correctAnswer = "rem",
            explanation = "rem is based on root element font size.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_028",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls font stretching?",
            options = listOf(
                "font-stretch",
                "font-style",
                "font-weight",
                "text-transform"
            ),
            correctAnswer = "font-stretch",
            explanation = "font-stretch controls condensed or expanded fonts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_029",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which font-family type has small decorative strokes?",
            options = listOf(
                "sans-serif",
                "serif",
                "monospace",
                "cursive"
            ),
            correctAnswer = "serif",
            explanation = "Serif fonts have small decorative strokes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_030",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which font-family type has equal character width?",
            options = listOf(
                "serif",
                "sans-serif",
                "monospace",
                "cursive"
            ),
            correctAnswer = "monospace",
            explanation = "Monospace fonts have equal width characters.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_031",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which CSS rule allows custom fonts?",
            options = listOf(
                "@font-face",
                "@font-import",
                "@custom-font",
                "@font-style"
            ),
            correctAnswer = "@font-face",
            explanation = "@font-face allows defining custom fonts.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_032",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property defines font file location?",
            options = listOf(
                "font-family",
                "src",
                "url",
                "font-url"
            ),
            correctAnswer = "src",
            explanation = "src specifies the font file path.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_033",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls text direction?",
            options = listOf(
                "direction",
                "unicode-bidi",
                "writing-mode",
                "text-orientation"
            ),
            correctAnswer = "direction",
            explanation = "direction controls left-to-right or right-to-left text.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_034",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value sets right-to-left text?",
            options = listOf(
                "ltr",
                "rtl",
                "auto",
                "reverse"
            ),
            correctAnswer = "rtl",
            explanation = "rtl displays text from right to left.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_035",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls vertical text orientation?",
            options = listOf(
                "writing-mode",
                "text-align",
                "direction",
                "unicode-bidi"
            ),
            correctAnswer = "writing-mode",
            explanation = "writing-mode controls vertical or horizontal text.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_036",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which writing-mode displays vertical text?",
            options = listOf(
                "horizontal-tb",
                "vertical-rl",
                "inline",
                "block"
            ),
            correctAnswer = "vertical-rl",
            explanation = "vertical-rl displays vertical text from right to left.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_037",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property improves text readability on small screens?",
            options = listOf(
                "font-weight",
                "line-height",
                "text-align",
                "letter-spacing"
            ),
            correctAnswer = "line-height",
            explanation = "Proper line-height improves readability.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_038",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which font-family is best as fallback?",
            options = listOf(
                "cursive",
                "fantasy",
                "sans-serif",
                "emoji"
            ),
            correctAnswer = "sans-serif",
            explanation = "Sans-serif is commonly used as fallback.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_039",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property controls font rendering emphasis?",
            options = listOf(
                "font-smooth",
                "font-weight",
                "text-rendering",
                "font-style"
            ),
            correctAnswer = "text-rendering",
            explanation = "text-rendering optimizes font display.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_040",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property prevents text selection?",
            options = listOf(
                "user-select",
                "text-select",
                "pointer-events",
                "selection"
            ),
            correctAnswer = "user-select",
            explanation = "user-select controls text selection behavior.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_041",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value disables text selection?",
            options = listOf(
                "none",
                "hidden",
                "disable",
                "off"
            ),
            correctAnswer = "none",
            explanation = "user-select: none disables text selection.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_042",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which property highlights selected text?",
            options = listOf(
                "::selection",
                ":selection",
                "::highlight",
                ":highlight"
            ),
            correctAnswer = "::selection",
            explanation = "::selection styles selected text.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_043",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which CSS concept allows text properties to inherit?",
            options = listOf(
                "Specificity",
                "Inheritance",
                "Cascading",
                "Priority"
            ),
            correctAnswer = "Inheritance",
            explanation = "Text properties often inherit from parent elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_044",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which value resets font properties to default?",
            options = listOf(
                "inherit",
                "unset",
                "initial",
                "none"
            ),
            correctAnswer = "initial",
            explanation = "initial resets property to default browser value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_text_and_fonts_045",
            categoryId = categoryId,
            chapterId = CSS_TEXT_FONTS,
            questionText = "Which CSS shorthand sets multiple font properties?",
            options = listOf(
                "font",
                "font-style",
                "font-family",
                "font-weight"
            ),
            correctAnswer = "font",
            explanation = "font shorthand sets style, weight, size, and family together.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_001",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which CSS property controls how an element is displayed?",
            options = listOf(
                "position",
                "display",
                "visibility",
                "overflow"
            ),
            correctAnswer = "display",
            explanation = "The display property defines how an element is rendered on the page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_002",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value hides an element completely?",
            options = listOf(
                "hidden",
                "none",
                "invisible",
                "collapse"
            ),
            correctAnswer = "none",
            explanation = "display: none removes the element from the layout.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_003",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value keeps space but hides element?",
            options = listOf(
                "none",
                "hidden",
                "visibility: hidden",
                "collapse"
            ),
            correctAnswer = "visibility: hidden",
            explanation = "visibility: hidden hides the element but keeps its space.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_004",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value is default for <div>?",
            options = listOf(
                "inline",
                "inline-block",
                "block",
                "flex"
            ),
            correctAnswer = "block",
            explanation = "Div elements are block-level by default.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_005",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value is default for <span>?",
            options = listOf(
                "block",
                "inline",
                "inline-block",
                "flex"
            ),
            correctAnswer = "inline",
            explanation = "Span elements are inline by default.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_006",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value allows width and height on inline elements?",
            options = listOf(
                "inline",
                "block",
                "inline-block",
                "flex"
            ),
            correctAnswer = "inline-block",
            explanation = "inline-block allows width and height while staying inline.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_007",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property controls element positioning?",
            options = listOf(
                "display",
                "float",
                "position",
                "align"
            ),
            correctAnswer = "position",
            explanation = "position defines how an element is positioned.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_008",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "What is the default value of position?",
            options = listOf(
                "relative",
                "absolute",
                "static",
                "fixed"
            ),
            correctAnswer = "static",
            explanation = "static is the default positioning behavior.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_009",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which position value allows movement using top/left?",
            options = listOf(
                "static",
                "relative",
                "inline",
                "inherit"
            ),
            correctAnswer = "relative",
            explanation = "relative allows offset positioning from its normal place.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_010",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which position value removes element from normal flow?",
            options = listOf(
                "relative",
                "static",
                "absolute",
                "inline"
            ),
            correctAnswer = "absolute",
            explanation = "absolute removes the element from normal document flow.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_011",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Absolute positioning is relative to which element?",
            options = listOf(
                "Viewport",
                "Parent always",
                "Nearest positioned ancestor",
                "Body tag"
            ),
            correctAnswer = "Nearest positioned ancestor",
            explanation = "Absolute positioning uses the nearest non-static ancestor.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_012",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which position value fixes element to viewport?",
            options = listOf(
                "absolute",
                "relative",
                "fixed",
                "sticky"
            ),
            correctAnswer = "fixed",
            explanation = "fixed positions element relative to viewport.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_013",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which position value sticks after scrolling?",
            options = listOf(
                "fixed",
                "relative",
                "absolute",
                "sticky"
            ),
            correctAnswer = "sticky",
            explanation = "sticky toggles between relative and fixed based on scroll.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_014",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which properties move positioned elements?",
            options = listOf(
                "margin and padding",
                "top, right, bottom, left",
                "float and clear",
                "display and visibility"
            ),
            correctAnswer = "top, right, bottom, left",
            explanation = "These properties offset positioned elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_015",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property controls stacking order?",
            options = listOf(
                "order",
                "z-index",
                "stack",
                "layer"
            ),
            correctAnswer = "z-index",
            explanation = "z-index controls vertical stacking of elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_016",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "z-index works only on which elements?",
            options = listOf(
                "Static elements",
                "Positioned elements",
                "Inline elements",
                "Hidden elements"
            ),
            correctAnswer = "Positioned elements",
            explanation = "z-index applies only to positioned elements.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_017",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value creates flexible layouts?",
            options = listOf(
                "block",
                "grid",
                "flex",
                "inline"
            ),
            correctAnswer = "flex",
            explanation = "flex enables flexible box layout.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_018",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property hides overflow content?",
            options = listOf(
                "display",
                "overflow",
                "clip",
                "visibility"
            ),
            correctAnswer = "overflow",
            explanation = "overflow controls content exceeding container.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_019",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which overflow value shows scrollbars always?",
            options = listOf(
                "auto",
                "hidden",
                "scroll",
                "visible"
            ),
            correctAnswer = "scroll",
            explanation = "scroll always shows scrollbars.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_020",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property floats an element?",
            options = listOf(
                "position",
                "display",
                "float",
                "align"
            ),
            correctAnswer = "float",
            explanation = "float moves element left or right.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_021",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property clears floated elements?",
            options = listOf(
                "clear",
                "float",
                "overflow",
                "position"
            ),
            correctAnswer = "clear",
            explanation = "clear prevents floating beside an element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_022",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which clear value clears both sides?",
            options = listOf(
                "left",
                "right",
                "both",
                "none"
            ),
            correctAnswer = "both",
            explanation = "both clears left and right floats.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_023",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value removes line breaks?",
            options = listOf(
                "block",
                "inline",
                "flex",
                "grid"
            ),
            correctAnswer = "inline",
            explanation = "inline elements do not start on new lines.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_024",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which position value respects normal document flow?",
            options = listOf(
                "absolute",
                "fixed",
                "relative",
                "sticky"
            ),
            correctAnswer = "relative",
            explanation = "relative keeps element in normal flow.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_025",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which unit is commonly used with position offsets?",
            options = listOf(
                "deg",
                "px",
                "s",
                "hz"
            ),
            correctAnswer = "px",
            explanation = "px is commonly used for offsets.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_026",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property aligns inline content vertically?",
            options = listOf(
                "text-align",
                "vertical-align",
                "align-items",
                "justify-content"
            ),
            correctAnswer = "vertical-align",
            explanation = "vertical-align aligns inline or table-cell elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_027",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which value aligns element to top?",
            options = listOf(
                "middle",
                "bottom",
                "top",
                "center"
            ),
            correctAnswer = "top",
            explanation = "top aligns element to the top.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_028",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value creates a grid layout?",
            options = listOf(
                "flex",
                "block",
                "grid",
                "inline"
            ),
            correctAnswer = "grid",
            explanation = "grid enables CSS Grid layout.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_029",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property controls element visibility without removing space?",
            options = listOf(
                "display",
                "visibility",
                "opacity",
                "overflow"
            ),
            correctAnswer = "visibility",
            explanation = "visibility hides element but keeps layout space.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_030",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which value makes element invisible but clickable?",
            options = listOf(
                "display: none",
                "visibility: hidden",
                "opacity: 0",
                "overflow: hidden"
            ),
            correctAnswer = "opacity: 0",
            explanation = "opacity: 0 hides element visually but keeps interaction.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_031",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property controls transparency?",
            options = listOf(
                "visibility",
                "opacity",
                "display",
                "filter"
            ),
            correctAnswer = "opacity",
            explanation = "opacity controls transparency level.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_032",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which opacity value makes element fully visible?",
            options = listOf(
                "0",
                "0.5",
                "1",
                "100"
            ),
            correctAnswer = "1",
            explanation = "Opacity ranges from 0 to 1.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_033",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which display value collapses table rows?",
            options = listOf(
                "none",
                "collapse",
                "hidden",
                "inline"
            ),
            correctAnswer = "collapse",
            explanation = "collapse is used mainly in tables.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_034",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property is NOT related to positioning?",
            options = listOf(
                "top",
                "left",
                "z-index",
                "color"
            ),
            correctAnswer = "color",
            explanation = "color affects text, not positioning.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_035",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which position value uses viewport for reference?",
            options = listOf(
                "relative",
                "absolute",
                "fixed",
                "sticky"
            ),
            correctAnswer = "fixed",
            explanation = "fixed is positioned relative to viewport.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_036",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property affects layout flow most?",
            options = listOf(
                "color",
                "display",
                "opacity",
                "background"
            ),
            correctAnswer = "display",
            explanation = "display determines layout behavior.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_037",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which value removes element from accessibility tree?",
            options = listOf(
                "visibility: hidden",
                "opacity: 0",
                "display: none",
                "position: absolute"
            ),
            correctAnswer = "display: none",
            explanation = "display: none removes element entirely.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_038",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property controls document flow?",
            options = listOf(
                "position",
                "display",
                "float",
                "all of these"
            ),
            correctAnswer = "all of these",
            explanation = "All can affect document flow.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_039",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which value is default for visibility?",
            options = listOf(
                "hidden",
                "collapse",
                "visible",
                "none"
            ),
            correctAnswer = "visible",
            explanation = "visible is default visibility.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_040",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property can overlap elements?",
            options = listOf(
                "z-index",
                "margin",
                "padding",
                "clear"
            ),
            correctAnswer = "z-index",
            explanation = "z-index controls overlapping order.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_041",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property aligns inline-block elements?",
            options = listOf(
                "text-align",
                "vertical-align",
                "align-items",
                "justify-content"
            ),
            correctAnswer = "text-align",
            explanation = "text-align affects inline and inline-block elements.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_042",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which value makes element invisible but focusable?",
            options = listOf(
                "display: none",
                "visibility: hidden",
                "opacity: 0",
                "position: static"
            ),
            correctAnswer = "opacity: 0",
            explanation = "opacity: 0 keeps element interactive.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_043",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property fixes element during scroll?",
            options = listOf(
                "absolute",
                "relative",
                "sticky",
                "fixed"
            ),
            correctAnswer = "fixed",
            explanation = "fixed keeps element fixed on screen.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_044",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which property prevents overlap with floats?",
            options = listOf(
                "clear",
                "float",
                "position",
                "display"
            ),
            correctAnswer = "clear",
            explanation = "clear prevents floating elements beside it.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_display_and_position_045",
            categoryId = categoryId,
            chapterId = CSS_DISPLAY,
            questionText = "Which CSS chapter explains element layout and positioning?",
            options = listOf(
                "Selectors",
                "Box Model",
                "Display and Position",
                "Flexbox"
            ),
            correctAnswer = "Display and Position",
            explanation = "This chapter focuses on layout and positioning.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_001",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which CSS property enables Flexbox layout?",
            options = listOf(
                "display: grid",
                "display: block",
                "display: flex",
                "position: flex"
            ),
            correctAnswer = "display: flex",
            explanation = "Flexbox is enabled by setting display to flex.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_002",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which element becomes a flex container?",
            options = listOf(
                "Child element",
                "Parent element",
                "Only div",
                "Only span"
            ),
            correctAnswer = "Parent element",
            explanation = "The element with display:flex becomes the flex container.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_003",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "What are items inside a flex container called?",
            options = listOf(
                "Grid items",
                "Flex items",
                "Block items",
                "Inline items"
            ),
            correctAnswer = "Flex items",
            explanation = "Children of a flex container are called flex items.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_004",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property defines the main axis direction?",
            options = listOf(
                "align-items",
                "flex-wrap",
                "flex-direction",
                "justify-content"
            ),
            correctAnswer = "flex-direction",
            explanation = "flex-direction defines the main axis direction.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_005",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "What is the default flex-direction?",
            options = listOf(
                "column",
                "row",
                "row-reverse",
                "column-reverse"
            ),
            correctAnswer = "row",
            explanation = "Flexbox default direction is row.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_006",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which axis runs horizontally by default?",
            options = listOf(
                "Cross axis",
                "Main axis",
                "Z axis",
                "Inline axis"
            ),
            correctAnswer = "Main axis",
            explanation = "By default, the main axis runs horizontally.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_007",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property aligns items along the main axis?",
            options = listOf(
                "align-items",
                "align-content",
                "justify-content",
                "flex-wrap"
            ),
            correctAnswer = "justify-content",
            explanation = "justify-content aligns items along the main axis.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_008",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property aligns items along the cross axis?",
            options = listOf(
                "justify-content",
                "align-items",
                "flex-grow",
                "flex-basis"
            ),
            correctAnswer = "align-items",
            explanation = "align-items controls cross-axis alignment.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_009",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value centers items horizontally in a row flex container?",
            options = listOf(
                "align-items: center",
                "justify-content: center",
                "flex-direction: center",
                "align-content: center"
            ),
            correctAnswer = "justify-content: center",
            explanation = "justify-content centers items along main axis.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_010",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value centers items vertically in a row flex container?",
            options = listOf(
                "justify-content: center",
                "align-items: center",
                "align-content: center",
                "flex-wrap: center"
            ),
            correctAnswer = "align-items: center",
            explanation = "align-items centers items along cross axis.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_011",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property allows flex items to wrap?",
            options = listOf(
                "flex-flow",
                "flex-wrap",
                "flex-grow",
                "flex-shrink"
            ),
            correctAnswer = "flex-wrap",
            explanation = "flex-wrap allows items to move to next line.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_012",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "What is the default value of flex-wrap?",
            options = listOf(
                "wrap",
                "nowrap",
                "wrap-reverse",
                "inherit"
            ),
            correctAnswer = "nowrap",
            explanation = "By default, flex items do not wrap.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_013",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which shorthand combines flex-direction and flex-wrap?",
            options = listOf(
                "flex",
                "flex-align",
                "flex-flow",
                "flex-box"
            ),
            correctAnswer = "flex-flow",
            explanation = "flex-flow is shorthand for direction and wrap.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_014",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property controls space between wrapped rows?",
            options = listOf(
                "align-items",
                "justify-content",
                "align-content",
                "flex-wrap"
            ),
            correctAnswer = "align-content",
            explanation = "align-content aligns multiple flex lines.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_015",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property affects only a single flex item?",
            options = listOf(
                "justify-content",
                "align-items",
                "align-self",
                "align-content"
            ),
            correctAnswer = "align-self",
            explanation = "align-self overrides alignment for a single item.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_016",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which flexbox property controls item growth?",
            options = listOf(
                "flex-grow",
                "flex-shrink",
                "flex-basis",
                "flex-flow"
            ),
            correctAnswer = "flex-grow",
            explanation = "flex-grow controls how items grow.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_017",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "What does flex-grow: 0 mean?",
            options = listOf(
                "Item grows equally",
                "Item shrinks",
                "Item does not grow",
                "Item fills container"
            ),
            correctAnswer = "Item does not grow",
            explanation = "0 means the item will not grow.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_018",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property controls item shrinking?",
            options = listOf(
                "flex-grow",
                "flex-wrap",
                "flex-shrink",
                "flex-basis"
            ),
            correctAnswer = "flex-shrink",
            explanation = "flex-shrink controls how items shrink.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_019",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "What does flex-shrink: 0 do?",
            options = listOf(
                "Prevents shrinking",
                "Forces shrinking",
                "Resets size",
                "Wraps items"
            ),
            correctAnswer = "Prevents shrinking",
            explanation = "0 prevents the item from shrinking.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_020",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property sets initial size of flex item?",
            options = listOf(
                "width",
                "flex-basis",
                "flex-grow",
                "flex-shrink"
            ),
            correctAnswer = "flex-basis",
            explanation = "flex-basis defines initial main size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_021",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "What does flex-basis: auto use?",
            options = listOf(
                "Content size",
                "Width or height",
                "Always 0",
                "Container size"
            ),
            correctAnswer = "Width or height",
            explanation = "auto uses width or height property.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_022",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which shorthand sets grow, shrink, and basis?",
            options = listOf(
                "flex",
                "flex-flow",
                "flex-item",
                "flex-align"
            ),
            correctAnswer = "flex",
            explanation = "flex shorthand sets grow, shrink, basis.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_023",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "What does flex: 1 mean?",
            options = listOf(
                "flex: 1 1 0",
                "flex: 0 1 auto",
                "flex: auto",
                "flex: none"
            ),
            correctAnswer = "flex: 1 1 0",
            explanation = "flex:1 equals grow 1, shrink 1, basis 0.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_024",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which flex-direction stacks items vertically?",
            options = listOf(
                "row",
                "row-reverse",
                "column",
                "inline"
            ),
            correctAnswer = "column",
            explanation = "column stacks items top to bottom.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_025",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value reverses item order horizontally?",
            options = listOf(
                "column-reverse",
                "row-reverse",
                "reverse",
                "inline-reverse"
            ),
            correctAnswer = "row-reverse",
            explanation = "row-reverse reverses horizontal order.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_026",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property sets order of flex items?",
            options = listOf(
                "z-index",
                "order",
                "position",
                "sequence"
            ),
            correctAnswer = "order",
            explanation = "order controls visual order of flex items.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_027",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Default value of order is?",
            options = listOf(
                "0",
                "1",
                "-1",
                "auto"
            ),
            correctAnswer = "0",
            explanation = "Default order value is 0.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_028",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Higher order value means?",
            options = listOf(
                "Item appears first",
                "Item appears last",
                "Item shrinks",
                "Item grows"
            ),
            correctAnswer = "Item appears last",
            explanation = "Higher order appears later visually.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_029",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which axis does align-items work on?",
            options = listOf(
                "Main axis",
                "Cross axis",
                "Inline axis",
                "Block axis"
            ),
            correctAnswer = "Cross axis",
            explanation = "align-items aligns along cross axis.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_030",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which axis does justify-content work on?",
            options = listOf(
                "Cross axis",
                "Main axis",
                "Vertical axis",
                "Z axis"
            ),
            correctAnswer = "Main axis",
            explanation = "justify-content works on main axis.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_031",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which align-items value stretches items?",
            options = listOf(
                "center",
                "flex-start",
                "stretch",
                "baseline"
            ),
            correctAnswer = "stretch",
            explanation = "stretch stretches items to fill cross axis.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_032",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Default value of align-items is?",
            options = listOf(
                "center",
                "flex-start",
                "stretch",
                "baseline"
            ),
            correctAnswer = "stretch",
            explanation = "stretch is the default align-items value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_033",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value aligns items at start of cross axis?",
            options = listOf(
                "center",
                "flex-end",
                "flex-start",
                "baseline"
            ),
            correctAnswer = "flex-start",
            explanation = "flex-start aligns items at start.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_034",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value aligns items based on text baseline?",
            options = listOf(
                "stretch",
                "center",
                "baseline",
                "flex-end"
            ),
            correctAnswer = "baseline",
            explanation = "baseline aligns items by text baseline.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_035",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which flexbox feature helps responsive layouts?",
            options = listOf(
                "float",
                "flex-wrap",
                "z-index",
                "outline"
            ),
            correctAnswer = "flex-wrap",
            explanation = "flex-wrap helps items adjust on small screens.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_036",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property distributes extra space evenly?",
            options = listOf(
                "justify-content: space-between",
                "align-items: center",
                "flex-grow",
                "flex-basis"
            ),
            correctAnswer = "justify-content: space-between",
            explanation = "space-between distributes space evenly.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_037",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value adds equal space around items?",
            options = listOf(
                "space-around",
                "space-between",
                "center",
                "stretch"
            ),
            correctAnswer = "space-around",
            explanation = "space-around adds space around items.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_038",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value adds equal space between and edges?",
            options = listOf(
                "space-around",
                "space-evenly",
                "space-between",
                "center"
            ),
            correctAnswer = "space-evenly",
            explanation = "space-evenly adds equal spacing everywhere.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_039",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property overrides container alignment?",
            options = listOf(
                "align-content",
                "align-items",
                "align-self",
                "justify-content"
            ),
            correctAnswer = "align-self",
            explanation = "align-self overrides alignment per item.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_040",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which flexbox property affects only flex items?",
            options = listOf(
                "display",
                "position",
                "order",
                "float"
            ),
            correctAnswer = "order",
            explanation = "order applies only to flex items.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_041",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which value prevents flex item from shrinking?",
            options = listOf(
                "flex: 1",
                "flex-shrink: 0",
                "flex-grow: 0",
                "flex-basis: auto"
            ),
            correctAnswer = "flex-shrink: 0",
            explanation = "0 disables shrinking.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_042",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property defines spacing between flex items (modern CSS)?",
            options = listOf(
                "margin",
                "gap",
                "padding",
                "space"
            ),
            correctAnswer = "gap",
            explanation = "gap adds spacing between flex items.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_043",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which property works in both grid and flexbox?",
            options = listOf(
                "float",
                "gap",
                "clear",
                "z-index"
            ),
            correctAnswer = "gap",
            explanation = "gap works in both grid and flex layouts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_044",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which flexbox concept solves 1D layouts?",
            options = listOf(
                "Grid",
                "Box Model",
                "Flexbox",
                "Positioning"
            ),
            correctAnswer = "Flexbox",
            explanation = "Flexbox is designed for one-dimensional layouts.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_flexbox_045",
            categoryId = categoryId,
            chapterId = CSS_FLEXBOX,
            questionText = "Which flexbox feature improves responsiveness?",
            options = listOf(
                "order",
                "flex-wrap",
                "z-index",
                "outline"
            ),
            correctAnswer = "flex-wrap",
            explanation = "flex-wrap helps layouts adapt to screen size.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_001",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which CSS property enables Grid layout?",
            options = listOf(
                "display: flex",
                "display: block",
                "display: grid",
                "position: grid"
            ),
            correctAnswer = "display: grid",
            explanation = "CSS Grid is enabled by setting display to grid.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_002",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which element becomes the grid container?",
            options = listOf(
                "Child element",
                "Parent element",
                "Only div",
                "Only section"
            ),
            correctAnswer = "Parent element",
            explanation = "The element with display:grid becomes the grid container.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_003",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "What are direct children of grid container called?",
            options = listOf(
                "Grid blocks",
                "Grid cells",
                "Grid items",
                "Grid areas"
            ),
            correctAnswer = "Grid items",
            explanation = "Direct children of grid container are grid items.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_004",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property defines grid columns?",
            options = listOf(
                "grid-template-rows",
                "grid-columns",
                "grid-template-columns",
                "grid-column"
            ),
            correctAnswer = "grid-template-columns",
            explanation = "grid-template-columns defines column structure.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_005",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property defines grid rows?",
            options = listOf(
                "grid-template-rows",
                "grid-rows",
                "grid-row",
                "grid-template"
            ),
            correctAnswer = "grid-template-rows",
            explanation = "grid-template-rows defines row structure.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_006",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which unit represents a fraction of available space?",
            options = listOf(
                "px",
                "%",
                "fr",
                "em"
            ),
            correctAnswer = "fr",
            explanation = "fr unit divides available space proportionally.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_007",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property defines spacing between grid items?",
            options = listOf(
                "margin",
                "padding",
                "gap",
                "spacing"
            ),
            correctAnswer = "gap",
            explanation = "gap defines spacing between grid rows and columns.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_008",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which older properties were replaced by gap?",
            options = listOf(
                "row-gap and column-gap",
                "grid-gap and grid-space",
                "gap-row and gap-column",
                "spacing-row and spacing-column"
            ),
            correctAnswer = "row-gap and column-gap",
            explanation = "gap replaces row-gap and column-gap.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_009",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property places grid items horizontally?",
            options = listOf(
                "align-items",
                "justify-items",
                "justify-content",
                "align-content"
            ),
            correctAnswer = "justify-items",
            explanation = "justify-items aligns items horizontally in cells.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_010",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property places grid items vertically?",
            options = listOf(
                "align-items",
                "justify-items",
                "justify-content",
                "place-items"
            ),
            correctAnswer = "align-items",
            explanation = "align-items aligns items vertically inside cells.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_011",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which shorthand sets align-items and justify-items?",
            options = listOf(
                "place-items",
                "grid-align",
                "align-grid",
                "grid-items"
            ),
            correctAnswer = "place-items",
            explanation = "place-items is shorthand for align-items and justify-items.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_012",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property aligns entire grid horizontally?",
            options = listOf(
                "justify-items",
                "align-items",
                "justify-content",
                "place-items"
            ),
            correctAnswer = "justify-content",
            explanation = "justify-content aligns the grid within container horizontally.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_013",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property aligns entire grid vertically?",
            options = listOf(
                "align-content",
                "align-items",
                "justify-items",
                "place-items"
            ),
            correctAnswer = "align-content",
            explanation = "align-content aligns the grid vertically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_014",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which shorthand sets align-content and justify-content?",
            options = listOf(
                "place-content",
                "grid-content",
                "content-align",
                "align-grid"
            ),
            correctAnswer = "place-content",
            explanation = "place-content is shorthand for grid content alignment.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_015",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property defines named grid areas?",
            options = listOf(
                "grid-template",
                "grid-template-areas",
                "grid-area",
                "grid-name"
            ),
            correctAnswer = "grid-template-areas",
            explanation = "grid-template-areas defines named layout areas.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_016",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property assigns item to named area?",
            options = listOf(
                "grid-area",
                "grid-column",
                "grid-row",
                "place-area"
            ),
            correctAnswer = "grid-area",
            explanation = "grid-area places item in a named grid area.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_017",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which function repeats columns automatically?",
            options = listOf(
                "auto-fit()",
                "repeat()",
                "minmax()",
                "fit-content()"
            ),
            correctAnswer = "repeat()",
            explanation = "repeat() reduces repetitive column definitions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_018",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which function sets min and max column size?",
            options = listOf(
                "repeat()",
                "auto-fit()",
                "minmax()",
                "fr()"
            ),
            correctAnswer = "minmax()",
            explanation = "minmax() sets minimum and maximum track size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_019",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which keyword fills available columns automatically?",
            options = listOf(
                "auto-fit",
                "auto-fill",
                "fit",
                "fill"
            ),
            correctAnswer = "auto-fill",
            explanation = "auto-fill creates as many columns as possible.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_020",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which keyword collapses empty tracks?",
            options = listOf(
                "auto-fill",
                "auto-fit",
                "collapse",
                "hidden"
            ),
            correctAnswer = "auto-fit",
            explanation = "auto-fit collapses unused grid tracks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_021",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property controls item column position?",
            options = listOf(
                "grid-column",
                "grid-row",
                "grid-area",
                "grid-template"
            ),
            correctAnswer = "grid-column",
            explanation = "grid-column defines column start and end.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_022",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property controls item row position?",
            options = listOf(
                "grid-row",
                "grid-column",
                "grid-area",
                "grid-template"
            ),
            correctAnswer = "grid-row",
            explanation = "grid-row defines row start and end.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_023",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which value spans item across columns?",
            options = listOf(
                "auto",
                "span",
                "fill",
                "extend"
            ),
            correctAnswer = "span",
            explanation = "span allows item to cover multiple tracks.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_024",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property auto-places grid items?",
            options = listOf(
                "grid-auto-flow",
                "grid-auto-columns",
                "grid-auto-rows",
                "grid-flow"
            ),
            correctAnswer = "grid-auto-flow",
            explanation = "grid-auto-flow controls auto placement direction.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_025",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Default grid-auto-flow value is?",
            options = listOf(
                "row",
                "column",
                "dense",
                "auto"
            ),
            correctAnswer = "row",
            explanation = "Default auto placement is row-wise.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_026",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which value fills gaps automatically?",
            options = listOf(
                "dense",
                "auto",
                "span",
                "fit"
            ),
            correctAnswer = "dense",
            explanation = "dense packing fills gaps in grid.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_027",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property defines implicit column size?",
            options = listOf(
                "grid-template-columns",
                "grid-auto-columns",
                "grid-columns",
                "auto-columns"
            ),
            correctAnswer = "grid-auto-columns",
            explanation = "grid-auto-columns sets implicit column size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_028",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property defines implicit row size?",
            options = listOf(
                "grid-template-rows",
                "grid-auto-rows",
                "grid-rows",
                "auto-rows"
            ),
            correctAnswer = "grid-auto-rows",
            explanation = "grid-auto-rows sets implicit row size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_029",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid feature supports 2D layouts?",
            options = listOf(
                "Flexbox",
                "Grid",
                "Float",
                "Position"
            ),
            correctAnswer = "Grid",
            explanation = "Grid handles rows and columns together.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_030",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which unit adapts best for responsive grids?",
            options = listOf(
                "px",
                "em",
                "fr",
                "%"
            ),
            correctAnswer = "fr",
            explanation = "fr adapts to available grid space.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_031",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property centers items both axes?",
            options = listOf(
                "place-items: center",
                "align-items: center",
                "justify-items: center",
                "grid-center"
            ),
            correctAnswer = "place-items: center",
            explanation = "place-items centers items horizontally and vertically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_032",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property centers grid itself?",
            options = listOf(
                "place-items",
                "place-content",
                "align-items",
                "justify-items"
            ),
            correctAnswer = "place-content",
            explanation = "place-content centers the entire grid.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_033",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which CSS feature replaces complex float layouts?",
            options = listOf(
                "Float",
                "Position",
                "Grid",
                "Inline-block"
            ),
            correctAnswer = "Grid",
            explanation = "Grid simplifies complex layouts.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_034",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property allows overlapping grid items?",
            options = listOf(
                "grid-overlap",
                "z-index",
                "overlap",
                "grid-layer"
            ),
            correctAnswer = "z-index",
            explanation = "z-index controls overlapping order.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_035",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid value is invalid?",
            options = listOf(
                "1fr",
                "minmax(100px,1fr)",
                "repeat(3,1fr)",
                "grid(2)"
            ),
            correctAnswer = "grid(2)",
            explanation = "grid(2) is not a valid CSS grid value.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_036",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which function limits column size to content?",
            options = listOf(
                "minmax()",
                "fit-content()",
                "auto-fit",
                "repeat()"
            ),
            correctAnswer = "fit-content()",
            explanation = "fit-content() limits track size to content.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_037",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid concept supports named lines?",
            options = listOf(
                "Grid areas",
                "Grid tracks",
                "Grid lines",
                "Grid cells"
            ),
            correctAnswer = "Grid lines",
            explanation = "Grid lines can be named for placement.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_038",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property uses named grid lines?",
            options = listOf(
                "grid-area",
                "grid-column",
                "grid-template-areas",
                "grid-template-columns"
            ),
            correctAnswer = "grid-column",
            explanation = "grid-column can reference named lines.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_039",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid feature improves accessibility?",
            options = listOf(
                "Order control",
                "Source order independence",
                "Float replacement",
                "Dense packing"
            ),
            correctAnswer = "Source order independence",
            explanation = "Grid separates layout from HTML order.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_040",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid layout dimension is vertical?",
            options = listOf(
                "Column",
                "Row",
                "Track",
                "Cell"
            ),
            correctAnswer = "Row",
            explanation = "Rows run horizontally, defining vertical layout.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_041",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid layout dimension is horizontal?",
            options = listOf(
                "Row",
                "Column",
                "Track",
                "Cell"
            ),
            correctAnswer = "Column",
            explanation = "Columns run vertically, defining horizontal layout.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_042",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which property controls grid auto placement direction?",
            options = listOf(
                "grid-auto-flow",
                "grid-direction",
                "grid-flow",
                "auto-grid"
            ),
            correctAnswer = "grid-auto-flow",
            explanation = "grid-auto-flow controls auto placement direction.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_043",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid feature is best for page layouts?",
            options = listOf(
                "Flexbox",
                "Grid",
                "Inline-block",
                "Float"
            ),
            correctAnswer = "Grid",
            explanation = "Grid is ideal for full page layouts.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_044",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which grid property can overlap areas intentionally?",
            options = listOf(
                "grid-template-areas",
                "z-index",
                "grid-auto-flow",
                "gap"
            ),
            correctAnswer = "grid-template-areas",
            explanation = "Overlapping area names can create overlap.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_grid_045",
            categoryId = categoryId,
            chapterId = CSS_GRID,
            questionText = "Which CSS chapter handles two-dimensional layouts?",
            options = listOf(
                "Flexbox",
                "Grid",
                "Box Model",
                "Positioning"
            ),
            correctAnswer = "Grid",
            explanation = "Grid is designed for 2D layouts.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_001",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "What is the main goal of responsive web design?",
            options = listOf(
                "Faster loading",
                "Better animations",
                "Adapt layout to different screen sizes",
                "Reduce HTML size"
            ),
            correctAnswer = "Adapt layout to different screen sizes",
            explanation = "Responsive design ensures websites work well on all devices.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_002",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS unit is most suitable for responsive layouts?",
            options = listOf(
                "px",
                "cm",
                "%",
                "pt"
            ),
            correctAnswer = "%",
            explanation = "Percentage units adapt relative to parent size.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_003",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS rule is essential for responsive design?",
            options = listOf(
                "@font-face",
                "@keyframes",
                "@media",
                "@supports"
            ),
            correctAnswer = "@media",
            explanation = "@media applies styles based on device conditions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_004",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "What does a media query check?",
            options = listOf(
                "Browser version",
                "Screen size or device features",
                "Internet speed",
                "HTML structure"
            ),
            correctAnswer = "Screen size or device features",
            explanation = "Media queries adapt CSS to screen characteristics.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_005",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which viewport meta tag enables proper scaling on mobile?",
            options = listOf(
                "width=device-width, initial-scale=1.0",
                "height=device-height",
                "user-scalable=no",
                "initial-scale=2.0"
            ),
            correctAnswer = "width=device-width, initial-scale=1.0",
            explanation = "This ensures correct width and zoom on mobile devices.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_006",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which unit is relative to viewport width?",
            options = listOf(
                "em",
                "rem",
                "vw",
                "vh"
            ),
            correctAnswer = "vw",
            explanation = "vw is 1% of the viewport width.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_007",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which unit is relative to viewport height?",
            options = listOf(
                "vh",
                "vw",
                "em",
                "%"
            ),
            correctAnswer = "vh",
            explanation = "vh represents a percentage of viewport height.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_008",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which unit is relative to root font size?",
            options = listOf(
                "em",
                "px",
                "rem",
                "%"
            ),
            correctAnswer = "rem",
            explanation = "rem is based on the root element font size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_009",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which approach starts designing from mobile first?",
            options = listOf(
                "Desktop-first",
                "Mobile-first",
                "Hybrid design",
                "Adaptive design"
            ),
            correctAnswer = "Mobile-first",
            explanation = "Mobile-first designs start with small screens.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_010",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which media query targets screens wider than 768px?",
            options = listOf(
                "@media (max-width: 768px)",
                "@media (min-width: 768px)",
                "@media (width: 768px)",
                "@media (device-width: 768px)"
            ),
            correctAnswer = "@media (min-width: 768px)",
            explanation = "min-width applies styles above the given width.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_011",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which property helps images scale responsively?",
            options = listOf(
                "height: auto",
                "max-width: 100%",
                "width: fixed",
                "display: block"
            ),
            correctAnswer = "max-width: 100%",
            explanation = "It prevents images from overflowing containers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_012",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which layout system is best for responsive grids?",
            options = listOf(
                "Float",
                "Inline-block",
                "CSS Grid",
                "Position absolute"
            ),
            correctAnswer = "CSS Grid",
            explanation = "Grid adapts well to different screen sizes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_013",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which flexbox property helps wrap items on small screens?",
            options = listOf(
                "flex-direction",
                "flex-wrap",
                "align-items",
                "justify-content"
            ),
            correctAnswer = "flex-wrap",
            explanation = "flex-wrap allows items to move to new lines.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_014",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS function helps create responsive columns?",
            options = listOf(
                "repeat()",
                "minmax()",
                "calc()",
                "fit-content()"
            ),
            correctAnswer = "minmax()",
            explanation = "minmax() sets flexible minimum and maximum sizes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_015",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which keyword hides content only on small screens?",
            options = listOf(
                "display: none",
                "visibility: hidden",
                "Using media queries",
                "opacity: 0"
            ),
            correctAnswer = "Using media queries",
            explanation = "Media queries control visibility per screen size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_016",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which breakpoint is commonly used for tablets?",
            options = listOf(
                "320px",
                "480px",
                "768px",
                "1200px"
            ),
            correctAnswer = "768px",
            explanation = "768px is a common tablet breakpoint.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_017",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS property adapts font size to screen width?",
            options = listOf(
                "font-size: px",
                "font-size: vw",
                "font-weight",
                "line-height"
            ),
            correctAnswer = "font-size: vw",
            explanation = "vw-based fonts scale with viewport width.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_018",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which approach improves performance on mobile?",
            options = listOf(
                "Desktop-first",
                "Mobile-first",
                "Large images first",
                "Fixed layouts"
            ),
            correctAnswer = "Mobile-first",
            explanation = "Mobile-first loads fewer styles initially.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_019",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which media feature detects device orientation?",
            options = listOf(
                "orientation",
                "direction",
                "rotation",
                "layout"
            ),
            correctAnswer = "orientation",
            explanation = "orientation detects portrait or landscape mode.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_020",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which orientation value targets landscape mode?",
            options = listOf(
                "vertical",
                "horizontal",
                "portrait",
                "landscape"
            ),
            correctAnswer = "landscape",
            explanation = "landscape applies when width is greater than height.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_021",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS feature adapts layouts without media queries?",
            options = listOf(
                "CSS Grid auto-fit",
                "Float",
                "Absolute positioning",
                "Z-index"
            ),
            correctAnswer = "CSS Grid auto-fit",
            explanation = "Auto-fit adapts columns automatically.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_022",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which property hides overflow on small screens?",
            options = listOf(
                "display",
                "overflow",
                "visibility",
                "position"
            ),
            correctAnswer = "overflow",
            explanation = "overflow controls extra content display.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_023",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which media query targets high-resolution screens?",
            options = listOf(
                "min-width",
                "max-width",
                "resolution",
                "orientation"
            ),
            correctAnswer = "resolution",
            explanation = "resolution targets high DPI screens.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_024",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS value makes layout fluid?",
            options = listOf(
                "Fixed px",
                "Percentage",
                "Absolute",
                "Static"
            ),
            correctAnswer = "Percentage",
            explanation = "Percentages adapt to container size.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_025",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS function combines multiple units?",
            options = listOf(
                "minmax()",
                "calc()",
                "repeat()",
                "var()"
            ),
            correctAnswer = "calc()",
            explanation = "calc() allows combining different CSS units.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_026",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which technique avoids horizontal scrolling?",
            options = listOf(
                "Fixed width",
                "Responsive layout",
                "Absolute positioning",
                "Large images"
            ),
            correctAnswer = "Responsive layout",
            explanation = "Responsive layouts adapt to screen width.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_027",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which breakpoint targets desktops?",
            options = listOf(
                "320px",
                "480px",
                "768px",
                "1024px and above"
            ),
            correctAnswer = "1024px and above",
            explanation = "Desktops usually start at 1024px.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_028",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS property makes videos responsive?",
            options = listOf(
                "max-width: 100%",
                "height: auto",
                "both A and B",
                "display: block"
            ),
            correctAnswer = "both A and B",
            explanation = "Both properties help videos scale correctly.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_029",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which unit should be avoided for responsive fonts?",
            options = listOf(
                "rem",
                "em",
                "vw",
                "pt"
            ),
            correctAnswer = "pt",
            explanation = "pt is print-based and not responsive-friendly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_030",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS feature adapts layout without breakpoints?",
            options = listOf(
                "Auto-fit grid",
                "Fixed width",
                "Absolute layout",
                "Float"
            ),
            correctAnswer = "Auto-fit grid",
            explanation = "Auto-fit grids adjust automatically.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_031",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which property limits element width on large screens?",
            options = listOf(
                "width",
                "min-width",
                "max-width",
                "fit-content"
            ),
            correctAnswer = "max-width",
            explanation = "max-width prevents elements from becoming too wide.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_032",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which approach loads styles progressively?",
            options = listOf(
                "Desktop-first",
                "Mobile-first",
                "Fixed-first",
                "Adaptive-first"
            ),
            correctAnswer = "Mobile-first",
            explanation = "Mobile-first loads minimal styles first.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_033",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS unit scales with parent font size?",
            options = listOf(
                "px",
                "rem",
                "em",
                "%"
            ),
            correctAnswer = "em",
            explanation = "em is relative to parent font size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_034",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS feature ensures accessibility on zoom?",
            options = listOf(
                "Fixed px fonts",
                "Relative units",
                "Absolute positioning",
                "Z-index"
            ),
            correctAnswer = "Relative units",
            explanation = "Relative units scale with zoom settings.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_035",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which media query condition targets touch devices?",
            options = listOf(
                "hover",
                "pointer",
                "resolution",
                "orientation"
            ),
            correctAnswer = "pointer",
            explanation = "pointer detects coarse or fine input devices.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_036",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which pointer value indicates touch input?",
            options = listOf(
                "fine",
                "coarse",
                "none",
                "touch"
            ),
            correctAnswer = "coarse",
            explanation = "coarse usually represents touch input.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_037",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS feature adapts layout based on container size?",
            options = listOf(
                "Media queries",
                "Container queries",
                "Grid auto-fit",
                "Flexbox"
            ),
            correctAnswer = "Container queries",
            explanation = "Container queries respond to parent size.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_038",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which property is used in container queries?",
            options = listOf(
                "container-type",
                "container-name",
                "container",
                "both A and B"
            ),
            correctAnswer = "both A and B",
            explanation = "Both container-type and container-name are used.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_039",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which responsive technique reduces media queries?",
            options = listOf(
                "Fluid layouts",
                "Fixed layouts",
                "Absolute units",
                "Table layouts"
            ),
            correctAnswer = "Fluid layouts",
            explanation = "Fluid layouts adapt naturally to screen size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_040",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS unit adapts best for spacing?",
            options = listOf(
                "px",
                "rem",
                "pt",
                "cm"
            ),
            correctAnswer = "rem",
            explanation = "rem scales well across devices.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_041",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which responsive strategy is exam-favorite?",
            options = listOf(
                "Fixed design",
                "Adaptive design",
                "Responsive design",
                "Static design"
            ),
            correctAnswer = "Responsive design",
            explanation = "Responsive design is widely tested in exams.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_042",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS property helps avoid overflow on small screens?",
            options = listOf(
                "max-width",
                "min-width",
                "width",
                "height"
            ),
            correctAnswer = "max-width",
            explanation = "max-width keeps elements within screen size.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_043",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS concept ensures layout flexibility?",
            options = listOf(
                "Cascading",
                "Inheritance",
                "Relative units",
                "Specificity"
            ),
            correctAnswer = "Relative units",
            explanation = "Relative units adapt to screen changes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_044",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which responsive technique is best for future-proofing?",
            options = listOf(
                "Fixed breakpoints",
                "Mobile-first design",
                "Desktop-first design",
                "Absolute units"
            ),
            correctAnswer = "Mobile-first design",
            explanation = "Mobile-first adapts well to new devices.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_responsive_design_045",
            categoryId = categoryId,
            chapterId = CSS_RESPONSIVE,
            questionText = "Which CSS chapter focuses on multi-device layouts?",
            options = listOf(
                "Grid",
                "Flexbox",
                "Responsive Design",
                "Box Model"
            ),
            correctAnswer = "Responsive Design",
            explanation = "Responsive Design focuses on multi-device support.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_001",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which CSS feature is used to create animations?",
            options = listOf(
                "Transitions",
                "Animations",
                "Transforms",
                "All of these"
            ),
            correctAnswer = "Animations",
            explanation = "CSS animations allow complex motion using keyframes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_002",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which rule defines animation steps?",
            options = listOf(
                "@transition",
                "@frames",
                "@keyframes",
                "@animate"
            ),
            correctAnswer = "@keyframes",
            explanation = "@keyframes defines stages of an animation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_003",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property starts an animation?",
            options = listOf(
                "animation-name",
                "animation-play",
                "animation-start",
                "animation-run"
            ),
            correctAnswer = "animation-name",
            explanation = "animation-name links an element to keyframes.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_004",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property controls animation duration?",
            options = listOf(
                "animation-delay",
                "animation-time",
                "animation-duration",
                "animation-speed"
            ),
            correctAnswer = "animation-duration",
            explanation = "animation-duration sets how long animation runs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_005",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property delays animation start?",
            options = listOf(
                "animation-wait",
                "animation-delay",
                "animation-start",
                "animation-offset"
            ),
            correctAnswer = "animation-delay",
            explanation = "animation-delay delays the animation start time.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_006",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property defines number of animation repeats?",
            options = listOf(
                "animation-repeat",
                "animation-count",
                "animation-iteration-count",
                "animation-loop"
            ),
            correctAnswer = "animation-iteration-count",
            explanation = "It defines how many times animation repeats.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_007",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which value makes animation infinite?",
            options = listOf(
                "repeat",
                "loop",
                "forever",
                "infinite"
            ),
            correctAnswer = "infinite",
            explanation = "infinite repeats animation endlessly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_008",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property controls animation speed curve?",
            options = listOf(
                "animation-flow",
                "animation-timing-function",
                "animation-ease",
                "animation-style"
            ),
            correctAnswer = "animation-timing-function",
            explanation = "It defines acceleration and deceleration.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_009",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which timing function starts slow and ends slow?",
            options = listOf(
                "linear",
                "ease",
                "ease-in",
                "ease-out"
            ),
            correctAnswer = "ease",
            explanation = "ease starts and ends slowly.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_010",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which timing function has constant speed?",
            options = listOf(
                "ease",
                "ease-in",
                "ease-out",
                "linear"
            ),
            correctAnswer = "linear",
            explanation = "linear keeps constant speed throughout.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_011",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property defines animation direction?",
            options = listOf(
                "animation-flow",
                "animation-direction",
                "animation-order",
                "animation-way"
            ),
            correctAnswer = "animation-direction",
            explanation = "It controls forward or reverse animation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_012",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which value runs animation forwards then backwards?",
            options = listOf(
                "reverse",
                "alternate",
                "alternate-reverse",
                "normal"
            ),
            correctAnswer = "alternate",
            explanation = "alternate runs animation forward then backward.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_013",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property controls animation state?",
            options = listOf(
                "animation-control",
                "animation-status",
                "animation-play-state",
                "animation-run-state"
            ),
            correctAnswer = "animation-play-state",
            explanation = "It pauses or plays the animation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_014",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which value pauses an animation?",
            options = listOf(
                "stop",
                "pause",
                "paused",
                "halt"
            ),
            correctAnswer = "paused",
            explanation = "paused stops animation temporarily.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_015",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property defines styles before animation starts?",
            options = listOf(
                "animation-fill-mode",
                "animation-style",
                "animation-before",
                "animation-start-mode"
            ),
            correctAnswer = "animation-fill-mode",
            explanation = "It controls styles before and after animation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_016",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which fill-mode applies styles before animation?",
            options = listOf(
                "forwards",
                "backwards",
                "both",
                "none"
            ),
            correctAnswer = "backwards",
            explanation = "backwards applies initial keyframe styles.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_017",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which fill-mode keeps final state after animation?",
            options = listOf(
                "backwards",
                "none",
                "forwards",
                "initial"
            ),
            correctAnswer = "forwards",
            explanation = "forwards keeps the final animation state.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_018",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which shorthand sets all animation properties?",
            options = listOf(
                "animation-all",
                "animate",
                "animation",
                "transition"
            ),
            correctAnswer = "animation",
            explanation = "animation is shorthand for all animation properties.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_019",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which CSS feature is lighter than animations?",
            options = listOf(
                "Transforms",
                "Transitions",
                "Keyframes",
                "Filters"
            ),
            correctAnswer = "Transitions",
            explanation = "Transitions handle simple state changes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_020",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property enables transitions?",
            options = listOf(
                "transition-enable",
                "transition-property",
                "transition-name",
                "transition-start"
            ),
            correctAnswer = "transition-property",
            explanation = "transition-property defines animated property.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_021",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property defines transition duration?",
            options = listOf(
                "transition-speed",
                "transition-delay",
                "transition-duration",
                "transition-time"
            ),
            correctAnswer = "transition-duration",
            explanation = "It defines how long transition lasts.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_022",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which timing function is default for transitions?",
            options = listOf(
                "linear",
                "ease",
                "ease-in",
                "ease-out"
            ),
            correctAnswer = "ease",
            explanation = "ease is the default timing function.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_023",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property delays transition start?",
            options = listOf(
                "transition-delay",
                "transition-wait",
                "transition-offset",
                "transition-pause"
            ),
            correctAnswer = "transition-delay",
            explanation = "transition-delay delays transition start.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_024",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which shorthand sets all transition properties?",
            options = listOf(
                "transition",
                "transition-all",
                "animate",
                "animation"
            ),
            correctAnswer = "transition",
            explanation = "transition is shorthand for transitions.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_025",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which CSS property animates movement?",
            options = listOf(
                "color",
                "transform",
                "float",
                "display"
            ),
            correctAnswer = "transform",
            explanation = "transform animates movement, scale, rotate.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_026",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which transform moves element horizontally?",
            options = listOf(
                "translateY()",
                "scaleX()",
                "translateX()",
                "rotateX()"
            ),
            correctAnswer = "translateX()",
            explanation = "translateX moves element horizontally.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_027",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which transform rotates an element?",
            options = listOf(
                "scale()",
                "translate()",
                "rotate()",
                "skew()"
            ),
            correctAnswer = "rotate()",
            explanation = "rotate rotates the element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_028",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which transform scales element size?",
            options = listOf(
                "rotate()",
                "translate()",
                "scale()",
                "skew()"
            ),
            correctAnswer = "scale()",
            explanation = "scale changes element size.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_029",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which transform tilts an element?",
            options = listOf(
                "rotate()",
                "skew()",
                "scale()",
                "translate()"
            ),
            correctAnswer = "skew()",
            explanation = "skew tilts the element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_030",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property improves animation performance?",
            options = listOf(
                "top",
                "left",
                "transform",
                "margin"
            ),
            correctAnswer = "transform",
            explanation = "transform is GPU-optimized.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_031",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property fades elements?",
            options = listOf(
                "visibility",
                "opacity",
                "display",
                "filter"
            ),
            correctAnswer = "opacity",
            explanation = "opacity controls transparency.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_032",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which opacity value hides element?",
            options = listOf(
                "0",
                "0.5",
                "1",
                "100"
            ),
            correctAnswer = "0",
            explanation = "Opacity 0 hides the element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_033",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property allows hardware acceleration?",
            options = listOf(
                "margin",
                "padding",
                "transform",
                "display"
            ),
            correctAnswer = "transform",
            explanation = "transform uses GPU acceleration.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_034",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which animation is better for hover effects?",
            options = listOf(
                "Keyframes",
                "Transitions",
                "JavaScript",
                "SVG"
            ),
            correctAnswer = "Transitions",
            explanation = "Transitions are ideal for simple hover effects.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_035",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which animation technique is exam-favorite?",
            options = listOf(
                "JavaScript animation",
                "CSS keyframes",
                "GIF animation",
                "Canvas animation"
            ),
            correctAnswer = "CSS keyframes",
            explanation = "CSS keyframes are commonly asked in exams.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_036",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property defines animation delay before repeat?",
            options = listOf(
                "animation-delay",
                "transition-delay",
                "animation-iteration-count",
                "animation-direction"
            ),
            correctAnswer = "animation-delay",
            explanation = "Delay applies before each iteration.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_037",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which animation state resumes animation?",
            options = listOf(
                "running",
                "resume",
                "play",
                "start"
            ),
            correctAnswer = "running",
            explanation = "running resumes animation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_038",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property animates rotation smoothly?",
            options = listOf(
                "rotate",
                "transform",
                "position",
                "display"
            ),
            correctAnswer = "transform",
            explanation = "transform handles rotation efficiently.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_039",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which CSS feature reduces JavaScript dependency?",
            options = listOf(
                "Transitions",
                "Animations",
                "Both A and B",
                "None"
            ),
            correctAnswer = "Both A and B",
            explanation = "CSS animations and transitions reduce JS usage.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_040",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which property controls animation direction reverse?",
            options = listOf(
                "alternate",
                "reverse",
                "animation-direction",
                "animation-play-state"
            ),
            correctAnswer = "animation-direction",
            explanation = "animation-direction controls reverse behavior.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_041",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which value plays animation backwards?",
            options = listOf(
                "reverse",
                "alternate",
                "backwards",
                "inverse"
            ),
            correctAnswer = "reverse",
            explanation = "reverse plays animation backwards.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_042",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which animation property is NOT valid?",
            options = listOf(
                "animation-name",
                "animation-speed",
                "animation-delay",
                "animation-duration"
            ),
            correctAnswer = "animation-speed",
            explanation = "animation-speed is not a valid CSS property.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_043",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which CSS feature improves UI feedback?",
            options = listOf(
                "Animations",
                "Transitions",
                "Transforms",
                "All of these"
            ),
            correctAnswer = "All of these",
            explanation = "All contribute to better UI feedback.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_044",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which animation type is best for loaders?",
            options = listOf(
                "Transitions",
                "Keyframe animations",
                "Hover effects",
                "Media queries"
            ),
            correctAnswer = "Keyframe animations",
            explanation = "Keyframes suit continuous loaders.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        cssQuestion(
            id = "css_animations_and_transitions_045",
            categoryId = categoryId,
            chapterId = CSS_ANIMATIONS,
            questionText = "Which CSS chapter focuses on motion effects?",
            options = listOf(
                "Responsive Design",
                "Grid",
                "Animations & Transitions",
                "Flexbox"
            ),
            correctAnswer = "Animations & Transitions",
            explanation = "This chapter covers motion and effects.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),


        )
}
