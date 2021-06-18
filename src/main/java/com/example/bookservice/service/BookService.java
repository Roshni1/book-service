package com.example.bookservice.service;

import com.example.bookservice.Entity.Book;
import com.example.bookservice.model.BookModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.bookservice.repository.BookRepository;

import java.util.ArrayList;
import java.util.List;

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


   public BookModel getBook(Long id)
   {
       Book bk=bookRepository.findBookById(id);
       BookModel bookModel= new BookModel(bk.getBookName(), bk.getAuthorName());
       return  bookModel;

   }

  public List<BookModel> getAllBook()
  {
      List<Book> books= bookRepository.findAll(); //get all book entites
      List<BookModel> bookModelList = new ArrayList<>();//resutl list
              for(int i=0 ;i<books.size();i++){
                 BookModel bookModel = new BookModel(books.get(i).getBookName(), books.get(i).getAuthorName());
                 bookModelList.add(bookModel);
              }
     return bookModelList;
  }
}
