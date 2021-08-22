package az.crocusoft.database.releationships.dao.repository;

import az.crocusoft.database.releationships.dao.entity.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address,Long> {
}
