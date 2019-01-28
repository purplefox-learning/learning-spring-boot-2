package com.ycm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        //a tomcat server will be listening on port 8080
        //try the following pages to test
        //http://localhost:8080/topics
        //http://localhost:8080/topics/java

        //to send a http post/put, use postman
        //in Headers, set Content-Type=application/json
        //in Body, change type to raw, and paste a json string in the textbox

        //Topics

        //GET       /topics         Get all topics
        //GET       /topics/id      Get the topic
        //POST      /topics         Create new topic
        //PUT       /topics/id      Updates the topic
        //DELETE    /topics/id      Deletes the topic


        SpringApplication.run(Application.class,args);
    }
}
