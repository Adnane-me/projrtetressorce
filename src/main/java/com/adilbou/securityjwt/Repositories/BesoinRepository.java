package com.adilbou.securityjwt.Repositories;



import com.adilbou.securityjwt.Entities.Besoin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BesoinRepository extends JpaRepository<Besoin, Long> {

    List<Besoin> findBesoinByIdMembreDepartementAndIsAffectedIsFalse(String id);
    List<Besoin> findBesoinByIdDepartement(int id);
    List<Besoin> findBesoinByIdMembreDepartement(String id);
    Besoin findBesoinByIdMembreDepartementAndIsBesoinInAppelOffreIsFalse(String id);
    List<Besoin> findBesoinByIdDepartementAndIsBesoinInAppelOffreIsFalse(Long id);
    List<Besoin> findAllByIsBesoinInAppelOffreIsFalse();

    @Query(value = "SELECT * FROM besoin WHERE is_besoin_in_appel_offre IS NULL", nativeQuery = true)
    List<Besoin> findBesoinsNotInAppelOffre();


    Besoin findBesoinById(Long id);

    //List<Besoin> findBesoinByvalider();

    List<Besoin> findAllByValiderIsTrue();
}
