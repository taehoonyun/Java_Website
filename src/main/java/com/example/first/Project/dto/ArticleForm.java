package com.example.first.Project.dto;

import com.example.first.Project.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class ArticleForm {

    private String title;
    private String content;

    public Article toEnity() {
        return new Article(null,title,content);
    }
}
