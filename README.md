# Room Design Challenge

Thank you for your interest in joining our team!

This coding exercise is designed to assess your full-stack engineering skills, systems thinking, and your ability to build robust, scalable web applications. The core stack of this project is: (1) React JS frontent, (2) Java Sprint Boot backend server, (3) Docker build tools.

## Prerequisites
- Java 11+
- Docker & Docker Compose
- Node.js & npm

### Verify:
```
java -version       # should report “11.x”
mvn -version        # Apache Maven x.x.x
docker -v           # Docker version x.x.x
docker-compose -v   # docker-compose version x.x.x
node -v             # v16.x or v18.x
npm -v              # x.x.x

```

## Getting Started

### Backend
1. Build & run via Docker:
   ```bash
   docker-compose up --build
   ```
   The API will be available at `http://localhost:8080/api`.

### Frontend
1. In a separate shell, navigate to `frontend/`.
2. Install & start:
   ```bash
   npm install
   npm start
   ```
   The React app will run on `http://localhost:3000`.

## Candidate Tasks
1. **Implement Backend Logic** – complete the `RoomService` to correctly determine if furniture can fit in a room (with rotation).
2. **Build Frontend** – create form inputs for room/furniture dimensions, call the backend endpoint, and display results. *Show your expertise in React and make something that looks nice here.*
3. **System Design Questions** – answer the system design questions in `design/system-design-template.md`.

## Submission
- Fork this repo and push your changes.
- Include any diagrams or SQL DDL you design.
- Update the README with setup notes or assumptions.
