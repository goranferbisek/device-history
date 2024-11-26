# Running the app in docker

To build the Docker image, execute the following commands from the directory where this file resides.

```
./gradlew clean assemble
docker build -t device-history:v1 .
```

You can then run the Docker image by executing:

```
docker run -it --rm -p 8080:8080 device-history:v1
```

Once the runtime starts, you can access the project at [http://localhost:8080/device-history](http://localhost:8080/device-history).
