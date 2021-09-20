package az.crocusoft.database.relationships.dao.repository;

import az.crocusoft.database.relationships.dao.entity.Address;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {
    @Override
    List<Address> findAll();

    Address findById(long id);

    @Override
    void deleteById(Long id);
}
