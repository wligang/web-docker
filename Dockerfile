FROM openjdk:8-jdk-alpine
VOLUME /root/tmp
ADD avatar-web-docker-1.0.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]