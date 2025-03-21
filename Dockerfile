# Use the official OpenJDK 21 base image from Docker Hub
FROM openjdk:21-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy your Java application (assuming the JAR file is named app.jar) into the container
COPY target/course-service.jar /app/course-service.jar

# Expose the port the app will run on
EXPOSE 8080

# Command to run the Java application
ENTRYPOINT ["java", "-jar", "course-service.jar"]
