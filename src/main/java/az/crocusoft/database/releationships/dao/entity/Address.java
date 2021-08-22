package az.crocusoft.database.releationships.dao.entity;

import javax.persistence.*;

@Entity
public class Address {

    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String location;

    @OneToOne(mappedBy = "address")
    private Library library;
}
