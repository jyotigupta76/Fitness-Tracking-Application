# Fitness Tracking Application 🏋️

A backend-focused fitness tracking application built using **Java and Spring Boot** that allows users to securely manage and track their fitness activities.

> 🚧 **Project Status: In Progress**

## 📌 About the Project

The Fitness Tracking Application is designed to help users record and manage their fitness activities such as **running, cycling, weight training, and cross-training**.

The application stores important activity details including:

* Activity type
* Duration
* Calories burned
* Date and time
* User information
* Fitness-related recommendations

The project focuses on building a secure and scalable REST API using modern Spring Boot concepts.

## ✨ Key Features

* 🔐 User Authentication and Authorization
* 🎫 JWT-based Authentication
* 👥 Role-Based Authorization
* 🏃 Fitness Activity Tracking
* 🔥 Calories Burned Tracking
* ⏱️ Activity Duration Tracking
* 📅 Activity Date and Time Tracking
* 💡 Fitness Recommendations
* ✅ Request Data Validation
* 📦 DTO-based Architecture
* 🗄️ Database Persistence using Spring Data JPA
* 🐳 Docker Containerization *(In Progress)*

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Security
* Spring Data JPA
* Hibernate
* REST APIs
* Lombok
* Maven

### Database

* MySQL

### Security

* Spring Security
* JWT (JSON Web Token)
* Role-Based Authentication & Authorization

### DevOps

* Docker *(In Progress)*
* Cloud Deployment *(Planned)*

## 🏗️ Project Architecture

The application follows a layered architecture:

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Database
```

### Main Layers

**Controller Layer**
Handles HTTP requests and exposes REST APIs.

**Service Layer**
Contains the application's business logic.

**Repository Layer**
Handles database operations using Spring Data JPA.

**Entity Layer**
Represents the database tables and their relationships.

**DTO Layer**
Transfers required data between the client and backend while keeping entities decoupled from API requests/responses.

## 🔐 Authentication & Authorization

Spring Security is used to secure the application.

The application uses **JWT-based authentication**, where a user receives a token after successful authentication. This token is then used to access protected APIs.

Role-based authorization is used to control access to different resources based on the user's role.

## 🗃️ Data Management

Fitness activities are stored in the database along with information such as:

```text
User
 ├── Activity Type
 ├── Duration
 ├── Calories Burned
 ├── Date
 └── Time
```

Spring Data JPA and Hibernate are used for database persistence and entity relationship management.

## ✅ Validation

The application uses Spring's validation framework to validate incoming request data before processing it.

This helps ensure that invalid or incomplete data is not stored in the database.

## 🐳 Docker

The application will be containerized using Docker to make it easier to build, run, and deploy the application consistently across different environments.

## 🚀 Future Enhancements

* Complete Docker containerization
* Cloud deployment
* Advanced fitness analytics
* Personalized recommendations
* Additional fitness activity types
* Improved API documentation
* Frontend integration

## 📂 Project Structure

```text
Fitness/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   └── test/
├── .gitignore
├── pom.xml
├── mvnw
├── mvnw.cmd
└── README.md
```

## 👩‍💻 Author

**Jyoti Kumari**

GitHub: [@jyotigupta76](https://github.com/jyotigupta76)
