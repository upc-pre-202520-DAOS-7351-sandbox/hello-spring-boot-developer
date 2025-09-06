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

## User Stories
The user stories for this application can be found in the [docs/user-stories](docs/user-stories.md) document.

## Class Diagram
The class diagram for this application can be found in the [docs/class-diagram](docs/class-diagram.puml) document.

The following diagram shows the class hierarchy for this application:

![class-diagram](https://www.plantuml.com/plantuml/proxy?src=https://raw.githubusercontent.com/upc-pre-202520-1asi0729-sandbox/hello-spring-boot-developer/refs/heads/master/docs/class-diagram.puml?token=GHSAT0AAAAAADJGFNEZSMW3VGR5GRGK7KZS2FY577Q)

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