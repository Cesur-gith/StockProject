package fr.afpa.projetStock.repository;

import fr.afpa.projetStock.model.Storage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StorageRepository extends JpaRepository<Storage, Long> {
}
