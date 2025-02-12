
# 📝 To-Do Application (Spring Boot + Bootstrap)

A simple To-Do List application built using **Spring Boot (Backend)** and **Thymeleaf + Bootstrap (Frontend)**. This project allows users to **add, update, and delete tasks** dynamically.

---

## 📌 Features
✅ Add tasks with a title  
✅ Update tasks (Toggle strikethrough for completion)  
✅ Delete tasks (Removes from both **database** and **UI** instantly using AJAX)  
✅ Responsive UI with Bootstrap  

---

## 🚀 Technologies Used
- **Backend**: Spring Boot, Spring MVC, Thymeleaf, MySQL  
- **Frontend**: Bootstrap 5, HTML, JavaScript (AJAX)  
- **Database**: MySQL  

---

## ⚙️ Installation & Setup

### 1️⃣ Clone the Repository
```bash
git clone https://github.com/yourusername/todo-app.git](https://github.com/coderdostarjun/To-Do-Application.git
cd todo-app
```

### 2️⃣ Configure MySQL Database
Create a database in MySQL:
```sql
CREATE DATABASE todo_db;
```
Then update `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Build & Run the Project
Use **Maven** to build and start the Spring Boot application:
```bash
mvn spring-boot:run
```
or if using an IDE, run the `TodoApplication.java` file.

---

## 🔗 API Endpoints

| HTTP Method | Endpoint             | Description         |
|------------|---------------------|---------------------|
| `POST`    | `/api/v1/task/create`  | Create a new task  |
| `POST`    | `/api/v1/task/update`  | Update a task      |
| `DELETE`  | `/api/v1/task/delete`  | Delete a task      |
| `GET`     | `/api/v1/task/get`     | Get a single task  |
| `GET`     | `/api/v1/task/tasks`   | Get all tasks      |

---

## 📜 Folder Structure
```
todo-app/
│── src/main/java/com/app/todoapp
│   ├── controller/   # Handles HTTP requests
│   ├── dto/          # Data Transfer Objects
│   ├── entity/       # Task Entity (Database)
│   ├── repository/   # JPA Repository
│   ├── service/      # Business Logic
│── src/main/resources/templates
│   ├── tasks.html    # Frontend UI (Thymeleaf)
│── src/main/resources/application.properties
│── pom.xml           # Maven dependencies
│── README.md         # Project Documentation
```

---

## 📢 How to Contribute
1. **Fork** the repository  
2. Create a **new branch**:  
   ```bash
   git checkout -b feature-branch
   ```
3. **Make your changes & commit**:  
   ```bash
   git commit -m "Added new feature"
   ```
4. **Push to GitHub** and create a **Pull Request**  

---

## 🎯 Future Improvements
🚀 Add **User Authentication**  
🚀 Store tasks **per user**  
🚀 Add **Due Dates & Priorities**  
🚀 Deploy to **AWS / Heroku**  

---

## 💡 Credits
Developed by **[Arjun Khanal](https://github.com/coderdostarjun)**  

---

## 📜 License
This project is licensed under the **MIT License**.
```

---

### **Key Highlights in This README:**
✅ **Clear instructions** to set up and run the project  
✅ **API endpoint table** for quick reference  
✅ **Folder structure overview**  
✅ **How to contribute** for open-source contributions  
✅ **Future improvements** for project expansion  

              
