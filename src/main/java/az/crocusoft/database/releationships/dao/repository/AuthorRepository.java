package az.crocusoft.database.releationships.dao.repository;

import az.crocusoft.database.releationships.dao.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
