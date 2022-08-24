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
public class Tarif {

    private Long id;
    private double prixEnEuro; 
    private TrancheHorraire trancheHorraire; 
    private Zone zone;
    private Administrateur administrateur; 
    
}
