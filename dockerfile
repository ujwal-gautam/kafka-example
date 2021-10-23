From openjdk:11
EXPOSE 8081
ADD /target/kafka-producer-0.0.1-SNAPSHOT.jar kafka-producer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "kafka-producer-0.0.1-SNAPSHOT.jar"]