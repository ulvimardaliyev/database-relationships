package az.crocusoft.database.relationships.service.impl;

import az.crocusoft.database.relationships.dao.repository.AuthorRepository;
import az.crocusoft.database.relationships.dao.repository.BookRepository;
import az.crocusoft.database.relationships.dto.request.AuthorRequestDto;
import az.crocusoft.database.relationships.dto.response.AuthorResponseDto;
import az.crocusoft.database.relationships.mapper.AuthorMapper;
import az.crocusoft.database.relationships.mapper.BookMapper;
import az.crocusoft.database.relationships.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;
    @Autowired
    private AuthorMapper authorMapper;
    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<AuthorResponseDto> getAllAuthors() {
        return authorMapper.convertAllAuthorToAuthorResponseDto(authorRepository.findAll());
    }

    @Override
    public AuthorResponseDto getAuthorById(long id) {
        return authorMapper
                .convertAuthorToAuthorResponseDto(authorRepository.findById(id));
    }

    @Override
    public long saveNewAuthor(AuthorRequestDto authorRequestDto) {
        var map = authorMapper.authorRequestDtoToAuthorEntity(authorRequestDto);
        var entity = authorRepository.save(map);
        return entity.getId();
    }

    @Override
    public void deleteAuthorById(long id) {
        authorRepository.deleteById(id);

    }

    @Override
    public AuthorResponseDto authorResponseDto(long authorId, long bookId) {
        var author = authorRepository.findById(authorId);
        var book = bookRepository.findById(bookId);
        book.getAuthors().add(author);
        bookRepository.save(book);
        author.getBooks().add(book);
        authorRepository.save(author);
        //bookMapper.allBooksToBookResponseDto(author.getBooks());
        return authorMapper.convertAuthorToAuthorResponseDto(author);
    }
}
