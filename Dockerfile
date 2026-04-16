FROM eclipse-temurin:17
COPY target/java-inheritance-app-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
