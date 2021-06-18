package com.example.bookservice.Entity;

import javax.persistence.*;

@Entity
@Table(name="BOOK")
public class Book {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String bookName;
    private String authorName;

    public Book() {

    }

    public Book(String bookName, String authorName) {

        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
