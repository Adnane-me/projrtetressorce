package com.adilbou.securityjwt.service;




import com.adilbou.securityjwt.Entities.Ordinateur;

import java.util.List;

public interface OrdinateurService {

    Ordinateur addOrdinateur(Ordinateur ordinateur);
    List<Ordinateur> getAllOrdinateurs();
    List<Ordinateur> getOrdinateursByMembreDepartement(String id);
    List<Ordinateur> getOrdinateursByDepartement(Long id);
    List<Ordinateur> getOrdinateursByFournisseur(String id);
    Ordinateur getOrdinateur(Long id);
    Ordinateur updateOrdinateur(Ordinateur ordinateur);

    void deleteOrdinateur(Long id);

}
