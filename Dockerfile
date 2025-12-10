FROM gradle:latest

WORKDIR app/

COPY . .

RUN ./gradlew clean build

#CMD ["gradle", "run"]
CMD ["java", "-jar", "app/build/libs/app.jar"]
