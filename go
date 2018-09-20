## set up golang developmant environment
RUN apt -y install golang-go &&\
    mkdir go
WORKDIR ./go
