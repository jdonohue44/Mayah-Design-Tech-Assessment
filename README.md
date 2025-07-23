# Room Design Challenge

**Purpose:** Assess candidate skills in React, full‑stack development with Java Spring Boot, systems thinking & scalability, and mentoring to production quality.

## Prerequisites
- Java 11+
- Docker & Docker Compose
- Node.js & npm

Verify:
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
2. **Build Frontend** – create form inputs for room/furniture dimensions, call the backend endpoint, and display results.
3. **Design Questions** – answer prompts in `design/system-design-template.md`.
4. **Testing & CI/CD** – describe your approach to testing and rolling out changes in a production pipeline.

## Submission
- Fork this repo and push your changes.
- Include any diagrams or SQL DDL you design.
- Update the README with setup notes or assumptions.
