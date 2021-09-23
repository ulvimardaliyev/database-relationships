package az.crocusoft.database.relationships.mapper;

import az.crocusoft.database.relationships.dao.entity.Address;
import az.crocusoft.database.relationships.dao.entity.Author;
import az.crocusoft.database.relationships.dao.entity.Book;
import az.crocusoft.database.relationships.dao.entity.Library;
import az.crocusoft.database.relationships.dto.request.AddressRequestDto;
import az.crocusoft.database.relationships.dto.response.AddressResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {Library.class, Book.class, Author.class})
public interface AddressMapper {

    List<AddressResponseDto> getAllAddresses(List<Address> address);

    //@Mapping(source = "id", target = "address_id")
    Address addressRequestDtoToAddressEntity(AddressRequestDto addressRequestDto);

    //@Mapping(source = "address_id", target = "id")
    AddressResponseDto addressEntityToAddressResponseDto(Address address);

    AddressResponseDto response1(AddressRequestDto addressRequestDto);
}
