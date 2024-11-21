package com.vehicule.service;

import com.vehicule.model.Vehicule;

import java.util.List;
import java.util.Optional;

public interface VehiculeService {
    List<Vehicule> getAllVehicules();
    Vehicule getVehiculeById(Long id);
    Vehicule saveVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Long id, Vehicule vehicule);
    void deleteVehicule(Long id);
}
