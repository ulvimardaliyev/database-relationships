package az.crocusoft.database.relationships.service.impl;

import az.crocusoft.database.relationships.dao.repository.BookRepository;
import az.crocusoft.database.relationships.dto.request.BookRequestDto;
import az.crocusoft.database.relationships.dto.response.BookResponseDto;
import az.crocusoft.database.relationships.mapper.BookMapper;
import az.crocusoft.database.relationships.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public List<BookResponseDto> getAllBooks() {
        var allBooks = bookRepository.findAll();
        return bookMapper.allBooksToBookResponseDto(allBooks);
    }

    @Override
    public BookResponseDto getBookResponseDtoWithId(long id) {
        var bookEntity = bookRepository.findById(id);
        return bookMapper.convertBookToBookResponseDto(bookEntity);
    }

    @Override
    public long saveNewBook(BookRequestDto bookRequestDto) {
        var bookRequestToBook = bookMapper.convertBookRequestDtoBook(bookRequestDto);
        var saveBook = bookRepository.save(bookRequestToBook);
        return saveBook.getId();
    }

    @Override
    public void deleteThisBook(long id) {
        //var bookEntity = bookRepository.findById(id);
        bookRepository.deleteById(id);
    }
}
