 ## Grofers Backend Application
Description
This project is a comprehensive backend application for managing an online grocery store service like Grofers. It includes operations for managing Suppliers, Products, Categories, Users, and Orders. The application is built using Spring Boot and includes features for user authentication, role-based access control, and a recommendation system.

## Features
- Add new Suppliers, Products, Categories, Users, and Orders.
- Allow a User to place an Order.
- Allow a User to add Products to an Order.
- Update Order details (e.g., delivery date, number of products).
- Fetch a User's Order history.
- Recommend products to a user based on their order history.
- Role-based access control using JWT and Spring Security.
- Pagination and sorting for all GET APIs.
- Validation and exception handling with custom error messages.
## Technologies Used
- Java
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- Spring Data JPA
- Hibernate
- Swagger
## User Level APIs
- POST /users - Register a new user.
- POST /auth/login - Authenticate a user and return JWT.
- POST /orders/{userId} - Allow a user to place an order.
- PUT /orders/{orderId}/products - Allow a user to add products to an order.
- PUT /orders/{orderId} - Allow a user to update the order details.
- GET /users/{userId}/orders - Fetch a user's order history.
- GET /users/{userId}/recommended-products - Recommend products to a user based on their order history.
## Admin Level APIs
- POST /suppliers - Add new suppliers.
- POST /products/{supplierId} - Add new products for a particular supplier.
- POST /categories - Add new categories.
- POST /users/admin - Add new admin users.
- DELETE /orders/{orderId}/admin - Delete an order.
- GET /users/admin - Fetch all users.
- GET /products/admin - Fetch all products.
- GET /categories/admin - Fetch all categories.
## Security and Validation
- JWT Token Functionality: Generation and validation of JWT tokens Role-based access control with Spring Security
- Exception Handling: Custom exception classes (e.g., InvalidEmailException, NotFoundException) Return suitable error messages and HTTP status codes

## Pagination and Sorting
- For GET APIs that may return a large amount of data, pagination and sorting are implemented using query parameters to indicate the page number, page size, and sorting criteria. This improves user experience and efficiency.
