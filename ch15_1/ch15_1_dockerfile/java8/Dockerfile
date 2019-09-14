FROM registry.cn-shanghai.aliyuncs.com/weishiyao/alpine-3.10:glibc-2.30-r0
MAINTAINER inwsy@hotmail.com
ADD server-jre-8u221-linux-x64.tar.gz /tmp/
RUN chmod +x /tmp/jdk1.8.0_221
ENV JAVA_HOME=/tmp/jdk1.8.0_221
ENV PATH="$JAVA_HOME/bin:${PATH}"