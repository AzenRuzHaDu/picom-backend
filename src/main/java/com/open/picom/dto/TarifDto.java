package com.open.picom.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter

public class TarifDto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	private double prixEnEuro;
	
	@NotNull(message = "Merci d'entrer une tranche horraire")
	Long idTrancheHorraire;

	
	@NotNull(message = "Merci d'entrer une zone")
	Long  idZone;
	
	@NotNull
	Long idAdministrateur;
}
