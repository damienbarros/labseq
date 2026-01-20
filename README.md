# labseq
Labseq sequence algorithm REST Service with Quarkus Java Framework

To run the application on IntelliJ IDEA: 
- mvn quarkus:dev

then: localhost:8080/labseq/n, where n can be, for example, number 10. 
So localhost:8080/labseq/10 would return 3 as a result.

-----------------------

To run on a container, like Docker:

1. Build the application with mvn package
2. Open Docker Desktop
3. On terminal, run 'docker build -f src/main/docker/Dockerfile.jvm -t labseq .' on the project folder to build the image
4. Still on the teminal, run 'docker run -p 8080:8080 labseq' to run the container, or run it with Docker Desktop
5. On a browser test it with 'localhost:8080/labseq/10'

------------------------

REST API Documentation on: 

http://localhost:8080/q/swagger-ui

<img width="1450" height="752" alt="image" src="https://github.com/user-attachments/assets/d869d252-3a3e-471c-b130-2a40b35a2197" />

------------------------

update: 
GUI Added -> http://localhost:8080/index.html

