package com.example.springbootmybatis.repository;

import com.example.springbootmybatis.entity.Users;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper{
    List<Users> selectAllUsers();
    Users selectUserById(String id);
    int insertUser(Users user);
    int updateUser(Users user);
    int deleteUser(String id);
}
