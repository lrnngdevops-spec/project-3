FROM eclipse-temurin:17-jdk

WORKDIR /usr/app

COPY target/products_api.jar products_api.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","products_api.jar"]


