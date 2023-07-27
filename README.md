# Basic Social Media API with Java, Spring Boot, and MySQL

## Description
This project is a basic social media application backend implemented as a Java REST API using the Spring framework and Spring Boot. The API allows users to interact with the system by creating user profiles and making posts. The primary technologies employed in this project include JPA, JDBC, Spring Security, and MySQL.

## Features
- User Management: Users can create profiles with details such as name and birthday.
- Post Creation: Users can make posts with descriptions.

## Technologies Used
- Java
- Spring Boot
- Spring Framework
- JPA (Java Persistence API)
- JDBC (Java Database Connectivity)
- Spring Security
- -H2 (In-memory database)
- MySQL (with Docker container)

## Getting Started
1. Clone the repository.
2. Run the application using your favorite Java IDE or use `mvn spring-boot:run` command.
3. Access the API through `http://localhost:8080`.

## Database Configuration
- Initially, the application uses H2 database for development purposes.
- To use MySQL, create a Docker container with MySQL and update the application.properties file accordingly.
