package com.adilbou.securityjwt.service;




import com.adilbou.securityjwt.Entities.Imprimante;

import java.util.List;

public interface ImprimanteService {

    Imprimante addImprimante(Imprimante imprimante);
    List<Imprimante> getAllImprimantes();
    List<Imprimante> getImprimantesByMembreDepartement(String id);
    List<Imprimante> getImprimantesByDepartement(Long id);
    List<Imprimante> getImprimantesByFournisseur(String id);
    Imprimante getImprimante(Long id);
    Imprimante updateImprimante(Imprimante imprimante);
    void deleteImprimante(Long id);

}
