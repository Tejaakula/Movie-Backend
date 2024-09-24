FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/movies-0.0.1-SNAPSHOT.jar Backend.jar
ENTRYPOINT ["java","-jar","/Backend.jar"]