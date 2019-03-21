FROM openjdk:8-jre-alpine
LABEL MAINTAINER="Woohyeok Choi <woohyeok.choi@kaist.ac.kr>"

RUN mkdir -p /home/app
COPY ./aif-demo-server-1.0.0.jar /home/aif-demo-server.jar

ENV CALLBACK_URL ""
ENV CREDENTIAL_PATH ""

EXPOSE 8080 50051

CMD [ "sh", "-c", "/usr/lib/jvm/java-1.8-openjdk/jre/bin/java \
-server \
-XX:+UnlockExperimentalVMOptions \
-XX:+UseCGroupMemoryLimitForHeap \
-XX:InitialRAMFraction=2 \
-XX:MinRAMFraction=2 \
-XX:MaxRAMFraction=2 \
-XX:+UseG1GC \
-XX:MaxGCPauseMillis=100 \
-XX:+UseStringDeduplication \
-jar /home/aif-demo-server.jar \
--callback_url=${CALLBACK_URL} \
--credential_path=${CREDENTIAL_PATH}"]