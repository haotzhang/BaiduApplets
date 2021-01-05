package com.example.entity;

import org.springframework.stereotype.Repository;

@Repository
public class user {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "user{" +
                "username='" + username + '\'' +
                '}';
    }
}
