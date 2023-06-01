# Start with a base image containing Java runtime
FROM java:11-jdk-alpine
# Add a volume pointing to /tmp
VOLUME /tmp
# The application's jar file
ARG JAR_FILE
# Add the application's jar to the container
ADD ${JAR_FILE} app.jar
# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
