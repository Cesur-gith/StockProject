package fr.afpa.projetStock.repository;

import fr.afpa.projetStock.model.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Long> {
}
