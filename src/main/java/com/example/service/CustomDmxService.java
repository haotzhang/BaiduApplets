package com.example.service;

import java.util.ArrayList;

public interface CustomDmxService {
    Integer addCustomQuestion(String username,String question);

    ArrayList<String> getAllCustomQuestion(String username);
}
