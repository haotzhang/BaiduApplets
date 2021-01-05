package com.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO user (username)" +
            " VALUES " +
            "(#{username})")
    int addUser(@Param("username") String username);

    @Select("SELECT username FROM user")
    ArrayList<String> getAllUsers();


}
