package com.open.picom.business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import org.hibernate.validator.constraints.CreditCardNumber;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Annonce {
    @NotNull
    private Long id; 
    @NotNull
    private LocalDateTime dateHeureCreation; 
    @FutureOrPresent(message ="Merci d'entrer la date d'aujourd'hui ou une date future")
    private LocalDateTime dateHeureDebut;
    @FutureOrPresent(message ="Merci d'entrer la date d'aujourd'hui ou une date future")
    private LocalDateTime dateHeureFin;
    @NotBlank(message="Merci d'écrire du contenu")
    private String contenu;
    @NotBlank (message="Merci d'écrire du contenu")
    private String titre;
    @CreditCardNumber(message="Ce numéro de carte n'est aps valide")
    @NotBlank(message="Merci de renseigner votre numéro de carte")
    private String numeroCarte; 
    @NotNull(message="Merci d'entrer une valeur")
    @Min(value = 22, message="Merci d'entrer une valeur supérieure à 22")
    private int anneExpiration; 
    @NotNull(message="Merci d'entrer une valeur")
    private byte moisExpiration;
    @NotBlank(message="Merci d'entrer une valeur")
    private String cryptogramme; 
    @NotNull
    private double montantRegleEnEuros; 
    @NotEmpty
    private List<Zone> zones = new ArrayList<>();
    @NotEmpty
    private List<TrancheHorraire> trancheHorraires = new ArrayList<>();
    @NotNull
    private Client client;


    public Annonce() {
        this.titre = "Sans titre";
    } 


    

}
