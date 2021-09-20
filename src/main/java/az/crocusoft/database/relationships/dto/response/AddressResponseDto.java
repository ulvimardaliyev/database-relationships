package az.crocusoft.database.relationships.dto.response;

import az.crocusoft.database.relationships.dao.entity.Library;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddressResponseDto {

    private long id;

    private String location;

    private Library library;
}
