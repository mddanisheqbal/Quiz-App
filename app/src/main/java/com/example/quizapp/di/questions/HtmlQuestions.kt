package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID

public fun getHtmlQuestions(categoryId: String, createdAt: String): List<Question> {
    return listOf(
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does HTML stand for?",
            options = listOf("Hyper Text Markup Language", "Home Tool Markup Language", "Hyperlinks and Text Markup Language", "Hyper Tooling Markup Language"),
            correctAnswer = "Hyper Text Markup Language", explanation = "HTML is the standard markup language for creating web pages.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 20, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML tag is used to define an internal style sheet?",
            options = listOf("<script>", "<css>", "<style>", "<link>"),
            correctAnswer = "<style>", explanation = "The <style> element is used to contain style information (CSS) for a document.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 25, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does HTML stand for?",
            options = listOf("Hyper Text Markup Language", "High Text Machine Language", "Hyper Tabular Main Language", "None of the above"),
            correctAnswer = "Hyper Text Markup Language", explanation = "HTML is the standard markup language for creating web pages.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML tag is used to define the largest heading?",
            options = listOf("<h6>", "<heading>", "<h1>", "<head>"),
            correctAnswer = "<h1>", explanation = "<h1> defines the most important heading, while <h6> defines the least important.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct HTML element for inserting a line break?",
            options = listOf("<break>", "<br>", "<lb>", "<next>"),
            correctAnswer = "<br>", explanation = "The <br> tag is an empty element, meaning it has no end tag.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute is used to provide an alternative text for an image?",
            options = listOf("title", "src", "alt", "longdesc"),
            correctAnswer = "alt", explanation = "The alt attribute is essential for accessibility and shows text if the image fails to load.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element is used to create a hyperlink?",
            options = listOf("<link>", "<a>", "<href>", "<url>"),
            correctAnswer = "<a>", explanation = "The <a> (anchor) tag is used with the href attribute to link to other pages.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which character is used to indicate an end tag?",
            options = listOf("<", "*", "/", "^"),
            correctAnswer = "/", explanation = "HTML end tags always start with a forward slash after the opening bracket.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element is used to define an unordered list?",
            options = listOf("<ol>", "<ul>", "<li>", "<list>"),
            correctAnswer = "<ul>", explanation = "<ul> stands for Unordered List (bullet points), while <ol> stands for Ordered List (numbers).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct HTML for creating a checkbox?",
            options = listOf("<check>", "<input type='check'>", "<checkbox>", "<input type='checkbox'>"),
            correctAnswer = "<input type='checkbox'>", explanation = "Checkboxes allow users to select zero or more options from a list.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to create a table row?",
            options = listOf("<td>", "<th>", "<table>", "<tr>"),
            correctAnswer = "<tr>", explanation = "<tr> stands for Table Row; it contains table data (<td>) or header (<th>) cells.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element contains all the visible content of a webpage?",
            options = listOf("<head>", "<html>", "<body>", "<section>"),
            correctAnswer = "<body>", explanation = "Everything inside the <body> tag is rendered by the browser on the screen.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element defines the title of a document?",
            options = listOf("<meta>", "<head>", "<title>", "<header>"),
            correctAnswer = "<title>", explanation = "The <title> tag appears in the browser tab and search engine results.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you make a list that lists items with numbers?",
            options = listOf("<list>", "<dl>", "<ul>", "<ol>"),
            correctAnswer = "<ol>", explanation = "<ol> stands for Ordered List.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML tag is used to define an internal style sheet?",
            options = listOf("<css>", "<script>", "<style>", "<link>"),
            correctAnswer = "<style>", explanation = "The <style> tag is usually placed inside the <head> section.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct HTML for adding a background color?",
            options = listOf("<body bg='yellow'>", "<body style='background-color:yellow;'>", "<background>yellow</background>", "<body color='yellow'>"),
            correctAnswer = "<body style='background-color:yellow;'>", explanation = "In modern HTML, styling should be done via CSS using the style attribute.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element is used to bold text in HTML5 (conveying importance)?",
            options = listOf("<bold>", "<b>", "<strong>", "<important>"),
            correctAnswer = "<strong>", explanation = "While <b> simply bolds text, <strong> indicates that the text has strong importance.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element is used to italicize text (conveying emphasis)?",
            options = listOf("<i>", "<italic>", "<em>", "<emphasize>"),
            correctAnswer = "<em>", explanation = "<em> stands for Emphasis and is the preferred way to italicize important text.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the <a> tag's href attribute specify?",
            options = listOf("The color of the link", "The destination address of the link", "The size of the link", "The name of the link"),
            correctAnswer = "The destination address of the link", explanation = "href stands for Hypertext Reference.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to define a multi-line input field?",
            options = listOf("<input type='text'>", "<textarea>", "<input type='textbox'>", "<textbox>"),
            correctAnswer = "<textarea>", explanation = "<textarea> allows for multi-line text input, useful for comments or messages.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to create a dropdown list in a form?",
            options = listOf("<list>", "<dropdown>", "<select>", "<input type='dropdown'>"),
            correctAnswer = "<select>", explanation = "The <select> element contains <option> tags to build a dropdown menu.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct HTML for making a text input field?",
            options = listOf("<input type='textfield'>", "<input type='text'>", "<textinput>", "<textfield>"),
            correctAnswer = "<input type='text'>", explanation = "The type='text' attribute creates a single-line text input.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to define the footer of a webpage?",
            options = listOf("<bottom>", "<end>", "<footer>", "<foot>"),
            correctAnswer = "<footer>", explanation = "The <footer> element typically contains copyright info or contact links.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How can you create an email link?",
            options = listOf("<a href='xxx@yyy.com'>", "<mail href='xxx@yyy.com'>", "<a href='mailto:xxx@yyy.com'>", "<a mailto='xxx@yyy.com'>"),
            correctAnswer = "<a href='mailto:xxx@yyy.com'>", explanation = "The mailto: protocol tells the browser to open the user's email client.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute is used to open a link in a new tab?",
            options = listOf("target='_new'", "target='_blank'", "target='new'", "target='window'"),
            correctAnswer = "target='_blank'", explanation = "_blank is the standard target value to open links in a new window/tab.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to insert an image?",
            options = listOf("<image>", "<img>", "<src>", "<pic>"),
            correctAnswer = "<img>", explanation = "The <img> tag is self-closing and requires the src and alt attributes.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct HTML for a radio button?",
            options = listOf("<input type='radio'>", "<radio>", "<input type='circle'>", "<input type='checkbox'>"),
            correctAnswer = "<input type='radio'>", explanation = "Radio buttons are used for selecting exactly one option from a set.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag defines the header for a section or page?",
            options = listOf("<head>", "<top>", "<header>", "<h1>"),
            correctAnswer = "<header>", explanation = "The <header> element is a container for introductory content.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element is used to group related elements in a form?",
            options = listOf("<label>", "<group>", "<fieldset>", "<section>"),
            correctAnswer = "<fieldset>", explanation = "The <fieldset> tag is used to group related data in a form, often used with <legend>.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to create a list item?",
            options = listOf("<list>", "<li>", "<item>", "<ol>"),
            correctAnswer = "<li>", explanation = "<li> stands for List Item and is used inside <ul> or <ol>.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct HTML to left-align content?",
            options = listOf("<left>", "<p align='left'>", "<p style='text-align:left;'>", "<align left>"),
            correctAnswer = "<p style='text-align:left;'>", explanation = "Alignment is handled through CSS in modern web development.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML tag is used to display a scalar measurement within a range?",
            options = listOf("<gauge>", "<meter>", "<range>", "<progress>"),
            correctAnswer = "<meter>", explanation = "The <meter> element represents a value within a known range (like disk usage).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 element is used to specify a self-contained content, like an image with a caption?",
            options = listOf("<figure>", "<section>", "<aside>", "<details>"),
            correctAnswer = "<figure>", explanation = "The <figure> tag is often used with <figcaption> to group an image and its description.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute is used to group related options in a <select> dropdown?",
            options = listOf("<optgroup>", "<group>", "<label>", "<optiongroup>"),
            correctAnswer = "<optgroup>", explanation = "The <optgroup> tag creates a non-selectable label to categorize options.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'required' attribute in a form input?",
            options = listOf("It makes the input read-only", "It ensures the field must be filled out before submitting", "It sets a default value", "It encrypts the data"),
            correctAnswer = "It ensures the field must be filled out before submitting", explanation = "The required attribute provides built-in browser validation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element is used to display a progress bar in HTML5?",
            options = listOf("<meter>", "<loader>", "<progress>", "<status>"),
            correctAnswer = "<progress>", explanation = "The <progress> tag represents the completion progress of a task.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct way to include a JavaScript file in HTML?",
            options = listOf("<script src='app.js'>", "<js file='app.js'>", "<script href='app.js'>", "<javascript src='app.js'>"),
            correctAnswer = "<script src='app.js'>", explanation = "The src attribute is used to link external scripts.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element is used to represent the result of a calculation?",
            options = listOf("<calc>", "<output>", "<result>", "<math>"),
            correctAnswer = "<output>", explanation = "The <output> tag displays the result of a user action or script calculation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute of the <form> tag specifies how to send form-data?",
            options = listOf("type", "method", "action", "enctype"),
            correctAnswer = "method", explanation = "The method attribute defines whether to use GET or POST.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the <datalist> tag?",
            options = listOf("To create a table", "To provide an 'autocomplete' feature for input elements", "To store metadata", "To create a list of links"),
            correctAnswer = "To provide an 'autocomplete' feature for input elements", explanation = "The <datalist> tag gives a list of pre-defined options for an <input>.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 element is used for drawing graphics via JavaScript?",
            options = listOf("<draw>", "<paint>", "<canvas>", "<svg>"),
            correctAnswer = "<canvas>", explanation = "The <canvas> element is a container for graphics; JavaScript is used to actually draw them.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute specifies where to send the form-data when a form is submitted?",
            options = listOf("method", "action", "target", "src"),
            correctAnswer = "action", explanation = "The action attribute contains the URL of the server-side script that processes the form.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which meta tag attribute specifies the character encoding for the HTML document?",
            options = listOf("name", "charset", "content", "http-equiv"),
            correctAnswer = "charset", explanation = "<meta charset='UTF-8'> is the standard for modern websites.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element is used to define a description list?",
            options = listOf("<dl>", "<list>", "<dd>", "<dt>"),
            correctAnswer = "<dl>", explanation = "<dl> stands for Description List; it contains <dt> (terms) and <dd> (descriptions).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'defer' attribute do in a <script> tag?",
            options = listOf("It stops the script from running", "It executes the script after the HTML document has been fully parsed", "It runs the script in the background", "It makes the script private"),
            correctAnswer = "It executes the script after the HTML document has been fully parsed", explanation = "Defer ensures scripts don't block the initial rendering of the page.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element is used to define the main content of a document?",
            options = listOf("<section>", "<article>", "<main>", "<body>"),
            correctAnswer = "<main>", explanation = "The <main> tag should be unique to the document and exclude sidebars/navigation.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute is used to specify that an input field is read-only?",
            options = listOf("disabled", "readonly", "static", "locked"),
            correctAnswer = "readonly", explanation = "A readonly field cannot be modified but is still submitted with the form.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the <base> tag?",
            options = listOf("To define the footer", "To specify a default URL and target for all links in a page", "To create a primary font", "To set the background color"),
            correctAnswer = "To specify a default URL and target for all links in a page", explanation = "The <base> tag must be inside the <head> element.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 attribute specifies a regular expression that the input value is checked against?",
            options = listOf("regexp", "check", "pattern", "validate"),
            correctAnswer = "pattern", explanation = "The pattern attribute allows for advanced form validation using RegEx.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to create a clickable button inside a form?",
            options = listOf("<input type='button'>", "<button>", "<input type='submit'>", "All of the above"),
            correctAnswer = "All of the above", explanation = "While all three create buttons, <button> is the most flexible for custom styling.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element is used to group the header content in an HTML table?",
            options = listOf("<thead>", "<header>", "<th>", "<top>"),
            correctAnswer = "<thead>", explanation = "<thead> is used in conjunction with <tbody> and <tfoot> to structure tables.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the <noscript> tag?",
            options = listOf("To hide code from search engines", "To provide alternative content for users who have disabled JavaScript", "To comment out large blocks of HTML", "To disable CSS"),
            correctAnswer = "To provide alternative content for users who have disabled JavaScript", explanation = "It displays a message or content if scripts aren't supported or are turned off.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 tag is used to embed an SVG directly in a page?",
            options = listOf("<canvas>", "<svg>", "<image>", "<vector>"),
            correctAnswer = "<svg>", explanation = "Scalable Vector Graphics (SVG) are XML-based and can be styled with CSS.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute in HTML5 allows an element to be draggable?",
            options = listOf("moveable", "drag", "draggable", "drop"),
            correctAnswer = "draggable", explanation = "Setting draggable='true' enables Drag-and-Drop API functionality.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to define a link between a document and an external resource (like a favicon or CSS)?",
            options = listOf("<anchor>", "<link>", "<rel>", "<src>"),
            correctAnswer = "<link>", explanation = "The <link> tag is an empty element that lives in the <head>.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the role of the 'placeholder' attribute?",
            options = listOf("To set a permanent value", "To provide a short hint that describes the expected value of an input field", "To act as a variable", "To hide the text"),
            correctAnswer = "To provide a short hint that describes the expected value of an input field", explanation = "The hint disappears once the user begins typing.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element is used to mark text as being no longer correct?",
            options = listOf("<delete>", "<s>", "<strike>", "<old>"),
            correctAnswer = "<s>", explanation = "The <s> tag represents contents that are no longer relevant or accurate.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 attribute specifies that an element should be automatically focused when the page loads?",
            options = listOf("focus", "autofocus", "select", "start"),
            correctAnswer = "autofocus", explanation = "Only one element per page should have the autofocus attribute.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct HTML for adding a video that plays automatically?",
            options = listOf("<video src='movie.mp4' play>", "<video src='movie.mp4' autoplay>", "<video movie='movie.mp4' loop>", "<movie src='movie.mp4'>"),
            correctAnswer = "<video src='movie.mp4' autoplay>", explanation = "The autoplay attribute starts video playback as soon as it can.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 element is used to group a set of navigation links?",
            options = listOf("<nav>", "<menu>", "<links>", "<navigation>"),
            correctAnswer = "<nav>", explanation = "The <nav> tag is intended for major blocks of navigation links.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute is used to specify the media type of a resource in a <style> or <link> tag?",
            options = listOf("media", "type", "rel", "href"),
            correctAnswer = "type", explanation = "Example: type='text/css'.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to define a container for an external application?",
            options = listOf("<object>", "<iframe>", "<embed>", "All of the above"),
            correctAnswer = "All of the above", explanation = "While <iframe> is the most common today, all three can embed external content.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'aria-live' attribute in HTML?",
            options = listOf("To animate elements", "To indicate that an element will be updated and assistive technology should announce it", "To keep the browser connection alive", "To play audio files automatically"),
            correctAnswer = "To indicate that an element will be updated and assistive technology should announce it", explanation = "The aria-live attribute informs screen readers that content within an element has changed dynamically.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In the context of the <picture> element, what does the 'media' attribute do?",
            options = listOf("Plays video files", "Defines a query that the browser uses to decide which image source to choose", "Specifies the social media link", "Sets the volume of the media"),
            correctAnswer = "Defines a query that the browser uses to decide which image source to choose", explanation = "The media attribute allows developers to perform 'Art Direction' by serving different images based on viewport width.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the function of the 'nonce' attribute in a <script> tag?",
            options = listOf("To run the script once", "To provide a cryptographic token used by Content Security Policy to allow specific scripts", "To hide the script from users", "To delay the script execution"),
            correctAnswer = "To provide a cryptographic token used by Content Security Policy to allow specific scripts", explanation = "A nonce prevents unauthorized inline scripts from executing, mitigating XSS attacks.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Shadow DOM'?",
            options = listOf("A dark mode for websites", "A way to encapsulate a DOM subtree so that styles and scripts are scoped to that component", "A hidden backup of the website", "A technique for SEO optimization"),
            correctAnswer = "A way to encapsulate a DOM subtree so that styles and scripts are scoped to that component", explanation = "Shadow DOM allows Web Components to have private styling that doesn't clash with the main document.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute specifies that an iframe should be loaded lazily?",
            options = listOf("lazy='true'", "loading='lazy'", "async='true'", "defer='true'"),
            correctAnswer = "loading='lazy'", explanation = "Loading='lazy' improves performance by delaying the loading of off-screen iframes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the <template> element?",
            options = listOf("To create a visual layout", "To hold HTML fragments that are not rendered at load time but can be instantiated via JavaScript", "To define CSS styles", "To act as a placeholder for images"),
            correctAnswer = "To hold HTML fragments that are not rendered at load time but can be instantiated via JavaScript", explanation = "The content of <template> is parsed but not displayed until cloned by script.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'rel=noopener' attribute value do when used on a link?",
            options = listOf("It makes the link open faster", "It prevents the new page from accessing the window.opener property of the original page", "It improves SEO ranking", "It secures the link with SSL"),
            correctAnswer = "It prevents the new page from accessing the window.opener property of the original page", explanation = "This is a security best practice when using target='_blank' to prevent 'tabnabbing' attacks.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 API allows a web application to store data locally within the user's browser?",
            options = listOf("Web Storage (LocalStorage/SessionStorage)", "SQL Database", "Cloud Store", "Cache API"),
            correctAnswer = "Web Storage (LocalStorage/SessionStorage)", explanation = "Web Storage allows for storing larger amounts of data more securely than cookies.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'manifest' attribute in the <html> tag used for (deprecated in favor of Service Workers)?",
            options = listOf("To list all images", "To specify a cache manifest file for offline web applications", "To define the author of the site", "To set up social media meta data"),
            correctAnswer = "To specify a cache manifest file for offline web applications", explanation = "AppCache (the manifest attribute) allowed sites to run offline before Service Workers became the standard.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In microdata (SEO), which attribute is used to define the type of item being described?",
            options = listOf("itemprop", "itemtype", "itemscope", "itemref"),
            correctAnswer = "itemtype", explanation = "Itemtype specifies the URL of the vocabulary (usually from Schema.org) used to describe the data.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'contenteditable' attribute?",
            options = listOf("To make an element searchable", "To allow users to edit the content of an element directly in the browser", "To encrypt the element content", "To translate the element content"),
            correctAnswer = "To allow users to edit the content of an element directly in the browser", explanation = "This attribute is used in the creation of web-based rich text editors.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to specify different versions of a source for a <video> or <audio> element?",
            options = listOf("<track>", "<source>", "<file>", "<media>"),
            correctAnswer = "<source>", explanation = "Multiple <source> tags allow the browser to choose the first format it supports.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the function of the <track> element in media?",
            options = listOf("To track user viewing data", "To specify external text tracks (captions, subtitles) for media players", "To play audio in the background", "To set the volume levels"),
            correctAnswer = "To specify external text tracks (captions, subtitles) for media players", explanation = "The <track> tag is used for accessibility, providing VTT files for captions.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'integrity' attribute in a <script> or <link> tag do?",
            options = listOf("Checks if the link is active", "Allows a browser to check that a fetched resource has been delivered without unexpected manipulation", "Compresses the file", "Adds a digital signature to the file"),
            correctAnswer = "Allows a browser to check that a fetched resource has been delivered without unexpected manipulation", explanation = "This is called Subresource Integrity (SRI) and protects against compromised CDNs.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'srcset' in the <img> tag?",
            options = listOf("To set multiple colors", "To provide different versions of the same image for different display densities or screen sizes", "To create a slideshow", "To link to a source set of videos"),
            correctAnswer = "To provide different versions of the same image for different display densities or screen sizes", explanation = "Srcset is key for responsive images, allowing browsers to download the smallest appropriate file.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute is used to provide a machine-readable version of a <time> element?",
            options = listOf("value", "datetime", "date", "iso"),
            correctAnswer = "datetime", explanation = "The datetime attribute uses the ISO 8601 format so search engines and calendars can parse the date.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "In SVG, which element is used to group several SVG shapes together?",
            options = listOf("<group>", "<container>", "<g>", "<layer>"),
            correctAnswer = "<g>", explanation = "The <g> tag is used for organization and for applying transformations to multiple shapes at once.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'reversed' attribute in an <ol> tag?",
            options = listOf("To reverse the order of the words", "To number the list in descending order", "To flip the list horizontally", "To hide the numbers"),
            correctAnswer = "To number the list in descending order", explanation = "A list starting at 3 and ending at 1 would use this attribute.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'ping' attribute on an <a> tag do?",
            options = listOf("Tests the speed of the server", "Sends a small POST request to the specified URL when the link is followed", "Checks if the user is online", "Animates the link"),
            correctAnswer = "Sends a small POST request to the specified URL when the link is followed", explanation = "The ping attribute is used for tracking link clicks without redirecting through a tracker URL.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the function of the <wbr> tag?",
            options = listOf("To create a web bridge", "To specify where in a text a line-break would be acceptable if needed", "To bold a word", "To link to a web resource"),
            correctAnswer = "To specify where in a text a line-break would be acceptable if needed", explanation = "<wbr> stands for Word Break Opportunity.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute prevents a script from blocking the HTML parser by running it asynchronously?",
            options = listOf("defer", "async", "background", "wait"),
            correctAnswer = "async", explanation = "Async scripts execute as soon as they are downloaded, regardless of whether the HTML parsing is complete.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element is used to define a container for an external application or interactive content (plugin)?",
            options = listOf("<embed>", "<iframe>", "<object>", "All of the above"),
            correctAnswer = "All of the above", explanation = "Embed, Iframe, and Object can all be used to host external plugins or applications.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'sandbox' attribute on an <iframe>?",
            options = listOf("To play games in the iframe", "To enable extra security restrictions for the content in the iframe", "To design the iframe layout", "To test the iframe responsiveness"),
            correctAnswer = "To enable extra security restrictions for the content in the iframe", explanation = "Sandbox can disable scripts, forms, and popups within the embedded content.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the function of the 'spellcheck' attribute?",
            options = listOf("To correct coding errors", "To specify whether the element is to have its spelling and grammar checked", "To check the URL spelling", "To provide a dictionary"),
            correctAnswer = "To specify whether the element is to have its spelling and grammar checked", explanation = "It can be set on input fields and textareas to help users with their writing.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which element represents the side-bar or content marginally related to the main content?",
            options = listOf("<section>", "<sidebar>", "<aside>", "<article>"),
            correctAnswer = "<aside>", explanation = "Aside is used for content that is tangential to the main topic (like ads or pull quotes).",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'download' attribute on an <a> tag do?",
            options = listOf("Downloads the whole website", "Prompts the user to save the linked resource instead of navigating to it", "Shows the download speed", "Automatically unzips files"),
            correctAnswer = "Prompts the user to save the linked resource instead of navigating to it", explanation = "The attribute value can also suggest a filename for the download.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Web Components' standard primarily composed of?",
            options = listOf("HTML5 and CSS3", "Shadow DOM, Custom Elements, and HTML Templates", "JavaScript and jQuery", "JSON and XML"),
            correctAnswer = "Shadow DOM, Custom Elements, and HTML Templates", explanation = "These three technologies allow for creating reusable, encapsulated UI components.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'translate' attribute?",
            options = listOf("To move elements on the screen", "To specify whether an element's attribute values and text content should be translated or left as-is", "To change the language of the page", "To link to a translator"),
            correctAnswer = "To specify whether an element's attribute values and text content should be translated or left as-is", explanation = "Setting translate='no' prevents translation services from changing brand names or code.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute in a <form> specifies the character encodings that are to be used for the form submission?",
            options = listOf("charset", "accept-charset", "enctype", "encoding"),
            correctAnswer = "accept-charset", explanation = "It ensures that the server receives data in a specific encoding like UTF-8.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the function of the <dialog> element?",
            options = listOf("To create a chat bot", "To represent a dialog box or other interactive component, such as a dismissible alert", "To record audio", "To translate text"),
            correctAnswer = "To represent a dialog box or other interactive component, such as a dismissible alert", explanation = "The <dialog> element has a built-in showModal() method in JavaScript.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the <head> element?",
            options = listOf("To display the main heading", "To contain metadata and links to scripts/styles", "To create a sticky header", "To store user passwords"),
            correctAnswer = "To contain metadata and links to scripts/styles", explanation = "Content in the <head> is not visible to the user but helps the browser process the page.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which tag is used to create a numbered list?",
            options = listOf("<ul>", "<li>", "<ol>", "<list>"),
            correctAnswer = "<ol>", explanation = "<ol> stands for Ordered List.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML element is used to define an important section of a page like a sidebar?",
            options = listOf("<aside>", "<section>", "<div>", "<footer>"),
            correctAnswer = "<aside>", explanation = "The <aside> tag is used for content marginally related to the surrounding content.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which attribute specifies a hint that describes the expected value of an input field?",
            options = listOf("hint", "value", "placeholder", "title"),
            correctAnswer = "placeholder", explanation = "The placeholder is displayed in the input field before the user enters a value.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 element is used for marking up a date and time?",
            options = listOf("<date>", "<time>", "<datetime>", "<calendar>"),
            correctAnswer = "<time>", explanation = "The <time> element can be parsed by browsers and search engines when used with the datetime attribute.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'srcset' attribute on an <img> tag?",
            options = listOf("To set a list of links", "To provide multiple image sources for different screen resolutions", "To set the image border", "To create an image set"),
            correctAnswer = "To provide multiple image sources for different screen resolutions", explanation = "It allows the browser to choose the most appropriate image based on display density.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'aria-label' attribute used for?",
            options = listOf("To label an image", "To provide a string that labels the current element for screen readers", "To animate text", "To create a link label"),
            correctAnswer = "To provide a string that labels the current element for screen readers", explanation = "It is used in cases where a text label is not visible on the screen.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which HTML5 attribute allows for asynchronous script execution?",
            options = listOf("defer", "sync", "async", "wait"),
            correctAnswer = "async", explanation = "The async attribute tells the browser to download the script in parallel and run it as soon as it is available.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        )

    )
}