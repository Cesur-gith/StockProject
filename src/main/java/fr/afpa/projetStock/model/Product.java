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
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_seq")
    @SequenceGenerator(name = "product_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    private String name;
    private Double price;
    private Float taxes;
    private Float length;
    private Float weight;
    private Float width;
    private Float height;
    private String description;
    private String image;

    @ManyToOne
    private Brand brand;

   @ManyToMany
   @JoinTable (
               name = "products_suppliers",
               joinColumns = @JoinColumn(name="product_id"),
               inverseJoinColumns = @JoinColumn(name="supplier_id")
   )
   private List <Supplier> suppliers;

   @ManyToMany
   @JoinTable(
           name = "products_storages",
           joinColumns = @JoinColumn(name="product_id"),
           inverseJoinColumns = @JoinColumn(name="storage_id")
   )
   private List <Storage>storages;


}
