package com.open.picom.business;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Utilisateur {

    private Long id;
    private String nom;
    private String prenom; 
    private String email; 
    private String motDePasse; 

}
