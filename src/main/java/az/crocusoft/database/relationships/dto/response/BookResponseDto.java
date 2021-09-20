package az.crocusoft.database.relationships.dto.response;

import az.crocusoft.database.relationships.dao.entity.Library;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookResponseDto {

    private long id;

    private String title;

    private Library library;

    private List<AuthorResponseDto> authors;
}
