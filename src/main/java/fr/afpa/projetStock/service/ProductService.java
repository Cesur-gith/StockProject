package fr.afpa.projetStock.service;

<<<<<<< HEAD
import fr.afpa.projetStock.repository.ProductRepository;
import org.springframework.stereotype.Service;

=======
import fr.afpa.projetStock.model.Product;
import fr.afpa.projetStock.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

>>>>>>> 8dc454b (StockProject)
@Service
public class ProductService {

    private ProductRepository productRepository;

<<<<<<< HEAD
=======
    public List<Product> findAll() {
        return productRepository.findAll();
    }


>>>>>>> 8dc454b (StockProject)
}
