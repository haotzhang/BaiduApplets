package com.example.service.impl;

import com.example.mapper.CustomDmxMapper;
import com.example.mapper.CustomZxhMapper;
import com.example.mapper.DmxMapper;
import com.example.mapper.ZxhMapper;
import com.example.service.DmxService;
import com.example.service.ZxhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DmxServiceImpl implements DmxService {
    @Autowired
    private DmxMapper dmxMapper;

    @Autowired
    private CustomDmxMapper customDmxMapper;

    @Override
    public String getQuestion(Integer id){
        return dmxMapper.getQuestion(id);
    }

    @Override
    public List<String> getAllQuestions(String username,Integer level){
        List<String> questions = dmxMapper.getAllQuestions(level);
        if(!username.isEmpty()){
            List<String> customQuestions = customDmxMapper.getAllCustomQuestion(username);
            for(String question : customQuestions){
                questions.add(question);
            }
        }
        return questions;
    }

}
