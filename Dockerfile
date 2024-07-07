FROM openjdk:17
COPY build/libs/producer.jar producer.jar
EXPOSE 8082:8082
CMD [ "java","-jar","/producer.jar" ]