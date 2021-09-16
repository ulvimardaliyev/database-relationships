package az.crocusoft.database.releationships.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookRequestDto {

    private String title;

    private LibraryRequestDto library;

    private List<AuthorRequestDto> authors;
}
