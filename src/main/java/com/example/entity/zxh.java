package com.example.entity;

import org.springframework.stereotype.Repository;

@Repository
public class zxh {

    private Integer id;

    private String question;

    private Integer level;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "zxh{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", level=" + level +
                '}';
    }
}
