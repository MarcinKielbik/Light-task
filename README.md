# 📝 To-Do List Application

A simple to-do list REST API built with **Java** and **Spring Boot**.  
This project demonstrates how to create a basic CRUD (Create, Read, Update, Delete) 
application using Spring Web, Spring Data JPA, and an H2 in-memory database.

---

## Technologies Used

- Java 17+
- Spring Boot 3.x
- Spring Web
- Spring Data JPA
- H2 Database
- Maven

---

## Features

- Create a new task
- Get all tasks
- Update an existing task
- Delete a task
- Access H2 database console via browser

---

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/todo-app.git
cd todo-app
```
### 2. Run the Application
```bash
./mvnw spring-boot:run
```

## REST API Endpoints

### 1. Get All Tasks

- **Method:** `GET`
- **URL:** `/api/tasks`
- **Description:** Returns a list of all tasks.
- **Response Example:**
```json
[
  {
    "id": 1,
    "title": "Learn Spring Boot",
    "description": "Complete the Spring Boot guide",
    "completed": false
  }
]
```

### 2. Get Task by ID

- **Method:** `GET`

- **URL:** `/api/tasks/{id}`

- **Description:** Returns a single task by ID.

- **Response Example:**

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Complete the Spring Boot guide",
  "completed": false
}
```


### 3. Create New Task
- **Method:** `POST`

- **URL:** `/api/tasks`

- **Description:** Creates a new task.

- **Request Body Example:**

```json
{
  "title": "Buy groceries",
  "description": "Milk, Eggs, Bread",
  "completed": false
}
```

**Response Example:**

```json
{
  "id": 2,
  "title": "Buy groceries",
  "description": "Milk, Eggs, Bread",
  "completed": false
}
```

### 4. Update Task

- **Method:** `PUT`

- **URL:** `/api/tasks/{id}`

- **Description:** Updates an existing task.

- **Request Body Example:**

```json
{
  "title": "Buy groceries",
  "description": "Milk, Eggs, Bread, Butter",
  "completed": true
}
```


### 5. Delete Task

- **Method:** `DELETE`

- **URL:** `/api/tasks/{id}`

- **Description:** Deletes a task by ID.

- **Response:** HTTP 204 No Content



### Technologies Used

- **Java 17**
- **Spring Boot 3**
- **Spring Web** – for creating RESTful APIs
- **Spring Data JPA** – for database access
- **H2 Database** – in-memory database for development and testing
- **Maven** – build and dependency management


### Author

Marcin Kiełbik