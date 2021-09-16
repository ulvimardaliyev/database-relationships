package az.crocusoft.database.releationships.dto.response;

import az.crocusoft.database.releationships.dao.entity.Address;
import az.crocusoft.database.releationships.dao.entity.Book;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LibraryResponseDto {

    private long id;

    private String name;

    private Address address;

    private List<Book> books;
}
