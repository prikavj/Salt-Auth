# Salt Authentication Project

This is a simple user authentication project built using:

- **Java Spring Boot** for the backend
- **PostgreSQL** for the database
- **HTML/CSS/JavaScript** for the frontend
- **Docker** and **Docker Compose** for containerization

Users can register and log in, with credentials stored securely in a PostgreSQL database with salted password hashing.

## Prerequisites

Ensure that you have the following installed on your machine:

- **Docker**
- **Maven** (for building the backend JAR file)

## Running the Application

1. Clone the repository from GitHub and navigate into the project directory.

2. Build the backend JAR file using Maven. This can be done by navigating into the `backend` directory and running the appropriate Maven commands to clean and package the project.

3. Start the Docker containers using Docker Compose. This will build the backend, frontend, and PostgreSQL containers.

### This process will:

- Build and start the backend and frontend containers.
- Set up the PostgreSQL database inside a container.

## Access the Application

- The frontend will be accessible in your browser at `http://localhost`.
- The backend API will be running at `http://localhost:8080`.

## API Endpoints

- **Register**: `POST /auth/register`
  - Parameters: `username`, `password`
  - Registers a new user in the system.

- **Login**: `POST /auth/login`
  - Parameters: `username`, `password`
  - Authenticates a user with provided credentials.

## Technologies Used

- **Java** with **Spring Boot** for building the backend.
- **PostgreSQL** for storing user credentials securely.
- **HTML**, **CSS**, and **JavaScript** for the frontend interface.
- **Docker** to containerize the application.
- **Nginx** for serving the frontend and acting as a reverse proxy.
