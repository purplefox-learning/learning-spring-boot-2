package com.ycm.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course,String> {

    //the following standard methods come with CrudRepository in Spring JPA:
    //findAll, findById, existsById, save, saveAll, delete, deleteAll, deleteById

    //in our case,
    //the class type of the object is Course
    //the class type of the id of the object is String
    //therefore we declare it as CrudRepository<Course,String>

    //one additional custom query at the course level: find a course by a topic
    public List<Course> findByTopicId(String topicId);
    public List<Course> findByDescription(String desc);

    //note that for Spring Data JPA to automatically generate the query for us
    //we need to follow certain naming convention
    //e.g. to find by topic id
    //findByName - JPA will know we want to search by property 'name'
    //findByObjProperty - JPA know we want to search by Object's Property
}
