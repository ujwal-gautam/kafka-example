FROM meisterplan/jdk-base:11
#EXPOSE 8081

ADD /target/kafka-producer-1.0.jar kafka-producer-1.0.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar", "kafka-producer-1.0.jar"]