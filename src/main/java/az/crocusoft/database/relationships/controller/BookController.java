package az.crocusoft.database.relationships.controller;

import az.crocusoft.database.relationships.dto.request.BookRequestDto;
import az.crocusoft.database.relationships.dto.response.BookResponseDto;
import az.crocusoft.database.relationships.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("api")
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public List<BookResponseDto> getAllBooks() {
        return bookService.getAllBooks();
    }

    @PostMapping("/books")
    @ResponseBody
    public long saveNewBook(@RequestBody BookRequestDto bookRequestDto) {
        return bookService.saveNewBook(bookRequestDto);
    }

    @GetMapping("/books/{bookId}")
    @ResponseBody
    public BookResponseDto getBookById(@PathVariable long bookId) {
        return bookService.getBookResponseDtoWithId(bookId);
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBookById(@PathVariable long bookId) {
        bookService.deleteThisBook(bookId);
    }
}
