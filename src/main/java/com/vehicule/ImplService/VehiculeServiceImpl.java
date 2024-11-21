package com.vehicule.ImplService;


import com.vehicule.model.Vehicule;
import com.vehicule.Repository.VehiculeRepository;
import com.vehicule.service.VehiculeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculeServiceImpl implements VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return vehiculeRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicule not found with id: " + id));
    }

    @Override
    public Vehicule saveVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Long id, Vehicule vehiculeDetails) {
        Vehicule vehicule = getVehiculeById(id);
        vehicule.setMarque(vehiculeDetails.getMarque());
        vehicule.setModele(vehiculeDetails.getModele());
        vehicule.setImmatriculation(vehiculeDetails.getImmatriculation());
        vehicule.setAnneeFabrication(vehiculeDetails.getAnneeFabrication());
        vehicule.setEnService(vehiculeDetails.isEnService());
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(Long id) {
        vehiculeRepository.deleteById(id);
    }
}
