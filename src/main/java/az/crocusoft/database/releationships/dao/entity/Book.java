package az.crocusoft.database.releationships.dao.entity;

import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String title;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;
}
