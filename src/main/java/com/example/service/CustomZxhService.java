package com.example.service;

import java.util.ArrayList;

public interface CustomZxhService {
    Integer addCustomQuestion(String username,String question);

    ArrayList<String> getAllCustomQuestion(String username);
}
