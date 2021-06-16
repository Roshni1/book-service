package controller;

import Entity.Book;
import model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    public  final BookService bookService;
    public BookController(@Autowired BookService bookService) {

        this.bookService = bookService;
    }


    @PostMapping
    public void addRest(@RequestBody BookModel bookModel)
    {
        bookService.createBook(bookModel);
    }
}

