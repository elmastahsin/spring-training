#Base image it has to be in any dockerfile
FROM openjdk:17-jdk
#will get jar file and copy it to docker image
COPY ./target/spring-25-Docker-0.0.1-SNAPSHOT.jar /usr/app/
#to direct to the folder
WORKDIR /usr/app
#will provide executable application when we run the container
ENTRYPOINT ["java","-jar","spring-25-0.0.1-SNAPSHOT.jar"]


