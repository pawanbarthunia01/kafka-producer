FROM openjdk:17
COPY build/libs/producer.jar producer.jar
EXPOSE 8083
CMD [ "java","-jar","/producer.jar" ]