-- Create database
CREATE DATABASE IF NOT EXISTS quiz_app_db;
USE quiz_app_db;

-- Drop tables if they exist (for clean setup)
DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS categories;

-- Categories table
CREATE TABLE categories (
    id VARCHAR(50) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    icon VARCHAR(50),
    color_hex VARCHAR(10) DEFAULT '#6200EE',
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Questions table
CREATE TABLE questions (
    id VARCHAR(50) PRIMARY KEY,
    category_id VARCHAR(50) NOT NULL,
    question_text TEXT NOT NULL,
    question_type ENUM('MULTIPLE_CHOICE', 'TRUE_FALSE', 'SHORT_ANSWER') DEFAULT 'MULTIPLE_CHOICE',
    options JSON,
    correct_answer VARCHAR(255) NOT NULL,
    explanation TEXT,
    difficulty ENUM('EASY', 'MEDIUM', 'HARD') DEFAULT 'MEDIUM',
    time_limit INT DEFAULT 30,
    points INT DEFAULT 10,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    FOREIGN KEY (category_id) REFERENCES categories(id) ON DELETE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Insert sample categories
INSERT INTO categories (id, name, description, icon, color_hex) VALUES
('cat-java-001', 'Java', 'Test your Java programming knowledge', 'code', '#E57373'),
('cat-python-002', 'Python', 'Python programming fundamentals', 'computer', '#64B5F6'),
('cat-kotlin-003', 'Kotlin', 'Modern Android development with Kotlin', 'android', '#9575CD'),
('cat-cpp-004', 'C++', 'Master C++ programming concepts', 'terminal', '#4DB6AC');

-- ==================== JAVA QUESTIONS ====================

INSERT INTO questions (id, category_id, question_text, question_type, options, correct_answer, explanation, difficulty, time_limit, points) VALUES
('q-java-001', 'cat-java-001', 'What is the size of an int in Java?', 'MULTIPLE_CHOICE', 
'["16 bits", "32 bits", "64 bits", "8 bits"]', '32 bits', 
'In Java, an int is always 32 bits regardless of the platform.', 'EASY', 30, 10),

('q-java-002', 'cat-java-001', 'Which keyword is used to inherit a class in Java?', 'MULTIPLE_CHOICE',
'["extends", "implements", "inherits", "import"]', 'extends',
'The extends keyword is used for class inheritance in Java.', 'EASY', 30, 10),

('q-java-003', 'cat-java-001', 'Is Java platform-independent?', 'TRUE_FALSE',
'[]', 'True',
'Java is platform-independent because it uses bytecode that can run on any JVM.', 'EASY', 20, 10),

('q-java-004', 'cat-java-001', 'What is the default value of a boolean variable in Java?', 'MULTIPLE_CHOICE',
'["true", "false", "null", "0"]', 'false',
'The default value of boolean variables in Java is false.', 'EASY', 30, 10),

('q-java-005', 'cat-java-001', 'Which method is the entry point of a Java application?', 'SHORT_ANSWER',
'[]', 'main',
'The main() method is the entry point for Java applications.', 'EASY', 30, 10),

('q-java-006', 'cat-java-001', 'Can we override static methods in Java?', 'TRUE_FALSE',
'[]', 'False',
'Static methods belong to the class, not instances, so they cannot be overridden.', 'MEDIUM', 30, 10),

('q-java-007', 'cat-java-001', 'What is encapsulation in Java?', 'MULTIPLE_CHOICE',
'["Hiding implementation details", "Inheriting properties", "Creating multiple objects", "Compiling code"]', 'Hiding implementation details',
'Encapsulation is the process of hiding implementation details from users.', 'MEDIUM', 40, 15),

('q-java-008', 'cat-java-001', 'Which collection class allows duplicate elements?', 'MULTIPLE_CHOICE',
'["ArrayList", "HashSet", "TreeSet", "LinkedHashSet"]', 'ArrayList',
'ArrayList allows duplicate elements, while Set implementations do not.', 'MEDIUM', 35, 15),

('q-java-009', 'cat-java-001', 'What is polymorphism?', 'MULTIPLE_CHOICE',
'["Many forms of a single entity", "Single form of many entities", "Creating objects", "Deleting objects"]', 'Many forms of a single entity',
'Polymorphism allows objects to take many forms through method overloading and overriding.', 'MEDIUM', 40, 15),

('q-java-010', 'cat-java-001', 'Can a class be both abstract and final in Java?', 'TRUE_FALSE',
'[]', 'False',
'A class cannot be both abstract and final as abstract classes are meant to be inherited.', 'HARD', 35, 20);

-- ==================== PYTHON QUESTIONS ====================

INSERT INTO questions (id, category_id, question_text, question_type, options, correct_answer, explanation, difficulty, time_limit, points) VALUES
('q-python-001', 'cat-python-002', 'What is the correct file extension for Python files?', 'MULTIPLE_CHOICE',
'[".python", ".py", ".pt", ".pyt"]', '.py',
'Python files use the .py extension.', 'EASY', 25, 10),

('q-python-002', 'cat-python-002', 'Which keyword is used to create a function in Python?', 'MULTIPLE_CHOICE',
'["function", "def", "func", "define"]', 'def',
'The def keyword is used to define functions in Python.', 'EASY', 30, 10),

('q-python-003', 'cat-python-002', 'Is Python case-sensitive?', 'TRUE_FALSE',
'[]', 'True',
'Python is case-sensitive. Variable names like "Var" and "var" are different.', 'EASY', 20, 10),

('q-python-004', 'cat-python-002', 'What does PIP stand for in Python?', 'MULTIPLE_CHOICE',
'["Python Installer Package", "Pip Installs Packages", "Python Integration Program", "Package Installation Python"]', 'Pip Installs Packages',
'PIP is a recursive acronym for "Pip Installs Packages".', 'EASY', 30, 10),

('q-python-005', 'cat-python-002', 'Which data type is mutable in Python?', 'MULTIPLE_CHOICE',
'["tuple", "string", "list", "int"]', 'list',
'Lists are mutable in Python, while tuples and strings are immutable.', 'MEDIUM', 35, 15),

('q-python-006', 'cat-python-002', 'What is the output of print(2 ** 3)?', 'SHORT_ANSWER',
'[]', '8',
'The ** operator is used for exponentiation. 2^3 = 8.', 'EASY', 30, 10),

('q-python-007', 'cat-python-002', 'Are Python lists ordered?', 'TRUE_FALSE',
'[]', 'True',
'Lists in Python maintain the order of elements.', 'EASY', 20, 10),

('q-python-008', 'cat-python-002', 'Which loop is guaranteed to execute at least once?', 'MULTIPLE_CHOICE',
'["for loop", "while loop", "do-while loop", "Python has no such loop"]', 'Python has no such loop',
'Python does not have a do-while loop like some other languages.', 'MEDIUM', 35, 15),

('q-python-009', 'cat-python-002', 'What is a lambda function?', 'MULTIPLE_CHOICE',
'["Anonymous function", "Named function", "Built-in function", "Class method"]', 'Anonymous function',
'Lambda functions are anonymous functions defined using the lambda keyword.', 'MEDIUM', 35, 15),

('q-python-010', 'cat-python-002', 'Can you use else clause with for loop in Python?', 'TRUE_FALSE',
'[]', 'True',
'Python allows an else clause with for and while loops, executed when loop completes normally.', 'HARD', 35, 20);

-- ==================== KOTLIN QUESTIONS ====================

INSERT INTO questions (id, category_id, question_text, question_type, options, correct_answer, explanation, difficulty, time_limit, points) VALUES
('q-kotlin-001', 'cat-kotlin-003', 'Kotlin is developed by which company?', 'MULTIPLE_CHOICE',
'["Google", "JetBrains", "Oracle", "Microsoft"]', 'JetBrains',
'Kotlin was developed by JetBrains and is now officially supported by Google for Android.', 'EASY', 30, 10),

('q-kotlin-002', 'cat-kotlin-003', 'Which keyword is used to declare a variable that cannot be changed?', 'MULTIPLE_CHOICE',
'["var", "val", "const", "final"]', 'val',
'val is used to declare read-only (immutable) variables in Kotlin.', 'EASY', 30, 10),

('q-kotlin-003', 'cat-kotlin-003', 'Does Kotlin support null safety?', 'TRUE_FALSE',
'[]', 'True',
'Kotlin has built-in null safety features to prevent null pointer exceptions.', 'EASY', 20, 10),

('q-kotlin-004', 'cat-kotlin-003', 'What is the correct way to declare a nullable variable in Kotlin?', 'MULTIPLE_CHOICE',
'["var name: String", "var name: String?", "var name: String!", "var name: Nullable<String>"]', 'var name: String?',
'The ? operator is used to declare nullable types in Kotlin.', 'EASY', 35, 10),

('q-kotlin-005', 'cat-kotlin-003', 'Which function is the entry point of a Kotlin application?', 'SHORT_ANSWER',
'[]', 'main',
'The main() function is the entry point for Kotlin applications.', 'EASY', 30, 10),

('q-kotlin-006', 'cat-kotlin-003', 'What is a data class in Kotlin?', 'MULTIPLE_CHOICE',
'["A class that holds data", "A class for database", "A class for UI", "A sealed class"]', 'A class that holds data',
'Data classes are designed to hold data and automatically provide equals(), hashCode(), toString(), etc.', 'MEDIUM', 40, 15),

('q-kotlin-007', 'cat-kotlin-003', 'Can Kotlin code be compiled to JavaScript?', 'TRUE_FALSE',
'[]', 'True',
'Kotlin can be compiled to JavaScript for web development.', 'MEDIUM', 30, 15),

('q-kotlin-008', 'cat-kotlin-003', 'What is the Elvis operator in Kotlin?', 'MULTIPLE_CHOICE',
'["?:", "!!", "?.", "::"]', '?:',
'The Elvis operator ?: provides a default value when the expression is null.', 'MEDIUM', 35, 15),

('q-kotlin-009', 'cat-kotlin-003', 'What are coroutines in Kotlin?', 'MULTIPLE_CHOICE',
'["Lightweight threads", "Heavy processes", "Data structures", "Design patterns"]', 'Lightweight threads',
'Coroutines are lightweight threads for asynchronous programming in Kotlin.', 'HARD', 40, 20),

('q-kotlin-010', 'cat-kotlin-003', 'Are semicolons required at the end of statements in Kotlin?', 'TRUE_FALSE',
'[]', 'False',
'Semicolons are optional in Kotlin and generally not used.', 'EASY', 20, 10);

-- ==================== C++ QUESTIONS ====================

INSERT INTO questions (id, category_id, question_text, question_type, options, correct_answer, explanation, difficulty, time_limit, points) VALUES
('q-cpp-001', 'cat-cpp-004', 'Who developed C++?', 'MULTIPLE_CHOICE',
'["Dennis Ritchie", "Bjarne Stroustrup", "James Gosling", "Guido van Rossum"]', 'Bjarne Stroustrup',
'C++ was developed by Bjarne Stroustrup at Bell Labs.', 'EASY', 30, 10),

('q-cpp-002', 'cat-cpp-004', 'Which operator is used to access members of a class through a pointer?', 'MULTIPLE_CHOICE',
'[".", "->", "::", "*"]', '->',
'The arrow operator (->) is used to access members through a pointer.', 'EASY', 30, 10),

('q-cpp-003', 'cat-cpp-004', 'Is C++ a superset of C?', 'TRUE_FALSE',
'[]', 'True',
'C++ is largely a superset of C with additional object-oriented features.', 'EASY', 20, 10),

('q-cpp-004', 'cat-cpp-004', 'What is the default access specifier for class members?', 'MULTIPLE_CHOICE',
'["public", "private", "protected", "internal"]', 'private',
'In C++, class members are private by default.', 'EASY', 30, 10),

('q-cpp-005', 'cat-cpp-004', 'Which header file is required for cout?', 'SHORT_ANSWER',
'[]', 'iostream',
'The iostream header file provides cout for output operations.', 'EASY', 30, 10),

('q-cpp-006', 'cat-cpp-004', 'What is polymorphism in C++?', 'MULTIPLE_CHOICE',
'["Ability to take many forms", "Multiple inheritance", "Memory management", "Compilation process"]', 'Ability to take many forms',
'Polymorphism allows objects to be treated as instances of their parent class.', 'MEDIUM', 40, 15),

('q-cpp-007', 'cat-cpp-004', 'Can a destructor be virtual?', 'TRUE_FALSE',
'[]', 'True',
'Destructors can and should be virtual in base classes for proper cleanup.', 'MEDIUM', 30, 15),

('q-cpp-008', 'cat-cpp-004', 'What is a friend function?', 'MULTIPLE_CHOICE',
'["Function that can access private members", "Function in the same class", "Static function", "Inline function"]', 'Function that can access private members',
'Friend functions can access private and protected members of a class.', 'MEDIUM', 40, 15),

('q-cpp-009', 'cat-cpp-004', 'What is RAII in C++?', 'MULTIPLE_CHOICE',
'["Resource Acquisition Is Initialization", "Random Access Index Implementation", "Runtime Abstract Interface Integration", "Recursive Algorithm Implementation"]', 'Resource Acquisition Is Initialization',
'RAII is a programming idiom where resource allocation is tied to object lifetime.', 'HARD', 45, 20),

('q-cpp-010', 'cat-cpp-004', 'Does C++ support multiple inheritance?', 'TRUE_FALSE',
'[]', 'True',
'C++ supports multiple inheritance, allowing a class to inherit from multiple base classes.', 'MEDIUM', 30, 15);

-- Show summary
SELECT 
    c.name as Category,
    COUNT(q.id) as Questions,
    ROUND(AVG(q.time_limit), 0) as AvgTime,
    ROUND(AVG(q.points), 0) as AvgPoints
FROM categories c
LEFT JOIN questions q ON c.id = q.category_id
GROUP BY c.id, c.name;

COMMIT;