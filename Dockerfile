FROM java:8
LABEL maintainer="hendisantika@gmail.com"
VOLUME /tmp
EXPOSE 8080
ADD target/spring-thymeleaf-sample-0.0.1-SNAPSHOT.jar spring-thymeleaf-sample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","spring-thymeleaf-sample-0.0.1-SNAPSHOT.jar"]