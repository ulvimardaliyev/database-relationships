package az.crocusoft.database.releationships.dto.request;

import az.crocusoft.database.releationships.dao.entity.Address;
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

    private String name;

    private Address address;

    private List<BookRequestDto> books;
}
