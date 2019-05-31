FROM openjdk:8-jdk-alpine
VOLUME /root/tmp
ARG avatar-web-docker-1.0.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]