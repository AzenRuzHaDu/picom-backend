package com.open.picom.business;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

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
public class Tarif {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    private Long id;
    @NotNull
    private double prixEnEuro;
    @NotNull(message="Merci d'entrer une tranche horraire")
    
    @ManyToOne(fetch=FetchType.EAGER)
    private TrancheHorraire trancheHorraire;
    @NotNull (message="Merci d'entrer une zone")
    @ManyToOne(fetch=FetchType.EAGER)
    private Zone zone;
    @NotNull
    @ManyToOne(fetch=FetchType.EAGER)
    
    private Administrateur administrateur;

    public Tarif(double prixEnEuro,TrancheHorraire trancheHorraire,
            Zone zone, Administrateur administrateur) {
        this.prixEnEuro = prixEnEuro;
        this.trancheHorraire = trancheHorraire;
        this.zone = zone;
        this.administrateur = administrateur;
    }

    

}
