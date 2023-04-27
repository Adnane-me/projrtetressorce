package com.adilbou.securityjwt.Entities;

//import com.GRFST.Gestion_de_ressources.entities.token.Token;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


import java.util.ArrayList;
import java.util.List;

@Entity
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    int id;
    private String userName;
    private String password;
    private String cin;
    private String nom;
    private String prenom;
    private String email;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Role> roles = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    @JsonIgnore
    private List<Token> tokens = new ArrayList<>();

}