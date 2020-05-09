package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.Post;
import com.example.springbootmybatis.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostService service;

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        List<Post> list = service.getAllPost();
        return list;
    }

    @GetMapping("/posts/{id}")
    public Post getUserById(@PathVariable String id){
        Post post = service.getUserById(id);
        if(post == null){
            //throw
        }
        return post;
    }

    @PostMapping("/posts")
    public int createPost(@RequestBody Post post){
        int createPost = service.createPost(post);
        return createPost;
    }

    @DeleteMapping("/posts/{id}")
    public List<Post> deletePost(@PathVariable String id) {
       service.removePost(id);
       return null;
    }
}
