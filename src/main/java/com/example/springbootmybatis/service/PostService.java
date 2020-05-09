package com.example.springbootmybatis.service;

import com.example.springbootmybatis.entity.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPost();
    Post getUserById(String id);
    int createPost(Post post);
    int modifyPost(Post post);
    int removePost(String id);

}
