package fr.afpa.projetStock.repository;

import fr.afpa.projetStock.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
<<<<<<< HEAD

public interface ProductRepository extends JpaRepository<Product, Long> {
=======
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    @Query(value = "select * from product;", nativeQuery = true)
    public List<Product> findAll();



>>>>>>> 8dc454b (StockProject)
}
