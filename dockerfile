FROM eclipse-temurin:17
COPY target/phone.jar phone.jar
CMD [ "java", "-jar", "phone.jar" ]