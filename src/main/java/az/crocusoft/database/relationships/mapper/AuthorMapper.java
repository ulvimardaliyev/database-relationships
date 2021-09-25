package az.crocusoft.database.relationships.mapper;

import az.crocusoft.database.relationships.dao.entity.Author;
import az.crocusoft.database.relationships.dto.request.AuthorRequestDto;
import az.crocusoft.database.relationships.dto.response.AuthorResponseDto;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {BookMapper.class, LibraryMapper.class, AddressMapper.class})
public interface AuthorMapper {
    List<AuthorResponseDto> convertAllAuthorToAuthorResponseDto(List<Author> allAuthors);

    AuthorResponseDto convertAuthorToAuthorResponseDto(Author author);

    Author authorRequestDtoToAuthorEntity(AuthorRequestDto authorRequestDto);

    void updateAuthor(Author authorUpdate, @MappingTarget Author author);
}
