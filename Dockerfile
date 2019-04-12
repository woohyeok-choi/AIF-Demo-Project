FROM openjdk:8-jre-alpine
LABEL MAINTAINER="Woohyeok Choi <woohyeok.choi@kaist.ac.kr>"

RUN mkdir -p /home/app/token
COPY ./aif-demo-server-1.0.2.jar /home/app/aif-demo-server.jar

ENV CALLBACK_URL ""
ENV CREDENTIAL_PATH ""
ENV TOKEN_PATH "/home/app/token"

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
-jar /home/app/aif-demo-server.jar \
--token_path=${TOKEN_PATH} \
--callback_url=${CALLBACK_URL} \
--credential_path=${CREDENTIAL_PATH}"]