package az.crocusoft.database.relationships.mapper;

import az.crocusoft.database.relationships.dao.entity.Address;
import az.crocusoft.database.relationships.dao.entity.Author;
import az.crocusoft.database.relationships.dao.entity.Book;
import az.crocusoft.database.relationships.dao.entity.Library;
import az.crocusoft.database.relationships.dto.request.AuthorRequestDto;
import az.crocusoft.database.relationships.dto.response.AuthorResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring",
        uses = {Book.class, Library.class, Address.class})
public interface AuthorMapper {
    List<AuthorResponseDto> convertAllAuthorToAuthorResponseDto(List<Author> allAuthors);

    AuthorResponseDto convertAuthorToAuthorResponseDto(Author author);

    Author authorRequestDtoToAuthorEntity(AuthorRequestDto authorRequestDto);
}
