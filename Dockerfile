FROM openjdk:8
EXPOSE 8086
ADD target/test.filename1.jar test.filename1.jar
ENTRYPOINT ["java","-jar","/test.filename1.jar"]