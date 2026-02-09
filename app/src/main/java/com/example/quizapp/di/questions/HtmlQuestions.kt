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
    return listOf(
        htmlQuestion(
            id = "html_introduction_to_html_1",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "What does HTML stand for?",
            options = listOf(
                "Hyper Text Markup Language",
                "High Text Markup Language",
                "Hyperlink and Text Markup Language",
                "Home Tool Markup Language"
            ),
            correctAnswer = "Hyper Text Markup Language",
            explanation = "HTML stands for Hyper Text Markup Language. It is used to structure content on web pages.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_2",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML is used to:",
            options = listOf(
                "Design web page layout",
                "Style web pages",
                "Structure web content",
                "Add interactivity to websites"
            ),
            correctAnswer = "Structure web content",
            explanation = "HTML provides the basic structure of a web page. Styling and interactivity are handled by CSS and JavaScript.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_3",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Who is responsible for developing HTML?",
            options = listOf(
                "World Wide Web Consortium (W3C)",
                "Mozilla Foundation",
                "Microsoft",
                "Google"
            ),
            correctAnswer = "World Wide Web Consortium (W3C)",
            explanation = "W3C is the international organization that develops standards for the World Wide Web, including HTML.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_4",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML is a:",
            options = listOf(
                "Programming language",
                "Scripting language",
                "Markup language",
                "Query language"
            ),
            correctAnswer = "Markup language",
            explanation = "HTML is a markup language used to mark up text and elements, not to write logic or programs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_5",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following best describes HTML tags?",
            options = listOf(
                "They store data in a database",
                "They define the structure of content",
                "They execute conditional logic",
                "They apply styles directly"
            ),
            correctAnswer = "They define the structure of content",
            explanation = "HTML tags tell the browser how content like text, images, and links should be structured.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_6",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML documents are saved with which file extension?",
            options = listOf(
                ".ht",
                ".html",
                ".hml",
                ".web"
            ),
            correctAnswer = ".html",
            explanation = "HTML files commonly use the .html or .htm extension to indicate web documents.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_7",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which software is required to view HTML files?",
            options = listOf(
                "Code editor",
                "Web browser",
                "Compiler",
                "Database"
            ),
            correctAnswer = "Web browser",
            explanation = "A web browser interprets HTML and displays the content visually to the user.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_8",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following is NOT a web browser?",
            options = listOf(
                "Chrome",
                "Firefox",
                "Notepad",
                "Edge"
            ),
            correctAnswer = "Notepad",
            explanation = "Notepad is a text editor, not a web browser. Browsers are used to render HTML.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_9",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML tags are usually written in:",
            options = listOf(
                "Uppercase only",
                "Lowercase only",
                "Mixed case",
                "Lowercase is recommended"
            ),
            correctAnswer = "Lowercase is recommended",
            explanation = "HTML is not case-sensitive, but lowercase is recommended for consistency and readability.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_10",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "What is the basic unit of HTML?",
            options = listOf(
                "Attribute",
                "Element",
                "Value",
                "Script"
            ),
            correctAnswer = "Element",
            explanation = "An HTML element consists of a start tag, content, and an end tag.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_11",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following best defines a web page?",
            options = listOf(
                "A text file stored locally",
                "A document written in HTML",
                "A program executed on server",
                "A database record"
            ),
            correctAnswer = "A document written in HTML",
            explanation = "A web page is an HTML document that is displayed in a web browser.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_12",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML was originally created to:",
            options = listOf(
                "Design mobile apps",
                "Share scientific documents",
                "Develop operating systems",
                "Create databases"
            ),
            correctAnswer = "Share scientific documents",
            explanation = "HTML was initially designed to share research documents over the internet.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_13",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following correctly describes HTML?",
            options = listOf(
                "It adds style to web pages",
                "It controls web page behavior",
                "It defines content structure",
                "It manages server requests"
            ),
            correctAnswer = "It defines content structure",
            explanation = "HTML structures content, while CSS styles it and JavaScript adds behavior.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_14",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML tags are enclosed within:",
            options = listOf(
                "Round brackets",
                "Square brackets",
                "Angle brackets",
                "Curly braces"
            ),
            correctAnswer = "Angle brackets",
            explanation = "HTML tags are written using angle brackets like <tag>.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_15",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following is a correct HTML file name?",
            options = listOf(
                "index.ht",
                "index.html",
                "index.txt",
                "index.css"
            ),
            correctAnswer = "index.html",
            explanation = "HTML files commonly use the .html extension to be recognized by browsers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_16",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML is interpreted by:",
            options = listOf(
                "Compiler",
                "Interpreter",
                "Web browser",
                "Operating system"
            ),
            correctAnswer = "Web browser",
            explanation = "Browsers read and render HTML to display content on the screen.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_17",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which feature makes HTML platform independent?",
            options = listOf(
                "Use of compiler",
                "Browser-based execution",
                "Binary code",
                "Operating system support"
            ),
            correctAnswer = "Browser-based execution",
            explanation = "HTML works on any platform as long as a compatible browser is available.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_18",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which organization maintains HTML standards?",
            options = listOf(
                "ISO",
                "IEEE",
                "W3C",
                "ANSI"
            ),
            correctAnswer = "W3C",
            explanation = "The World Wide Web Consortium maintains and updates HTML standards.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_19",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML code is written using:",
            options = listOf(
                "Binary format",
                "Plain text",
                "Machine code",
                "Bytecode"
            ),
            correctAnswer = "Plain text",
            explanation = "HTML is written in plain text and can be created using any text editor.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_20",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following best defines the WWW?",
            options = listOf(
                "A programming language",
                "A collection of web pages",
                "A web browser",
                "An operating system"
            ),
            correctAnswer = "A collection of web pages",
            explanation = "The World Wide Web consists of interlinked web pages accessed via the internet.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_21",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML was invented by:",
            options = listOf(
                "Tim Berners-Lee",
                "Bill Gates",
                "Steve Jobs",
                "Linus Torvalds"
            ),
            correctAnswer = "Tim Berners-Lee",
            explanation = "Tim Berners-Lee invented HTML while working at CERN.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_22",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML tags tell the browser:",
            options = listOf(
                "How to execute programs",
                "How to display content",
                "How to connect databases",
                "How to compile code"
            ),
            correctAnswer = "How to display content",
            explanation = "Tags guide the browser on how content should appear on the page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_23",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following is true about HTML?",
            options = listOf(
                "It is case-sensitive",
                "It requires compilation",
                "It is markup-based",
                "It is object-oriented"
            ),
            correctAnswer = "It is markup-based",
            explanation = "HTML uses markup tags to structure content, not programming constructs.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_24",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which tool is best suited to write HTML code?",
            options = listOf(
                "Text editor",
                "Spreadsheet",
                "Debugger",
                "Database"
            ),
            correctAnswer = "Text editor",
            explanation = "HTML can be written using any simple text editor like Notepad or VS Code.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_25",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML helps in creating:",
            options = listOf(
                "Desktop applications",
                "Web pages",
                "Operating systems",
                "Device drivers"
            ),
            correctAnswer = "Web pages",
            explanation = "HTML is the foundation language for creating web pages.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_26",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following is NOT a purpose of HTML?",
            options = listOf(
                "Structuring content",
                "Defining hyperlinks",
                "Styling pages",
                "Embedding media"
            ),
            correctAnswer = "Styling pages",
            explanation = "Styling is handled by CSS, not HTML.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_27",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML documents are also known as:",
            options = listOf(
                "Web scripts",
                "Web pages",
                "Web programs",
                "Web services"
            ),
            correctAnswer = "Web pages",
            explanation = "HTML documents displayed in browsers are commonly called web pages.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_28",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which statement is correct about HTML?",
            options = listOf(
                "HTML can run logic",
                "HTML is compiled",
                "HTML is interpreted",
                "HTML supports loops"
            ),
            correctAnswer = "HTML is interpreted",
            explanation = "HTML is interpreted by browsers, not compiled like programming languages.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_29",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following best explains markup?",
            options = listOf(
                "Adding styles",
                "Annotating text with tags",
                "Executing commands",
                "Storing data"
            ),
            correctAnswer = "Annotating text with tags",
            explanation = "Markup means annotating content using tags to define structure and meaning.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_30",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML works together with which technologies?",
            options = listOf(
                "CSS and JavaScript",
                "Java and Python",
                "C and C++",
                "PHP and SQL"
            ),
            correctAnswer = "CSS and JavaScript",
            explanation = "HTML structures content, CSS styles it, and JavaScript adds interactivity.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_31",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML does NOT provide:",
            options = listOf(
                "Content structure",
                "Page layout",
                "User interaction logic",
                "Hyperlinks"
            ),
            correctAnswer = "User interaction logic",
            explanation = "HTML alone cannot handle logic or interactions; JavaScript is used for that.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_32",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following is a correct statement?",
            options = listOf(
                "HTML is a subset of XML",
                "HTML is used only on servers",
                "HTML describes page structure",
                "HTML replaces CSS"
            ),
            correctAnswer = "HTML describes page structure",
            explanation = "HTML defines the structure and content of a web page.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_33",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML files can be opened using:",
            options = listOf(
                "Only paid software",
                "Only IDEs",
                "Any web browser",
                "Only servers"
            ),
            correctAnswer = "Any web browser",
            explanation = "Any modern browser can open and display HTML files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_34",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which property makes HTML easy to learn?",
            options = listOf(
                "Complex syntax",
                "Plain text format",
                "Strict typing",
                "Compiled execution"
            ),
            correctAnswer = "Plain text format",
            explanation = "HTML uses simple tags written in plain text, making it beginner-friendly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_35",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML tags mainly act as:",
            options = listOf(
                "Instructions to browser",
                "Data containers",
                "Programming statements",
                "Style rules"
            ),
            correctAnswer = "Instructions to browser",
            explanation = "Tags instruct the browser on how to display and organize content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_36",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following is a limitation of HTML?",
            options = listOf(
                "Cannot create structure",
                "Cannot add interactivity alone",
                "Cannot display images",
                "Cannot use links"
            ),
            correctAnswer = "Cannot add interactivity alone",
            explanation = "HTML by itself cannot handle logic or interactions without JavaScript.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_37",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML was first proposed in the year:",
            options = listOf(
                "1989",
                "1991",
                "1995",
                "2000"
            ),
            correctAnswer = "1991",
            explanation = "HTML was first introduced by Tim Berners-Lee in 1991.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_38",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which feature allows HTML to link documents?",
            options = listOf(
                "Styles",
                "Scripts",
                "Hyperlinks",
                "Attributes"
            ),
            correctAnswer = "Hyperlinks",
            explanation = "Hyperlinks allow HTML documents to be connected with each other.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_39",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML is best described as:",
            options = listOf(
                "Logic-based language",
                "Data manipulation language",
                "Content description language",
                "System programming language"
            ),
            correctAnswer = "Content description language",
            explanation = "HTML describes the content and structure, not logic or computation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_40",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which environment is required to run HTML?",
            options = listOf(
                "Runtime engine",
                "Browser environment",
                "Virtual machine",
                "Compiler environment"
            ),
            correctAnswer = "Browser environment",
            explanation = "HTML runs inside web browsers that interpret and render the code.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_41",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML focuses mainly on:",
            options = listOf(
                "Presentation",
                "Logic",
                "Structure",
                "Security"
            ),
            correctAnswer = "Structure",
            explanation = "HTML defines the structure of content on a web page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_42",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which of the following makes HTML non-procedural?",
            options = listOf(
                "No control flow",
                "No variables",
                "No tags",
                "No attributes"
            ),
            correctAnswer = "No control flow",
            explanation = "HTML does not support loops or conditions, making it non-procedural.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_43",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML is mainly used on:",
            options = listOf(
                "Client side",
                "Server side",
                "Database side",
                "Kernel side"
            ),
            correctAnswer = "Client side",
            explanation = "HTML runs on the client side and is rendered by the browser.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_44",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "HTML documents are platform independent because:",
            options = listOf(
                "They are compiled",
                "They use plain text",
                "They run on OS kernel",
                "They are encrypted"
            ),
            correctAnswer = "They use plain text",
            explanation = "Plain text HTML can be read and rendered on any platform with a browser.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_introduction_to_html_45",
            categoryId = categoryId,
            chapterId = HTML_INTRO,
            questionText = "Which statement is most accurate about HTML?",
            options = listOf(
                "HTML controls application logic",
                "HTML is used for styling only",
                "HTML structures web content",
                "HTML replaces JavaScript"
            ),
            correctAnswer = "HTML structures web content",
            explanation = "HTML provides the foundation and structure of web pages.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_html_structure_1",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "What is the correct basic structure of an HTML document?",
            options = listOf(
                "<html><head><title></title><body></body></head></html>",
                "<head><html><body><title></title></body></html>",
                "<html><head><title></title></head><body></body></html>",
                "<body><html><head><title></title></head></body></html>"
            ),
            correctAnswer = "<html><head><title></title></head><body></body></html>",
            explanation = "An HTML document starts with html, contains head for metadata, and body for visible content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_2",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag represents the root element of an HTML document?",
            options = listOf(
                "<body>",
                "<head>",
                "<html>",
                "<doctype>"
            ),
            correctAnswer = "<html>",
            explanation = "The html tag is the root element that wraps the entire HTML document.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_3",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which section of HTML contains metadata and links?",
            options = listOf(
                "<body>",
                "<meta>",
                "<header>",
                "<head>"
            ),
            correctAnswer = "<head>",
            explanation = "The head section stores metadata, title, links, and scripts not shown on the page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_4",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag defines the title shown on the browser tab?",
            options = listOf(
                "<meta>",
                "<head>",
                "<title>",
                "<header>"
            ),
            correctAnswer = "<title>",
            explanation = "The title tag sets the page title visible on the browser tab.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_5",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which part of HTML is displayed to the user?",
            options = listOf(
                "<head>",
                "<meta>",
                "<title>",
                "<body>"
            ),
            correctAnswer = "<body>",
            explanation = "The body tag contains all visible content of the web page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_6",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "What is the purpose of the <!DOCTYPE html> declaration?",
            options = listOf(
                "Defines page title",
                "Links external files",
                "Informs browser about HTML version",
                "Creates document body"
            ),
            correctAnswer = "Informs browser about HTML version",
            explanation = "DOCTYPE tells the browser which HTML standard the document follows.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_7",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Where should the <!DOCTYPE html> declaration appear?",
            options = listOf(
                "Inside <body>",
                "Inside <head>",
                "Before <html>",
                "After <html>"
            ),
            correctAnswer = "Before <html>",
            explanation = "DOCTYPE must be the first line before the html tag.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_8",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag encloses all visible and non-visible parts of HTML?",
            options = listOf(
                "<head>",
                "<body>",
                "<html>",
                "<section>"
            ),
            correctAnswer = "<html>",
            explanation = "The html tag wraps both head and body sections.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_9",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag is mandatory in every valid HTML document?",
            options = listOf(
                "<meta>",
                "<title>",
                "<html>",
                "<link>"
            ),
            correctAnswer = "<html>",
            explanation = "The html tag is mandatory as it defines the document root.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_10",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which element directly follows the <html> tag?",
            options = listOf(
                "<title>",
                "<body>",
                "<head>",
                "<meta>"
            ),
            correctAnswer = "<head>",
            explanation = "The head tag comes immediately after the html tag.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_11",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag contains SEO-related information?",
            options = listOf(
                "<body>",
                "<footer>",
                "<head>",
                "<section>"
            ),
            correctAnswer = "<head>",
            explanation = "SEO-related data like meta tags are placed inside head.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_12",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag defines character encoding?",
            options = listOf(
                "<title>",
                "<meta>",
                "<body>",
                "<link>"
            ),
            correctAnswer = "<meta>",
            explanation = "The meta tag is used to define character encoding like UTF-8.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_13",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "What happens if the <head> tag is omitted?",
            options = listOf(
                "HTML will not run",
                "Browser ignores body",
                "Browser adds it implicitly",
                "Page crashes"
            ),
            correctAnswer = "Browser adds it implicitly",
            explanation = "Browsers can auto-generate missing head tags.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_14",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which HTML structure element holds scripts and styles?",
            options = listOf(
                "<body>",
                "<section>",
                "<head>",
                "<article>"
            ),
            correctAnswer = "<head>",
            explanation = "Scripts and styles are usually placed inside the head tag.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_15",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag is responsible for page rendering order?",
            options = listOf(
                "<meta>",
                "<head>",
                "<body>",
                "<html>"
            ),
            correctAnswer = "<body>",
            explanation = "Content inside body is rendered in sequence on the page.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_16",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag must appear only once in an HTML document?",
            options = listOf(
                "<div>",
                "<p>",
                "<html>",
                "<span>"
            ),
            correctAnswer = "<html>",
            explanation = "The html tag is the single root element.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_17",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which section affects browser behavior but not page display?",
            options = listOf(
                "<body>",
                "<footer>",
                "<head>",
                "<main>"
            ),
            correctAnswer = "<head>",
            explanation = "Head affects browser processing but is not visible.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_18",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which HTML structure tag is parsed first by the browser?",
            options = listOf(
                "<body>",
                "<head>",
                "<html>",
                "<title>"
            ),
            correctAnswer = "<html>",
            explanation = "The browser starts parsing from the html root element.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_19",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag separates metadata from content?",
            options = listOf(
                "<section>",
                "<html>",
                "<head>",
                "<body>"
            ),
            correctAnswer = "<body>",
            explanation = "The body tag marks the start of visible content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_20",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which element defines the document type?",
            options = listOf(
                "<meta>",
                "<doctype>",
                "<!DOCTYPE html>",
                "<html>"
            ),
            correctAnswer = "<!DOCTYPE html>",
            explanation = "DOCTYPE defines the HTML version used by the document.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_21",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag contains links to CSS files?",
            options = listOf(
                "<style>",
                "<link>",
                "<meta>",
                "<script>"
            ),
            correctAnswer = "<link>",
            explanation = "External CSS files are linked using the link tag in head.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_22",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag is NOT part of basic HTML structure?",
            options = listOf(
                "<html>",
                "<head>",
                "<body>",
                "<table>"
            ),
            correctAnswer = "<table>",
            explanation = "Table is a content tag, not a structural requirement.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_23",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which HTML structure tag controls encoding and viewport?",
            options = listOf(
                "<title>",
                "<meta>",
                "<head>",
                "<html>"
            ),
            correctAnswer = "<meta>",
            explanation = "Meta tags define encoding, viewport, and SEO data.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_24",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which section loads before visible content?",
            options = listOf(
                "<footer>",
                "<body>",
                "<head>",
                "<main>"
            ),
            correctAnswer = "<head>",
            explanation = "The head section is processed before body rendering.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_25",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag ensures standards-compliant rendering?",
            options = listOf(
                "<html>",
                "<head>",
                "<!DOCTYPE html>",
                "<meta>"
            ),
            correctAnswer = "<!DOCTYPE html>",
            explanation = "DOCTYPE prevents quirks mode in browsers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_26",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which HTML structure is correct?",
            options = listOf(
                "<body><head></head></body>",
                "<html><body></body><head></head></html>",
                "<html><head></head><body></body></html>",
                "<head><body></body></head>"
            ),
            correctAnswer = "<html><head></head><body></body></html>",
            explanation = "Head must come before body inside html.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_27",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag defines the language of the document?",
            options = listOf(
                "<meta>",
                "<html lang>",
                "<body>",
                "<head>"
            ),
            correctAnswer = "<html lang>",
            explanation = "The lang attribute is set on the html tag.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_28",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag is optional but recommended for SEO?",
            options = listOf(
                "<body>",
                "<head>",
                "<title>",
                "<html>"
            ),
            correctAnswer = "<title>",
            explanation = "Title improves SEO and usability but browser may still render page without it.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_29",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which structural part controls page metadata?",
            options = listOf(
                "<header>",
                "<body>",
                "<head>",
                "<section>"
            ),
            correctAnswer = "<head>",
            explanation = "Metadata like charset and description belong to head.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_30",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which element is mandatory for proper HTML5 rendering?",
            options = listOf(
                "<meta charset>",
                "<!DOCTYPE html>",
                "<title>",
                "<link>"
            ),
            correctAnswer = "<!DOCTYPE html>",
            explanation = "Without DOCTYPE, browser may enter quirks mode.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_31",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which section should not contain visible text?",
            options = listOf(
                "<body>",
                "<head>",
                "<main>",
                "<article>"
            ),
            correctAnswer = "<head>",
            explanation = "Head content is not shown directly to users.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_32",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which element encloses all metadata elements?",
            options = listOf(
                "<meta>",
                "<title>",
                "<head>",
                "<html>"
            ),
            correctAnswer = "<head>",
            explanation = "All metadata elements live inside head.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_33",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which HTML structure element affects page loading speed?",
            options = listOf(
                "<body>",
                "<head>",
                "<footer>",
                "<section>"
            ),
            correctAnswer = "<head>",
            explanation = "Scripts and links in head can impact loading performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_34",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag defines the visible document content?",
            options = listOf(
                "<html>",
                "<head>",
                "<body>",
                "<meta>"
            ),
            correctAnswer = "<body>",
            explanation = "Everything visible to the user goes inside body.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_35",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which structure element is parsed but not rendered?",
            options = listOf(
                "<body>",
                "<head>",
                "<main>",
                "<article>"
            ),
            correctAnswer = "<head>",
            explanation = "Head content is parsed but not displayed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_36",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag improves accessibility and SEO?",
            options = listOf(
                "<body>",
                "<html lang>",
                "<meta>",
                "<link>"
            ),
            correctAnswer = "<html lang>",
            explanation = "Language declaration helps screen readers and search engines.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_37",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which structural tag is required for browser title?",
            options = listOf(
                "<head>",
                "<body>",
                "<html>",
                "<meta>"
            ),
            correctAnswer = "<head>",
            explanation = "Title must be placed inside the head tag.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_38",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which element defines document hierarchy?",
            options = listOf(
                "<meta>",
                "<html>",
                "<title>",
                "<link>"
            ),
            correctAnswer = "<html>",
            explanation = "HTML tag defines the document hierarchy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_39",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which structural error triggers quirks mode?",
            options = listOf(
                "Missing body",
                "Missing html",
                "Missing doctype",
                "Missing head"
            ),
            correctAnswer = "Missing doctype",
            explanation = "Without DOCTYPE, browsers may switch to quirks mode.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_40",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag groups metadata logically?",
            options = listOf(
                "<body>",
                "<section>",
                "<head>",
                "<footer>"
            ),
            correctAnswer = "<head>",
            explanation = "Head groups metadata elements together.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_41",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag contains external JS file links?",
            options = listOf(
                "<script>",
                "<meta>",
                "<link>",
                "<style>"
            ),
            correctAnswer = "<script>",
            explanation = "External JavaScript files are loaded using script tags.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_42",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag ensures correct text rendering?",
            options = listOf(
                "<meta charset>",
                "<title>",
                "<body>",
                "<html>"
            ),
            correctAnswer = "<meta charset>",
            explanation = "Charset defines how characters are displayed.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_43",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which structural tag affects browser bookmarks?",
            options = listOf(
                "<meta>",
                "<title>",
                "<body>",
                "<html>"
            ),
            correctAnswer = "<title>",
            explanation = "Browser bookmarks use the page title.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_44",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which tag should never be placed inside body?",
            options = listOf(
                "<head>",
                "<section>",
                "<div>",
                "<article>"
            ),
            correctAnswer = "<head>",
            explanation = "Head must be outside body for valid structure.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html_structure_45",
            categoryId = categoryId,
            chapterId = HTML_STRUCTURE,
            questionText = "Which structure ensures browser compatibility?",
            options = listOf(
                "Correct nesting",
                "External CSS",
                "JavaScript",
                "Images"
            ),
            correctAnswer = "Correct nesting",
            explanation = "Proper nesting ensures consistent rendering across browsers.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_text_formatting_1",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which HTML tag is used to make text bold without extra importance?",
            options = listOf(
                "<strong>",
                "<b>",
                "<em>",
                "<mark>"
            ),
            correctAnswer = "<b>",
            explanation = "The <b> tag makes text bold without adding semantic importance.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_2",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is semantically correct for strong importance?",
            options = listOf(
                "<b>",
                "<i>",
                "<strong>",
                "<u>"
            ),
            correctAnswer = "<strong>",
            explanation = "<strong> indicates strong importance, not just visual boldness.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_3",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used to italicize text without emphasis?",
            options = listOf(
                "<em>",
                "<i>",
                "<mark>",
                "<small>"
            ),
            correctAnswer = "<i>",
            explanation = "<i> is used for visual italics without semantic meaning.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_4",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag conveys emphasized text semantically?",
            options = listOf(
                "<i>",
                "<em>",
                "<u>",
                "<b>"
            ),
            correctAnswer = "<em>",
            explanation = "<em> adds emphasis and is meaningful for screen readers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_5",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag highlights text with a background color?",
            options = listOf(
                "<mark>",
                "<strong>",
                "<b>",
                "<span>"
            ),
            correctAnswer = "<mark>",
            explanation = "<mark> highlights text, usually with a yellow background.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_6",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag displays text in smaller font size?",
            options = listOf(
                "<small>",
                "<sub>",
                "<sup>",
                "<span>"
            ),
            correctAnswer = "<small>",
            explanation = "<small> reduces the text size relative to surrounding content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_7",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used to strike through text?",
            options = listOf(
                "<strike>",
                "<del>",
                "<s>",
                "<u>"
            ),
            correctAnswer = "<del>",
            explanation = "<del> represents deleted or removed text semantically.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_8",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is preferred over <strike> in HTML5?",
            options = listOf(
                "<s>",
                "<del>",
                "<u>",
                "<mark>"
            ),
            correctAnswer = "<del>",
            explanation = "<del> is the semantic replacement for deprecated <strike>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_9",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag underlines text?",
            options = listOf(
                "<u>",
                "<em>",
                "<ins>",
                "<mark>"
            ),
            correctAnswer = "<u>",
            explanation = "<u> underlines text without semantic meaning.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_10",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag represents inserted text?",
            options = listOf(
                "<u>",
                "<del>",
                "<ins>",
                "<mark>"
            ),
            correctAnswer = "<ins>",
            explanation = "<ins> marks text that has been added to a document.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_11",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used for superscript text?",
            options = listOf(
                "<sup>",
                "<sub>",
                "<small>",
                "<span>"
            ),
            correctAnswer = "<sup>",
            explanation = "<sup> displays text slightly above the normal line.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_12",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used for subscript text?",
            options = listOf(
                "<sup>",
                "<sub>",
                "<small>",
                "<mark>"
            ),
            correctAnswer = "<sub>",
            explanation = "<sub> displays text slightly below the normal line.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_13",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag preserves both spaces and line breaks?",
            options = listOf(
                "<code>",
                "<pre>",
                "<p>",
                "<span>"
            ),
            correctAnswer = "<pre>",
            explanation = "<pre> preserves whitespace exactly as written in HTML.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_14",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used to display computer code?",
            options = listOf(
                "<pre>",
                "<code>",
                "<kbd>",
                "<samp>"
            ),
            correctAnswer = "<code>",
            explanation = "<code> is used to represent programming code.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_15",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag represents keyboard input?",
            options = listOf(
                "<code>",
                "<kbd>",
                "<samp>",
                "<var>"
            ),
            correctAnswer = "<kbd>",
            explanation = "<kbd> is used for keyboard input instructions.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_16",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag represents sample output?",
            options = listOf(
                "<samp>",
                "<code>",
                "<kbd>",
                "<pre>"
            ),
            correctAnswer = "<samp>",
            explanation = "<samp> shows sample output from a program.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_17",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used for variable names?",
            options = listOf(
                "<code>",
                "<var>",
                "<kbd>",
                "<samp>"
            ),
            correctAnswer = "<var>",
            explanation = "<var> represents variables in mathematical or programming context.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_18",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag creates a line break without spacing?",
            options = listOf(
                "<hr>",
                "<br>",
                "<p>",
                "<pre>"
            ),
            correctAnswer = "<br>",
            explanation = "<br> inserts a single line break.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_19",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag creates a horizontal line?",
            options = listOf(
                "<br>",
                "<line>",
                "<hr>",
                "<div>"
            ),
            correctAnswer = "<hr>",
            explanation = "<hr> inserts a thematic horizontal rule.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_20",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is semantic for deleted content?",
            options = listOf(
                "<s>",
                "<strike>",
                "<del>",
                "<u>"
            ),
            correctAnswer = "<del>",
            explanation = "<del> indicates content that has been removed.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_21",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which formatting tag is deprecated in HTML5?",
            options = listOf(
                "<b>",
                "<i>",
                "<strike>",
                "<mark>"
            ),
            correctAnswer = "<strike>",
            explanation = "<strike> is deprecated and replaced by <del>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_22",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is purely non-semantic?",
            options = listOf(
                "<strong>",
                "<em>",
                "<b>",
                "<ins>"
            ),
            correctAnswer = "<b>",
            explanation = "<b> changes appearance only, without meaning.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_23",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is best for accessibility?",
            options = listOf(
                "<b>",
                "<i>",
                "<strong>",
                "<u>"
            ),
            correctAnswer = "<strong>",
            explanation = "<strong> provides meaning for screen readers.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_24",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag preserves formatting exactly?",
            options = listOf(
                "<code>",
                "<pre>",
                "<p>",
                "<span>"
            ),
            correctAnswer = "<pre>",
            explanation = "<pre> preserves spaces and line breaks.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_25",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used for inline formatting?",
            options = listOf(
                "<div>",
                "<p>",
                "<span>",
                "<section>"
            ),
            correctAnswer = "<span>",
            explanation = "<span> is an inline container used for styling text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_26",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag indicates emphasized stress?",
            options = listOf(
                "<i>",
                "<em>",
                "<b>",
                "<mark>"
            ),
            correctAnswer = "<em>",
            explanation = "<em> indicates stress emphasis in content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_27",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which formatting tag should be avoided for styling?",
            options = listOf(
                "<strong>",
                "<em>",
                "<b>",
                "<mark>"
            ),
            correctAnswer = "<b>",
            explanation = "Styling should be done using CSS instead of <b>.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_28",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is inline by default?",
            options = listOf(
                "<p>",
                "<div>",
                "<span>",
                "<pre>"
            ),
            correctAnswer = "<span>",
            explanation = "<span> is an inline-level element.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_29",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag visually looks italic but adds meaning?",
            options = listOf(
                "<i>",
                "<em>",
                "<u>",
                "<small>"
            ),
            correctAnswer = "<em>",
            explanation = "<em> looks italic but adds semantic emphasis.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_30",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag should be used for chemical formulas like H2O?",
            options = listOf(
                "<sup>",
                "<sub>",
                "<small>",
                "<var>"
            ),
            correctAnswer = "<sub>",
            explanation = "<sub> is used for subscripts like chemical formulas.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_31",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is best for mathematical powers?",
            options = listOf(
                "<sub>",
                "<sup>",
                "<var>",
                "<code>"
            ),
            correctAnswer = "<sup>",
            explanation = "<sup> is used for exponents and powers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_32",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag visually marks updated content?",
            options = listOf(
                "<mark>",
                "<ins>",
                "<u>",
                "<b>"
            ),
            correctAnswer = "<ins>",
            explanation = "<ins> indicates newly inserted content.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_33",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag creates semantic separation in text?",
            options = listOf(
                "<br>",
                "<hr>",
                "<p>",
                "<span>"
            ),
            correctAnswer = "<hr>",
            explanation = "<hr> represents a thematic break in content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_34",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which formatting tag affects SEO positively?",
            options = listOf(
                "<b>",
                "<i>",
                "<strong>",
                "<u>"
            ),
            correctAnswer = "<strong>",
            explanation = "<strong> adds semantic importance recognized by search engines.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_35",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is inline and semantic?",
            options = listOf(
                "<strong>",
                "<div>",
                "<p>",
                "<pre>"
            ),
            correctAnswer = "<strong>",
            explanation = "<strong> is inline and carries meaning.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_36",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag should replace <font> in HTML5?",
            options = listOf(
                "<span>",
                "<style>",
                "<strong>",
                "<mark>"
            ),
            correctAnswer = "<span>",
            explanation = "<span> with CSS replaces deprecated <font>.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_37",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is deprecated for formatting?",
            options = listOf(
                "<font>",
                "<strong>",
                "<em>",
                "<mark>"
            ),
            correctAnswer = "<font>",
            explanation = "<font> is deprecated in HTML5.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_38",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is best for inline grouping?",
            options = listOf(
                "<div>",
                "<span>",
                "<section>",
                "<article>"
            ),
            correctAnswer = "<span>",
            explanation = "<span> groups inline text elements.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_39",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which formatting tag does not affect layout?",
            options = listOf(
                "<span>",
                "<p>",
                "<div>",
                "<pre>"
            ),
            correctAnswer = "<span>",
            explanation = "<span> does not create line breaks.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_40",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is used for emphasized quotations?",
            options = listOf(
                "<em>",
                "<blockquote>",
                "<q>",
                "<cite>"
            ),
            correctAnswer = "<q>",
            explanation = "<q> represents short inline quotations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_41",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag displays cited work titles?",
            options = listOf(
                "<cite>",
                "<q>",
                "<em>",
                "<i>"
            ),
            correctAnswer = "<cite>",
            explanation = "<cite> represents titles of creative works.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_42",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag is semantic and inline?",
            options = listOf(
                "<em>",
                "<div>",
                "<pre>",
                "<section>"
            ),
            correctAnswer = "<em>",
            explanation = "<em> is inline and carries meaning.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_43",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which formatting tag improves readability for screen readers?",
            options = listOf(
                "<b>",
                "<i>",
                "<strong>",
                "<span>"
            ),
            correctAnswer = "<strong>",
            explanation = "<strong> conveys importance to assistive technologies.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_44",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which tag visually separates sections?",
            options = listOf(
                "<br>",
                "<hr>",
                "<span>",
                "<mark>"
            ),
            correctAnswer = "<hr>",
            explanation = "<hr> creates a visual and semantic separator.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_text_formatting_45",
            categoryId = categoryId,
            chapterId = HTML_TEXT,
            questionText = "Which formatting approach is recommended in modern HTML?",
            options = listOf(
                "HTML formatting tags only",
                "CSS-based formatting",
                "Inline font tags",
                "Deprecated tags"
            ),
            correctAnswer = "CSS-based formatting",
            explanation = "Modern HTML uses CSS for styling and formatting.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_links_images_1",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which HTML tag is used to create a hyperlink?",
            options = listOf(
                "<link>",
                "<a>",
                "<href>",
                "<url>"
            ),
            correctAnswer = "<a>",
            explanation = "The <a> tag (anchor tag) is used to create hyperlinks in HTML.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_2",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute specifies the destination of a hyperlink?",
            options = listOf(
                "src",
                "link",
                "href",
                "target"
            ),
            correctAnswer = "href",
            explanation = "The href attribute defines the URL the link points to.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_3",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which value of target opens a link in a new tab?",
            options = listOf(
                "_self",
                "_parent",
                "_top",
                "_blank"
            ),
            correctAnswer = "_blank",
            explanation = "_blank opens the linked document in a new tab or window.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_4",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag is used to display an image in HTML?",
            options = listOf(
                "<img>",
                "<image>",
                "<src>",
                "<picture>"
            ),
            correctAnswer = "<img>",
            explanation = "The <img> tag is used to embed images in a web page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_5",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute is mandatory for the <img> tag?",
            options = listOf(
                "alt",
                "title",
                "src",
                "width"
            ),
            correctAnswer = "src",
            explanation = "The src attribute specifies the image source path.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_6",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute provides alternative text for an image?",
            options = listOf(
                "title",
                "alt",
                "src",
                "name"
            ),
            correctAnswer = "alt",
            explanation = "The alt attribute provides text if the image cannot be displayed.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_7",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute defines the link behavior?",
            options = listOf(
                "href",
                "rel",
                "target",
                "type"
            ),
            correctAnswer = "target",
            explanation = "The target attribute controls where the linked document opens.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_8",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which of the following is a relative URL?",
            options = listOf(
                "https://example.com/page.html",
                "www.example.com",
                "/images/logo.png",
                "http://localhost/home"
            ),
            correctAnswer = "/images/logo.png",
            explanation = "Relative URLs point to resources within the same site.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_9",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which type of link points to a location on the same page?",
            options = listOf(
                "External link",
                "Absolute link",
                "Anchor link",
                "Image link"
            ),
            correctAnswer = "Anchor link",
            explanation = "Anchor links navigate to a specific section of the same page.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_10",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which symbol is used before an id in anchor links?",
            options = listOf(
                "@",
                "#",
                "$",
                "&"
            ),
            correctAnswer = "#",
            explanation = "# is used to reference an element id on the same page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_11",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag makes an image clickable?",
            options = listOf(
                "<img>",
                "<a>",
                "<map>",
                "<area>"
            ),
            correctAnswer = "<a>",
            explanation = "Wrapping an image inside <a> makes it a clickable link.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_12",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute sets the image width?",
            options = listOf(
                "size",
                "height",
                "length",
                "width"
            ),
            correctAnswer = "width",
            explanation = "The width attribute sets the image width in pixels or percentage.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_13",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute maintains image aspect ratio when resized?",
            options = listOf(
                "alt",
                "src",
                "height and width together",
                "title"
            ),
            correctAnswer = "height and width together",
            explanation = "Using both height and width maintains image proportions.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_14",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag is used for image mapping?",
            options = listOf(
                "<map>",
                "<img>",
                "<area>",
                "<picture>"
            ),
            correctAnswer = "<map>",
            explanation = "<map> defines clickable areas within an image.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_15",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag definkable regions in an image map?",
            options = listOf(
                "<map>",
                "<img>",
                "<area>",
                "<a>"
            ),
            correctAnswer = "<area>",
            explanation = "<area> defines clickable regions inside an image map.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_16",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute connects <img> with <map>?",
            options = listOf(
                "id",
                "usemap",
                "src",
                "href"
            ),
            correctAnswer = "usemap",
            explanation = "usemap links an image to an image map.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_17",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which type of URL includes protocol and domain?",
            options = listOf(
                "Relative URL",
                "Anchor URL",
                "Absolute URL",
                "Local URL"
            ),
            correctAnswer = "Absolute URL",
            explanation = "Absolute URLs include protocol, domain, and full path.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_18",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute improves accessibility for images?",
            options = listOf(
                "src",
                "width",
                "alt",
                "style"
            ),
            correctAnswer = "alt",
            explanation = "alt text is used by screen readers for accessibility.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_19",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which link opens in the same tab by default?",
            options = listOf(
                "_blank",
                "_new",
                "_self",
                "_parent"
            ),
            correctAnswer = "_self",
            explanation = "_self is the default target behavior.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_20",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute specifies relationship between documents?",
            options = listOf(
                "rel",
                "type",
                "href",
                "target"
            ),
            correctAnswer = "rel",
            explanation = "rel describes the relationship between current and linked document.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_21",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag is used to group multiple image sources?",
            options = listOf(
                "<img>",
                "<picture>",
                "<map>",
                "<figure>"
            ),
            correctAnswer = "<picture>",
            explanation = "<picture> allows multiple image sources for responsiveness.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_22",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute specifies image loading hint?",
            options = listOf(
                "async",
                "defer",
                "loading",
                "fetch"
            ),
            correctAnswer = "loading",
            explanation = "loading='lazy' delays image loading for performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_23",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag provides a caption for an image?",
            options = listOf(
                "<caption>",
                "<figcaption>",
                "<alt>",
                "<title>"
            ),
            correctAnswer = "<figcaption>",
            explanation = "<figcaption> provides captions for images inside <figure>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_24",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which container groups image with caption?",
            options = listOf(
                "<figure>",
                "<div>",
                "<section>",
                "<article>"
            ),
            correctAnswer = "<figure>",
            explanation = "<figure> groups media content with captions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_25",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which link type is best for SEO navigation?",
            options = listOf(
                "Image links",
                "Text links",
                "Button links",
                "Hidden links"
            ),
            correctAnswer = "Text links",
            explanation = "Text links are clearer for search engines.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_26",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute defines image description tooltip?",
            options = listOf(
                "alt",
                "title",
                "src",
                "name"
            ),
            correctAnswer = "title",
            explanation = "title shows tooltip text on hover.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_27",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which link points to an email address?",
            options = listOf(
                "mailto:",
                "tel:",
                "ftp:",
                "http:"
            ),
            correctAnswer = "mailto:",
            explanation = "mailto: opens the default email client.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_28",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which protocol is used for phone links?",
            options = listOf(
                "mailto:",
                "sms:",
                "tel:",
                "call:"
            ),
            correctAnswer = "tel:",
            explanation = "tel: is used for clickable phone numbers.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_29",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute is required for accessibility compliance?",
            options = listOf(
                "title",
                "width",
                "alt",
                "height"
            ),
            correctAnswer = "alt",
            explanation = "alt text is required for accessibility standards.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_30",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which link type is broken if file path is wrong?",
            options = listOf(
                "Internal link",
                "External link",
                "Anchor link",
                "Email link"
            ),
            correctAnswer = "Internal link",
            explanation = "Internal links depend on correct file paths.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_31",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag is empty and has no closing tag?",
            options = listOf(
                "<a>",
                "<map>",
                "<img>",
                "<figure>"
            ),
            correctAnswer = "<img>",
            explanation = "<img> is an empty element with no closing tag.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_32",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which image format supports transparency?",
            options = listOf(
                "JPG",
                "PNG",
                "BMP",
                "TIFF"
            ),
            correctAnswer = "PNG",
            explanation = "PNG supports transparency using alpha channel.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_33",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which image format is best for photographs?",
            options = listOf(
                "PNG",
                "SVG",
                "JPG",
                "GIF"
            ),
            correctAnswer = "JPG",
            explanation = "JPG is optimized for photographs.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_34",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which image format is vector-based?",
            options = listOf(
                "PNG",
                "JPG",
                "SVG",
                "GIF"
            ),
            correctAnswer = "SVG",
            explanation = "SVG is a vector image format.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_35",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute prevents image distortion?",
            options = listOf(
                "alt",
                "style",
                "aspect-ratio via CSS",
                "title"
            ),
            correctAnswer = "aspect-ratio via CSS",
            explanation = "CSS aspect-ratio prevents image distortion.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_36",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute defines link tooltip?",
            options = listOf(
                "alt",
                "title",
                "rel",
                "href"
            ),
            correctAnswer = "title",
            explanation = "title shows tooltip when hovering over links.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_37",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which link improves internal page navigation?",
            options = listOf(
                "External link",
                "Anchor link",
                "Absolute link",
                "Mail link"
            ),
            correctAnswer = "Anchor link",
            explanation = "Anchor links jump within the same page.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_38",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which image attribute is optional but recommended?",
            options = listOf(
                "src",
                "alt",
                "width",
                "height"
            ),
            correctAnswer = "alt",
            explanation = "alt is optional syntactically but strongly recommended.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_39",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which link opens parent frame?",
            options = listOf(
                "_self",
                "_top",
                "_parent",
                "_blank"
            ),
            correctAnswer = "_parent",
            explanation = "_parent opens link in parent frame.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_40",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute improves performance for images?",
            options = listOf(
                "alt",
                "loading",
                "width",
                "height"
            ),
            correctAnswer = "loading",
            explanation = "loading='lazy' improves page performance.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_41",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which tag groups image with caption semantically?",
            options = listOf(
                "<div>",
                "<figure>",
                "<section>",
                "<article>"
            ),
            correctAnswer = "<figure>",
            explanation = "<figure> semantically groups media content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_42",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which image format supports animation?",
            options = listOf(
                "PNG",
                "JPG",
                "SVG",
                "GIF"
            ),
            correctAnswer = "GIF",
            explanation = "GIF supports basic animation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_43",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which link is safest for external websites?",
            options = listOf(
                "Relative link",
                "Anchor link",
                "Absolute link",
                "Internal link"
            ),
            correctAnswer = "Absolute link",
            explanation = "Absolute links ensure correct external navigation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_44",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which attribute prevents SEO penalty for external links?",
            options = listOf(
                "nofollow",
                "noopener",
                "noreferrer",
                "rel=\"nofollow\""
            ),
            correctAnswer = "rel=\"nofollow\"",
            explanation = "nofollow tells search engines not to follow the link.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_links_images_45",
            categoryId = categoryId,
            chapterId = HTML_LINKS,
            questionText = "Which approach is best practice for images in modern HTML?",
            options = listOf(
                "Large images only",
                "Images without alt",
                "Responsive images",
                "Inline base64 images"
            ),
            correctAnswer = "Responsive images",
            explanation = "Responsive images adapt to different screen sizes.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_lists_1",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML tag is used to create an unordered list?",
            options = listOf(
                "<ol>",
                "<ul>",
                "<li>",
                "<list>"
            ),
            correctAnswer = "<ul>",
            explanation = "<ul> creates an unordered (bulleted) list.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_2",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML tag is used to create an ordered list?",
            options = listOf(
                "<ul>",
                "<li>",
                "<ol>",
                "<order>"
            ),
            correctAnswer = "<ol>",
            explanation = "<ol> creates a numbered or ordered list.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_3",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which tag represents a list item?",
            options = listOf(
                "<ul>",
                "<ol>",
                "<li>",
                "<item>"
            ),
            correctAnswer = "<li>",
            explanation = "<li> defines an individual item inside a list.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_4",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list displays items with bullets by default?",
            options = listOf(
                "Ordered list",
                "Definition list",
                "Unordered list",
                "Nested list"
            ),
            correctAnswer = "Unordered list",
            explanation = "Unordered lists use bullets by default.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_5",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list displays items with numbers by default?",
            options = listOf(
                "Unordered list",
                "Ordered list",
                "Definition list",
                "Inline list"
            ),
            correctAnswer = "Ordered list",
            explanation = "Ordered lists display items using numbers or letters.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_6",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML tag is used to create a description list?",
            options = listOf(
                "<dl>",
                "<ul>",
                "<ol>",
                "<list>"
            ),
            correctAnswer = "<dl>",
            explanation = "<dl> defines a description (definition) list.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_7",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which tag defines a term in a description list?",
            options = listOf(
                "<dd>",
                "<dt>",
                "<li>",
                "<term>"
            ),
            correctAnswer = "<dt>",
            explanation = "<dt> defines the term in a description list.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_8",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which tag defines the description of a term?",
            options = listOf(
                "<dt>",
                "<dl>",
                "<dd>",
                "<li>"
            ),
            correctAnswer = "<dd>",
            explanation = "<dd> describes the term defined by <dt>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_9",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list type is best for glossary or FAQ?",
            options = listOf(
                "Ordered list",
                "Unordered list",
                "Description list",
                "Nested list"
            ),
            correctAnswer = "Description list",
            explanation = "Description lists are ideal for terms and explanations.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_10",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which attribute changes numbering style in ordered lists?",
            options = listOf(
                "style",
                "type",
                "format",
                "value"
            ),
            correctAnswer = "type",
            explanation = "The type attribute changes numbering style like A, a, I, i.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_11",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which value of type attribute creates Roman numerals?",
            options = listOf(
                "A",
                "a",
                "I",
                "1"
            ),
            correctAnswer = "I",
            explanation = "Type=\"I\" uses uppercase Roman numerals.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_12",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which attribute specifies the starting number of an ordered list?",
            options = listOf(
                "begin",
                "value",
                "start",
                "index"
            ),
            correctAnswer = "start",
            explanation = "The start attribute defines the starting number.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_13",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which attribute sets a specific value for a list item?",
            options = listOf(
                "start",
                "type",
                "value",
                "order"
            ),
            correctAnswer = "value",
            explanation = "value sets the number of a particular list item.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_14",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list can contain another list inside it?",
            options = listOf(
                "Inline list",
                "Flat list",
                "Nested list",
                "Description list"
            ),
            correctAnswer = "Nested list",
            explanation = "Nested lists place one list inside another list item.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_15",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which tag must directly contain <li> elements?",
            options = listOf(
                "<ul> or <ol>",
                "<dl>",
                "<dt>",
                "<dd>"
            ),
            correctAnswer = "<ul> or <ol>",
            explanation = "<li> elements must be inside <ul> or <ol>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_16",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list does NOT use <li> tags?",
            options = listOf(
                "Ordered list",
                "Unordered list",
                "Description list",
                "Nested list"
            ),
            correctAnswer = "Description list",
            explanation = "Description lists use <dt> and <dd>, not <li>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_17",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML list is semantic for term-definition pairs?",
            options = listOf(
                "<ul>",
                "<ol>",
                "<dl>",
                "<li>"
            ),
            correctAnswer = "<dl>",
            explanation = "<dl> is semantic for definitions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_18",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list style removes bullets using CSS?",
            options = listOf(
                "list-style: none",
                "bullet: none",
                "type: none",
                "style: off"
            ),
            correctAnswer = "list-style: none",
            explanation = "CSS list-style: none removes bullets or numbers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_19",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML list is best for navigation menus?",
            options = listOf(
                "Ordered list",
                "Unordered list",
                "Description list",
                "Table"
            ),
            correctAnswer = "Unordered list",
            explanation = "Menus usually use unordered lists.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_20",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list preserves sequence importance?",
            options = listOf(
                "Unordered list",
                "Description list",
                "Ordered list",
                "Inline list"
            ),
            correctAnswer = "Ordered list",
            explanation = "Ordered lists indicate sequence or priority.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_21",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML tag is invalid inside <ul>?",
            options = listOf(
                "<li>",
                "<ul>",
                "<div>",
                "<dt>"
            ),
            correctAnswer = "<dt>",
            explanation = "<dt> belongs only inside <dl>.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_22",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which attribute reverses numbering in ordered lists?",
            options = listOf(
                "reverse",
                "invert",
                "reversed",
                "backward"
            ),
            correctAnswer = "reversed",
            explanation = "The reversed attribute reverses numbering order.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_23",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which tag combination is correct for description list?",
            options = listOf(
                "<dl><li></li></dl>",
                "<dl><dt></dt><dd></dd></dl>",
                "<ul><dt></dt></ul>",
                "<ol><dd></dd></ol>"
            ),
            correctAnswer = "<dl><dt></dt><dd></dd></dl>",
            explanation = "Description lists use <dt> and <dd>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_24",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list type supports alphabetical ordering?",
            options = listOf(
                "Unordered list",
                "Ordered list",
                "Description list",
                "Inline list"
            ),
            correctAnswer = "Ordered list",
            explanation = "Ordered lists can use alphabetical ordering.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_25",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML list element is block-level by default?",
            options = listOf(
                "<li>",
                "<span>",
                "<ul>",
                "<a>"
            ),
            correctAnswer = "<ul>",
            explanation = "<ul> is block-level by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_26",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list is most semantic for step-by-step instructions?",
            options = listOf(
                "Unordered list",
                "Ordered list",
                "Description list",
                "Nested list"
            ),
            correctAnswer = "Ordered list",
            explanation = "Steps require sequence, so ordered lists are best.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_27",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which attribute is obsolete for <ul> in HTML5?",
            options = listOf(
                "type",
                "id",
                "class",
                "style"
            ),
            correctAnswer = "type",
            explanation = "Bullet styling should be done using CSS.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_28",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list element can contain block elements?",
            options = listOf(
                "<li>",
                "<dt>",
                "<span>",
                "<dd>"
            ),
            correctAnswer = "<li>",
            explanation = "<li> can contain block-level elements.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_29",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list structure improves accessibility?",
            options = listOf(
                "Using divs",
                "Using proper list tags",
                "Using tables",
                "Using spans"
            ),
            correctAnswer = "Using proper list tags",
            explanation = "Semantic lists help screen readers.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_30",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which HTML list is non-semantic if styled manually?",
            options = listOf(
                "Using <ul>",
                "Using <ol>",
                "Using <dl>",
                "Using <div>"
            ),
            correctAnswer = "Using <div>",
            explanation = "Using divs instead of lists removes semantics.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_31",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list item tag can appear multiple times?",
            options = listOf(
                "<ul>",
                "<ol>",
                "<li>",
                "<dl>"
            ),
            correctAnswer = "<li>",
            explanation = "Multiple <li> elements form a list.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_32",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list supports reversed numbering?",
            options = listOf(
                "<ul>",
                "<ol>",
                "<dl>",
                "<li>"
            ),
            correctAnswer = "<ol>",
            explanation = "Ordered lists support reversed attribute.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_33",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list type is most flexible for styling?",
            options = listOf(
                "Unordered list",
                "Ordered list",
                "Description list",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "All list types can be styled using CSS.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_34",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which tag defines list semantics to browsers?",
            options = listOf(
                "<li>",
                "<ul>/<ol>/<dl>",
                "<div>",
                "<span>"
            ),
            correctAnswer = "<ul>/<ol>/<dl>",
            explanation = "List containers define list semantics.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_35",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list item can contain another list?",
            options = listOf(
                "<ul>",
                "<ol>",
                "<li>",
                "<dt>"
            ),
            correctAnswer = "<li>",
            explanation = "Nested lists are placed inside <li>.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_36",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list element improves SEO when used correctly?",
            options = listOf(
                "Lists with divs",
                "Semantic HTML lists",
                "Tables",
                "Images"
            ),
            correctAnswer = "Semantic HTML lists",
            explanation = "Search engines understand semantic lists.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_37",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which attribute is HTML5-specific for ordered lists?",
            options = listOf(
                "type",
                "start",
                "reversed",
                "value"
            ),
            correctAnswer = "reversed",
            explanation = "reversed was introduced in HTML5.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_38",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list type is most commonly misused by beginners?",
            options = listOf(
                "Description list",
                "Ordered list",
                "Unordered list",
                "Nested list"
            ),
            correctAnswer = "Description list",
            explanation = "Beginners often misuse <dl>, <dt>, and <dd>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_39",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list element has no direct visual marker?",
            options = listOf(
                "<ul>",
                "<ol>",
                "<dl>",
                "<li>"
            ),
            correctAnswer = "<dl>",
            explanation = "Description lists have no bullets or numbers by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_40",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list type is best for legal clauses?",
            options = listOf(
                "Unordered list",
                "Ordered list",
                "Description list",
                "Inline list"
            ),
            correctAnswer = "Ordered list",
            explanation = "Legal clauses require strict ordering.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_41",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list tag is invalid outside its container?",
            options = listOf(
                "<li>",
                "<ul>",
                "<ol>",
                "<dl>"
            ),
            correctAnswer = "<li>",
            explanation = "<li> must be inside a list container.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_42",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list element improves screen reader navigation?",
            options = listOf(
                "<div>",
                "<span>",
                "<ul>/<ol>",
                "<br>"
            ),
            correctAnswer = "<ul>/<ol>",
            explanation = "Screen readers understand list structures.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_43",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list type supports semantic grouping?",
            options = listOf(
                "Unordered list",
                "Ordered list",
                "Description list",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "All list types provide semantic grouping.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_44",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which list tag combination is invalid?",
            options = listOf(
                "<ul><li></li></ul>",
                "<ol><li></li></ol>",
                "<dl><li></li></dl>",
                "<dl><dt></dt><dd></dd></dl>"
            ),
            correctAnswer = "<dl><li></li></dl>",
            explanation = "<li> cannot be used inside <dl>.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_lists_45",
            categoryId = categoryId,
            chapterId = HTML_LISTS,
            questionText = "Which practice is recommended for modern HTML lists?",
            options = listOf(
                "Use tables for lists",
                "Use divs with CSS",
                "Use semantic list tags",
                "Avoid lists"
            ),
            correctAnswer = "Use semantic list tags",
            explanation = "Semantic lists improve accessibility and SEO.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_tables_1",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which HTML tag is used to create a table?",
            options = listOf(
                "<table>",
                "<tab>",
                "<tbl>",
                "<grid>"
            ),
            correctAnswer = "<table>",
            explanation = "<table> is the container tag used to define an HTML table.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_2",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag defines a table row?",
            options = listOf(
                "<td>",
                "<th>",
                "<tr>",
                "<row>"
            ),
            correctAnswer = "<tr>",
            explanation = "<tr> represents a single row in a table.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_3",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag defines a table data cell?",
            options = listOf(
                "<tr>",
                "<th>",
                "<td>",
                "<cell>"
            ),
            correctAnswer = "<td>",
            explanation = "<td> is used for standard data cells inside rows.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_4",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag defines a table header cell?",
            options = listOf(
                "<td>",
                "<thead>",
                "<th>",
                "<header>"
            ),
            correctAnswer = "<th>",
            explanation = "<th> defines header cells and is bold and centered by default.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_5",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table cell is bold by default?",
            options = listOf(
                "<td>",
                "<tr>",
                "<th>",
                "<caption>"
            ),
            correctAnswer = "<th>",
            explanation = "<th> cells are bold and centered by default.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_6",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag provides a title for the table?",
            options = listOf(
                "<title>",
                "<caption>",
                "<thead>",
                "<summary>"
            ),
            correctAnswer = "<caption>",
            explanation = "<caption> provides a descriptive title for a table.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_7",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag groups the header content of a table?",
            options = listOf(
                "<thead>",
                "<tbody>",
                "<tfoot>",
                "<tr>"
            ),
            correctAnswer = "<thead>",
            explanation = "<thead> groups header rows in a table.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_8",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag groups the body content of a table?",
            options = listOf(
                "<thead>",
                "<tbody>",
                "<tfoot>",
                "<tr>"
            ),
            correctAnswer = "<tbody>",
            explanation = "<tbody> contains the main table data rows.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_9",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag groups the footer content of a table?",
            options = listOf(
                "<thead>",
                "<tbody>",
                "<tfoot>",
                "<footer>"
            ),
            correctAnswer = "<tfoot>",
            explanation = "<tfoot> groups footer rows like totals or summaries.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_10",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which attribute merges two or more columns?",
            options = listOf(
                "rowspan",
                "merge",
                "colspan",
                "span"
            ),
            correctAnswer = "colspan",
            explanation = "colspan merges multiple columns into one cell.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_11",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which attribute merges multiple rows?",
            options = listOf(
                "colspan",
                "merge",
                "rowspan",
                "rows"
            ),
            correctAnswer = "rowspan",
            explanation = "rowspan allows a cell to span across rows.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_12",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element improves accessibility?",
            options = listOf(
                "<div>",
                "<span>",
                "<th>",
                "<br>"
            ),
            correctAnswer = "<th>",
            explanation = "<th> helps screen readers identify header cells.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_13",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which attribute associates header cells with data cells?",
            options = listOf(
                "scope",
                "headers",
                "align",
                "axis"
            ),
            correctAnswer = "scope",
            explanation = "scope defines whether a header applies to rows or columns.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_14",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which value of scope applies header to a column?",
            options = listOf(
                "row",
                "col",
                "group",
                "table"
            ),
            correctAnswer = "col",
            explanation = "scope=\"col\" associates header with a column.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_15",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which value of scope applies header to a row?",
            options = listOf(
                "col",
                "row",
                "cell",
                "table"
            ),
            correctAnswer = "row",
            explanation = "scope=\"row\" associates header with a row.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_16",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element must be placed directly inside <table>?",
            options = listOf(
                "<td>",
                "<tr>",
                "<th>",
                "<caption>"
            ),
            correctAnswer = "<caption>",
            explanation = "<caption> must be a direct child of <table>.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_17",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table tag cannot exist outside <tr>?",
            options = listOf(
                "<td>",
                "<table>",
                "<caption>",
                "<thead>"
            ),
            correctAnswer = "<td>",
            explanation = "<td> must be inside a table row.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_18",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table tag cannot exist without <table>?",
            options = listOf(
                "<div>",
                "<tbody>",
                "<span>",
                "<section>"
            ),
            correctAnswer = "<tbody>",
            explanation = "<tbody> must be inside a table.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_19",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table layout is discouraged for page design?",
            options = listOf(
                "Data tables",
                "Semantic tables",
                "Layout tables",
                "Accessible tables"
            ),
            correctAnswer = "Layout tables",
            explanation = "Tables should not be used for page layout.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_20",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which CSS property collapses table borders?",
            options = listOf(
                "border-style",
                "border-spacing",
                "border-collapse",
                "border-width"
            ),
            correctAnswer = "border-collapse",
            explanation = "border-collapse merges adjacent table borders.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_21",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which attribute aligns content inside table cells?",
            options = listOf(
                "align",
                "position",
                "float",
                "display"
            ),
            correctAnswer = "align",
            explanation = "align controls horizontal alignment inside cells (deprecated).",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_22",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table attribute is deprecated in HTML5?",
            options = listOf(
                "border",
                "rowspan",
                "colspan",
                "scope"
            ),
            correctAnswer = "border",
            explanation = "Table borders should be styled using CSS, not HTML attributes.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_23",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element helps screen readers understand structure?",
            options = listOf(
                "<div>",
                "<th>",
                "<span>",
                "<br>"
            ),
            correctAnswer = "<th>",
            explanation = "<th> provides semantic meaning for headers.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_24",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag defines a group of columns?",
            options = listOf(
                "<colgroup>",
                "<group>",
                "<columns>",
                "<colspan>"
            ),
            correctAnswer = "<colgroup>",
            explanation = "<colgroup> groups columns for styling.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_25",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag defines properties for individual columns?",
            options = listOf(
                "<col>",
                "<td>",
                "<tr>",
                "<th>"
            ),
            correctAnswer = "<col>",
            explanation = "<col> defines column-level properties.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_26",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table section is rendered before tbody in source order?",
            options = listOf(
                "<tfoot>",
                "<thead>",
                "<caption>",
                "<colgroup>"
            ),
            correctAnswer = "<tfoot>",
            explanation = "tfoot appears before tbody in source for faster rendering.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_27",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element is optional but recommended?",
            options = listOf(
                "<caption>",
                "<tr>",
                "<td>",
                "<table>"
            ),
            correctAnswer = "<caption>",
            explanation = "<caption> improves accessibility and clarity.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_28",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which tag defines table semantics to browsers?",
            options = listOf(
                "<table>",
                "<div>",
                "<section>",
                "<article>"
            ),
            correctAnswer = "<table>",
            explanation = "<table> tells browser content is tabular data.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_29",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table misuse affects SEO and accessibility?",
            options = listOf(
                "Using <th>",
                "Using <caption>",
                "Using tables for layout",
                "Using thead"
            ),
            correctAnswer = "Using tables for layout",
            explanation = "Layout tables harm accessibility and SEO.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_30",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element cannot be nested inside <tbody>?",
            options = listOf(
                "<tr>",
                "<td>",
                "<th>",
                "<caption>"
            ),
            correctAnswer = "<caption>",
            explanation = "<caption> must be direct child of <table>.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_31",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table attribute defines column width?",
            options = listOf(
                "size",
                "width",
                "length",
                "span"
            ),
            correctAnswer = "width",
            explanation = "width defines column or cell width (deprecated in HTML).",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_32",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table feature improves readability for large data?",
            options = listOf(
                "No borders",
                "Captions and headers",
                "Inline styles",
                "Nested tables"
            ),
            correctAnswer = "Captions and headers",
            explanation = "Headers and captions clarify table meaning.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_33",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table-related attribute is obsolete?",
            options = listOf(
                "cellpadding",
                "scope",
                "headers",
                "colspan"
            ),
            correctAnswer = "cellpadding",
            explanation = "Spacing should be handled using CSS.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_34",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table structure improves screen reader navigation?",
            options = listOf(
                "Tables without headers",
                "Tables with <th> and scope",
                "Nested tables",
                "Tables without caption"
            ),
            correctAnswer = "Tables with <th> and scope",
            explanation = "Headers with scope improve accessibility.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_35",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table tag defines tabular relationship?",
            options = listOf(
                "<div>",
                "<table>",
                "<span>",
                "<section>"
            ),
            correctAnswer = "<table>",
            explanation = "<table> semantically represents tabular data.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_36",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table tag may contain both <th> and <td>?",
            options = listOf(
                "<thead>",
                "<tr>",
                "<tbody>",
                "<tfoot>"
            ),
            correctAnswer = "<tr>",
            explanation = "<tr> can contain both header and data cells.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_37",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table practice is best for modern HTML?",
            options = listOf(
                "Use tables for layout",
                "Use tables only for data",
                "Avoid tables completely",
                "Nest tables deeply"
            ),
            correctAnswer = "Use tables only for data",
            explanation = "Tables should represent structured data only.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_38",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element defines column styling?",
            options = listOf(
                "<col>",
                "<td>",
                "<th>",
                "<tr>"
            ),
            correctAnswer = "<col>",
            explanation = "<col> applies styles to entire columns.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_39",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table tag improves SEO when used correctly?",
            options = listOf(
                "<table>",
                "<div>",
                "<span>",
                "<br>"
            ),
            correctAnswer = "<table>",
            explanation = "Semantic tables help search engines understand data.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_40",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element is optional but recommended for summaries?",
            options = listOf(
                "<tfoot>",
                "<thead>",
                "<tbody>",
                "<colgroup>"
            ),
            correctAnswer = "<tfoot>",
            explanation = "<tfoot> is useful for totals and summaries.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_41",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table element is parsed first by browsers?",
            options = listOf(
                "<tbody>",
                "<tfoot>",
                "<thead>",
                "<tr>"
            ),
            correctAnswer = "<tfoot>",
            explanation = "tfoot is parsed early to allow faster rendering.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_42",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table feature prevents visual clutter?",
            options = listOf(
                "Nested tables",
                "Collapsed borders",
                "Inline styles",
                "Multiple captions"
            ),
            correctAnswer = "Collapsed borders",
            explanation = "Collapsed borders make tables cleaner.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_43",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table tag cannot be repeated multiple times?",
            options = listOf(
                "<tr>",
                "<td>",
                "<thead>",
                "<tbody>"
            ),
            correctAnswer = "<thead>",
            explanation = "Only one thead is allowed per table.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_44",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which table structure mistake breaks accessibility?",
            options = listOf(
                "Using th",
                "Using caption",
                "Missing headers",
                "Using scope"
            ),
            correctAnswer = "Missing headers",
            explanation = "Headers are essential for accessible tables.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_tables_45",
            categoryId = categoryId,
            chapterId = HTML_TABLES,
            questionText = "Which approach is recommended for table styling?",
            options = listOf(
                "HTML attributes",
                "Inline styles",
                "CSS",
                "Deprecated tags"
            ),
            correctAnswer = "CSS",
            explanation = "CSS is the modern way to style tables.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_forms_1",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which HTML tag is used to create a form?",
            options = listOf(
                "<form>",
                "<input>",
                "<fieldset>",
                "<label>"
            ),
            correctAnswer = "<form>",
            explanation = "<form> is the container that holds all form controls.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_2",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute specifies where form data is sent?",
            options = listOf(
                "method",
                "action",
                "target",
                "name"
            ),
            correctAnswer = "action",
            explanation = "The action attribute defines the URL that receives form data.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_3",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute specifies how form data is sent?",
            options = listOf(
                "action",
                "method",
                "enctype",
                "type"
            ),
            correctAnswer = "method",
            explanation = "The method attribute defines GET or POST submission.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_4",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which is the default method of an HTML form?",
            options = listOf(
                "POST",
                "PUT",
                "GET",
                "DELETE"
            ),
            correctAnswer = "GET",
            explanation = "If method is not specified, GET is used by default.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_5",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which HTML tag is used to accept user input?",
            options = listOf(
                "<form>",
                "<input>",
                "<label>",
                "<select>"
            ),
            correctAnswer = "<input>",
            explanation = "<input> is the most common form control.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_6",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type hides entered characters?",
            options = listOf(
                "text",
                "hidden",
                "password",
                "secure"
            ),
            correctAnswer = "password",
            explanation = "password input masks characters for security.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_7",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type is used for email validation?",
            options = listOf(
                "text",
                "email",
                "mail",
                "validate"
            ),
            correctAnswer = "email",
            explanation = "email type enables basic email format validation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_8",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type allows selecting multiple options?",
            options = listOf(
                "radio",
                "checkbox",
                "select",
                "option"
            ),
            correctAnswer = "checkbox",
            explanation = "Checkbox allows multiple selections.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_9",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type allows only one selection in a group?",
            options = listOf(
                "checkbox",
                "text",
                "radio",
                "select"
            ),
            correctAnswer = "radio",
            explanation = "Radio buttons allow only one choice per group.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_10",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute groups radio buttons?",
            options = listOf(
                "id",
                "class",
                "name",
                "value"
            ),
            correctAnswer = "name",
            explanation = "Radio buttons with same name act as a group.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_11",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which tag is used to create a dropdown list?",
            options = listOf(
                "<input>",
                "<option>",
                "<select>",
                "<datalist>"
            ),
            correctAnswer = "<select>",
            explanation = "<select> creates a dropdown menu.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_12",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which tag defines options inside a dropdown?",
            options = listOf(
                "<list>",
                "<item>",
                "<option>",
                "<value>"
            ),
            correctAnswer = "<option>",
            explanation = "<option> defines each dropdown item.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_13",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute makes a form field mandatory?",
            options = listOf(
                "validate",
                "required",
                "must",
                "mandatory"
            ),
            correctAnswer = "required",
            explanation = "required forces user to fill the field.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_14",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute disables a form control?",
            options = listOf(
                "readonly",
                "inactive",
                "disabled",
                "hidden"
            ),
            correctAnswer = "disabled",
            explanation = "disabled prevents user interaction and submission.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_15",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute makes input non-editable but submits value?",
            options = listOf(
                "disabled",
                "readonly",
                "hidden",
                "locked"
            ),
            correctAnswer = "readonly",
            explanation = "readonly fields are submitted but cannot be edited.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_16",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which tag provides a label for form inputs?",
            options = listOf(
                "<legend>",
                "<label>",
                "<caption>",
                "<title>"
            ),
            correctAnswer = "<label>",
            explanation = "<label> improves accessibility and usability.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_17",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute connects label with input?",
            options = listOf(
                "name",
                "for",
                "id",
                "value"
            ),
            correctAnswer = "for",
            explanation = "for attribute links label to input id.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_18",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which tag groups related form fields?",
            options = listOf(
                "<form>",
                "<fieldset>",
                "<group>",
                "<section>"
            ),
            correctAnswer = "<fieldset>",
            explanation = "<fieldset> groups related form elements.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_19",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which tag provides a title for a fieldset?",
            options = listOf(
                "<label>",
                "<legend>",
                "<caption>",
                "<title>"
            ),
            correctAnswer = "<legend>",
            explanation = "<legend> describes the fieldset group.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_20",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type submits the form?",
            options = listOf(
                "button",
                "submit",
                "send",
                "action"
            ),
            correctAnswer = "submit",
            explanation = "submit sends form data to server.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_21",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type clears all form fields?",
            options = listOf(
                "reset",
                "clear",
                "refresh",
                "empty"
            ),
            correctAnswer = "reset",
            explanation = "reset restores default form values.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_22",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which method is safer for sensitive data?",
            options = listOf(
                "GET",
                "POST",
                "URL",
                "FETCH"
            ),
            correctAnswer = "POST",
            explanation = "POST does not expose data in URL.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_23",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute limits number of characters?",
            options = listOf(
                "length",
                "max",
                "maxlength",
                "size"
            ),
            correctAnswer = "maxlength",
            explanation = "maxlength restricts character count.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_24",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute defines placeholder text?",
            options = listOf(
                "hint",
                "value",
                "placeholder",
                "title"
            ),
            correctAnswer = "placeholder",
            explanation = "placeholder shows hint text inside input.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_25",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type allows file upload?",
            options = listOf(
                "file",
                "upload",
                "image",
                "data"
            ),
            correctAnswer = "file",
            explanation = "file input allows selecting files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_26",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which enctype is required for file upload?",
            options = listOf(
                "text/plain",
                "application/json",
                "multipart/form-data",
                "application/xml"
            ),
            correctAnswer = "multipart/form-data",
            explanation = "This encoding is required for file uploads.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_27",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type validates numbers only?",
            options = listOf(
                "number",
                "range",
                "tel",
                "digit"
            ),
            correctAnswer = "number",
            explanation = "number accepts numeric values only.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_28",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute defines minimum numeric value?",
            options = listOf(
                "min",
                "low",
                "start",
                "begin"
            ),
            correctAnswer = "min",
            explanation = "min sets the minimum allowed value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_29",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute defines maximum numeric value?",
            options = listOf(
                "max",
                "high",
                "limit",
                "end"
            ),
            correctAnswer = "max",
            explanation = "max sets the maximum allowed value.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_30",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type displays a slider?",
            options = listOf(
                "range",
                "number",
                "scroll",
                "slider"
            ),
            correctAnswer = "range",
            explanation = "range displays a slider control.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_31",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute enables browser validation?",
            options = listOf(
                "novalidate",
                "validate",
                "required",
                "pattern"
            ),
            correctAnswer = "required",
            explanation = "required triggers browser-side validation.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_32",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute disables HTML validation?",
            options = listOf(
                "novalidate",
                "disable",
                "noverify",
                "ignore"
            ),
            correctAnswer = "novalidate",
            explanation = "novalidate turns off browser validation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_33",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which tag allows predefined input suggestions?",
            options = listOf(
                "<select>",
                "<datalist>",
                "<option>",
                "<list>"
            ),
            correctAnswer = "<datalist>",
            explanation = "<datalist> provides input suggestions.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_34",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute links input with datalist?",
            options = listOf(
                "id",
                "name",
                "list",
                "data"
            ),
            correctAnswer = "list",
            explanation = "list attribute connects input to datalist.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_35",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which form practice improves accessibility?",
            options = listOf(
                "Using placeholders only",
                "Using labels",
                "Using divs",
                "Using tables"
            ),
            correctAnswer = "Using labels",
            explanation = "Labels help screen readers and usability.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_36",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute sends input value to server?",
            options = listOf(
                "id",
                "class",
                "name",
                "for"
            ),
            correctAnswer = "name",
            explanation = "Only inputs with name are submitted.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_37",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which form element is non-semantic?",
            options = listOf(
                "<input>",
                "<label>",
                "<div>",
                "<fieldset>"
            ),
            correctAnswer = "<div>",
            explanation = "<div> has no form semantics.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_38",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type submits form via image?",
            options = listOf(
                "image",
                "submit",
                "button",
                "file"
            ),
            correctAnswer = "image",
            explanation = "image type submits form with image click.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_39",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which form attribute opens result in new tab?",
            options = listOf(
                "method",
                "action",
                "target",
                "enctype"
            ),
            correctAnswer = "target",
            explanation = "target=\"_blank\" opens response in new tab.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_40",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type is best for date selection?",
            options = listOf(
                "calendar",
                "datetime",
                "date",
                "time"
            ),
            correctAnswer = "date",
            explanation = "date provides calendar-based selection.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_41",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which attribute validates input pattern?",
            options = listOf(
                "regex",
                "pattern",
                "format",
                "rule"
            ),
            correctAnswer = "pattern",
            explanation = "pattern uses regex for validation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_42",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which input type is NOT submitted to server?",
            options = listOf(
                "text",
                "hidden",
                "disabled",
                "checkbox"
            ),
            correctAnswer = "disabled",
            explanation = "Disabled inputs are not submitted.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_43",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which form element improves grouping semantics?",
            options = listOf(
                "<div>",
                "<span>",
                "<fieldset>",
                "<section>"
            ),
            correctAnswer = "<fieldset>",
            explanation = "<fieldset> semantically groups inputs.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_44",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which form misuse causes accessibility issues?",
            options = listOf(
                "Using labels",
                "Using placeholders only",
                "Using fieldsets",
                "Using required"
            ),
            correctAnswer = "Using placeholders only",
            explanation = "Placeholders should not replace labels.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_forms_45",
            categoryId = categoryId,
            chapterId = HTML_FORMS,
            questionText = "Which is best practice for modern HTML forms?",
            options = listOf(
                "Use table layout",
                "Use semantic tags",
                "Disable validation",
                "Avoid labels"
            ),
            correctAnswer = "Use semantic tags",
            explanation = "Semantic forms improve accessibility and usability.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_semantic_1",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "What is the main purpose of semantic HTML?",
            options = listOf(
                "To style web pages",
                "To add animations",
                "To describe meaning of content",
                "To reduce file size"
            ),
            correctAnswer = "To describe meaning of content",
            explanation = "Semantic HTML tells browsers and developers what the content means, not how it looks.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_2",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which of the following is a semantic HTML tag?",
            options = listOf(
                "<div>",
                "<span>",
                "<section>",
                "<b>"
            ),
            correctAnswer = "<section>",
            explanation = "<section> clearly defines a thematic section of content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_3",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag represents introductory content of a page or section?",
            options = listOf(
                "<header>",
                "<top>",
                "<head>",
                "<section>"
            ),
            correctAnswer = "<header>",
            explanation = "<header> holds introductory or navigational content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_4",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag represents footer information?",
            options = listOf(
                "<bottom>",
                "<end>",
                "<footer>",
                "<section>"
            ),
            correctAnswer = "<footer>",
            explanation = "<footer> contains copyright, links, or author info.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_5",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag represents the main content of a document?",
            options = listOf(
                "<body>",
                "<main>",
                "<article>",
                "<section>"
            ),
            correctAnswer = "<main>",
            explanation = "<main> contains the dominant content of the page.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_6",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag represents independent, reusable content?",
            options = listOf(
                "<section>",
                "<div>",
                "<article>",
                "<aside>"
            ),
            correctAnswer = "<article>",
            explanation = "<article> is used for standalone content like blog posts.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_7",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag contains content indirectly related to main content?",
            options = listOf(
                "<aside>",
                "<section>",
                "<footer>",
                "<article>"
            ),
            correctAnswer = "<aside>",
            explanation = "<aside> holds side content like ads or related links.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_8",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag is best for navigation menus?",
            options = listOf(
                "<menu>",
                "<nav>",
                "<ul>",
                "<header>"
            ),
            correctAnswer = "<nav>",
            explanation = "<nav> is specifically meant for navigation links.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_9",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag should NOT be used more than once per page?",
            options = listOf(
                "<header>",
                "<footer>",
                "<main>",
                "<section>"
            ),
            correctAnswer = "<main>",
            explanation = "Only one <main> element should exist per page.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_10",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag improves accessibility for screen readers?",
            options = listOf(
                "<div>",
                "<span>",
                "<section>",
                "<nav>"
            ),
            correctAnswer = "<nav>",
            explanation = "Screen readers recognize <nav> as navigation content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_11",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic element groups related content?",
            options = listOf(
                "<section>",
                "<span>",
                "<b>",
                "<i>"
            ),
            correctAnswer = "<section>",
            explanation = "<section> groups thematically related content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_12",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag represents author or copyright info?",
            options = listOf(
                "<header>",
                "<aside>",
                "<footer>",
                "<main>"
            ),
            correctAnswer = "<footer>",
            explanation = "Footer commonly contains author and copyright details.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_13",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag replaced layout tables?",
            options = listOf(
                "<table>",
                "<div>",
                "<section>",
                "<header>, <nav>, <main>, <footer>"
            ),
            correctAnswer = "<header>, <nav>, <main>, <footer>",
            explanation = "Semantic tags replaced table-based layouts.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_14",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag defines content that can stand alone?",
            options = listOf(
                "<section>",
                "<article>",
                "<aside>",
                "<nav>"
            ),
            correctAnswer = "<article>",
            explanation = "Articles are self-contained and reusable.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_15",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag is semantic but inline?",
            options = listOf(
                "<strong>",
                "<div>",
                "<section>",
                "<article>"
            ),
            correctAnswer = "<strong>",
            explanation = "<strong> is inline and adds semantic importance.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_16",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag gives meaning to emphasized text?",
            options = listOf(
                "<i>",
                "<b>",
                "<em>",
                "<u>"
            ),
            correctAnswer = "<em>",
            explanation = "<em> semantically represents emphasis.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_17",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag is NOT semantic?",
            options = listOf(
                "<article>",
                "<section>",
                "<div>",
                "<nav>"
            ),
            correctAnswer = "<div>",
            explanation = "<div> has no semantic meaning.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_18",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag improves SEO?",
            options = listOf(
                "<div>",
                "<span>",
                "<article>",
                "<br>"
            ),
            correctAnswer = "<article>",
            explanation = "Search engines understand semantic structure better.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_19",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag should contain the primary navigation?",
            options = listOf(
                "<header>",
                "<nav>",
                "<aside>",
                "<footer>"
            ),
            correctAnswer = "<nav>",
            explanation = "<nav> is meant for main navigation links.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_20",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag is allowed multiple times per page?",
            options = listOf(
                "<main>",
                "<article>",
                "<html>",
                "<head>"
            ),
            correctAnswer = "<article>",
            explanation = "Multiple articles can exist on a page.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_21",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag represents related links or ads?",
            options = listOf(
                "<aside>",
                "<nav>",
                "<footer>",
                "<header>"
            ),
            correctAnswer = "<aside>",
            explanation = "<aside> holds supplementary content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_22",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag replaces <div> for page sections?",
            options = listOf(
                "<section>",
                "<span>",
                "<b>",
                "<i>"
            ),
            correctAnswer = "<section>",
            explanation = "<section> adds meaning unlike <div>.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_23",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag is best for blog posts?",
            options = listOf(
                "<section>",
                "<article>",
                "<main>",
                "<aside>"
            ),
            correctAnswer = "<article>",
            explanation = "Blog posts are independent content units.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_24",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag helps assistive technology understand layout?",
            options = listOf(
                "<div>",
                "<span>",
                "<header>",
                "<br>"
            ),
            correctAnswer = "<header>",
            explanation = "<header> provides structural meaning.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_25",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag is often confused with <section>?",
            options = listOf(
                "<article>",
                "<div>",
                "<span>",
                "<strong>"
            ),
            correctAnswer = "<article>",
            explanation = "Article and section are commonly confused by beginners.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_26",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag should not be inside <main>?",
            options = listOf(
                "<article>",
                "<section>",
                "<aside>",
                "<header>"
            ),
            correctAnswer = "<header>",
            explanation = "Global headers should not be inside <main>.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_27",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag replaces <b> for importance?",
            options = listOf(
                "<strong>",
                "<em>",
                "<mark>",
                "<i>"
            ),
            correctAnswer = "<strong>",
            explanation = "<strong> conveys importance semantically.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_28",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag is used for page-level footer?",
            options = listOf(
                "<aside>",
                "<section>",
                "<footer>",
                "<nav>"
            ),
            correctAnswer = "<footer>",
            explanation = "Footer appears at bottom of page or section.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_29",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag improves document outline?",
            options = listOf(
                "<div>",
                "<span>",
                "<section>",
                "<br>"
            ),
            correctAnswer = "<section>",
            explanation = "Sectioning elements improve document outline.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_30",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic element should wrap the site logo?",
            options = listOf(
                "<header>",
                "<footer>",
                "<main>",
                "<aside>"
            ),
            correctAnswer = "<header>",
            explanation = "Logos usually belong to the header area.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_31",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag is semantic but block-level?",
            options = listOf(
                "<strong>",
                "<em>",
                "<article>",
                "<span>"
            ),
            correctAnswer = "<article>",
            explanation = "<article> is block-level and semantic.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_32",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic element improves mobile accessibility?",
            options = listOf(
                "<nav>",
                "<div>",
                "<span>",
                "<b>"
            ),
            correctAnswer = "<nav>",
            explanation = "Navigation landmarks help mobile screen readers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_33",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag represents a standalone comment or review?",
            options = listOf(
                "<article>",
                "<section>",
                "<aside>",
                "<main>"
            ),
            correctAnswer = "<article>",
            explanation = "Reviews and comments are independent content.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_34",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic misuse harms SEO?",
            options = listOf(
                "Using <article> correctly",
                "Using <nav> for menus",
                "Using <div> everywhere",
                "Using <footer>"
            ),
            correctAnswer = "Using <div> everywhere",
            explanation = "Overusing div removes semantic meaning.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_35",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag defines complementary content?",
            options = listOf(
                "<main>",
                "<article>",
                "<aside>",
                "<section>"
            ),
            correctAnswer = "<aside>",
            explanation = "<aside> holds complementary information.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_36",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag is semantic replacement for <i> when emphasizing?",
            options = listOf(
                "<em>",
                "<strong>",
                "<mark>",
                "<span>"
            ),
            correctAnswer = "<em>",
            explanation = "<em> adds emphasis meaningfully.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_37",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic element creates page landmarks?",
            options = listOf(
                "<div>",
                "<header>, <nav>, <main>, <footer>",
                "<span>",
                "<br>"
            ),
            correctAnswer = "<header>, <nav>, <main>, <footer>",
            explanation = "Landmarks help navigation for assistive tools.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_38",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag improves document structure hierarchy?",
            options = listOf(
                "<section>",
                "<span>",
                "<b>",
                "<i>"
            ),
            correctAnswer = "<section>",
            explanation = "Sections create clear content hierarchy.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_39",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag should wrap related articles?",
            options = listOf(
                "<main>",
                "<section>",
                "<nav>",
                "<aside>"
            ),
            correctAnswer = "<section>",
            explanation = "Section groups related articles.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_40",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag defines navigation links?",
            options = listOf(
                "<ul>",
                "<nav>",
                "<header>",
                "<footer>"
            ),
            correctAnswer = "<nav>",
            explanation = "<nav> is dedicated to navigation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_41",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag should NOT be used for layout only?",
            options = listOf(
                "<section>",
                "<article>",
                "<nav>",
                "<table>"
            ),
            correctAnswer = "<table>",
            explanation = "Tables should not be used for layout.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_42",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic tag benefits screen readers most?",
            options = listOf(
                "<span>",
                "<div>",
                "<main>",
                "<b>"
            ),
            correctAnswer = "<main>",
            explanation = "Main landmark helps screen readers skip navigation.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_43",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which tag represents a self-contained news item?",
            options = listOf(
                "<article>",
                "<section>",
                "<aside>",
                "<nav>"
            ),
            correctAnswer = "<article>",
            explanation = "News items are independent articles.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_44",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which semantic practice is recommended?",
            options = listOf(
                "Use div for everything",
                "Use semantic tags correctly",
                "Avoid semantic tags",
                "Use tables for layout"
            ),
            correctAnswer = "Use semantic tags correctly",
            explanation = "Correct semantics improve SEO and accessibility.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_semantic_45",
            categoryId = categoryId,
            chapterId = HTML_SEMANTIC,
            questionText = "Which is the biggest advantage of semantic HTML?",
            options = listOf(
                "Better styling",
                "Better animations",
                "Better accessibility and SEO",
                "Smaller file size"
            ),
            correctAnswer = "Better accessibility and SEO",
            explanation = "Semantic HTML improves understanding for browsers and users.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_multimedia_1",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which HTML tag is used to embed audio content?",
            options = listOf(
                "<sound>",
                "<media>",
                "<audio>",
                "<music>"
            ),
            correctAnswer = "<audio>",
            explanation = "<audio> is used to embed sound content in web pages.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_2",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which HTML tag is used to embed video content?",
            options = listOf(
                "<movie>",
                "<media>",
                "<video>",
                "<mp4>"
            ),
            correctAnswer = "<video>",
            explanation = "<video> is used to embed video files.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_3",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute enables audio or video controls?",
            options = listOf(
                "autoplay",
                "controls",
                "loop",
                "muted"
            ),
            correctAnswer = "controls",
            explanation = "controls shows play, pause, and volume buttons.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_4",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute starts media automatically?",
            options = listOf(
                "controls",
                "loop",
                "autoplay",
                "start"
            ),
            correctAnswer = "autoplay",
            explanation = "autoplay starts media automatically when loaded.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_5",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute plays media repeatedly?",
            options = listOf(
                "repeat",
                "again",
                "loop",
                "cycle"
            ),
            correctAnswer = "loop",
            explanation = "loop replays audio or video continuously.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_6",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute mutes audio by default?",
            options = listOf(
                "silent",
                "mute",
                "muted",
                "volume"
            ),
            correctAnswer = "muted",
            explanation = "muted disables sound output initially.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_7",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag provides multiple media file options?",
            options = listOf(
                "<track>",
                "<source>",
                "<option>",
                "<media>"
            ),
            correctAnswer = "<source>",
            explanation = "<source> allows multiple media formats for compatibility.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_8",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag provides subtitles or captions?",
            options = listOf(
                "<caption>",
                "<track>",
                "<subtitle>",
                "<text>"
            ),
            correctAnswer = "<track>",
            explanation = "<track> adds subtitles, captions, or descriptions.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_9",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute specifies media file location?",
            options = listOf(
                "path",
                "src",
                "href",
                "link"
            ),
            correctAnswer = "src",
            explanation = "src defines the media file source path.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_10",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which audio format is widely supported?",
            options = listOf(
                "WAV",
                "MP3",
                "OGG",
                "AIFF"
            ),
            correctAnswer = "MP3",
            explanation = "MP3 is supported by almost all browsers.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_11",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which video format is widely supported?",
            options = listOf(
                "AVI",
                "MKV",
                "MP4",
                "FLV"
            ),
            correctAnswer = "MP4",
            explanation = "MP4 (H.264) works across most browsers.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_12",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute shows an image before video plays?",
            options = listOf(
                "poster",
                "thumbnail",
                "preview",
                "cover"
            ),
            correctAnswer = "poster",
            explanation = "poster displays a placeholder image.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_13",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag embeds external media like YouTube?",
            options = listOf(
                "<video>",
                "<embed>",
                "<iframe>",
                "<object>"
            ),
            correctAnswer = "<iframe>",
            explanation = "<iframe> is commonly used for external media.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_14",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag is obsolete for multimedia?",
            options = listOf(
                "<video>",
                "<audio>",
                "<embed>",
                "<bgsound>"
            ),
            correctAnswer = "<bgsound>",
            explanation = "<bgsound> is obsolete and non-standard.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_15",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute improves accessibility for videos?",
            options = listOf(
                "autoplay",
                "loop",
                "track",
                "muted"
            ),
            correctAnswer = "track",
            explanation = "track provides captions for accessibility.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_16",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which value of track kind provides subtitles?",
            options = listOf(
                "captions",
                "descriptions",
                "subtitles",
                "metadata"
            ),
            correctAnswer = "subtitles",
            explanation = "subtitles display translated or spoken text.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_17",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia element is empty?",
            options = listOf(
                "<audio>",
                "<video>",
                "<source>",
                "<iframe>"
            ),
            correctAnswer = "<source>",
            explanation = "<source> has no closing tag.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_18",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute defines preload behavior?",
            options = listOf(
                "load",
                "buffer",
                "preload",
                "cache"
            ),
            correctAnswer = "preload",
            explanation = "preload controls media loading strategy.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_19",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which preload value loads metadata only?",
            options = listOf(
                "auto",
                "none",
                "metadata",
                "partial"
            ),
            correctAnswer = "metadata",
            explanation = "metadata loads duration and basic info.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_20",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute disables media download option?",
            options = listOf(
                "controlslist",
                "nodownload",
                "download",
                "secure"
            ),
            correctAnswer = "controlslist",
            explanation = "controlslist can restrict download options.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_21",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag supports fallback text?",
            options = listOf(
                "<audio>",
                "<video>",
                "<iframe>",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "Fallback text shows if media is unsupported.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_22",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia practice is discouraged?",
            options = listOf(
                "Using captions",
                "Autoplay with sound",
                "Multiple sources",
                "Poster images"
            ),
            correctAnswer = "Autoplay with sound",
            explanation = "Autoplay with sound harms user experience.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_23",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute allows inline video on mobile?",
            options = listOf(
                "inline",
                "playsinline",
                "mobile",
                "responsive"
            ),
            correctAnswer = "playsinline",
            explanation = "playsinline prevents full-screen playback.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_24",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia tag is semantic?",
            options = listOf(
                "<div>",
                "<span>",
                "<video>",
                "<font>"
            ),
            correctAnswer = "<video>",
            explanation = "<video> semantically represents video content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_25",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute defines video height?",
            options = listOf(
                "size",
                "height",
                "length",
                "scale"
            ),
            correctAnswer = "height",
            explanation = "height sets the vertical size of video.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_26",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute defines video width?",
            options = listOf(
                "width",
                "size",
                "length",
                "scale"
            ),
            correctAnswer = "width",
            explanation = "width sets the horizontal size of video.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_27",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag supports both audio and video embedding?",
            options = listOf(
                "<media>",
                "<object>",
                "<source>",
                "<track>"
            ),
            correctAnswer = "<object>",
            explanation = "<object> can embed various media types.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_28",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia misuse affects accessibility most?",
            options = listOf(
                "Missing controls",
                "Missing captions",
                "Small video",
                "Low resolution"
            ),
            correctAnswer = "Missing captions",
            explanation = "Captions are critical for hearing-impaired users.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_29",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag is preferred over <embed> in HTML5?",
            options = listOf(
                "<video>",
                "<object>",
                "<iframe>",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "HTML5 provides better semantic alternatives.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_30",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia feature improves SEO?",
            options = listOf(
                "Autoplay",
                "Muted audio",
                "Captions and metadata",
                "Large files"
            ),
            correctAnswer = "Captions and metadata",
            explanation = "Text data helps search engines understand media.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_31",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute defines media MIME type?",
            options = listOf(
                "format",
                "type",
                "codec",
                "media"
            ),
            correctAnswer = "type",
            explanation = "type specifies the media MIME type.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_32",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute allows faster browser decision?",
            options = listOf(
                "src",
                "type",
                "preload",
                "codec"
            ),
            correctAnswer = "type",
            explanation = "type helps browser choose supported format quickly.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_33",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia tag supports text fallback?",
            options = listOf(
                "<audio>",
                "<video>",
                "<object>",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "Fallback text improves compatibility.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_34",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia practice improves performance?",
            options = listOf(
                "Large files",
                "Autoplay",
                "Preload metadata",
                "Inline styles"
            ),
            correctAnswer = "Preload metadata",
            explanation = "Metadata preload reduces initial load.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_35",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag is best for background audio?",
            options = listOf(
                "<audio>",
                "<video>",
                "<bgsound>",
                "<embed>"
            ),
            correctAnswer = "<audio>",
            explanation = "<audio> is the standard solution.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_36",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia tag is block-level by default?",
            options = listOf(
                "<audio>",
                "<video>",
                "<source>",
                "<track>"
            ),
            correctAnswer = "<video>",
            explanation = "<video> is rendered as block-level.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_37",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute is required for <track>?",
            options = listOf(
                "kind",
                "src",
                "label",
                "srclang"
            ),
            correctAnswer = "src",
            explanation = "src specifies subtitle file location.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_38",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute specifies subtitle language?",
            options = listOf(
                "lang",
                "language",
                "srclang",
                "label"
            ),
            correctAnswer = "srclang",
            explanation = "srclang defines subtitle language.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_39",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia feature helps hearing-impaired users?",
            options = listOf(
                "Autoplay",
                "Muted audio",
                "Captions",
                "Poster"
            ),
            correctAnswer = "Captions",
            explanation = "Captions provide spoken content as text.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_40",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which tag is non-semantic?",
            options = listOf(
                "<audio>",
                "<video>",
                "<embed>",
                "<track>"
            ),
            correctAnswer = "<embed>",
            explanation = "<embed> has no clear semantic meaning.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_41",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia element improves user control?",
            options = listOf(
                "autoplay",
                "controls",
                "loop",
                "muted"
            ),
            correctAnswer = "controls",
            explanation = "Controls allow users to manage playback.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_42",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which practice is best for modern HTML multimedia?",
            options = listOf(
                "Use Flash",
                "Use HTML5 media tags",
                "Use plugins",
                "Use tables"
            ),
            correctAnswer = "Use HTML5 media tags",
            explanation = "HTML5 tags are standard and accessible.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_43",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which multimedia misuse harms UX most?",
            options = listOf(
                "Missing poster",
                "Autoplay audio",
                "Small video",
                "Low bitrate"
            ),
            correctAnswer = "Autoplay audio",
            explanation = "Unexpected sound annoys users.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_44",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which attribute enables silent autoplay?",
            options = listOf(
                "loop",
                "controls",
                "muted",
                "volume"
            ),
            correctAnswer = "muted",
            explanation = "Muted autoplay is allowed by browsers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_multimedia_45",
            categoryId = categoryId,
            chapterId = HTML_MULTIMEDIA,
            questionText = "Which is the biggest benefit of HTML5 multimedia?",
            options = listOf(
                "Plugins required",
                "Better accessibility and control",
                "More scripting",
                "Larger files"
            ),
            correctAnswer = "Better accessibility and control",
            explanation = "HTML5 media is accessible, native, and user-friendly.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),

        htmlQuestion(
            id = "html_html5_features_1",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "What is the primary goal of HTML5?",
            options = listOf(
                "Replace CSS",
                "Replace JavaScript",
                "Improve web application support",
                "Reduce internet speed"
            ),
            correctAnswer = "Improve web application support",
            explanation = "HTML5 focuses on rich, interactive, application-like web experiences.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_2",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature is newly introduced in HTML5?",
            options = listOf(
                "Tables",
                "Forms",
                "Semantic elements",
                "Frames"
            ),
            correctAnswer = "Semantic elements",
            explanation = "HTML5 introduced semantic tags like header, footer, article.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_3",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature allows offline web applications?",
            options = listOf(
                "Cookies",
                "Web Storage",
                "Application Cache",
                "Session Storage"
            ),
            correctAnswer = "Application Cache",
            explanation = "Application Cache allows web apps to run offline (now deprecated but exam-important).",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_4",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which storage option stores data permanently on client side?",
            options = listOf(
                "Cookies",
                "SessionStorage",
                "LocalStorage",
                "Cache"
            ),
            correctAnswer = "LocalStorage",
            explanation = "LocalStorage stores data without expiration unless cleared manually.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_5",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature replaces plugins like Flash?",
            options = listOf(
                "Canvas",
                "SVG",
                "Audio and Video",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "HTML5 native graphics and media reduced dependency on plugins.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_6",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which tag is used for drawing graphics via scripting?",
            options = listOf(
                "<svg>",
                "<canvas>",
                "<draw>",
                "<graphics>"
            ),
            correctAnswer = "<canvas>",
            explanation = "Canvas is used with JavaScript to draw graphics dynamically.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_7",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 API provides geographical location?",
            options = listOf(
                "Storage API",
                "Media API",
                "Geolocation API",
                "Location API"
            ),
            correctAnswer = "Geolocation API",
            explanation = "Geolocation API allows access to user's location with permission.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_8",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature improves form validation?",
            options = listOf(
                "JavaScript",
                "New input types",
                "CSS",
                "Cookies"
            ),
            correctAnswer = "New input types",
            explanation = "HTML5 input types provide built-in validation.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_9",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which input type is NOT introduced in HTML5?",
            options = listOf(
                "email",
                "date",
                "range",
                "password"
            ),
            correctAnswer = "password",
            explanation = "Password existed before HTML5.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_10",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature allows drag and drop operations?",
            options = listOf(
                "Canvas API",
                "Drag and Drop API",
                "Web Workers",
                "Storage"
            ),
            correctAnswer = "Drag and Drop API",
            explanation = "HTML5 introduced native drag and drop functionality.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_11",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature enables background processing?",
            options = listOf(
                "Web Storage",
                "Web Workers",
                "Service Workers",
                "LocalStorage"
            ),
            correctAnswer = "Web Workers",
            explanation = "Web Workers run scripts in background threads.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_12",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature reduces server load?",
            options = listOf(
                "Cookies",
                "LocalStorage",
                "Canvas",
                "Meta tags"
            ),
            correctAnswer = "LocalStorage",
            explanation = "Client-side storage reduces repeated server requests.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_13",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which element supports scalable vector graphics?",
            options = listOf(
                "<canvas>",
                "<svg>",
                "<img>",
                "<vector>"
            ),
            correctAnswer = "<svg>",
            explanation = "SVG supports scalable vector-based graphics.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_14",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature works with JavaScript only?",
            options = listOf(
                "Canvas",
                "Audio",
                "Video",
                "Semantic tags"
            ),
            correctAnswer = "Canvas",
            explanation = "Canvas requires JavaScript to draw graphics.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_15",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature allows two-way client-server communication?",
            options = listOf(
                "AJAX",
                "WebSockets",
                "Cookies",
                "Sessions"
            ),
            correctAnswer = "WebSockets",
            explanation = "WebSockets allow full-duplex communication.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_16",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature improves accessibility?",
            options = listOf(
                "Canvas",
                "Semantic elements",
                "LocalStorage",
                "Web Workers"
            ),
            correctAnswer = "Semantic elements",
            explanation = "Semantic tags help screen readers understand content.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_17",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which storage clears automatically when browser closes?",
            options = listOf(
                "LocalStorage",
                "SessionStorage",
                "Cookies",
                "Cache"
            ),
            correctAnswer = "SessionStorage",
            explanation = "SessionStorage data is removed after session ends.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_18",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature allows responsive graphics?",
            options = listOf(
                "Canvas",
                "SVG",
                "Bitmap",
                "JPEG"
            ),
            correctAnswer = "SVG",
            explanation = "SVG scales without loss of quality.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_19",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 API runs even when page is closed?",
            options = listOf(
                "Web Workers",
                "Service Workers",
                "LocalStorage",
                "Geolocation"
            ),
            correctAnswer = "Service Workers",
            explanation = "Service Workers support background sync and caching.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_20",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature supports progressive web apps?",
            options = listOf(
                "Frames",
                "Service Workers",
                "Tables",
                "Meta refresh"
            ),
            correctAnswer = "Service Workers",
            explanation = "Service Workers enable offline and caching features.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_21",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 input type improves mobile UX?",
            options = listOf(
                "text",
                "email",
                "password",
                "hidden"
            ),
            correctAnswer = "email",
            explanation = "Email input shows optimized keyboard on mobile.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_22",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature removes need for Flash?",
            options = listOf(
                "Video tag",
                "Audio tag",
                "Canvas",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "HTML5 replaces Flash functionality.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_23",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature is event-driven?",
            options = listOf(
                "WebSockets",
                "LocalStorage",
                "Cookies",
                "Meta tags"
            ),
            correctAnswer = "WebSockets",
            explanation = "WebSockets use real-time event-based communication.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_24",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 API is privacy-sensitive?",
            options = listOf(
                "Canvas",
                "Geolocation",
                "Storage",
                "Forms"
            ),
            correctAnswer = "Geolocation",
            explanation = "Geolocation requires user permission.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_25",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature helps reduce page reloads?",
            options = listOf(
                "LocalStorage",
                "WebSockets",
                "AJAX",
                "All of the above"
            ),
            correctAnswer = "All of the above",
            explanation = "These features reduce full page reloads.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_26",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature is deprecated but exam-important?",
            options = listOf(
                "Canvas",
                "Application Cache",
                "Web Storage",
                "Geolocation"
            ),
            correctAnswer = "Application Cache",
            explanation = "AppCache is deprecated but still asked in exams.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_27",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature supports real-time chat apps?",
            options = listOf(
                "Cookies",
                "WebSockets",
                "LocalStorage",
                "SVG"
            ),
            correctAnswer = "WebSockets",
            explanation = "WebSockets enable real-time communication.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_28",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature improves page performance?",
            options = listOf(
                "Service Workers",
                "Frames",
                "Deprecated tags",
                "Inline styles"
            ),
            correctAnswer = "Service Workers",
            explanation = "They cache resources and speed up loading.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_29",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 API allows client-side databases?",
            options = listOf(
                "Web SQL",
                "LocalStorage",
                "Cookies",
                "Session"
            ),
            correctAnswer = "Web SQL",
            explanation = "Web SQL supports structured client-side storage (deprecated).",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_30",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature improves form UX without JavaScript?",
            options = listOf(
                "Pattern validation",
                "CSS",
                "Tables",
                "Frames"
            ),
            correctAnswer = "Pattern validation",
            explanation = "HTML5 provides built-in validation rules.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_31",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature improves mobile web apps?",
            options = listOf(
                "Frames",
                "Service Workers",
                "Font tags",
                "Applet"
            ),
            correctAnswer = "Service Workers",
            explanation = "They enable offline support and caching.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_32",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature allows background sync?",
            options = listOf(
                "Web Workers",
                "Service Workers",
                "LocalStorage",
                "Canvas"
            ),
            correctAnswer = "Service Workers",
            explanation = "Service Workers support background sync.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_33",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature supports gaming graphics?",
            options = listOf(
                "SVG",
                "Canvas",
                "Video",
                "Audio"
            ),
            correctAnswer = "Canvas",
            explanation = "Canvas is widely used for browser-based games.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_34",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature replaces cookies for large storage?",
            options = listOf(
                "LocalStorage",
                "SessionStorage",
                "Cache",
                "Meta tags"
            ),
            correctAnswer = "LocalStorage",
            explanation = "LocalStorage supports much larger data than cookies.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_35",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 API is asynchronous by nature?",
            options = listOf(
                "LocalStorage",
                "Cookies",
                "Web Workers",
                "Meta refresh"
            ),
            correctAnswer = "Web Workers",
            explanation = "Workers run asynchronously in background threads.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_36",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature improves offline experience?",
            options = listOf(
                "Frames",
                "Service Workers",
                "Tables",
                "Inline CSS"
            ),
            correctAnswer = "Service Workers",
            explanation = "They cache files and enable offline access.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_37",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature supports client-side validation?",
            options = listOf(
                "JavaScript",
                "HTML attributes",
                "Cookies",
                "Sessions"
            ),
            correctAnswer = "HTML attributes",
            explanation = "Attributes like required and pattern validate input.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_38",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature is best for real-time dashboards?",
            options = listOf(
                "LocalStorage",
                "WebSockets",
                "SVG",
                "Audio"
            ),
            correctAnswer = "WebSockets",
            explanation = "WebSockets provide real-time updates.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_39",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature is browser-native?",
            options = listOf(
                "Flash",
                "Java Applets",
                "HTML5 Video",
                "Silverlight"
            ),
            correctAnswer = "HTML5 Video",
            explanation = "HTML5 video works without plugins.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_40",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature improves SEO the most?",
            options = listOf(
                "Canvas",
                "Semantic tags",
                "Audio",
                "LocalStorage"
            ),
            correctAnswer = "Semantic tags",
            explanation = "Search engines rely on semantic structure.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_41",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature enables push notifications?",
            options = listOf(
                "Web Workers",
                "Service Workers",
                "LocalStorage",
                "Canvas"
            ),
            correctAnswer = "Service Workers",
            explanation = "Service Workers enable push notifications.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_42",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature reduces dependency on server?",
            options = listOf(
                "LocalStorage",
                "Cookies",
                "Frames",
                "Meta tags"
            ),
            correctAnswer = "LocalStorage",
            explanation = "Client-side storage reduces server requests.",
            difficulty = Difficulty.EASY,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_43",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which HTML5 feature is critical for PWAs?",
            options = listOf(
                "Tables",
                "Frames",
                "Service Workers",
                "Fonts"
            ),
            correctAnswer = "Service Workers",
            explanation = "PWAs rely heavily on service workers.",
            difficulty = Difficulty.HARD,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_44",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "Which feature allows drawing charts dynamically?",
            options = listOf(
                "SVG",
                "Canvas",
                "Image",
                "Video"
            ),
            correctAnswer = "Canvas",
            explanation = "Canvas is used for dynamic drawings and charts.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        ),
        htmlQuestion(
            id = "html_html5_features_45",
            categoryId = categoryId,
            chapterId = HTML5_FEATURES,
            questionText = "What is the biggest advantage of HTML5?",
            options = listOf(
                "More tags",
                "Plugin-free rich web apps",
                "Larger file size",
                "Complex syntax"
            ),
            correctAnswer = "Plugin-free rich web apps",
            explanation = "HTML5 enables rich web apps without external plugins.",
            difficulty = Difficulty.MEDIUM,
            createdAt = createdAt
        )

        )

}
