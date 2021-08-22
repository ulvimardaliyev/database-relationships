package az.crocusoft.database.releationships.dao.entity;

import javax.persistence.*;

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
}
