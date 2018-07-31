# SpringBoot


## SET

### JAVA
- JDK - 1.7~

- maven 


## Create Project

### create maven java project

	---

	mvn archetype:generate -DgroupId=com.bit.app -DartifactId=my-boot01 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false

	---


### pom.xml

1.  add parent

		<parent>

	    <groupId>org.springframework.boot</groupId>

	    <artifactId>spring-boot-starter-parent</artifactId>

	    <version>2.0.3.RELEASE</version>

	    </parent> 


2.  add dependency
       <dependency>
       <groupId>org.springframework.boot</groupId>

       <artifactId>spring-boot-starter-web</artifactId>

       </dependency>


### Coding

1. main

    ---

        public static void main(String[] args) {

		    SpringApplication.run(App.class, args);

	}

    ---

3. Controller

    ---

        @RestController

           public class MyController {

    
           @GetMapping("/")

               public String ping() {

                  return "Hello Boot";

               }

          }

    ---


## Run

### mvn spring-boot:run