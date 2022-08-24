package com.open.picom.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

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

public class Annonce {
    private Long id; 
    private LocalDateTime dateHeureCreation; 
    private LocalDateTime dateHeureDebut;
    private LocalDateTime dateHeureFin;
    private String contenu; 
    private String titre;
    private String numeroCarte; 
    private int anneExpiration; 
    private byte moisExpiration;
    private String cryptogramme; 
    private double montantRegleEnEuros; 
    private List<Zone> zones = new ArrayList<Zone>();
    private List<TrancheHorraire> trancheHorraires = new ArrayList<TrancheHorraire>();
    private Client client; 

}
