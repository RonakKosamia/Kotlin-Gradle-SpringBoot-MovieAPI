# 🎬 Kotlin-Gradle-SpringBoot-MovieAPI 🚀  

A **RESTful Movie API** built using **Kotlin, Spring Boot, Gradle, and MongoDB**.  
This project follows **MVVM + Clean Architecture**, leveraging **Coroutines & Flows** for modern backend development.  

## 📌 Features  
✅ Fetch movies from a **MongoDB database**  
✅ Built with **Spring Boot + Kotlin** for scalability  
✅ Uses **Gradle** for dependency management  
✅ Implements **REST API** following best practices  
✅ Supports **CRUD operations**  
✅ Secure and lightweight  

## 🛠️ Tech Stack  
- **Kotlin** 🟡  
- **Spring Boot** 🌱  
- **Gradle** ⚙️  
- **MongoDB** 🍃  
- **REST API** 📡  
- **Coroutines & Flows** 🔄  

## 🚀 Getting Started  

### 1️⃣ Clone the Repository  
```sh
git clone https://github.com/YOUR_USERNAME/Kotlin-Gradle-SpringBoot-MovieAPI.git
cd Kotlin-Gradle-SpringBoot-MovieAPI
```

### **📌 Running & Testing the API**  

## **2️⃣ Run the Application**  
Ensure **MongoDB** is running locally:  

```sh
brew services start mongodb-community@6.0
```

Then, start the Spring Boot server:  

```sh
./gradlew bootRun
```

---

## **3️⃣ Test the API**  

### **📍 Fetch Movies**  
```sh
curl -X GET http://localhost:8080/movies
```

### **📍 Add a Movie**  
```sh
curl -X POST http://localhost:8080/movies \
     -H "Content-Type: application/json" \
     -d '{"title": "The Dark Knight", "rating": 9.1, "releaseYear": 2008}'
```

---

## **🎯 Roadmap**  
🔹 Add **Unit Tests** with JUnit & Mockito  
🔹 Integrate **Docker for containerization**  
🔹 Deploy API to **AWS/GCP/Render**  

---

## **🤝 Contributing**  
Feel free to **fork** this repo, open issues, and submit PRs!  

---

## **📜 License**  
This project is **open-source** and available under the **MIT License**.  
```
