package fr.afpa.projetStock.repository;

import fr.afpa.projetStock.model.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
