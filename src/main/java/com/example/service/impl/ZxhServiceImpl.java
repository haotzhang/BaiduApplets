package com.example.service.impl;
import com.example.mapper.CustomZxhMapper;
import com.example.mapper.ZxhMapper;
import com.example.service.ZxhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ZxhServiceImpl implements ZxhService {

    @Autowired
    private ZxhMapper zxhMapper;

    @Autowired
    private CustomZxhMapper customZxhMapper;

    @Override
    public String getQuestion(Integer id){
        return zxhMapper.getQuestion(id);
    }

    @Override
    public List<String> getAllQuestions(String username,Integer level){
        List<String> questions = zxhMapper.getAllQuestions(level);
        if(!username.isEmpty()){
            List<String> customQuestions = customZxhMapper.getAllCustomQuestion(username);
            for(String question : customQuestions){
                questions.add(question);
            }
        }
        return questions;
    }


}
