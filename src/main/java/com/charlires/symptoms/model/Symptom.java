package com.charlires.symptoms.model;

import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by carlos_andonaegui on 10/20/14.
 */
public class Symptom {

    @Id
    private String id;
    private String name;
    private Date time;
    private String level;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
