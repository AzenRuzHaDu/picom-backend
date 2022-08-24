package com.open.picom.business;

import javax.validation.constraints.NotBlank;
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
public class Arret {

private Long id;
@NotBlank(message="Merci d'entrer une valeur")
private String nom;
@NotNull(message="Merci d'entrer une valeur")   
private double longitude;
@NotNull(message="Merci d'entrer une valeur")   
private double latitude;
@NotNull(message="Merci d'entrer une valeur")
private Zone zone;
}
