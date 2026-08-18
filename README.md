# Food App - Maven CI/CD Project

Simple Spring Boot project prepared for GitHub + CI/CD + EC2 practice.

## APIs

- GET http://localhost:8080/api/health
- GET http://localhost:8080/api/foods

## Run without installing Maven locally

Docker is enough:

```bash
docker compose up --build -d
```

Then open:

http://localhost:8080/api/health

## GitHub

Create a GitHub repository and upload this project.

GitHub Actions automatically runs:

- checkout
- Java 17 setup
- Maven build
- tests

## EC2 deployment

On an Ubuntu EC2 instance install Docker, clone the GitHub repository, then:

```bash
docker compose up --build -d
```

The application will be available on port 8080.

For AWS security group, allow TCP 8080 only when you need direct browser access for practice.
