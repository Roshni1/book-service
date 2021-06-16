package service;

import Entity.Book;
import model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepository;


    public BookService(@Autowired BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

   public void createBook(BookModel bookModel)
   {
       bookRepository.save(new Book(bookModel.getName(),bookModel.getAuthor()));
   }

}
