# AlpineLinux open jre 9
FROM alpine:latest
MAINTAINER inwsy@hotmail.com
# Install cURL
RUN echo -e "https://mirror.tuna.tsinghua.edu.cn/alpine/v3.10/main\n\
https://mirror.tuna.tsinghua.edu.cn/alpine/v3.10/community" > /etc/apk/repositories

RUN apk --update add curl bash openjdk9-jre && \
      rm -rf /var/cache/apk/*

# Set environment
ENV JAVA_HOME /usr/lib/jvm/default-jvm
ENV PATH ${PATH}:${JAVA_HOME}/bin