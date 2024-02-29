package com.ilrick.springstudy.data;

import org.springframework.data.annotation.Id;

public class ToDo {
    @Id
    private String id;
    private String title;
    private boolean completed;

    public ToDo(String title, boolean completed) {
        this.title = title;
        this.completed = completed;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }
}
