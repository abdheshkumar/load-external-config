# load-external-config
Provide external configuration file to docker based scala application

**Load default application.conf file:**

docker run -it sbt-docker-test:0.1

**Override default application.conf file:**

docker run -it -v "/home/abdhesh/Documents/Code/sbt-docker-test/src:/var" sbt-docker-test:0.1 -Dconfig.file=/var/a.conf

