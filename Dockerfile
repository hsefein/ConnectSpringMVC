FROM openjdk:8
ADD target/Connect.jar Connect.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Connect.jar"]