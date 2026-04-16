FROM openjdk:8-jre-alpine
COPY target/java-app.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
