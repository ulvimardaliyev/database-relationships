package az.crocusoft.database.relationships.dto.request;

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
public class LibraryRequestDto {

    private String libraryName;

    private Address libraryAddress;

    private List<BookRequestDto> books;
}
