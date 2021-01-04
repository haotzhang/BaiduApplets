package com.example.service.impl;
import com.example.mapper.ZxhMapper;
import com.example.service.ZxhService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ZxhServiceImpl implements ZxhService {

    @Autowired
    private ZxhMapper zxhMapper;

    @Override
    public String getQuestion(Integer id){
        return zxhMapper.getQuestion(id);
    }

    @Override
    public List<String> getAllQuestions(Integer level){
        return zxhMapper.getAllQuestions(level);
    }


}
