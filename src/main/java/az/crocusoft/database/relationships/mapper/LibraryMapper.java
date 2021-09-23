package az.crocusoft.database.relationships.mapper;

import az.crocusoft.database.relationships.dao.entity.Address;
import az.crocusoft.database.relationships.dao.entity.Author;
import az.crocusoft.database.relationships.dao.entity.Book;
import az.crocusoft.database.relationships.dao.entity.Library;
import az.crocusoft.database.relationships.dto.request.LibraryRequestDto;
import az.crocusoft.database.relationships.dto.response.LibraryResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {Address.class, Author.class, Book.class})
public interface LibraryMapper {
    LibraryMapper LIBRARY_MAPPER = Mappers.getMapper(LibraryMapper.class);

    List<LibraryResponseDto> allEntitiesToLibraryResponseDto(List<Library> libraries);

    @Mappings({
            @Mapping(source = "libraryName", target = "name"),
            @Mapping(source = "libraryAddress", target = "address")
    })
    Library libraryRequestDtoToLibraryEntity(LibraryRequestDto libraryRequestDto);

    @Mapping(source = "address", target = "libraryAddress")
    @Mapping(source = "id", target = "library_id")
    LibraryResponseDto libraryEntityToLibraryResponseDto(Library library);

}
