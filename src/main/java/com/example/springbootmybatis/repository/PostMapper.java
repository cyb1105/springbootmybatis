package com.example.springbootmybatis.repository;

import com.example.springbootmybatis.entity.Post;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PostMapper {
    List<Post> selectAllPosts();
    Post selectUserById(String id);
    int insertPost(Post post);
    int updatePost(Post post);
    int deletePost(String id);
}
