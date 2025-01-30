FROM eclipse-temurin:11-jre-alpine
ARG PROFILE dev
ENV SPRING_PROFILES_ACTIVE $PROFILE
ADD ./application/target/fx-external-exec.jar /usr/app/fxservice/fx-external/jar/fx-external.jar
ADD ./application/target/classes/application-$PROFILE.yml /usr/app/fxservice/fx-external/config/application-$PROFILE.yml
ENTRYPOINT ["java", "-Xms256M", "-Xmx2048M", "-jar", "/usr/app/fxservice/fx-external/jar/fx-external.jar"]
