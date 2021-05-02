FROM openjdk:8
COPY target/JavConcepts-0.0.1-SNAPSHOT-spring-boot.jar JavConcepts-0.0.1-SNAPSHOT-spring-boot.jar
ENTRYPOINT ["java","-jar","JavConcepts-0.0.1-SNAPSHOT-spring-boot.jar"] 
