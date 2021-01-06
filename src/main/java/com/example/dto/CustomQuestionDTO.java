package com.example.dto;

public class CustomQuestionDTO {
    private String username;

    private String question;

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
        return "CustomQuestionDTO{" +
                "username='" + username + '\'' +
                ", question='" + question + '\'' +
                '}';
    }
}
