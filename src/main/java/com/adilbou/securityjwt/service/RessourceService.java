package com.adilbou.securityjwt.service;


import ma.team.gestion_ressources.entities.Ressource;
import ma.team.gestion_ressources.entities.RessourceFournisseur;

import java.util.List;

public interface RessourceService {

    List<Ressource> getAllRessources();
    List<Ressource> getRessourcesByMembreDepartement(String id);
    Ressource addRessource(Ressource ressource);
    RessourceFournisseur addRessourceFournisseur(RessourceFournisseur ressourceFournisseur);
    List<Ressource> addMultipleRessources(List<Ressource> ressources);
    Ressource updateRessource(Ressource ressource);
    void deleteRessource(Long id);
    List<Ressource> getRessourcesByDepartement(Long id);

}
