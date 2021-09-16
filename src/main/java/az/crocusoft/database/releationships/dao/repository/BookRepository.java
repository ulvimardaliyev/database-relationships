package az.crocusoft.database.releationships.dao.repository;

import az.crocusoft.database.releationships.dao.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {
}
