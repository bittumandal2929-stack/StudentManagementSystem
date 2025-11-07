# StudentManagementSystem

The Student Management System is a simple console-based Java project that helps manage student records using MySQL as the database.
It allows users to Add, View, Update, and Delete student information easily through a menu-driven program.
The project uses JDBC (Java Database Connectivity) to connect Java with the MySQL database and the Collection Framework (ArrayList) to store and manage data temporarily during runtime.

Each student has four details:

1.Roll Number
2.Name
3.Age
4.Address


Features

1.Add Student — Insert new student details into the database.
2.View All Students — Display all stored student records.
3.Update Student — Modify existing student details using roll number.
4.Delete Student — Remove a student record permanently.
5.Uses MySQL database for storing all records safely.


Technologies Used

1.Java 
2.MySQL Database
3.JDBC (Java Database Connectivity)
4.Collection Framework (ArrayList)


Project Structure
StudentManagement/
 ├── Student.java              # Model class (represents student data)
 ├── DBConnection.java         # Handles database connection
 ├── StudentDAO.java           # Performs database operations (CRUD)
 ├── StudentService.java       # Business logic layer
 ├── StudentManagementSystem.java # Main class (controller)


How It Works

The program connects to the MySQL database using JDBC.
It shows a simple text-based menu for the user to choose options.
According to the selected option, the system performs actions like adding, viewing, updating, or deleting student records.
The output is displayed neatly on the console.



Purpose

This project is designed for beginners in Java and database programming to learn how to:
Connect Java with MySQL using JDBC.
Organize code using DAO, Service, and Controller layers.
Perform basic CRUD operations from a Java program.
