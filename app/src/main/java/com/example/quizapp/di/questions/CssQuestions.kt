package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID

public fun getCssQuestions(categoryId: String, createdAt: String): List<Question> {
    return listOf(
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to change the background color?",
            options = listOf("color", "bgcolor", "background-color", "background"),
            correctAnswer = "background-color", explanation = "The `background-color` property sets the background color of an element.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 20, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you select an element with id 'demo'?",
            options = listOf(".demo", "#demo", "demo", "*demo"),
            correctAnswer = "#demo", explanation = "In CSS, a hash (#) symbol is used to select an element by its id.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 25, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does CSS stand for?",
            options = listOf("Creative Style Sheets", "Cascading Style Sheets", "Computer Style Sheets", "Colorful Style Sheets"),
            correctAnswer = "Cascading Style Sheets", explanation = "CSS is the language we use to style an HTML document.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Where in an HTML document is the correct place to refer to an external style sheet?",
            options = listOf("In the <body> section", "At the end of the document", "In the <head> section", "Inside the <html> tag"),
            correctAnswer = "In the <head> section", explanation = "External styles are linked using the <link> tag inside the <head>.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML tag is used to define an internal style sheet?",
            options = listOf("<script>", "<style>", "<css>", "<link>"),
            correctAnswer = "<style>", explanation = "The <style> element is used to provide style information for a single HTML document.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS property is used to change the background color?",
            options = listOf("color", "bgcolor", "background-color", "cell-color"),
            correctAnswer = "background-color", explanation = "The background-color property sets the background color of an element.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS property is used to change the text color of an element?",
            options = listOf("text-color", "fgcolor", "color", "font-color"),
            correctAnswer = "color", explanation = "The color property specifies the color of text.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS property controls the text size?",
            options = listOf("text-style", "font-size", "text-size", "font-style"),
            correctAnswer = "font-size", explanation = "Font-size property sets the size of the font.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct CSS syntax for making all the <p> elements bold?",
            options = listOf("p {text-size:bold;}", "p {font-weight:bold;}", "<p style='font-size:bold;'>", "p {font-style:bold;}"),
            correctAnswer = "p {font-weight:bold;}", explanation = "The font-weight property sets how thick or thin characters in text should be displayed.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you display hyperlinks without an underline?",
            options = listOf("a {text-decoration:none;}", "a {underline:none;}", "a {text-style:no-underline;}", "a {decoration:no-underline;}"),
            correctAnswer = "a {text-decoration:none;}", explanation = "The text-decoration property is mostly used to remove underlines from links.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you make each word in a text start with a capital letter?",
            options = listOf("text-style:capitalize", "text-transform:capitalize", "transform:capitalize", "You can't do that with CSS"),
            correctAnswer = "text-transform:capitalize", explanation = "Text-transform:capitalize targets the first letter of each word.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to change the font of an element?",
            options = listOf("font-weight", "font-style", "font-family", "font-type"),
            correctAnswer = "font-family", explanation = "Font-family specifies the font for an element.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you add a background color for all <h1> elements?",
            options = listOf("h1.all {background-color:#FFFFFF;}", "h1 {background-color:#FFFFFF;}", "all.h1 {background-color:#FFFFFF;}", "h1 {bg-color:#FFFFFF;}"),
            correctAnswer = "h1 {background-color:#FFFFFF;}", explanation = "Standard element selector is used followed by the property.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to change the left margin of an element?",
            options = listOf("padding-left", "indent", "margin-left", "margin-left-side"),
            correctAnswer = "margin-left", explanation = "The margin-left property sets the left margin of an element.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you select an element with id 'demo'?",
            options = listOf(".demo", "#demo", "demo", "*demo"),
            correctAnswer = "#demo", explanation = "The # symbol is used for ID selectors in CSS.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you select elements with a specific class name?",
            options = listOf("#classname", "classname", ".classname", "*classname"),
            correctAnswer = ".classname", explanation = "The period (.) symbol is used for class selectors in CSS.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the default value of the position property?",
            options = listOf("relative", "fixed", "absolute", "static"),
            correctAnswer = "static", explanation = "HTML elements are positioned static by default; they follow the normal page flow.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you make the text italic?",
            options = listOf("font:italic;", "font-style:italic;", "text-style:italic;", "font-weight:italic;"),
            correctAnswer = "font-style:italic;", explanation = "Font-style is used to specify italic text.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to center-align text?",
            options = listOf("text-align", "align-text", "center", "text-center"),
            correctAnswer = "text-align", explanation = "Setting text-align: center centers the text inside a block element.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to create space between the element's border and its content?",
            options = listOf("margin", "spacing", "padding", "border-spacing"),
            correctAnswer = "padding", explanation = "Padding is the space inside the border, while margin is the space outside the border.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a border that is 5 pixels thick, solid, and red?",
            options = listOf("border: 5px solid red;", "border-width: 5px; border-style: solid; color: red;", "border: 5px red solid;", "border-style: solid 5px red;"),
            correctAnswer = "border: 5px solid red;", explanation = "This is the shorthand property for border-width, border-style, and border-color.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct way to write a CSS comment?",
            options = listOf("// this is a comment", "/* this is a comment */", "' this is a comment", ""),
            correctAnswer = "/* this is a comment */", explanation = "CSS comments are wrapped in /* and */.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to set the list style for an unordered list?",
            options = listOf("list-type", "list-style-type", "list-style-image", "bullet-style"),
            correctAnswer = "list-style-type", explanation = "List-style-type specifies the appearance of the list item marker.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to change the transparency of an element?",
            options = listOf("visibility", "opacity", "transparent", "filter"),
            correctAnswer = "opacity", explanation = "The opacity property can take a value from 0.0 (fully transparent) to 1.0 (fully opaque).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct CSS for making a multi-column layout?",
            options = listOf("column-count", "columns", "layout-columns", "display: columns"),
            correctAnswer = "column-count", explanation = "The column-count property specifies the number of columns an element should be divided into.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you make a list with square bullets?",
            options = listOf("list: square;", "list-style-type: square;", "list-type: square;", "bullet-type: square;"),
            correctAnswer = "list-style-type: square;", explanation = "Square is one of the standard values for list-style-type.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to add shadows to text?",
            options = listOf("shadow-text", "text-shadow", "font-shadow", "shadow"),
            correctAnswer = "text-shadow", explanation = "The text-shadow property adds shadow to text.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to change the stack order of an element?",
            options = listOf("z-index", "index", "stack-order", "s-index"),
            correctAnswer = "z-index", explanation = "An element with greater stack order is always in front of an element with a lower stack order.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you select all elements inside the <body> tag?",
            options = listOf("body *", "body all", "body > all", "body.all"),
            correctAnswer = "body *", explanation = "The universal selector (*) combined with the body selector selects all descendants of body.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to create rounded corners?",
            options = listOf("border-radius", "corner-radius", "border-round", "border-curve"),
            correctAnswer = "border-radius", explanation = "The border-radius property allows you to add rounded corners to elements.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS property is used to specify whether an element's box should be a desktop-style block box or an inline box?",
            options = listOf("box-type", "display", "visibility", "position"),
            correctAnswer = "display", explanation = "The display property is the most important CSS property for controlling layout.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to animate elements in CSS?",
            options = listOf("transition", "animation", "transform", "All of the above"),
            correctAnswer = "All of the above", explanation = "Animation, transition, and transform are all used to create motion and changes in CSS.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the CSS 'Box Model'?",
            options = listOf("A way to draw boxes around images", "A model used to represent the layout and dimensions of elements", "A 3D design tool", "A model for grouping classes"),
            correctAnswer = "A model used to represent the layout and dimensions of elements", explanation = "The box model consists of margins, borders, padding, and the actual content.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),

        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In the box model, which of these is the outermost part?",
            options = listOf("Padding", "Border", "Margin", "Content"),
            correctAnswer = "Margin", explanation = "Margin is the outermost layer of the box model, creating space between the element and its neighbors.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you make a Flexbox container?",
            options = listOf("display: flex;", "layout: flexbox;", "flex-direction: row;", "display: box;"),
            correctAnswer = "display: flex;", explanation = "To use Flexbox, you must first define a flex container.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used in Flexbox to align items along the main axis?",
            options = listOf("align-items", "justify-content", "align-content", "flex-align"),
            correctAnswer = "justify-content", explanation = "Justify-content defines the alignment along the main axis (usually horizontal).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you center an element horizontally and vertically using Flexbox?",
            options = listOf("justify-content: center; align-items: center;", "align-content: center;", "text-align: center;", "margin: auto;"),
            correctAnswer = "justify-content: center; align-items: center;", explanation = "Combining these two properties on a flex container perfectly centers the children.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of CSS Media Queries?",
            options = listOf("To play music files", "To apply different styles for different devices/screen sizes", "To query a database for styles", "To optimize image loading"),
            correctAnswer = "To apply different styles for different devices/screen sizes", explanation = "Media queries are a fundamental part of responsive web design.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which measurement unit is relative to the font-size of the element?",
            options = listOf("px", "em", "rem", "vh"),
            correctAnswer = "em", explanation = "1em is equal to the current font size; 2em is double the current font size.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'rem' unit in CSS?",
            options = listOf("Relative to the element font-size", "Relative to the root element (html) font-size", "Random element measurement", "Real element marker"),
            correctAnswer = "Relative to the root element (html) font-size", explanation = "rem stands for 'root em'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS property allows you to define a grid layout?",
            options = listOf("display: grid;", "layout: grid;", "display: table-grid;", "grid-template: active;"),
            correctAnswer = "display: grid;", explanation = "The grid value of the display property initiates a grid formatting context.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property specifies the gap between grid rows and columns?",
            options = listOf("grid-spacing", "gap", "grid-margin", "cell-spacing"),
            correctAnswer = "gap", explanation = "The gap property is shorthand for row-gap and column-gap.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS selector is used to style an element when the mouse is over it?",
            options = listOf(":active", ":focus", ":hover", ":visited"),
            correctAnswer = ":hover", explanation = "The :hover pseudo-class is used to add a special style to an element when you mouse over it.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'z-index' only work on?",
            options = listOf("Block elements", "Inline elements", "Positioned elements (relative, absolute, fixed, or sticky)", "All elements"),
            correctAnswer = "Positioned elements (relative, absolute, fixed, or sticky)", explanation = "z-index has no effect on non-positioned elements.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to prevent text from wrapping to a new line?",
            options = listOf("word-wrap: none;", "white-space: nowrap;", "text-wrap: none;", "line-break: forbidden;"),
            correctAnswer = "white-space: nowrap;", explanation = "White-space: nowrap forces text to stay on a single line.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'overflow: hidden;'?",
            options = listOf("To hide the element", "To clip content that exceeds the element's box without scrollbars", "To hide the background image", "To prevent text selection"),
            correctAnswer = "To clip content that exceeds the element's box without scrollbars", explanation = "It hides content that spills out of the element's dimensions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS function is used to calculate values dynamically (e.g., width: calc(100% - 20px))?",
            options = listOf("eval()", "math()", "calc()", "compute()"),
            correctAnswer = "calc()", explanation = "Calc() lets you perform calculations when specifying CSS property values.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which pseudo-element is used to insert content before an element?",
            options = listOf(":first-child", "::before", "::after", ":prepend"),
            correctAnswer = "::before", explanation = "::before creates a pseudo-element that is the first child of the selected element.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'CSS Specificity'?",
            options = listOf("The speed of CSS loading", "The rule that determines which CSS styles are applied based on selector weight", "A way to write specific code", "The size of the CSS file"),
            correctAnswer = "The rule that determines which CSS styles are applied based on selector weight", explanation = "If multiple rules apply to an element, the one with higher specificity wins.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to specify how an image or video should be resized to fit its container?",
            options = listOf("object-fit", "image-size", "fit-content", "background-size"),
            correctAnswer = "object-fit", explanation = "Object-fit values like 'cover' or 'contain' are vital for responsive media.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'inherit' value do?",
            options = listOf("Makes a new style", "Forces a property to take the same value as its parent element", "Prevents style changes", "Deletes the style"),
            correctAnswer = "Forces a property to take the same value as its parent element", explanation = "Inherit is a CSS keyword that can be applied to any CSS property.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which selector targets an element that is the first child of its parent?",
            options = listOf(":first-child", ":first", ":child(1)", ":only-child"),
            correctAnswer = ":first-child", explanation = "The :first-child pseudo-class matches every element that is the first child of its parent.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you apply a style to multiple selectors at once?",
            options = listOf("Separate selectors with a dot", "Separate selectors with a comma", "Separate selectors with a space", "You can't do that"),
            correctAnswer = "Separate selectors with a comma", explanation = "Grouping selectors (e.g., h1, p, .btn) saves code.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the function of the '!important' rule?",
            options = listOf("To mark a style for deletion", "To override all other styling rules for a specific property", "To make the text bold", "To speed up the page"),
            correctAnswer = "To override all other styling rules for a specific property", explanation = "It should be used sparingly as it makes debugging CSS difficult.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to add a reflection effect in some browsers?",
            options = listOf("box-reflect", "mirror", "text-reflect", "filter: reflect"),
            correctAnswer = "box-reflect", explanation = "-webkit-box-reflect is often used for this visual effect.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'position: fixed;' do?",
            options = listOf("Fixes the element to its parent", "Positions the element relative to the viewport, meaning it stays in the same place even when scrolling", "Fixes bugs in the layout", "Makes the element static"),
            correctAnswer = "Positions the element relative to the viewport, meaning it stays in the same place even when scrolling", explanation = "Fixed elements are removed from the normal document flow.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to transition between two states (e.g., hover effect)?",
            options = listOf("animation", "transition", "transform", "speed"),
            correctAnswer = "transition", explanation = "Transition allows you to change property values smoothly over a given duration.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'visibility: hidden;' and 'display: none;'?",
            options = listOf("No difference", "Visibility: hidden hides the element but it still takes up space; Display: none removes it from the layout", "Display: none is only for images", "Visibility: hidden is faster"),
            correctAnswer = "Visibility: hidden hides the element but it still takes up space; Display: none removes it from the layout", explanation = "Display: none effectively 'deletes' the element from the rendered view.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property controls how background images are tiled?",
            options = listOf("background-tile", "background-repeat", "background-attachment", "background-fill"),
            correctAnswer = "background-repeat", explanation = "Values include repeat, no-repeat, repeat-x, and repeat-y.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which CSS property is used to specify the stack order of an element?",
            options = listOf("order", "z-index", "stack", "priority"),
            correctAnswer = "z-index", explanation = "Elements with higher z-index values appear on top of those with lower values.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property allows you to change the shape of the mouse pointer?",
            options = listOf("mouse-style", "cursor", "pointer-type", "pointer-events"),
            correctAnswer = "cursor", explanation = "You can change the cursor to a pointer (hand), crosshair, wait (spinner), etc.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'box-sizing: border-box;' do?",
            options = listOf("Adds a border to the box", "Includes padding and border in the element's total width and height", "Sizes the border separately", "Creates a box around the border"),
            correctAnswer = "Includes padding and border in the element's total width and height", explanation = "This makes layout math much easier compared to the default 'content-box'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What are 'CSS Variables' (Custom Properties)?",
            options = listOf("Variables used in JavaScript", "Entities defined by CSS authors that contain specific values to be reused throughout a document", "Variables only for color names", "Predefined browser constants"),
            correctAnswer = "Entities defined by CSS authors that contain specific values to be reused throughout a document", explanation = "They are defined using --name syntax and accessed via var(--name).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the '@keyframes' rule?",
            options = listOf("To define a key in a database", "To specify the animation code and control the intermediate steps in a CSS animation sequence", "To unlock premium CSS features", "To define font faces"),
            correctAnswer = "To specify the animation code and control the intermediate steps in a CSS animation sequence", explanation = "Keyframes allow for complex, multi-stage animations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'position: sticky;' do?",
            options = listOf("Makes the element permanently fixed", "Positions an element based on the user's scroll position, toggling between relative and fixed", "Makes an element stick to the bottom only", "Prevents an element from being moved"),
            correctAnswer = "Positions an element based on the user's scroll position, toggling between relative and fixed", explanation = "It 'sticks' to its nearest scrolling ancestor when its offset is reached.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'CSS Containment' (contain property)?",
            options = listOf("To hide code", "To limit the scope of the browser's styles, layout, and paint work", "To keep images inside a div", "To prevent text selection"),
            correctAnswer = "To limit the scope of the browser's styles, layout, and paint work", explanation = "The contain property allows developers to isolate parts of the page for performance optimizations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'BEM' (Block, Element, Modifier) methodology?",
            options = listOf("A CSS drawing technique", "A naming convention for writing clean and modular CSS", "A type of CSS framework", "A browser engine"),
            correctAnswer = "A naming convention for writing clean and modular CSS", explanation = "BEM helps in scaling and maintaining CSS in large projects.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Intrinsic Sizing' in CSS (e.g., min-content, max-content)?",
            options = listOf("Sizing based on the parent's width", "Sizing based on the content inside the element", "Using fixed pixels", "Sizing based on the viewport"),
            correctAnswer = "Sizing based on the content inside the element", explanation = "Min-content makes the box as small as possible without overflow; max-content makes it as large as the content requires.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'CSS Cascade' algorithm?",
            options = listOf("A Waterfall design", "The process that determines how conflicts between style rules are resolved", "A way to download CSS files", "A type of CSS animation"),
            correctAnswer = "The process that determines how conflicts between style rules are resolved", explanation = "The cascade considers origin, specificity, and source order.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'will-change' property do?",
            options = listOf("Changes the value of a property", "Hints to the browser that an element is expected to change, allowing for hardware acceleration", "Automatically updates styles", "Validates CSS code"),
            correctAnswer = "Hints to the browser that an element is expected to change, allowing for hardware acceleration", explanation = "Will-change should be used sparingly as it can consume a lot of resources.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Subgrid' in CSS Grid?",
            options = listOf("A grid inside a grid", "Allows a grid item to inherit the grid tracks of its parent", "A way to hide grid lines", "A small grid for mobile devices"),
            correctAnswer = "Allows a grid item to inherit the grid tracks of its parent", explanation = "Subgrid ensures alignment across nested grid structures.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Aspect-Ratio' property in CSS?",
            options = listOf("Sets the brightness of an image", "Allows you to define a preferred width-to-height ratio for an element", "Changes the orientation of text", "Limits the size of the container"),
            correctAnswer = "Allows you to define a preferred width-to-height ratio for an element", explanation = "Aspect-ratio helps in preventing layout shift during content loading.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Paint API' (part of CSS Houdini)?",
            options = listOf("A drawing app", "Allows developers to write JavaScript functions that can be used directly in CSS to draw graphics", "A way to change text colors", "An image editor"),
            correctAnswer = "Allows developers to write JavaScript functions that can be used directly in CSS to draw graphics", explanation = "The Paint API brings low-level rendering control to CSS.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'CSS Nesting'?",
            options = listOf("Nesting birds in code", "A feature (native or via preprocessors) that allows writing CSS rules inside each other to follow HTML structure", "A way to hide styles", "A technique for creating layers"),
            correctAnswer = "A feature (native or via preprocessors) that allows writing CSS rules inside each other to follow HTML structure", explanation = "Native nesting is becoming supported in modern browsers, following the lead of Sass/Less.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Container Queries' (@container)?",
            options = listOf("Queries for shipping containers", "Allows styling elements based on the size of a parent container rather than the viewport", "A new type of media query", "Queries for Docker containers"),
            correctAnswer = "Allows styling elements based on the size of a parent container rather than the viewport", explanation = "@container is the biggest shift in responsive design since @media.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Cumulative Layout Shift' (CLS) and how does CSS affect it?",
            options = listOf("A type of animation", "A metric for visual stability; setting dimensions in CSS for media prevents it", "The speed of page loading", "A way to shift elements"),
            correctAnswer = "A metric for visual stability; setting dimensions in CSS for media prevents it", explanation = "High CLS occurs when elements move unexpectedly during page load.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the '::part' pseudo-element used for?",
            options = listOf("Styling a part of a paragraph", "Styling elements within a Shadow DOM from the outside document", "Breaking an element into pieces", "Selecting every other element"),
            correctAnswer = "Styling elements within a Shadow DOM from the outside document", explanation = "It's essential for styling encapsulated Web Components.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'CSS Shaders'?",
            options = listOf("Adding shadows to code", "A deprecated technology that allowed applying 3D effects to HTML via GLSL", "A new type of gradient", "A tool for dark mode"),
            correctAnswer = "A deprecated technology that allowed applying 3D effects to HTML via GLSL", explanation = "They were removed due to security concerns, replaced mostly by CSS filters and WebGL.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Scoped CSS'?",
            options = listOf("CSS only for telescopes", "CSS rules that only apply to a specific part of the DOM tree", "Hiding CSS from search engines", "Making CSS private"),
            correctAnswer = "CSS rules that only apply to a specific part of the DOM tree", explanation = "The @scope rule is a recent addition to the CSS specification.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the '@supports' rule do?",
            options = listOf("Supports the user's browser", "Feature queries that allow you to check if a browser supports a specific CSS property/value pair", "Supports CSS variable injection", "Adds technical support links"),
            correctAnswer = "Feature queries that allow you to check if a browser supports a specific CSS property/value pair", explanation = "@supports is used for progressive enhancement.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Clip-Path' property used for?",
            options = listOf("Clipping coupons", "Creating complex shapes by clipping the element to a specific region", "Reducing file size", "Hiding path names"),
            correctAnswer = "Creating complex shapes by clipping the element to a specific region", explanation = "It can create circles, polygons, and custom SVG paths as masks.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'CSS Shapes' (shape-outside)?",
            options = listOf("Adding shapes to images", "Allowing inline content to wrap around a complex shape defined by an image or coordinates", "A drawing tool in CSS", "A new type of border"),
            correctAnswer = "Allowing inline content to wrap around a complex shape defined by an image or coordinates", explanation = "It allows text to flow in non-rectangular patterns.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Font-Variation-Settings'?",
            options = listOf("A way to change fonts", "Low-level control over OpenType variable fonts (weight, width, slant, etc.)", "Adjusting the volume of text", "Choosing a random font"),
            correctAnswer = "Low-level control over OpenType variable fonts (weight, width, slant, etc.)", explanation = "Variable fonts allow a single file to represent thousands of font variations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Backface-Visibility' property?",
            options = listOf("Hiding the back of the computer", "Determines whether the back surface of an element is visible when it is rotated toward the user", "A way to see through objects", "A security setting"),
            correctAnswer = "Determines whether the back surface of an element is visible when it is rotated toward the user", explanation = "Setting it to 'hidden' is useful for card-flip animations.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Isolation: isolate;' used for?",
            options = listOf("To isolate a virus", "To create a new stacking context without requiring a z-index or specific position", "To hide an element from others", "To speed up rendering"),
            correctAnswer = "To create a new stacking context without requiring a z-index or specific position", explanation = "It prevents an element's blend mode from affecting elements outside its subtree.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Mix-Blend-Mode' property?",
            options = listOf("Mixing paint in CSS", "Sets how an element's content should blend with the content of the element's parent and background", "A way to blend different fonts", "A type of CSS animation"),
            correctAnswer = "Sets how an element's content should blend with the content of the element's parent and background", explanation = "It brings Photoshop-like blending (Multiply, Overlay, etc.) to the web.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Scroll-Snap'?",
            options = listOf("A way to snap photos", "Allows you to lock the viewport to certain elements after a user has finished scrolling", "A faster way to scroll", "A tool for creating scrollbars"),
            correctAnswer = "Allows you to lock the viewport to certain elements after a user has finished scrolling", explanation = "It's perfect for image carousels or full-page scrolling sites.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is '@layer' (Cascade Layers)?",
            options = listOf("Adding layers to images", "A way to control the cascade order of style sheets, regardless of specificity", "A new type of CSS selector", "A technique for 3D CSS"),
            correctAnswer = "A way to control the cascade order of style sheets, regardless of specificity", explanation = "Cascade layers allow for better management of internal styles vs third-party libraries.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'CSS Logical Properties' (e.g., margin-block-start)?",
            options = listOf("Using logic in CSS", "Properties that are relative to the text flow (direction) rather than physical sides (top/left)", "Mathematical properties", "Properties used for code logic"),
            correctAnswer = "Properties that are relative to the text flow (direction) rather than physical sides (top/left)", explanation = "They are vital for internationalization (RTL languages).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'HWB' color notation?",
            options = listOf("Hardware-based color", "Hue, Whiteness, Blackness", "High Width Brightness", "A type of color blind mode"),
            correctAnswer = "Hue, Whiteness, Blackness", explanation = "HWB is an intuitive color model for humans, often easier than RGB or HSL.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'ch' unit in CSS?",
            options = listOf("Relative to the character count", "Relative to the width of the '0' (zero) character of the element's font", "Change measurement", "Constant height"),
            correctAnswer = "Relative to the width of the '0' (zero) character of the element's font", explanation = "It is useful for setting the width of a container based on font characters.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'User-Agent Stylesheet'?",
            options = listOf("A stylesheet for agents", "The default styles applied by the browser (Chrome, Safari, etc.) before any author styles", "Styles for hackers", "A hidden developer tool"),
            correctAnswer = "The default styles applied by the browser (Chrome, Safari, etc.) before any author styles", explanation = "Reset or Normalize CSS is used to neutralize these default browser differences.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to change the background image?",
            options = listOf("background-image", "bg-image", "background-url", "image-background"),
            correctAnswer = "background-image", explanation = "The background-image property sets one or more background images for an element.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you make a list with no bullets?",
            options = listOf("list-style-type: none;", "list: none;", "bullet-style: none;", "list-type: no-bullet;"),
            correctAnswer = "list-style-type: none;", explanation = "None is the standard value to remove markers.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'margin: 10px 20px;' set?",
            options = listOf("10px on all sides", "10px top/bottom, 20px left/right", "10px left/right, 20px top/bottom", "10px top, 20px right, 0 bottom, 0 left"),
            correctAnswer = "10px top/bottom, 20px left/right", explanation = "This is a two-value shorthand for margin.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which property is used to change the mouse cursor?",
            options = listOf("mouse", "cursor", "pointer", "cursor-type"),
            correctAnswer = "cursor", explanation = "The cursor property specifies the mouse cursor to be displayed.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'flex-grow' property?",
            options = listOf("To make an element grow vertically", "To specify how much a flex item will grow relative to the rest of the flex items", "To increase the font size", "To expand the margin"),
            correctAnswer = "To specify how much a flex item will grow relative to the rest of the flex items", explanation = "It determines how much of the free space in the container is assigned to the item.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'em' and 'rem' units?",
            options = listOf("No difference", "em is relative to parent font-size, rem is relative to root (html) font-size", "rem is for margins only", "em is for mobile devices"),
            correctAnswer = "em is relative to parent font-size, rem is relative to root (html) font-size", explanation = "Rem is more predictable for global scaling.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Specificity' of an ID selector compared to a class selector?",
            options = listOf("They are equal", "ID selector is much higher", "Class selector is higher", "It depends on the browser"),
            correctAnswer = "ID selector is much higher", explanation = "IDs have a specificity of (1, 0, 0), while classes are (0, 1, 0).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'vh' unit in CSS?",
            options = listOf("Vertical height of the element", "1% of the height of the viewport", "Viewport height of the parent", "Value height"),
            correctAnswer = "1% of the height of the viewport", explanation = "100vh covers the full height of the visible screen.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 25, createdAt = createdAt
        )
    )
}