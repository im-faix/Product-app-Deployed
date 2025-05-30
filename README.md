
# 🛍️ Product Management Web App

This is a simple full-stack CRUD (Create, Read, Update, Delete) application for managing product inventory. It uses a **Spring Boot** REST API for the backend and a **Bootstrap + JavaScript** frontend.

---

## 🔧 Tech Stack

- **Frontend**: HTML, CSS, JavaScript, Bootstrap
- **Backend**: Spring Boot (Java)
- **Database**: Postgresql (configurable)
- **API Communication**: JSON (Fetch API)

---

## 🚀 Features

- Add a new product
- Edit existing product
- Delete product
- View list of all products
- Auto-refresh table after each operation

---

## 📁 Project Structure

```
project-root/
│
├── backend/
│   ├── src/main/java/com/example/productapi/
│   │   ├── Product.java
│   │   ├── ProductController.java
│   │   └── ProductRepository.java
│   └── resources/application.properties
│
├── static/
│   ├── index.html
│   ├── script.js
│   └── style.css
│
└── README.md
```

---

## ⚙️ How to Run

### 🔙 Backend (Spring Boot)
1. Open the project in your IDE (IntelliJ, Eclipse, etc.)
2. Configure `application.properties`:
   ```properties
   spring.datasource.url=jdbc:h2:mem:testdb
   spring.h2.console.enabled=true
   spring.jpa.show-sql=true
   spring.jpa.hibernate.ddl-auto=update
   ```
3. Run the application (`ProductApplication.java`)
4. API will be available at: `http://localhost:8094/products`

### 🌐 Frontend
1. Open `index.html` from the frontend folder in your browser
2. Ensure the Spring Boot backend is running

---

## 📡 REST API Endpoints

| Method | Endpoint         | Description        |
|--------|------------------|--------------------|
| GET    | `/products`      | Retrieve all products   |
| POST   | `/products`      | Add a new product       |
| PUT    | `/products/{id}` | Update existing product |
| DELETE | `/products/{id}` | Delete a product        |

---

## 🖼️ UI Preview

> *(Add screenshot here if needed)*

---

## 🙏 Acknowledgements

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Bootstrap](https://getbootstrap.com/)
- [JavaScript Fetch API](https://developer.mozilla.org/en-US/docs/Web/API/Fetch_API)

---

## 📃 License

Licensed under the [MIT License](https://opensource.org/licenses/MIT)


