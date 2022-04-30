package fr.afpa.projetStock.model;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
>>>>>>> 8dc454b (StockProject)
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@Table(name = "storage")
public class Storage {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "storage_seq")
    @SequenceGenerator(name = "storage_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    private String name;
    private String phone;
    private String email;
    private String website;
    private String fax;


    @OneToOne
    private Address address;

    @ManyToMany(mappedBy = "storages")
<<<<<<< HEAD
=======
    @JsonIgnoreProperties("storages")
>>>>>>> 8dc454b (StockProject)
    private List<Product> products;


}

