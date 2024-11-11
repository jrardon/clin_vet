FROM openjdk:22-jdk-slim
ARG JAR_FILE=target/veterinaria-0.0.1.jar
COPY ${JAR_FILE} app_veterinaria.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","app_veterinaria.jar"]