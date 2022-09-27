
# Run Tomcat with Docker



## Build docker image

-- cd path docker image;
-- docker build -t tomcatDemo .;

## Pull tomcat 

-- docker pull tomcat:latest

## Run container 

-- docker run --name tomcat -d -p 8087:8080  -v /tmp/tomcat-users.xml:/usr/local/tomcat/conf/tomcat-users.xml   -v /tmp/context.xml:/tmp/context.xml   tomcat /bin/bash -c "mv /usr/local/tomcat/webapps /usr/local/tomcat/webapps2; mv /usr/local/tomcat/webapps.dist /usr/local/tomcat/webapps; cp /tmp/context.xml /usr/local/tomcat/webapps/manager/META-INF/context.xml; cp /tmp/tomcat-users.xml /usr/local/tomcat/conf/tomcat-users.xml;  catalina.sh run";

