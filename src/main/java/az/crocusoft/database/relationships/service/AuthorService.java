package az.crocusoft.database.relationships.service;

import az.crocusoft.database.relationships.dto.request.AuthorRequestDto;
import az.crocusoft.database.relationships.dto.response.AuthorResponseDto;

import java.util.List;

public interface AuthorService {

    List<AuthorResponseDto> getAllAuthors();

    AuthorResponseDto getAuthorById(long id);

    long saveNewAuthor(AuthorRequestDto authorRequestDto);

    void deleteAuthorById(long id);

    AuthorResponseDto authorResponseDto(long authorId, long bookId);
}
