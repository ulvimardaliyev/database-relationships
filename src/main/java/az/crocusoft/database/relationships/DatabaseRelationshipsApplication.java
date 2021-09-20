package az.crocusoft.database.relationships;

import az.crocusoft.database.relationships.dao.entity.Address;
import az.crocusoft.database.relationships.dao.entity.Book;
import az.crocusoft.database.relationships.dao.entity.Library;
import az.crocusoft.database.relationships.dao.repository.AddressRepository;
import az.crocusoft.database.relationships.dao.repository.BookRepository;
import az.crocusoft.database.relationships.dao.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class DatabaseRelationshipsApplication implements CommandLineRunner {

    private final AddressRepository addressRepository;
    private final BookRepository bookRepository;
    private final LibraryRepository libraryRepository;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseRelationshipsApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        List<Book> bookList = new ArrayList<>();


        Library library =
                Library
                        .builder()
                        .name("Akhundov")
                        .build();
        Address address =
                Address
                        .builder()
                        .id(1)
                        .library(library)
                        .location("Ganja")
                        .build();
        Book book =
                Book
                        .builder()
                        .id(1)
                        .library(library)
                        .title("Crime and punishment")
                        .build();
        bookList.add(book);
        library.setAddress(address);
        library.setBooks(bookList);
        libraryRepository.save(library);
        addressRepository.save(address);

        bookRepository.save(book);


    }
}
