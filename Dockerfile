FROM openjdk:8-jre-alpine
LABEL MAINTAINER="Woohyeok Choi <woohyeok.choi@kaist.ac.kr>"

RUN mkdir -p /home/app
COPY ./aif-demo-server.jar /home/aif-demo-server.jar

ENV CALLBACK_URL ""
ENV CREDENTIAL_PATH ""
ENV GRPC_PORT 500051

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
--callback=${CALLBACK_URL} \
--credential_path=${CREDENTIAL_PATH} \
--grpc_port=${GRPC_PORT}"]