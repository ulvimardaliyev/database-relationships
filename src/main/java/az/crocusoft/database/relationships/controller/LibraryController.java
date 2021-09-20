package az.crocusoft.database.relationships.controller;

import az.crocusoft.database.relationships.dto.request.LibraryRequestDto;
import az.crocusoft.database.relationships.dto.response.LibraryResponseDto;
import az.crocusoft.database.relationships.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@RequiredArgsConstructor
public class LibraryController {

    private final LibraryService libraryService;

    @GetMapping("/libraries/{libraryId}")
    public LibraryResponseDto getCurrentLibrary(@PathVariable long libraryId) {
        return libraryService.getCurrentLibrary(libraryId);
    }

    @PostMapping("/libraries")
    public long saveNewLibrary(@RequestBody LibraryRequestDto libraryRequestDto) {
        return libraryService.saveNewLibrary(libraryRequestDto);
    }

    @GetMapping("/libraries")
    public List<LibraryResponseDto> getAllLibraries() {
        return libraryService.getAllLibraries();
    }

    @DeleteMapping("/libraries/{libraryId}")
    public void deleteCurrentLibrary(@PathVariable long libraryId) {
        libraryService.deleteCurrentLibrary(libraryId);
    }

    @PutMapping("/libraries/{libraryId}/books/{bookId}")
    public LibraryResponseDto addBookToLibrary(@PathVariable long bookId,
                                               @PathVariable long libraryId) {
        return libraryService.addBookToLibrary(libraryId, bookId);
    }
}
