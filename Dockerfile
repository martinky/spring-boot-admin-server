FROM gradle:7.4.2-jdk11-alpine AS build

WORKDIR /home/gradle/project

COPY build.gradle.kts settings.gradle.kts /home/gradle/project/
RUN gradle dependencies --no-daemon --console=plain

COPY . /home/gradle/project
RUN gradle bootJar --no-daemon --console=plain

FROM openjdk:11-jre-slim

WORKDIR /app
COPY --from=build /home/gradle/project/build/libs/*.jar spring-boot-admin-server.jar

ENTRYPOINT java -jar spring-boot-admin-server.jar
