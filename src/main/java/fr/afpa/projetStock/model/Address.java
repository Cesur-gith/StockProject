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
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name = "address_seq", allocationSize = 1, initialValue = 1000)
    private Long id;

    private String number;
    private String street;
    private String city;
    private String zipCode;
    private String country;



}
