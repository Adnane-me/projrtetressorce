package com.adilbou.securityjwt.Repositories;


import com.adilbou.securityjwt.Entities.Imprimante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ImprimanteRepository extends JpaRepository<Imprimante, Long> {

    public List<Imprimante> getImprimanteByIdMembreDepartement(String id);
    public List<Imprimante> getImprimanteByIdDepartement(Long id);
    public List<Imprimante> getImprimanteByIdFournisseur(String id);

}
