package com.adilbou.securityjwt.Repositories;



import com.adilbou.securityjwt.Entities.Departement;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartementRepository extends JpaRepository<Departement, Integer> {

    Page<Departement> findAll(Pageable pageable);
    Departement getDepartementByNomDepartement(String name);



}
