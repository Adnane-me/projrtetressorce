package com.adilbou.securityjwt.service;


import ma.team.gestion_ressources.entities.MembreDepartement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreDepartementRepository extends JpaRepository<MembreDepartement,Integer> {

    MembreDepartement findMembreDepartementById(int id);
//    List<MembreDepartement> findMembreDepartementByIdDepartement(Long id);

}
