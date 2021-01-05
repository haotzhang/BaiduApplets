package com.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface CustomZxhMapper {
    @Insert("INSERT INTO custom_zxh (id,question)" +
            " VALUES " +
            "(#{id},#{question})")
    int addQuestions(@Param("id") Integer id,@Param("question") String question);
}
