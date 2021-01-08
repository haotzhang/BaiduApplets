package com.example.service;

import java.util.List;

public interface ZxhService {

    String getQuestion(Integer id);

    List<String> getAllQuestions(String username,Integer level);

}
