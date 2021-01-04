package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface DmxMapper {
    @Select("SELECT question FROM dmx WHERE id=#{id}")
    String getQuestion(@Param("id") Integer id);

    @Select("SELECT question FROM dmx WHERE level=#{level}")
    ArrayList<String> getAllQuestions(@Param("level") Integer level);
}
