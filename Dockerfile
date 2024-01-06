FROM eclipse-temurin:17
COPY target/newwebapp.jar newwebapp.jar
CMD ["java","-jar","newwebapp.jar"]