# Spring Boot Weather API Application
This application is a Spring Boot server that integrates with the Weather API from RapidAPI. It exposes RESTful APIs to retrieve the weather forecast summary and hourly forecast details of any city. The API requests are secured with a header-based authentication mechanism that uses a randomly generated client ID and client secret.


# How to Run
To run the application, you need to follow the below steps:
•	Clone the repository to your local machine.
•	Set the RapidAPI credentials in the application.properties file.
•	Open a command prompt or terminal in the project directory and run the command mvn spring-boot:run. This will start the server on port 8080.

# APIs
The following APIs are exposed by the server:
Authentication: The APIs require header-based authentication with a randomly generated client ID and client secret. The client ID and secret can be generated by the client and passed in the headers of each request. The server validates the credentials for each API request and returns an error if the credentials are invalid.
* Get Forecast Summary: This API returns the weather forecast summary of a city. The API can be accessed using the following URL:
 ![image](https://user-images.githubusercontent.com/37036765/227759249-d489d4f2-b036-4cb5-8377-a2e32591df56.png)

The response is a JSON object that contains the following fields:
 ![image](https://user-images.githubusercontent.com/37036765/227759254-3fbbb88a-f36d-4b79-aa9f-e629ff1ed825.png)


* Get Hourly Forecast:This API returns the hourly weather forecast details of a city. The API can be accessed using the following URL:
 ![image](https://user-images.githubusercontent.com/37036765/227759264-375b72c4-5805-4ed3-853c-b0a957dafb3e.png)

The response is a JSON object that contains the following fields: 
![image](https://user-images.githubusercontent.com/37036765/227759272-9e23b077-d706-47ed-9970-77e0a6935236.png)

# Conclusion
This application demonstrates how to integrate the Weather API from RapidAPI with a SpringBoot server and expose RESTful APIs to retrieve weather forecast details. The server also implements a simple header-based authentication mechanism for API security.
