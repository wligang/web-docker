FROM openjdk:8-jdk-alpine
VOLUME /root/tmp
ARG ${JAR_FILE}
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom"," jar","app.jar"]