# wildfly-example
## a short example of creating a ear including a war and ejb

## Create Test Jboss
docker build --tag=jboss/wildfly-admin .

docker run -p 8080:8080 -p 9990:9990 --name jboss -d jboss/wildfly-admin

## Build and Deploy
mvn clean install 
cd module-ear
mvn wildfly:deploy  

## Browser
http://localhost:8080/rest/test

