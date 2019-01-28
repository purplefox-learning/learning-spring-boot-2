package com.ycm.course;

import com.ycm.topic.Topic;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

//@Data get lombok generate common methods
//@Entity get JPA generate all ORM-related classes

@Data
@Entity
public class Course {

    @Id
    private String id;

    private String name;
    private String description;

    @ManyToOne
    private Topic topic;    //course:topic is m:1

    public Course() {}

    public Course(String id, String name, String desc, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = desc;
        this.topic = new Topic(topicId, "", "");
    }
}
