package az.crocusoft.database.relationships.controller;

import az.crocusoft.database.relationships.dto.request.AuthorRequestDto;
import az.crocusoft.database.relationships.dto.response.AuthorResponseDto;
import az.crocusoft.database.relationships.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public List<AuthorResponseDto> authorResponseDtoList() {
        return authorService.getAllAuthors();
    }

    @GetMapping("/authors/{authorId}")
    public AuthorResponseDto getAuthorById(@PathVariable long authorId) {
        return authorService.getAuthorById(authorId);
    }

    @PostMapping("/authors")
    public long saveNewAuthor(@RequestBody AuthorRequestDto authorRequestDto) {
        return authorService.saveNewAuthor(authorRequestDto);
    }

    @DeleteMapping("/authors/{authorId}")
    public void deleteAuthor(@PathVariable long authorId) {
        authorService.deleteAuthorById(authorId);
    }

    @PutMapping("/authors/{authorId}/books/{bookId}")
    public AuthorResponseDto putBookToAuthor(@PathVariable long authorId,
                                             @PathVariable long bookId) {
        return authorService.authorResponseDto(authorId, bookId);
    }
}
