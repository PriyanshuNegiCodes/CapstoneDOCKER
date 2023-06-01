FROM openjdk
WORKDIR usr/lib
ADD ./target/notification-0.0.1-SNAPSHOT.jar /usr/lib/notification-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","notification-0.0.1-SNAPSHOT.jar"]