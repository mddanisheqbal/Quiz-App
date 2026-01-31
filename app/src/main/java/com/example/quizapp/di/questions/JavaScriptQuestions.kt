package com.example.quizapp.di.questions

import com.example.quizapp.data.model.Difficulty
import com.example.quizapp.data.model.Question
import com.example.quizapp.data.model.QuestionType
import java.util.UUID

public fun getJavaScriptQuestions(categoryId: String, createdAt: String): List<Question> {
    return listOf(
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Inside which HTML element do we put the JavaScript?",
            options = listOf("<js>", "<javascript>", "<scripting>", "<script>"),
            correctAnswer = "<script>", explanation = "The <script> tag is used to embed or refer to an executable script within an HTML document.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 25, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you write 'Hello World' in an alert box?",
            options = listOf("msgBox('Hello World');", "alert('Hello World');", "alertBox('Hello World');", "msg('Hello World');"),
            correctAnswer = "alert('Hello World');", explanation = "The `alert()` method displays an alert box with a message and an OK button.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 20, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to declare a variable that can be reassigned in JavaScript?",
            options = listOf("const", "var", "let", "Both var and let"),
            correctAnswer = "Both var and let", explanation = "Variables declared with 'var' and 'let' can be reassigned, whereas 'const' cannot.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Inside which HTML element do we put the JavaScript?",
            options = listOf("<js>", "<javascript>", "<script>", "<scripting>"),
            correctAnswer = "<script>", explanation = "The <script> tag is used to embed or reference executable scripts in HTML.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you write 'Hello World' in an alert box?",
            options = listOf("msg('Hello World');", "alertBox('Hello World');", "alert('Hello World');", "console.log('Hello World');"),
            correctAnswer = "alert('Hello World');", explanation = "The alert() method displays an alert box with a specified message and an OK button.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you create a function in JavaScript?",
            options = listOf("function:myFunction()", "function myFunction()", "function = myFunction()", "def myFunction()"),
            correctAnswer = "function myFunction()", explanation = "In JavaScript, functions are defined with the 'function' keyword.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you call a function named 'myFunction'?",
            options = listOf("call myFunction()", "call function myFunction()", "myFunction()", "execute myFunction()"),
            correctAnswer = "myFunction()", explanation = "You call a function by writing its name followed by parentheses.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you write an IF statement in JavaScript?",
            options = listOf("if i = 5 then", "if (i == 5)", "if i == 5 then", "if i = 5"),
            correctAnswer = "if (i == 5)", explanation = "The condition in an 'if' statement must be enclosed in parentheses.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How does a FOR loop start?",
            options = listOf("for (i = 0; i <= 5)", "for (i <= 5; i++)", "for (i = 0; i <= 5; i++)", "for i = 1 to 5"),
            correctAnswer = "for (i = 0; i <= 5; i++)", explanation = "A for loop consists of initialization, condition, and increment/decrement.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How can you add a comment in JavaScript?",
            options = listOf("' This is a comment", "", "// This is a comment", "# This is a comment"),
            correctAnswer = "// This is a comment", explanation = "// is used for single-line comments in JavaScript.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct way to write a JavaScript array?",
            options = listOf("var colors = 'red', 'green', 'blue'", "var colors = (1:'red', 2:'green', 3:'blue')", "var colors = ['red', 'green', 'blue']", "var colors = 1=('red'), 2=('green')"),
            correctAnswer = "var colors = ['red', 'green', 'blue']", explanation = "JavaScript arrays are written with square brackets.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you round the number 7.25 to the nearest integer?",
            options = listOf("rnd(7.25)", "Math.rnd(7.25)", "Math.round(7.25)", "round(7.25)"),
            correctAnswer = "Math.round(7.25)", explanation = "The Math.round() function returns the value of a number rounded to the nearest integer.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "JavaScript is the same as Java.",
            options = listOf("True", "False", "Only in syntax", "Depending on the browser"),
            correctAnswer = "False", explanation = "Java and JavaScript are entirely different languages in both design and use cases.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which operator is used to assign a value to a variable?",
            options = listOf("*", "x", "=", "-"),
            correctAnswer = "=", explanation = "The '=' operator is used to assign a value to a variable.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What will the following code return: Boolean(10 > 9)?",
            options = listOf("false", "true", "NaN", "undefined"),
            correctAnswer = "true", explanation = "Since 10 is greater than 9, the boolean expression evaluates to true.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is used to find the length of a string?",
            options = listOf("length()", "size()", "length", "index"),
            correctAnswer = "length", explanation = "In JavaScript, .length is a property used to get the number of characters in a string.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which event occurs when the user clicks on an HTML element?",
            options = listOf("onmouseclick", "onmouseover", "onchange", "onclick"),
            correctAnswer = "onclick", explanation = "The onclick event handler is triggered when a user clicks an element.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you declare a constant in JavaScript?",
            options = listOf("var", "let", "const", "constant"),
            correctAnswer = "const", explanation = "The 'const' keyword creates a block-scoped constant.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the correct way to check if 'a' is equal to 'b' in value and type?",
            options = listOf("a == b", "a = b", "a === b", "a equals b"),
            correctAnswer = "a === b", explanation = "The '===' operator checks for both value and type equality (strict equality).",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to convert a string to an integer?",
            options = listOf("Integer.parse()", "parseInt()", "parse()", "toNumber()"),
            correctAnswer = "parseInt()", explanation = "The parseInt() function parses a string and returns an integer.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the data type of 'null' in JavaScript?",
            options = listOf("null", "undefined", "object", "string"),
            correctAnswer = "object", explanation = "Historically, 'typeof null' returns 'object' in JavaScript.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you find the largest number of 2 and 4?",
            options = listOf("Math.max(2, 4)", "Math.ceil(2, 4)", "ceil(2, 4)", "top(2, 4)"),
            correctAnswer = "Math.max(2, 4)", explanation = "Math.max() returns the number with the highest value.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which built-in method adds one or more elements to the end of an array?",
            options = listOf("last()", "push()", "append()", "put()"),
            correctAnswer = "push()", explanation = "The push() method adds new items to the end of an array and returns the new length.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you write a multi-line comment in JavaScript?",
            options = listOf("// This is a comment", "/* This is a comment */", "", "''' This is a comment '''"),
            correctAnswer = "/* This is a comment */", explanation = "Multi-line comments start with /* and end with */.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is used to remove the last element from an array?",
            options = listOf("pop()", "remove()", "last()", "shift()"),
            correctAnswer = "pop()", explanation = "The pop() method removes the last element of an array.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the index of the first element in an array?",
            options = listOf("1", "0", "-1", "Any"),
            correctAnswer = "0", explanation = "JavaScript arrays are zero-indexed.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to refer to the current object?",
            options = listOf("this", "self", "object", "me"),
            correctAnswer = "this", explanation = "The 'this' keyword refers to the object it belongs to.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do you write a message to the browser console?",
            options = listOf("print()", "console.print()", "console.log()", "log()"),
            correctAnswer = "console.log()", explanation = "console.log() is used to log messages for debugging purposes.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of 'typeof 42'?",
            options = listOf("'number'", "'string'", "'int'", "'float'"),
            correctAnswer = "'number'", explanation = "In JavaScript, integers and floats are both considered of type 'number'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is used to join two or more arrays?",
            options = listOf("join()", "concat()", "add()", "combine()"),
            correctAnswer = "concat()", explanation = "The concat() method is used to merge two or more arrays.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does 'NaN' stand for in JavaScript?",
            options = listOf("Next and New", "Not a Number", "Now and Next", "None and Null"),
            correctAnswer = "Not a Number", explanation = "NaN represents a value that is not a legal number.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which data type is used to represent 'true' or 'false'?",
            options = listOf("String", "Integer", "Boolean", "Logic"),
            correctAnswer = "Boolean", explanation = "A boolean represents one of two values: true or false.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Hoisting' in JavaScript?",
            options = listOf("A way to speed up code", "A behavior where declarations are moved to the top of their scope during compilation", "A garbage collection method", "A technique for creating loops"),
            correctAnswer = "A behavior where declarations are moved to the top of their scope during compilation", explanation = "Variable and function declarations are put into memory during the compile phase.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the result of '5' + 2?",
            options = listOf("7", "52", "NaN", "Error"),
            correctAnswer = "52", explanation = "JavaScript performs string concatenation when a string is added to a number.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Closure' in JavaScript?",
            options = listOf("Closing the browser tab", "A function combined with its lexical environment", "The end of a code block", "A way to encrypt variables"),
            correctAnswer = "A function combined with its lexical environment", explanation = "Closures allow a function to access variables from an outer function even after the outer function has finished.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'typeof' operator return for an array?",
            options = listOf("'array'", "'list'", "'object'", "'undefined'"),
            correctAnswer = "'object'", explanation = "In JavaScript, arrays are technically objects.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between '==' and '==='?",
            options = listOf("No difference", "'==' checks value, '===' checks value and type", "'===' checks value, '==' checks value and type", "Only one works for strings"),
            correctAnswer = "'==' checks value, '===' checks value and type", explanation = "Strict equality (===) prevents type coercion.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which array method is used to transform each element into something else?",
            options = listOf("filter()", "map()", "forEach()", "reduce()"),
            correctAnswer = "map()", explanation = "map() creates a new array with the results of calling a provided function on every element.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a Promise in JavaScript?",
            options = listOf("A guarantee that code will run", "An object representing the eventual completion or failure of an asynchronous operation", "A way to declare global variables", "A type of loop"),
            correctAnswer = "An object representing the eventual completion or failure of an asynchronous operation", explanation = "Promises handle asynchronous logic more cleanly than callbacks.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'use strict'?",
            options = listOf("To make code run faster", "To enforce stricter parsing and error handling in JavaScript", "To enable new features", "To protect the code from hackers"),
            correctAnswer = "To enforce stricter parsing and error handling in JavaScript", explanation = "Strict mode helps catch common coding bloopers and prevents use of unsafe actions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method is used to convert an object into a JSON string?",
            options = listOf("JSON.parse()", "JSON.stringify()", "JSON.object()", "JSON.to()"),
            correctAnswer = "JSON.stringify()", explanation = "JSON.stringify() turns a JavaScript object into a JSON string for transmission/storage.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What will '2' + 2 - 1 result in?",
            options = listOf("3", "21", "221", "NaN"),
            correctAnswer = "21", explanation = "'2' + 2 becomes '22' (concatenation), then '22' - 1 becomes 21 (subtraction converts to number).",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'bind()', 'call()', and 'apply()'?",
            options = listOf("To create new functions", "To control the value of 'this' in a function", "To manage memory", "To handle exceptions"),
            correctAnswer = "To control the value of 'this' in a function", explanation = "These methods allow you to invoke functions with a specific context.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Temporal Dead Zone' in JavaScript?",
            options = listOf("A point where the script stops", "The period between entering scope and variable initialization (for let/const)", "The end of a loop", "A way to delete objects"),
            correctAnswer = "The period between entering scope and variable initialization (for let/const)", explanation = "Accessing let/const before their declaration results in a ReferenceError.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'null' and 'undefined'?",
            options = listOf("No difference", "null is assigned by developer, undefined is default by engine", "undefined is an object", "null is a type of string"),
            correctAnswer = "null is assigned by developer, undefined is default by engine", explanation = "null represents intentional absence of value; undefined means a variable was declared but not assigned.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is an 'IIFE'?",
            options = listOf("An infinite loop", "Immediately Invoked Function Expression", "Internal Integrated Function Entry", "An error handling method"),
            correctAnswer = "Immediately Invoked Function Expression", explanation = "An IIFE is a function that runs as soon as it is defined.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which array method returns a single value after processing elements?",
            options = listOf("filter()", "map()", "reduce()", "every()"),
            correctAnswer = "reduce()", explanation = "reduce() executes a reducer function on each element to produce a single output value.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'Symbol' in ES6?",
            options = listOf("To create mathematical symbols", "To create unique, private identifiers for object properties", "To represent strings", "To manage memory"),
            correctAnswer = "To create unique, private identifiers for object properties", explanation = "Symbols are primitive data types that provide uniqueness.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'event bubbling' in the DOM?",
            options = listOf("Events spreading randomly", "An event triggering on the element then its parents up the tree", "An event triggering on the top parent then moving down", "A memory error"),
            correctAnswer = "An event triggering on the element then its parents up the tree", explanation = "Bubbling moves from the target element up through its ancestors.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'async' and 'await'?",
            options = listOf("To make code synchronous", "To handle asynchronous operations more readably like synchronous code", "To speed up functions", "To replace promises"),
            correctAnswer = "To handle asynchronous operations more readably like synchronous code", explanation = "Async/await is syntactic sugar over Promises.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'spread' (...) operator?",
            options = listOf("To spread a virus", "To expand an iterable into individual elements", "To join two strings", "To create a loop"),
            correctAnswer = "To expand an iterable into individual elements", explanation = "Spread can be used to copy arrays or merge objects.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Object Destructuring'?",
            options = listOf("Deleting an object", "Extracting values from objects and assigning them to variables", "Breaking the code", "A memory management tool"),
            correctAnswer = "Extracting values from objects and assigning them to variables", explanation = "Destructuring provides a concise way to extract data from objects.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'new' keyword do?",
            options = listOf("Creates a new string", "Creates an instance of an object from a constructor function", "Resets the program", "Declares a variable"),
            correctAnswer = "Creates an instance of an object from a constructor function", explanation = "It allocates memory and binds 'this' to the new instance.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the result of 'typeof NaN'?",
            options = listOf("'NaN'", "'undefined'", "'number'", "'object'"),
            correctAnswer = "'number'", explanation = "Technically, NaN is a numeric type in JavaScript.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'localStorage'?",
            options = listOf("To store data until the tab is closed", "To store data with no expiration date in the browser", "To store server-side data", "To manage sessions"),
            correctAnswer = "To store data with no expiration date in the browser", explanation = "LocalStorage persists even after the browser is closed and reopened.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Rest' parameter?",
            options = listOf("To let the program rest", "A way to collect multiple arguments into a single array", "The end of a function", "A way to sleep a thread"),
            correctAnswer = "A way to collect multiple arguments into a single array", explanation = "Rest parameters use the '...' syntax in function definitions.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Prototypal Inheritance'?",
            options = listOf("Inheriting from classes like Java", "Objects inheriting properties and methods from other objects via prototype chain", "Copying code between files", "A private way to use variables"),
            correctAnswer = "Objects inheriting properties and methods from other objects via prototype chain", explanation = "Every object has a prototype from which it inherits members.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to schedule a task to run after a specific delay?",
            options = listOf("setInterval()", "setTimeout()", "wait()", "delay()"),
            correctAnswer = "setTimeout()", explanation = "setTimeout() executes a function once after a specified number of milliseconds.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Event Loop'?",
            options = listOf("A game loop", "The mechanism that allows JS to perform non-blocking I/O operations by offloading tasks", "An infinite for loop", "A way to animate elements"),
            correctAnswer = "The mechanism that allows JS to perform non-blocking I/O operations by offloading tasks", explanation = "The event loop manages the execution of callbacks and tasks.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which keyword is used to stop an execution inside a loop?",
            options = listOf("exit", "stop", "break", "return"),
            correctAnswer = "break", explanation = "The break statement exits the loop immediately.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'Map' and 'Set' objects?",
            options = listOf("To draw maps and sets", "To store keyed collections and unique values more efficiently than plain objects/arrays", "To handle strings", "To manage threads"),
            correctAnswer = "To store keyed collections and unique values more efficiently than plain objects/arrays", explanation = "Map maintains insertion order; Set stores only unique values.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What will 'false == 0' return?",
            options = listOf("true", "false", "NaN", "Error"),
            correctAnswer = "true", explanation = "In non-strict comparison (==), false is coerced to 0.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is a 'Metaprogramming' feature in JavaScript?",
            options = listOf("Prototypes", "Proxy and Reflect", "Iterators", "Generators"),
            correctAnswer = "Proxy and Reflect", explanation = "Proxies allow you to intercept and customize fundamental operations for objects.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Garbage Collection' in JavaScript primarily based on?",
            options = listOf("Manual deletion", "Reference Counting and Mark-and-Sweep algorithms", "Thread management", "Stack clearing"),
            correctAnswer = "Reference Counting and Mark-and-Sweep algorithms", explanation = "The engine identifies unreachable objects and reclaims their memory.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "How do 'WeakMap' and 'WeakSet' differ from 'Map' and 'Set'?",
            options = listOf("They are faster", "They allow for garbage collection of their entries if no other references exist", "They only store numbers", "They are for server-side only"),
            correctAnswer = "They allow for garbage collection of their entries if no other references exist", explanation = "WeakMap keys must be objects and are held 'weakly'.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Currying' in functional JavaScript?",
            options = listOf("A type of loop", "Transforming a function with multiple arguments into a sequence of functions taking one argument each", "Optimizing code for the CPU", "A memory management tool"),
            correctAnswer = "Transforming a function with multiple arguments into a sequence of functions taking one argument each", explanation = "Currying allows for partial application of functions.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Tail Call Optimization'?",
            options = listOf("Removing the end of a function", "An ES6 feature that allows recursive functions to run in constant stack space", "Speeding up loops", "A way to hide private data"),
            correctAnswer = "An ES6 feature that allows recursive functions to run in constant stack space", explanation = "It prevents Stack Overflow in recursive scenarios.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What are 'Generators' in JavaScript?",
            options = listOf("A way to generate random numbers", "Functions that can be paused and resumed, yielding multiple values", "Tools for UI generation", "A type of server"),
            correctAnswer = "Functions that can be paused and resumed, yielding multiple values", explanation = "Generators use 'function*' syntax and the 'yield' keyword.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Shadow DOM'?",
            options = listOf("A dark theme", "An encapsulated DOM tree for Web Components to prevent style/script leakage", "A backup of the DOM", "A hidden tracking system"),
            correctAnswer = "An encapsulated DOM tree for Web Components to prevent style/script leakage", explanation = "Shadow DOM keeps the implementation details of a component private.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the difference between 'Task Queue' and 'Microtask Queue'?",
            options = listOf("No difference", "Microtasks (Promises) are executed before the next render; Tasks (setTimeout) are executed after", "Tasks are faster", "Microtasks are only for strings"),
            correctAnswer = "Microtasks (Promises) are executed before the next render; Tasks (setTimeout) are executed after", explanation = "Microtasks have higher priority in the event loop.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Memoization'?",
            options = listOf("Memorizing code", "An optimization technique that caches function results based on arguments", "A way to write comments", "A type of variable"),
            correctAnswer = "An optimization technique that caches function results based on arguments", explanation = "It prevents redundant computations for the same inputs.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'Module Pattern' in JavaScript?",
            options = listOf("A way to use modules like in Node.js", "A design pattern used to encapsulate private data and expose public APIs using closures", "A type of CSS layout", "A sorting algorithm"),
            correctAnswer = "A design pattern used to encapsulate private data and expose public APIs using closures", explanation = "It helps in organizing code and creating private scopes.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'BigInt'?",
            options = listOf("A very large string", "A primitive data type for integers larger than 2^53 - 1", "A high precision float", "A way to count threads"),
            correctAnswer = "A primitive data type for integers larger than 2^53 - 1", explanation = "BigInt handles arbitrarily large integers.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 20, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'V8' engine?",
            options = listOf("A type of car engine", "Google's open-source high-performance JavaScript and WebAssembly engine used in Chrome and Node.js", "A graphic processing unit", "A new JS version"),
            correctAnswer = "Google's open-source high-performance JavaScript and WebAssembly engine used in Chrome and Node.js", explanation = "V8 compiles JS directly to native machine code.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'JIT' compilation in JavaScript?",
            options = listOf("Just-In-Time compilation of script into machine code during execution", "Compiling code before sending to browser", "An error handling tool", "A way to optimize images"),
            correctAnswer = "Just-In-Time compilation of script into machine code during execution", explanation = "JIT balances fast startup and optimized runtime execution.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'Object.freeze()' vs 'Object.seal()'?",
            options = listOf("No difference", "Freeze makes object immutable; Seal prevents adding/removing properties but allows modifying existing ones", "Seal is more restrictive", "Freeze is only for arrays"),
            correctAnswer = "Freeze makes object immutable; Seal prevents adding/removing properties but allows modifying existing ones", explanation = "Freeze is a deeper level of restriction.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Composition' over 'Inheritance'?",
            options = listOf("A way to draw UI", "A design principle where objects are built from smaller parts rather than a rigid hierarchy", "Writing long functions", "A type of variable"),
            correctAnswer = "A design principle where objects are built from smaller parts rather than a rigid hierarchy", explanation = "It leads to more flexible and reusable code.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the 'This' keyword behavior in Arrow Functions?",
            options = listOf("It refers to the object calling the function", "It inherits 'this' from its lexical parent scope", "It is always undefined", "It refers to the global object"),
            correctAnswer = "It inherits 'this' from its lexical parent scope", explanation = "Arrow functions do not have their own 'this' binding.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Strict Mode' limitation regarding 'this' in global functions?",
            options = listOf("It makes 'this' refer to window", "It makes 'this' undefined", "It makes 'this' a string", "It has no effect"),
            correctAnswer = "It makes 'this' undefined", explanation = "In strict mode, global 'this' is undefined to prevent accidental window manipulation.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Prototype Pollution'?",
            options = listOf("A way to clean code", "A vulnerability where an attacker modifies an object's prototype to inject properties", "A type of memory leak", "Optimizing the prototype chain"),
            correctAnswer = "A vulnerability where an attacker modifies an object's prototype to inject properties", explanation = "It can lead to XSS or remote code execution.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'SharedArrayBuffer' and 'Atomics' used for?",
            options = listOf("Sharing files", "Sharing memory between web workers and performing atomic operations safely", "Database connections", "UI animations"),
            correctAnswer = "Sharing memory between web workers and performing atomic operations safely", explanation = "They enable high-performance multi-threaded computing in JS.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Intersection Observer API'?",
            options = listOf("To observe user clicks", "To detect when an element enters or exits the viewport efficiently", "To manage network requests", "To draw 3D graphics"),
            correctAnswer = "To detect when an element enters or exits the viewport efficiently", explanation = "Used for lazy loading and infinite scroll.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'Async Iterator'?",
            options = listOf("To iterate faster", "To iterate over asynchronous data sources (e.g. streaming data)", "A type of loop for arrays", "A private way to use variables"),
            correctAnswer = "To iterate over asynchronous data sources (e.g. streaming data)", explanation = "Uses 'for await...of' syntax.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'WebAssembly' (Wasm) relation to JavaScript?",
            options = listOf("It replaces JavaScript", "A binary instruction format that runs alongside JavaScript at near-native speed", "A type of CSS", "A new JS framework"),
            correctAnswer = "A binary instruction format that runs alongside JavaScript at near-native speed", explanation = "Wasm allows high-performance code (C++/Rust) to run on the web.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Polyfill'?",
            options = listOf("A type of plastic", "A piece of code used to provide modern functionality on older browsers that do not natively support it", "A design pattern", "A type of variable"),
            correctAnswer = "A piece of code used to provide modern functionality on older browsers that do not natively support it", explanation = "It 'fills in' the missing API.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Tree Shaking'?",
            options = listOf("Shaking a tree for data", "A form of dead code elimination that removes unused exports from final bundle", "A way to organize files", "A memory cleanup tool"),
            correctAnswer = "A form of dead code elimination that removes unused exports from final bundle", explanation = "It relies on the static structure of ES6 modules.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Higher-Order Function' in JavaScript?",
            options = listOf("A function with many lines", "A function that takes another function as an argument or returns a function", "A prioritized function", "A global function"),
            correctAnswer = "A function that takes another function as an argument or returns a function", explanation = "Examples include map, filter, and reduce.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Function Currying' implementation?",
            options = listOf("Using loops", "Using closures to return nested functions", "Using global variables", "Using arrays"),
            correctAnswer = "Using closures to return nested functions", explanation = "Closures capture the arguments of previous calls.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Partial Application'?",
            options = listOf("Only running half of a function", "Fixing a number of arguments to a function, producing another function of smaller arity", "A bug in the engine", "A way to hide code"),
            correctAnswer = "Fixing a number of arguments to a function, producing another function of smaller arity", explanation = "Similar but distinct from currying.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'AbortController'?",
            options = listOf("To abort the program", "To cancel one or more Web requests or asynchronous tasks", "To manage errors", "To stop loops"),
            correctAnswer = "To cancel one or more Web requests or asynchronous tasks", explanation = "Essential for stopping fetch requests that are no longer needed.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'TCO' limitation in modern browsers?",
            options = listOf("It is only supported in Safari/WebKit", "It is supported everywhere", "It is for Node.js only", "It is deprecated"),
            correctAnswer = "It is only supported in Safari/WebKit", explanation = "Other engines have not implemented it due to debugging complexities.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 30, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Async/Await' behavior in a loop?",
            options = listOf("Always runs in parallel", "Sequential by default if used with 'for...of'", "Always throws error", "Cannot be used in loops"),
            correctAnswer = "Sequential by default if used with 'for...of'", explanation = "To run in parallel, Promise.all() should be used.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which function is used to convert a JSON string into a JavaScript object?",
            options = listOf("JSON.stringify()", "JSON.parse()", "JSON.toObject()", "JSON.objectify()"),
            correctAnswer = "JSON.parse()", explanation = "JSON.parse() parses a JSON string, constructing the value or object described by the string.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the output of 'typeof undefined'?",
            options = listOf("'null'", "'object'", "'undefined'", "'string'"),
            correctAnswer = "'undefined'", explanation = "The type of an undefined variable is 'undefined'.",
            difficulty = Difficulty.EASY, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 30, points = 10, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "Which method creates a new array by filtering out elements that do not pass a test?",
            options = listOf("map()", "filter()", "reduce()", "find()"),
            correctAnswer = "filter()", explanation = "The filter() method creates a shallow copy of a portion of a given array, filtered down to just the elements from the given array that pass the test.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of the 'finally' block in a try...catch statement?",
            options = listOf("To handle the error", "To execute code regardless of whether an error occurred or was caught", "To restart the try block", "To skip the catch block"),
            correctAnswer = "To execute code regardless of whether an error occurred or was caught", explanation = "Finally is used for cleanup code.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What does the 'bind()' method return?",
            options = listOf("The result of the function", "A new function with a fixed 'this' context", "An object", "undefined"),
            correctAnswer = "A new function with a fixed 'this' context", explanation = "Bind creates a copy of the function that can be called later.",
            difficulty = Difficulty.MEDIUM, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 45, points = 15, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Debouncing' in JavaScript?",
            options = listOf("Removing bugs", "A technique to limit the rate at which a function gets invoked", "A type of loop", "A way to join strings"),
            correctAnswer = "A technique to limit the rate at which a function gets invoked", explanation = "Debouncing ensures that a function is only called after a certain period of inactivity.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is the purpose of 'Reflect' API?",
            options = listOf("To reflect light in UI", "A built-in object that provides methods for interceptable JavaScript operations", "To mirror the DOM", "To manage sessions"),
            correctAnswer = "A built-in object that provides methods for interceptable JavaScript operations", explanation = "Reflect makes it easier to work with Proxies.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        ),
        Question(
            id = UUID.randomUUID().toString(), categoryId = categoryId, questionText = "What is 'Temporal' (Experimental) intended to replace?",
            options = listOf("The String object", "The Date object", "The Array object", "The Map object"),
            correctAnswer = "The Date object", explanation = "Temporal is a new global object being proposed to fix issues with the current Date API.",
            difficulty = Difficulty.HARD, questionType = QuestionType.MULTIPLE_CHOICE, timeLimit = 60, points = 25, createdAt = createdAt
        )
    )
}