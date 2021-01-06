package com.example.service.impl;

import com.example.mapper.CustomZxhMapper;
import com.example.service.CustomZxhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomZxhServiceImpl implements CustomZxhService {
    @Autowired
    private CustomZxhMapper customZxhMapper;

    @Override
    public Integer addCustomQuestion(String username,String question){
        Integer id= customZxhMapper.getMaxId();
        if(id == null){
            id=1;
        }else{
            id++;
        }
        return customZxhMapper.addQuestions(id,username,question);
    }

    @Override
    public ArrayList<String> getAllCustomQuestion(String username){
        return customZxhMapper.getAllCustomQuestion(username);
    }
}
