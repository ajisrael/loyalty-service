# Base image
FROM openjdk:17-jdk-alpine

# Set the working directory
WORKDIR /app

# Copy the jar file
COPY target/loyalty-command-api-0.0.1-SNAPSHOT.jar loyalty-command-api.jar

# Expose a random port (in practice, you'd want to explicitly assign a port range or specific ports for multiple instances)
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "loyalty-command-api.jar", "--spring.profiles.active=docker"]
