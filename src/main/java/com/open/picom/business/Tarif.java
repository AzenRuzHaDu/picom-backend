package com.open.picom.business;

import javax.validation.constraints.NotNull;

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
@NotNull
    private Long id;
    @NotNull
    private double prixEnEuro; 
    @NotNull
    private TrancheHorraire trancheHorraire; 
    @NotNull
    private Zone zone;
    @NotNull
    private Administrateur administrateur; 
    
}
