./gradlew clean assemble
docker build -t device-history:v1 .
docker run -it --rm -p 8080:8080 -p 9990:9990 device-history:v1