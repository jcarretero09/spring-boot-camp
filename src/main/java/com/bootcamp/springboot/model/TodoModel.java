package com.bootcamp.springboot.model;

import com.sun.istack.internal.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TodoModel {

    private long id;
    @NotNull
    private String title;
    private String description;
    private boolean done;


    public TodoModel() {
    }

    public TodoModel(long id, String title, String description, boolean done) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.done = done;
    }

    @Id
    @GeneratedValue
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
