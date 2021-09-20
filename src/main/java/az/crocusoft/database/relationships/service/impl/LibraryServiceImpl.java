package az.crocusoft.database.relationships.service.impl;

import az.crocusoft.database.relationships.dao.entity.Book;
import az.crocusoft.database.relationships.dao.repository.AddressRepository;
import az.crocusoft.database.relationships.dao.repository.BookRepository;
import az.crocusoft.database.relationships.dao.repository.LibraryRepository;
import az.crocusoft.database.relationships.dto.request.LibraryRequestDto;
import az.crocusoft.database.relationships.dto.response.LibraryResponseDto;
import az.crocusoft.database.relationships.mapper.LibraryMapper;
import az.crocusoft.database.relationships.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LibraryServiceImpl implements LibraryService {
    private final BookRepository bookRepository;
    private final AddressRepository addressRepository;
    private final LibraryRepository libraryRepository;
    private final LibraryMapper libraryMapper;

    @Override
    public long saveNewLibrary(LibraryRequestDto libraryRequestDto) {
        var libraryEntity =
                libraryMapper.libraryRequestDtoToLibraryEntity(libraryRequestDto);
        var savedEntity = libraryRepository.save(libraryEntity);
        return savedEntity.getId();
    }

    //TODO book foreign key-e gore sile bilmir
    @Override
    public void deleteCurrentLibrary(long libraryId) {
        var library = libraryRepository.findById(libraryId);
        var books = library.getBooks();
        for (Book book : books) {
            book.setLibrary(null);
        }
        libraryRepository.save(library);
        libraryRepository.deleteById(libraryId);
    }

    @Override
    public LibraryResponseDto getCurrentLibrary(long libraryId) {
        var libraryEntity
                = libraryRepository.findById(libraryId);
        return libraryMapper.libraryEntityToLibraryResponseDto(libraryEntity);
    }

    @Override
    public List<LibraryResponseDto> getAllLibraries() {
        var allLibraries = libraryRepository.findAll();
        return libraryMapper.allEntitiesToLibraryResponseDto(allLibraries);
    }

    @Override
    public LibraryResponseDto addBookToLibrary(long libraryId, long bookId) {
        var library = libraryRepository.findById(libraryId);
        var book = bookRepository.findById(bookId);
        book.setLibrary(library);
        bookRepository.save(book);
        return libraryMapper.libraryEntityToLibraryResponseDto(library);
    }

    /*@Override
    public LibraryResponseDto addAddressToLibraryWithId(long libraryId, long addressId) {
        var libraryEntityById = libraryRepository.findById(libraryId);
        var addressEntityById = addressRepository.findById(addressId);
        libraryEntityById.setAddress(addressEntityById);
        libraryRepository.save(libraryEntityById);
        var libraryEntityToResponse =
                libraryMapper.libraryEntityToLibraryResponseDto(libraryEntityById);
        return libraryEntityToResponse;
    }*/
}
