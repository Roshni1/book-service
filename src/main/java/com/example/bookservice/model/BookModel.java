package com.example.bookservice.model;


public class BookModel {

    private String name;
    private String author;


    public BookModel(){}
    public BookModel(String name, String author) {

        this.name = name;
        this.author = author;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
