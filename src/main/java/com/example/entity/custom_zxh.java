package com.example.entity;

public class custom_zxh {
    private Integer id;

    private  String question;

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

    @Override
    public String toString() {
        return "custom_zxh{" +
                "id=" + id +
                ", question='" + question + '\'' +
                '}';
    }
}
