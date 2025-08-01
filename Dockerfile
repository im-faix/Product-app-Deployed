FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests -X

FROM eclipse-temurin:21-jdk
WORKDIR /execute
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8094
ENTRYPOINT [ "java", "-jar", "app.jar" ]

# this is only for java not postgresql
