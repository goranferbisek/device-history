./gradlew clean assemble
docker build -t device-history:v1 -f docker/wildfly/Dockerfile .
docker run -d --rm -p 8080:8080 -p 9990:9990 device-history:v1