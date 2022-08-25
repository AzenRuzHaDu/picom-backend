package com.open.picom.business;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

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
public class Arret {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Merci d'entrer une valeur")
    private String nom;
    @NotNull(message = "Merci d'entrer une valeur")
    private double longitude;
    @NotNull(message = "Merci d'entrer une valeur")
    private double latitude;
    @NotNull(message = "Merci d'entrer une valeur")
    @ManyToOne(fetch = FetchType.EAGER)
    private Zone zone;

    public Arret(String nom,
            double latitude,
            double longitude,
            Zone zone) {
        this.nom = nom;
        this.longitude = longitude;
        this.latitude = latitude;
        this.zone = zone;
    }

}
