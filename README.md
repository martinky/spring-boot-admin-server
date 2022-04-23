# Minimal Spring Boot Admin Server

My minimal [Spring Boot Admin](https://github.com/codecentric/spring-boot-admin) server implementation.

## Build

```shell
docker build -t spring-boot-admin-server
```

## Usage

```shell
docker run -d -p 8080:8080 spring-boot-admin-server 
```

You can configure the application via a properties file mounted to `/app/config/application.properties` like so:

```shell
docker run -d -p 8080:8080 -v application.properties:/app/config/application.properties spring-boot-admin-server 
```
