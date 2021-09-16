package az.crocusoft.database.releationships.dto.response;

import az.crocusoft.database.releationships.dao.entity.Library;
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
