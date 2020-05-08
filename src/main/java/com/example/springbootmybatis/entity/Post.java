package com.example.springbootmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    private int id;
    private String user_id;
    private String title;
    private String contents;
    private int del_yn;
    private Date createAt;

    public Post(int id, String user_id, String title, String contents, int del_yn) {
        this.id = id;
        this.user_id = user_id;
        this.title = title;
        this.contents = contents;
        this.del_yn = del_yn;
    }
}
