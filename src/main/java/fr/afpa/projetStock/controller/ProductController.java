package fr.afpa.projetStock.controller;


<<<<<<< HEAD
import org.springframework.stereotype.Controller;

@Controller
public class ProductController{
=======
import fr.afpa.projetStock.model.Product;
import fr.afpa.projetStock.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController{
    @Autowired
    private ProductService productService;


    @GetMapping("/index")
    public String home(Model model) {
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "index";
    }

>>>>>>> 8dc454b (StockProject)
}
