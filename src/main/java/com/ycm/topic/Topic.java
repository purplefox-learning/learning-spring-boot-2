package com.ycm.topic;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Data get lombok generate common methods
//@Entity get JPA generate all ORM-related classes

@Data
@Entity
public class Topic {

    @Id
    private String id;

    private String name;
    private String description;

    public Topic() {}

    public Topic(String id, String name, String desc) {
        super();
        this.id = id;
        this.name = name;
        this.description = desc;
    }
}
