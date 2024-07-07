FROM openjdk:17
ADD build\libs\producer-kafka.jar producer-kafka.jar
EXPOSE 8082:8082
CMD [ "java","-jar","/producer-kafka.jar" ]