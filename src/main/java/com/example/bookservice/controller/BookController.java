package com.example.bookservice.controller;

import com.example.bookservice.Entity.Book;
import com.example.bookservice.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.bookservice.service.BookService;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    public  final BookService bookService;
    public BookController(@Autowired BookService bookService) {

        this.bookService = bookService;
    }


    @PostMapping
    public void addBook(@RequestBody BookModel bookModel)
    {
        bookService.createBook(bookModel);
    }


    @GetMapping("/{id}")
    public BookModel getBook1(@PathVariable Long id)
    {
       return bookService.getBook(id);
    }

    @GetMapping("/")
    public List<BookModel> getBookList() {
        return bookService.getAllBook();
    }


}

