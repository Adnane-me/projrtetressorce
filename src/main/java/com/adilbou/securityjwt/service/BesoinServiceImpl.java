package com.adilbou.securityjwt.service;



import com.adilbou.securityjwt.Entities.*;
import com.adilbou.securityjwt.Repositories.BesoinRepository;
import com.adilbou.securityjwt.Repositories.DepartementRepository;
import com.adilbou.securityjwt.Repositories.MembreDepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class BesoinServiceImpl implements BesoinService {

    private final BesoinRepository besoinRepository;
    private final MembreDepartementRepository membreDepartementRepository;
    private final RessourceService ressourceService;
    private final OrdinateurService ordinateurService;
    private final ImprimanteService imprimanteService;
    @Autowired
    DepartementRepository departementRepository;

    public BesoinServiceImpl(BesoinRepository besoinRepository, MembreDepartementRepository membreDepartementRepository, RessourceService ressourceService, OrdinateurService ordinateurService, ImprimanteService imprimanteService) {
        this.besoinRepository = besoinRepository;
        this.membreDepartementRepository = membreDepartementRepository;
        this.ressourceService = ressourceService;
        this.ordinateurService = ordinateurService;
        this.imprimanteService = imprimanteService;
    }
// valider
    @Override
    public Besoin save(Besoin besoin) {
        List<Ordinateur> ordinateurs = (List<Ordinateur>) besoin.getOrdinateurs();
        List<Imprimante> imprimantes = (List<Imprimante>) besoin.getImprimantes();

        List<Ordinateur> ordinateurList = new ArrayList<>();
        List<Imprimante> imprimanteList = new ArrayList<>();



        String nom_departent=this.get_nom_departement(besoin.getId_member()); // b.getid_memener


        for(Ordinateur ordinateur: ordinateurs) {
            Ordinateur ordTemp = ordinateurService.addOrdinateur(ordinateur);
            ordTemp.setNom_deparetemnt(nom_departent);
            ordTemp.setIdMembreDepartement(besoin.getId_member());
            ordinateurList.add(ordTemp);
        }
        for(Imprimante imprimante: imprimantes) {
            Imprimante impTemp = imprimanteService.addImprimante(imprimante);
            impTemp.setNom_deparetemnt(nom_departent);
            impTemp.setIdMembreDepartement(besoin.getId_member());
            imprimanteList.add(impTemp);
        }




        besoin.setOrdinateurs(ordinateurList);
        besoin.setImprimantes(imprimanteList);
        besoin.setNom_departement(nom_departent);
        return besoinRepository.save(besoin);
    }


    public String get_nom_departement(Integer user_id) {
        int id = 0;

        String nom = "";

        List<Departement> departements = departementRepository.findAll();
        for (Departement departement : departements) {
            Collection<MembreDepartement> membreDepartements = departement.getMembreDepartements();
            for (MembreDepartement membreDepartement : membreDepartements) {
                int id_memeber = membreDepartement.getId();

                if (id_memeber == user_id) {

                    nom = departement.getNomDepartement();
                    break;
                }


            }
        }
        return nom;
    }



}
