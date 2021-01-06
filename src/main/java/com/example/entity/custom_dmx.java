package com.example.entity;

public class custom_dmx {
    private Integer id;

    private String username;

    private String question;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    @Override
    public String toString() {
        return "custom_dmx{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
