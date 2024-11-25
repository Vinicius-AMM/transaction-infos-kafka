FROM maven:3.9.9-eclipse-temurin-21-alpine AS build
COPY . .
RUN mvn package -DskipTests

FROM eclipse-temurin:21-alpine
COPY --from=build target/ConsumerKafka.jar app.jar
EXPOSE 8082
CMD ["java", "-jar", "app.jar"]