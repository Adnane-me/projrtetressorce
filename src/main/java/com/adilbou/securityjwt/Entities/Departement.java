package com.adilbou.securityjwt.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;

@Entity
@Builder @NoArgsConstructor @AllArgsConstructor @Data
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nomDepartement;
    @OneToMany(mappedBy = "departement")
    private Collection<MembreDepartement> membreDepartements = new ArrayList<>();

}
