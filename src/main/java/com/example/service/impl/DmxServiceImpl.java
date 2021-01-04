package com.example.service.impl;

import com.example.mapper.DmxMapper;
import com.example.service.DmxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DmxServiceImpl implements DmxService {
    @Autowired
    private DmxMapper dmxMapper;

    @Override
    public String getQuestion(Integer id){
        return dmxMapper.getQuestion(id);
    }

    @Override
    public List<String> getAllQuestions(Integer level){
        return dmxMapper.getAllQuestions(level);
    }

}
