# Room Design Challenge

Thank you for your interest in joining our team!

This coding exercise is designed to assess your full-stack engineering skills, systems thinking, and your ability to build robust, scalable web applications. The core stack for this project includes a React frontend and a Java Spring Boot backend.

Please begin by forking this repository. Do not make changes directly to the original repository. All work should be done in your own fork.

---

## Prerequisites

Please ensure the following are installed and available in your terminal:

```

java -version       # should report “11.x”
mvn -version        # Apache Maven x.x.x
docker -v           # Docker version x.x.x
docker-compose -v   # docker-compose version x.x.x
node -v             # v16.x or v18.x
npm -v              # x.x.x

````

---

## Getting Started

### Backend

1. Build & run via Docker:
   ```bash
   docker-compose up --build
   ```

The API will be available at: [http://localhost:8080/api](http://localhost:8080/api)

### Frontend

1. In a separate terminal, navigate to the `frontend/` folder.
2. Install dependencies and start the app:

   ```bash
   npm install
   npm start
   ```

   The React app will be available at: [http://localhost:3000](http://localhost:3000)

---

## Candidate Tasks

1. **Implement Backend Logic**  
   Complete the `RoomService` to return furniture items that fit within a given room. Given a room and its dimensions, the service should calculate which furniture objects can fit inside — accounting for the space already occupied by any selected items (e.g. sofa, coffee table, side table).

2. **Build Frontend UX**
   Create an elegant user interface to display selected furniture in a room. Demonstrate best practices in React component design, state management, and styling.

3. **System Design Questions**
   Answer the system design questions in `design/system-design-template.md`.

---

## Submission

When you're finished, please submit a pull request to this repository with your name in the comment.
Thank you, and good luck!
