package com.ycm.topic;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {

    //the following standard methods come with CrudRepository in Spring JPA:
    //findAll, findById, existsById, save, saveAll, delete, deleteAll, deleteById

    //in our case,
    //the class type of the object is Topic
    //the class type of the id of the object is String
    //therefore we declare it as CrudRepository<Topic,String>
}
