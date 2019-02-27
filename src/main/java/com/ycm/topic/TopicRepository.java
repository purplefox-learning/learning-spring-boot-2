package com.ycm.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

    //Repository is a key concept in spring-data

    //to learn more on Spring-Data-JPA or other Spring-Data-Xxx libraries,
    //see project learning-spring-boot-mvc-and-jpa for references
}
