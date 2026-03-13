# Use Java 17 base image
FROM eclipse-temurin:21-jdk

# Set working directory
WORKDIR /app

# Copy jar file from target folder
COPY target/*.jar app.jar

# Expose port
EXPOSE 8080

# Run Spring Boot application
ENTRYPOINT ["java","-jar","app.jar"]