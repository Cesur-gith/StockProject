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
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
    @SequenceGenerator(name = "brand_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "brand")
    private List<Product> products;

}