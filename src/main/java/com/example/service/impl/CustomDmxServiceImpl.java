package com.example.service.impl;

import com.example.mapper.CustomDmxMapper;
import com.example.mapper.CustomZxhMapper;
import com.example.service.CustomDmxService;
import com.example.service.CustomZxhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CustomDmxServiceImpl implements CustomDmxService {

    @Autowired
    private CustomDmxMapper customDmxMapper;

    @Override
    public Integer addCustomQuestion(String username,String question){
        Integer id= customDmxMapper.getMaxId();
        if(id == null){
            id=1;
        }else{
            id++;
        }
        return customDmxMapper.addQuestions(id,username,question);
    }

    @Override
    public ArrayList<String> getAllCustomQuestion(String username){
        return customDmxMapper.getAllCustomQuestion(username);
    }
}
