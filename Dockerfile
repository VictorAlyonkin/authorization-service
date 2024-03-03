FROM openjdk:17-jdk-alpine
EXPOSE 8080
ADD target/authorization-service-0.0.1-SNAPSHOT.jar authorization.jar
#ENTRYPOINT ["java","-jar","authorization.jar"]