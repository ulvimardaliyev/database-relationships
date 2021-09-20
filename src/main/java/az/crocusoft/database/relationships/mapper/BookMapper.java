package az.crocusoft.database.relationships.mapper;

import az.crocusoft.database.relationships.dao.entity.Book;
import az.crocusoft.database.relationships.dto.request.BookRequestDto;
import az.crocusoft.database.relationships.dto.response.BookResponseDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface BookMapper {

    Book convertBookRequestDtoBook(BookRequestDto bookRequestDto);

    BookResponseDto convertBookToBookResponseDto(Book book);

    List<BookResponseDto> allBooksToBookResponseDto(List<Book> allBooks);

}
