FROM openjdk:8-jdk-alpine
EXPOSE 8080
ADD target/spring-boot-ci-travis.jar spring-boot-ci-travis.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -Dspring.profiles.active=default -jar /spring-boot-ci-travis.jar" ]