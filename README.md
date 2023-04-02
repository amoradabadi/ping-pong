# Ping Pong
This is a multi-module Maven Java Spring Boot application that includes two separate modules, each functioning as a discrete Spring Boot application. The primary objective of this project is to demonstrate the utilization of API-driven development in a microservices environment.

The main application features an API endpoint at **/ping**, which internally invokes another service to produce a response.

## How to Run the Application
Before running the application, please ensure that you have Java 17 and Maven installed on your system. Follow these steps to run the application:

1. Clone the repository or download it to your local machine.

2. Navigate to the project's root directory.

3. Build the application by running the following command:

```bash
mvn clean install
```

4. Start the main application by running the following command in the application directory:

```bash
cd application
mvn spring-boot:run
```

Run the following command to start the ping-service application:

```bash
cd ping-service
mvn spring-boot:run
```

To access the public endpoint, open your browser and go to http://localhost:8080/ping.


## API Documentation
The API documentation for each application is available via Swagger UI. To access the Swagger UI, go to http://localhost:8080/swagger-ui.html.


## How to Run the Tests
To run the tests for the application, please follow these steps:

Navigate to the project's root directory.

Run the following command to execute the tests:

```bash
mvn test
```
