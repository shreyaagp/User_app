# UserApp

A simple Spring Boot application using MongoDB to manage users.  
You can **GET** all users and **POST** new users.

---

## **Tech Stack**

- Java 17  
- Spring Boot 3.5.5  
- MongoDB Atlas  
- Maven  
- Jakarta Validation  

---

## **Project Structure**

UserApp
├─ src/main/java/com.demoApi
│ ├─ Controllers
│ ├─ Models
│ ├─ Repositories
│ └─ Services
├─ src/main/resources/application.properties
├─ pom.xml
└─ README.md

yaml
Copy code

---

## **Setup**

1. Clone the repo:

```bash
git clone <your-repo-url>
cd UserApp
Configure MongoDB Atlas:

Create a cluster & database named my.

Create a user (e.g., my_user) and password.

Whitelist your IP (0.0.0.0/0 for testing).

Update application.properties:

properties
Copy code
spring.application.name=UserApp
server.port=8081
spring.data.mongodb.uri=mongodb+srv://my_user:YOUR_PASSWORD@cluster0.7lbqodx.mongodb.net/my?retryWrites=true&w=majority
Run the App
bash
Copy code
mvn spring-boot:run
Check logs:

scss
Copy code
Tomcat started on port(s): 8081
Started UserApp
API Endpoints
GET All Users
URL: http://localhost:8081/user

Method: GET

Example Response:

json
Copy code
[
  {
    "userId": "65123abc",
    "userName": "Shreya",
    "mobileNum": "9876543210",
    "userEmail": "shreya@example.com",
    "userPassword": "Pass@1234"
  }
]
Postman Screenshot Placeholder:
![GET Users Screenshot](images/get_users.png)

POST Add User
URL: http://localhost:8081/user

Method: POST

Headers: Content-Type: application/json

Body Example:

json
Copy code
{
  "userName": "Shreya",
  "mobileNum": "9876543210",
  "userEmail": "shreya@example.com",
  "userPassword": "Pass@1234"
}
Response:

sql
Copy code
User added successfully with ID: 65123abc
Postman Screenshot Placeholder:
![POST User Screenshot](images/post_user.png)

Validation Rules
userName: ≥ 3 characters

mobileNum: 10 digits, starts with 6-9

userEmail: Valid email format

userPassword: ≥ 8 chars, 1 uppercase, 1 lowercase, 1 digit, 1 special char

Notes
Make sure the port in application.properties is free.

If Connection refused occurs, verify MongoDB URI and password.

Use Postman to test endpoints easily.


