package com.adilbou.securityjwt.Entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@SuperBuilder
@AllArgsConstructor @NoArgsConstructor @Data
public class MembreDepartement extends User{
    private String domaineExpertise;
    private String laboratoire;

    @ManyToOne
    @JsonBackReference
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Departement departement;

}
