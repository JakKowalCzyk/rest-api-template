FROM fabric8/java-jboss-openjdk8-jdk

USER root

ENV AB_OFF true

ENV JAVA_APP_JAR app.jar

ADD target/*.jar /deployments/$JAVA_APP_JAR

