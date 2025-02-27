FROM openjdk:17
EXPOSE 8081
ADD target/JobSAE6-0.0.1-SNAPSHOT.jar job.jar
ENTRYPOINT ["java", "-jar","job.jar"]