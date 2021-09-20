package az.crocusoft.database.relationships.service;

import az.crocusoft.database.relationships.dto.request.LibraryRequestDto;
import az.crocusoft.database.relationships.dto.response.LibraryResponseDto;

import java.util.List;

public interface LibraryService {
    long saveNewLibrary(LibraryRequestDto libraryRequestDto);

    void deleteCurrentLibrary(long libraryId);

    LibraryResponseDto getCurrentLibrary(long libraryId);

    List<LibraryResponseDto> getAllLibraries();

    LibraryResponseDto addBookToLibrary(long libraryId, long bookId);
    //LibraryResponseDto addAddressToLibraryWithId(long libraryId, long addressId);
}
