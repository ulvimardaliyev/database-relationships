package az.crocusoft.database.relationships.dao.repository;

import az.crocusoft.database.relationships.dao.entity.Library;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepository extends CrudRepository<Library, Long> {
    @Override
    @Query(value = "select * from library", nativeQuery = true)
    List<Library> findAll();

    @Query(value = "select * from library where id=?1", nativeQuery = true)
    Library findById(long id);
}
