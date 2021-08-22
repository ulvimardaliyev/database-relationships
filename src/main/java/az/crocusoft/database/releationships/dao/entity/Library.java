package az.crocusoft.database.releationships.dao.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Library {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToMany(mappedBy = "library")
    private List<Book> books;
}
