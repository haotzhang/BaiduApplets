package com.example.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface ZxhMapper {

    @Select("SELECT question FROM zxh WHERE id=#{id}")
    String getQuestion(@Param("id") Integer id);

    @Select("SELECT question FROM zxh WHERE level=#{level}")
    ArrayList<String> getAllQuestions(@Param("level") Integer level);

}
