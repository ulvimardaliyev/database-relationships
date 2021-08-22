package az.crocusoft.database.releationships.dao.repository;

import az.crocusoft.database.releationships.dao.entity.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
