## set up Scala development environment
RUN mkdir scala
WORKDIR ./scala

# install JDK and JRE
RUN apt install -y openjdk-8-jre openjdk-8-jdk

# install sbt
RUN echo "deb https://dl.bintray.com/sbt/debian /" | tee -a /etc/apt/sources.list.d/sbt.list &&\
    apt-key adv --keyserver hkp://keyserver.ubuntu.com:80 --recv 2EE0EA64E40A89B84B2DF73499E82A75642AC823 &&\
    apt update &&\
    apt install sbt

