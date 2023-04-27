package com.adilbou.securityjwt.Repositories;



import com.adilbou.securityjwt.Entities.MembreDepartement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreDepartementRepository extends JpaRepository<MembreDepartement,Integer> {

    MembreDepartement findMembreDepartementById(int id);
//    List<MembreDepartement> findMembreDepartementByIdDepartement(Long id);

}
