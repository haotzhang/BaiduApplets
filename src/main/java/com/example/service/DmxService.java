package com.example.service;

import java.util.List;

public interface DmxService {

    String getQuestion(Integer id);

    List<String> getAllQuestions(Integer level);
}
