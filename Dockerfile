FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY target/simple-java-app-1.0.jar app.jar
#commit
CMD ["java", "-jar", "app.jar"]
