package az.crocusoft.database.relationships.dao.repository;

import az.crocusoft.database.relationships.dao.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends CrudRepository<Author,Long> {
}
