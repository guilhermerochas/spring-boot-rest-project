# Spring Boot REST API project

## 🏃‍♂️ How to run

First you have to build the image from the dockerfile

```bash
  docker build -t <your_name>/<pg_image_name>:1.0 -f ./docker/postgres.DOCKERFILE
```

Once the image is built, you can run the container with

```bash
  docker run --detach --name <container_name> -p 5432:5432 <your_name>/<pg_image_name>:1.0
```

Now that you have the container up and running you can use the following commands to start the spring application:
```bash
  cd demo-restapi/
  gradle clean build # Or ./gradlew clean build
```
 You will get a folder called build/ inside this folder you will get the executable JAR by:
 
 ```bash
  cd ./build/libs
  java -jar demo-restapi*.jar
 ```
 
 There you go now you will be able to access http://localhost:8080/person/ and get a json array of dummy data 💜
