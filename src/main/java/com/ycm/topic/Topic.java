package com.ycm.topic;

import lombok.Data;
import lombok.Getter;

@Data
@Getter
public class Topic {

    private String id;
    String name;
    String description;

    public Topic(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }
}
