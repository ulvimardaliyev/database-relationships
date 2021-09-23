package az.crocusoft.database.relationships.dao.repository;

import az.crocusoft.database.relationships.dao.entity.Author;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {
    List<Author> findAll();

    Author findById(long id);

    void deleteById(long id);
}
