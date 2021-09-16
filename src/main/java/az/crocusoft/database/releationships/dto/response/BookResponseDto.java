package az.crocusoft.database.releationships.dto.response;

import az.crocusoft.database.releationships.dao.entity.Author;
import az.crocusoft.database.releationships.dao.entity.Library;
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

    private List<Author> authors;
}
