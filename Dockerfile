FROM openjdk:8-alpine

ADD /target/boot-*-SNAPSHOT.jar /boot.jar
EXPOSE 8080

ENTRYPOINT ["java", "-Dfile.encoding=UTF-8", "-jar", "/boot.jar"]