# use of official java runtime as the base image 
FROM openjdk:17-jdk-alpine

# set the working directory inside the container
WORKDIR /app

#Copy the jar file from target folder to working directory
COPY target/spring-ai-deepseek-0.0.1-SNAPSHOT.jar spring-ai-deepseek-0.0.1-SNAPSHOT.jar

# Expose your port application run on
EXPOSE 8081

# Specify the command to run the application
ENTRYPOINT ["java", "-jar", "spring-ai-deepseek-0.0.1-SNAPSHOT.jar"] 