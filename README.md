# 🛒 Product Management Application (Spring Boot + PostgreSQL + Docker)

A **full-stack 3-tier product management system** built with Spring Boot, PostgreSQL, and Docker. Designed using best DevOps practices — containerized, environment-driven, and cloud-deployable. Ideal for showcasing practical DevOps, CI/CD, and backend development skills.

---

## 📸 Architecture Overview

```
+--------------------+         +------------------------+        +--------------------+
|    Frontend (UI)   |  <-->   |  Backend (Spring Boot) | <-->   |  PostgreSQL (DB)   |
|   HTML/CSS/JS      |         | REST APIs + JPA/Hibernate       |   Product Data     |
|   (Static Site)    |         | Business Logic         |        |                    |
+--------------------+         +------------------------+        +--------------------+

         
```

---

## 🚀 Features

- CRUD operations on `Product` entity
- PostgreSQL database integration
- RESTful APIs with Spring Boot
- Containerized using Docker (multistage build)


---

## 🛠️ Technologies Used

- **Backend:** Spring Boot 3.5, Java 21
- **Database:** PostgreSQL
- **Build Tool:** Maven
- **Containerization:** Docker
- **Frontend:** HTML, CSS, JavaScript (Vanilla)
- **Version Control:** Git, GitHub

---

## ⚙️ Setup Instructions (Docker Compose)

### 1. Clone the Repository

```bash
git clone https://github.com/im-faix/Product-app-Deployed.git
cd Product-app-Deployed
```



### 2. Run Docker Compose

```bash
docker-compose up --build
```

- App will be running on: `http://localhost:8094`
- PostgreSQL DB exposed at: `localhost:5432`

---

## 🧪 API Endpoints

| Method | Endpoint            | Description            |
|--------|---------------------|------------------------|
| GET    | `/products`         | List all products      |
| POST   | `/products`         | Create new product     |
| PUT    | `/products/{id}`    | Update product by ID   |
| DELETE | `/products/{id}`    | Delete product by ID   |

---

## 📈 DevOps Highlights for Resume & LinkedIn

✅ Dockerized Spring Boot microservice  
✅ PostgreSQL as containerized service  
✅ Multi-stage Dockerfile build optimization  
✅ Ready for CI/CD with Jenkins/GitHub Actions  
✅ GitHub project with README + Architecture diagram  
✅ REST API development and testing with `curl`/Postman  

---

## 📦 Folder Structure

```
.
├── Dockerfile
├── docker-compose.yml
├── src/
│   └── main/java/... (Spring Boot App)
├── static/ (Frontend)
├── .env
└── README.md
```

---

## 💼 Author

**Mohammed Faizan**  
DevOps Engineer & Backend Developer  
🔗 [LinkedIn](https://www.linkedin.com/in/faizan9)  
🌐 [GitHub](https://github.com/im-faix)

---



## 📌 License

This project is open-source and free to use for educational and professional purposes.
