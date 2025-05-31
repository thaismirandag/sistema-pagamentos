FROM eclipse-temurin:17-jdk-alpine

WORKDIR /app

COPY . .

RUN ./mvnw clean package -DskipTests

CMD ["./mvnw", "spring-boot:run"]

