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
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
    @SequenceGenerator(name = "brand_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "brand")
<<<<<<< HEAD
=======
    @JsonIgnoreProperties("brand")
>>>>>>> 8dc454b (StockProject)
    private List<Product> products;

}