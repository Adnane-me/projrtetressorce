package com.adilbou.securityjwt.service;


import ma.team.gestion_ressources.entities.Ressource;
import ma.team.gestion_ressources.entities.RessourceFournisseur;
import ma.team.gestion_ressources.repository.ResourceFournisseurRepository;
import ma.team.gestion_ressources.repository.RessourceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RessourceServiceImpl implements RessourceService {

    private final RessourceRepository ressourceRepository;
    private  final ResourceFournisseurRepository resourceFournisseurRepository;

    public RessourceServiceImpl(RessourceRepository ressourceRepository, ResourceFournisseurRepository resourceFournisseurRepository) {
        this.ressourceRepository = ressourceRepository;
        this.resourceFournisseurRepository = resourceFournisseurRepository;
    }

    @Override
    public List<Ressource> getAllRessources() {
        return ressourceRepository.findAll();
    }

    @Override
    public List<Ressource> getRessourcesByMembreDepartement(String id) {
        return ressourceRepository.getRessourceByIdMembreDepartement(id);
    }

    @Override
    public Ressource addRessource(Ressource ressource) {
        return ressourceRepository.save(ressource);
    }

    @Override
    public RessourceFournisseur addRessourceFournisseur(RessourceFournisseur ressourceFournisseur) {
        return resourceFournisseurRepository.save(ressourceFournisseur);
    }

    @Override
    public List<Ressource> addMultipleRessources(List<Ressource> ressources) {
        return ressourceRepository.saveAll(ressources);
    }

    @Override
    public Ressource updateRessource(Ressource ressource) {
        return ressourceRepository.save(ressource);
    }

    @Override
    public void deleteRessource(Long id) {
        Ressource ressource = ressourceRepository.findById(id).orElseThrow();
        ressource.setIsDeleted(true);
        ressourceRepository.save(ressource);
    }

    @Override
    public List<Ressource> getRessourcesByDepartement(Long id) {
        return ressourceRepository.getRessourceByIdDepartement(id);
    }
}
