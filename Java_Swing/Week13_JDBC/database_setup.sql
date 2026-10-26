CREATE DATABASE IF NOT EXISTS swing_tutorial;
USE swing_tutorial;
CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(100) NOT NULL,course VARCHAR(50) NOT NULL,email VARCHAR(120) UNIQUE);
INSERT IGNORE INTO students(id,name,course,email) VALUES (1,'Ana Santos','BSIT','ana@example.com'),(2,'Ben Cruz','BSCS','ben@example.com');
