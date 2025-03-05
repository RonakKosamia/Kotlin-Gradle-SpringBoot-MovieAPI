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

### **📍 Usefull maven commands**  
```sh
mvn clean install
mvn clean package
mvn compile
mvn dependency:tree
mvn spring-boot:run

Manually running maven : 
mvn exec:java -Dexec.mainClass="com.example.exampleapi.ExampleMainApiApplication"
mvn spring-boot:run -Dspring-boot.run.mainClass=com.api.movies_api.MoviesApiApplicationKt


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

---

## **Issues you might run into with standard Spring Initializer project(s) : **

1. You can use a local MongoDB instance instead of MongoDB Atlas. To do this, 

update your application.properties: ```sh spring.data.mongodb.uri=mongodb://localhost:27017/moviesDB ```
verify connection with mongoDb :```sh mongosh "mongodb://localhost:27017/moviesDB" ```

2.  Maven Wrapper not recognized. 

If ./mvnw is missing, your project might not be properly initialized.
run:
```sh 
mvn -N io.takari:maven:wrapper 
chmod +x mvnw
```
3. if mvn command is missing , Fixing mvn: command not found
```sh 
brew install maven
mvn -version
echo 'export PATH="/usr/local/bin:$PATH"' >> ~/.zshrc
source ~/.zshrc
```
4. sometimes spring initilizer doesnt provide pom.xml too. so you will need add it manually and modify it according to your app. 
And make sure you have declared your main class in pom.xml
```sh 
        <configuration>
                <mainClass>com.example.exampleapi.ExampleMainApiApplication</mainClass>
OR if using Kotlin : 
                <mainClass>com.api.movies_api.MoviesApiApplicationKt</mainClass>
       </configuration>

```

5. Port Conflict
```sh 
lsof -i :8080
kill -9 <PID>
```


