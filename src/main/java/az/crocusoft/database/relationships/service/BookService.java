package az.crocusoft.database.relationships.service;

import az.crocusoft.database.relationships.dto.request.BookRequestDto;
import az.crocusoft.database.relationships.dto.response.BookResponseDto;

import java.util.List;

public interface BookService {
    List<BookResponseDto> getAllBooks();

    BookResponseDto getBookResponseDtoWithId(long id);

    long saveNewBook(BookRequestDto bookRequestDto);

    void deleteThisBook(long id);

}
