FROM openjdk:17
EXPOSE 8080
ADD target/docker-images-using-jenkins.jar docker-images-using-jenkins.jar
ENTRYPOINT ["java", "-jar", "docker-images-using-jenkins.jar"]