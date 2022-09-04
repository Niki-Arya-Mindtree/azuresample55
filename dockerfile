FROM maven:3.8.6-openjdk-18 as maven
COPY . .


COPY ./pom.xml ./pom.xml
COPY ./target/azuresample55-0.0.1-SNAPSHOT.jar ./app.jar
CMD java -jar app.jar