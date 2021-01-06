package com.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface CustomDmxMapper {

    @Insert("INSERT INTO custom_dmx (id,username,question)" +
            " VALUES " +
            "(#{id},#{username},#{question})")
    int addQuestions(@Param("id") Integer id, @Param("username") String username, @Param("question") String question);

    @Select("SELECT MAX(id) FROM custom_dmx")
    int getMaxId();

    @Select("SELECT question FROM custom_dmx WHERE username=#{username}")
    ArrayList<String> getAllCustomQuestion(@Param("username") String username);

}
