# JournalApp

A full-stack journal application built with Spring Boot on the backend and React for the frontend.

## Project overview

- Backend: Spring Boot 3.5.5, Java 21
- Frontend: React with `react-scripts`
- Data access: MongoDB and PostgreSQL dependencies are included

## Repository structure

- `pom.xml` - Maven configuration for the Spring Boot application
- `src/main/java` - Java backend source code
- `src/main/frontend` - React frontend application
- `src/main/resources` - Spring Boot application resources and configuration
- `src/test/java` - Java tests

## Prerequisites

- Java 21
- Maven
- Node.js and npm
- MongoDB and/or PostgreSQL if using database persistence

## Run locally

### 1. Start the frontend

```bash
cd src/main/frontend
npm install
npm start
```

The React app will run at `http://localhost:3000` by default.

### 2. Start the backend

From the project root:

```bash
./mvnw spring-boot:run
```

Or with Maven installed:

```bash
mvn spring-boot:run
```

The backend starts on `http://localhost:8080` by default.

## Build for production

### Frontend build

```bash
cd src/main/frontend
npm run build
```

### Backend build

From the project root:

```bash
./mvnw clean package
```

## Notes

- The backend includes support for both MongoDB and PostgreSQL via Spring Data.
- Update `src/main/resources/application.properties` with your database connection settings.

## License

This project does not include a license by default.
