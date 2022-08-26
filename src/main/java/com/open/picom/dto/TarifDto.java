package com.open.picom.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class TarifDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private double prixEnEuro;
	
	@NotNull(message = "Merci d'entrer une tranche horraire")
	long idTrancheHorraire;
	
	@NotNull(message = "Merci d'entrer une zone")
	long  idZone;
	
	@NotNull
	long idAdministrateur;
}
