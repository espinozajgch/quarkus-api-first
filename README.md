# quarkus-api-first

> No Mergear ninguna rama con ***master***

## API First Implementation:
API First implementation is a methodology that emphasizes designing and developing APIs from the perspective of the API contract or specification

## Running the application in dev mode
You can run your application in dev mode that enables live coding using:
```shell script
./mvnw compile quarkus:dev
```

## Packaging and running the application
The application can be packaged using:
```shell script
./mvnw package
```

## Creating a native executable
You can create a native executable using:
```shell script
./mvnw package -Pnative
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using:
```shell script
./mvnw package -Pnative -Dquarkus.native.container-build=true
```
