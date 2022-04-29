package fr.afpa.projetStock.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_seq")
    @SequenceGenerator(name = "supplier_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String website;

    @ManyToMany(mappedBy = "storages")
    private List<Product> products;

    @OneToOne
    private Address address;


}
