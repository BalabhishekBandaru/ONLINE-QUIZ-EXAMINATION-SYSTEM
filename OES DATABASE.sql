#REGISTRATION TABLE

CREATE TABLE `registration` (
  `FirstName` varchar(50) DEFAULT NULL,
  `LastName` varchar(50) DEFAULT NULL,
  `Email` varchar(40) DEFAULT NULL,
  `PhoneNumber` int DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `UserName` varchar(45) NOT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

#DBMS TABLE

CREATE TABLE `dbms` (
  `did` int NOT NULL AUTO_INCREMENT,
  `dquestion` varchar(500) DEFAULT NULL,
  `danswer` varchar(500) DEFAULT NULL,
  `duserans` varchar(500) DEFAULT NULL,

  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('The process of organizing data into a structured format is called _______.', 'data modeling');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('In a relational database, data is stored in _______.', 'tables');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('SQL stands for _______.', 'Structured Query Language');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('A unique identifier for each record in a database table is called a _______.', 'primary key');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('The process of retrieving specific data from a database is called _______.', 'querying');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('A database management system (DBMS) helps in _______ and _______ data in databases.', 'storing and manipulating');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('The SQL command used to insert new data into a table is _______.', 'INSERT INTO');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('In a database, a collection of related data items is called a _______.', 'table');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('The SQL command used to retrieve data from a database table is _______.', 'SELECT');
INSERT INTO oes.dbms (dquestion, danswer) VALUES ('The _______ operation is used in SQL to combine rows from two or more tables based on a related column between them.', 'JOIN');
SELECT * FROM oes.dbms;


#JAVA TABLE

CREATE TABLE `java` (
  `jid` int NOT NULL AUTO_INCREMENT,
  `jquestion` varchar(500) DEFAULT NULL,
  `janswer` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`jid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO oes.java (jquestion, janswer) VALUES
('The process of organizing data into a structured format is called _______.', 'data modeling'),
('In Java, a _______ is a blueprint for creating objects, while an _______ is an instance of a class.', 'class, object'),
('Java programs are platform-independent because they are compiled into _______ code, which can be executed by the Java Virtual Machine (JVM).', 'bytecode'),
('The _______ keyword in Java is used to indicate that a variable can only be assigned a value once.', 'final'),
('_______ is the process of grouping related variables and methods together into a single unit.', 'Encapsulation'),
('_______ is a mechanism in Java that allows one class to inherit properties and behaviors from another class.', 'Inheritance'),
('The _______ keyword in Java is used to create a subclass that inherits from a superclass.', 'extends'),
('_______ is a feature of Java that allows a method to have different implementations based on the type of object it is called on.', 'Polymorphism'),
('Java supports _______ which allows a method to have the same name but different parameters or types.', 'method overloading'),
('The _______ class in Java provides methods for performing input and output operations.', 'Scanner');
select * from oes.java;


#OS TABLE

CREATE TABLE `os` (
  `oid` int NOT NULL AUTO_INCREMENT,
  `oquestion` varchar(500) DEFAULT NULL,
  `oanswer` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`oid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
INSERT INTO oes.os (oquestion, oanswer) VALUES
('The primary function of an operating system is to manage _______ and _______ resources.', 'hardware, software'),
('_______ is the process of swapping data between main memory and secondary storage to free up memory space.', 'Paging'),
('In an operating system, a _______ is a unit of execution that represents a process.', 'thread'),
('_______ is a method used by the operating system to schedule the execution of multiple processes.', 'Scheduling'),
('A _______ is a software mechanism used by an operating system to enforce access control policies on resources.', 'Security model'),
('_______ is a technique used by the operating system to improve the efficiency of file access by storing frequently accessed data in main memory.', 'Caching'),
('An operating system provides a _______ interface that allows users to interact with the system through commands or graphical elements.', 'User'),
('The _______ is a special program responsible for booting the operating system and initializing hardware components during system startup.', 'Bootstrap loader'),
('A _______ is a set of rules and protocols that allows multiple users to access and share resources on a network.', 'Network operating system'),
('The _______ is a critical component of an operating system responsible for managing input/output operations between hardware devices and the CPU.', 'Device driver');
select * from oes.os;