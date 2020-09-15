FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 80
ARG JAR_FILE=target/*.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["sh", "-c","java -Djava.security.egd=file:/dev/./urandom ${JAVA_OPTS} -jar /app.jar"]