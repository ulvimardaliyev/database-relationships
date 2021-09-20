package az.crocusoft.database.relationships.dao.repository;

import az.crocusoft.database.relationships.dao.entity.Book;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

    @Override
    @Query(value = "select * from book", nativeQuery = true)
    List<Book> findAll();

    @Query(value = "select * from book where id=?1", nativeQuery = true)
    Book findById(long id);
}
