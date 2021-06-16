package repository;

import Entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    public Book findBookById(Long id);
    public Book save(Book book);
    public Book deleteBookById(Long id);
    public List<Book> findAll();

}
