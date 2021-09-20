package az.crocusoft.database.relationships.dto.response;

import az.crocusoft.database.relationships.dao.entity.Address;
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

    private long library_id;

    private String name;

    private Address libraryAddress;

    private List<BookResponseDto> books;
}
