package com.ameda.kevin.kisevu.GraphiQL.entity;/*
*
@author ameda
@project GraphiQL
@package com.ameda.kevin.kisevu.GraphiQL.entity
*
*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Integer bookId;
    private String name;
    private String author;

    public Book(){}
    public Book(String name,String author){
        this.name = name;
        this.author = author;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
