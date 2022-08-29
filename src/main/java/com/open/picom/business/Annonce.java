package com.open.picom.business;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.CreditCardNumber;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Annonce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private LocalDateTime dateHeureCreation;
    @NotNull
    @FutureOrPresent(message = "Merci d'entrer la date d'aujourd'hui ou une date future")
    private LocalDateTime dateHeureDebut;
    @FutureOrPresent(message = "Merci d'entrer la date d'aujourd'hui ou une date future")
    @NotNull
    private LocalDateTime dateHeureFin;
    @NotBlank(message = "Merci d'écrire du contenu")
    @Lob
    private String contenu;
    @NotBlank(message = "Merci d'écrire du contenu")
    private String titre = "Sans Titre";
    @CreditCardNumber(message = "Ce numéro de carte n'est aps valide")
    @NotBlank(message = "Merci de renseigner votre numéro de carte")
    private String numeroCarte;
    @NotNull(message = "Merci d'entrer une valeur")
    @Min(value = 22, message = "Merci d'entrer une valeur supérieure à 22")
    private int anneeExpiration;
    @NotNull(message = "Merci d'entrer une valeur")
    private byte moisExpiration;
    @NotBlank(message = "Merci d'entrer une valeur")
    private String cryptogramme;
    @NotNull
    @Min(value = 1)
    private double montantRegleEnEuros;
    @NotEmpty(message = "Merci d'entrer une valeur")
    @ManyToMany
    private List<Zone> zones;
    @NotEmpty(message = "Merci d'entrer une valeur")
    @ManyToMany
    private List<TrancheHorraire> trancheHorraires;
    @NotNull
    @ManyToOne
    @JsonIgnore
    private Client client;

   
   

}
