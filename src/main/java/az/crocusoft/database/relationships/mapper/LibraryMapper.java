package az.crocusoft.database.relationships.mapper;

import az.crocusoft.database.relationships.dao.entity.Library;
import az.crocusoft.database.relationships.dto.request.LibraryRequestDto;
import az.crocusoft.database.relationships.dto.response.LibraryResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {AddressMapper.class, AuthorMapper.class, BookMapper.class})
public interface LibraryMapper {
    LibraryMapper LIBRARY_MAPPER = Mappers.getMapper(LibraryMapper.class);

    List<LibraryResponseDto> allEntitiesToLibraryResponseDto(List<Library> libraries);

    @Mappings({
            @Mapping(source = "libraryName", target = "name"),
            @Mapping(source = "libraryAddress", target = "address")
    })
    Library libraryRequestDtoToLibraryEntity(LibraryRequestDto libraryRequestDto);

    @Mapping(source = "library.address", target = "libraryAddress")
    @Mapping(source = "library.id", target = "library_id")
    LibraryResponseDto libraryEntityToLibraryResponseDto(Library library);

}
