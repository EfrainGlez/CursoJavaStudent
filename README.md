1. mvn dependency:resolve
2. mvn clean package
3. mvn test
4. docker build -f Dockerfile -t demo/maven:3.3-jdk-8 .
5. docker run -it --rm -v "$PWD":/app -w /app demo/maven:3.3-jdk-8 java -cp target/helloWorldMavenDockerized-1.0-SNAPSHOT.jar com.privalia.principal.Main
6. Command to delete an image:
docker rmi Image demo/maven:3.3
7. 


mvn clean package