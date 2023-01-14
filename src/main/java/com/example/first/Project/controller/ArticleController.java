package com.example.first.Project.controller;

import com.example.first.Project.dto.ArticleForm;
import com.example.first.Project.entity.Article;
import com.example.first.Project.repository.ArticleRepository;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import lombok.extern.slf4j.XSlf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
@Slf4j
public class ArticleController {
    @Autowired // Spring boot will load the object and contact itself
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create")
    public String createArticle(ArticleForm form){
//        System.out.println(form.toString()); --> not useful, use Logging
        log.info(form.toString());
        // 1. convert Dto to Entity
        Article article = form.toEnity();
        log.info(article.toString());

        // 2. make Repository save Entity into DB
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return"";
    }
}
