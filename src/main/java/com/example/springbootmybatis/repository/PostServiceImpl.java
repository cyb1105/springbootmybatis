package com.example.springbootmybatis.repository;

import com.example.springbootmybatis.entity.Post;
import com.example.springbootmybatis.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostMapper mapper;

    @Override
    public List<Post> getAllPost() {
        return mapper.selectAllPosts();
    }

    @Override
    public Post getUserById(String id) {
        return mapper.selectUserById(id);
    }

    @Override
    public int createPost(Post post) {
        return mapper.insertPost(post);
    }

    @Override
    public int modifyPost(Post post) {
        return mapper.updatePost(post);
    }

    @Override
    public int removePost(String id) {
        return mapper.deletePost(id);
    }
}
