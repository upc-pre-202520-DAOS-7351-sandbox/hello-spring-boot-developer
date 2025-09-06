# Hello Spring Boot Developer

A simple Spring Boot application demonstrating a RESTful API for greeting developers.

## Features
- **GET /greetings**: Retrieve a greeting with optional `firstName` and `lastName` query parameters.
- **POST /greetings**: Create a greeting with a JSON request body containing `firstName` and `lastName`.

## Prerequisites
- Java 24 or higher
- Spring Boot 3.5.5 or higher
- Apache Commons Lang 3.18.0
- Lombok
- Java Maven

## Getting Started
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd hello-spring-boot-developer

2. Build the project:
   ```bash
    mvn clean install
    ```
3. Run the application:
    ```bash
   mvn spring-boot:run
   ```

4. Access the API:
    - Open your browser and navigate to:
    - `http://localhost:8080/greetings` for a GET request
    - Use a tool like Postman or curl to send a POST request to `http://localhost:8080/greetings` with a JSON body:
      ```json
      {
        "firstName": "John",
        "lastName": "Doe"
      }
      ```