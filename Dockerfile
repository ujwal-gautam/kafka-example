From openjdk:11
#EXPOSE 8081
ADD /target/kafka-producer-1.0.jar kafka-producer-1.0.jar
ENTRYPOINT ["java","-jar", "kafka-producer-1.0.jar"]