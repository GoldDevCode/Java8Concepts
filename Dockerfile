FROM openjdk:8
COPY target/JavaConcepts-0.0.1-SNAPSHOT-spring-boot.jar JavaConcepts-0.0.1-SNAPSHOT-spring-boot.jar
ENTRYPOINT ["java","-jar","JavaConcepts-0.0.1-SNAPSHOT-spring-boot.jar"] 
