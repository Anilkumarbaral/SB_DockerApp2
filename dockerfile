FROM openjdk:17
MAINTAINER Anil
COPY target/anilapp /usr/app/
WORKDIR /usr/app/
ENTRYPOINT [ "java","-jar","anilapp.jar" ]