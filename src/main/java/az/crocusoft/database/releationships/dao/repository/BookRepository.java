package az.crocusoft.database.releationships.dao.repository;

import az.crocusoft.database.releationships.dao.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
