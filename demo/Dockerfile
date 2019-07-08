FROM openjdk:8
MAINTAINER Pankaj Semwal <pnkjsmwl09@gmail.com>
ADD target/jenkins-test.jar jenkins-test.jar
EXPOSE 9095
ENTRYPOINT ["java", "-jar", "jenkins-test.jar"]