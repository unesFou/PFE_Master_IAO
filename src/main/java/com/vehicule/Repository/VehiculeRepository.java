package com.vehicule.Repository;

import com.vehicule.model.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {
    // Vous pouvez ajouter des requêtes personnalisées si nécessaire
    Optional<Vehicule> findByImmatriculation(String immatriculation);
}
