package com.example.first.Project.entity;

import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity //DB can recognize the Object
@AllArgsConstructor
@ToString
public class Article {

    @Id // Representation like a SSN
    @GeneratedValue // 1,2,3, ... it create auto annotation
    private  Long id;
    @Column
    private  String title;

    @Column
    private String content;



}
