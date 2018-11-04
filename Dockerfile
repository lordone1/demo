FROM openjdk:8

ENV TZ=Europe/Madrid
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

LABEL description="Demo application"

VOLUME /tmp
EXPOSE 8080
ADD /target/*-SNAPSHOT.jar app.jar
ADD /src/main/resources/* ./

RUN touch /app.jar

ENV JAVA_OPTS=""

ENTRYPOINT ["/bin/sh", "-c" , "exec java $JAVA_OPTS -jar /app.jar " ]
