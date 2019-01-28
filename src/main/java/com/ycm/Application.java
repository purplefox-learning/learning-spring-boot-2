package com.ycm;

import com.ycm.course.Course;
import com.ycm.topic.Topic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        //a tomcat server will be listening on port 8080

        //by the way,
        //to send a http post/put, use postman
        //in Headers, set Content-Type=application/json
        //in Body, change type to raw, and paste a json string in the textbox

        //Topics
        //GET       /topics         Get all topics
        //GET       /topics/id      Get the topic
        //POST      /topics         Create new topic
        //PUT       /topics/id      Updates the topic
        //DELETE    /topics/id      Deletes the topic

        //Courses
        //GET       /topics/java/courses            get all courses under topic java
        //GET       /topics/java/courses/java001    get the course under topic java
        //POST      /topics/java/courses            add a new course under topic java
        //PUT       /topics/java/courses/java001    update the course under topic java
        //DELETE    /topics/java/courses/java001    delete the course under topic java

        SpringApplication.run(Application.class,args);
    }
}
