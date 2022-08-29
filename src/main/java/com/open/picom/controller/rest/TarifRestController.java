package com.open.picom.controller.rest;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.open.picom.business.Tarif;
import com.open.picom.dto.TarifDto;
import com.open.picom.service.TarifService;
import com.open.picom.service.TrancheHorraireService;
import com.open.picom.service.UtilisateurService;
import com.open.picom.service.ZoneService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@AllArgsConstructor
@RequestMapping("/api/")
@Validated

public class TarifRestController {

	private final TarifService tarifService;
	private final TrancheHorraireService trancheHorraireService; 
	private final ZoneService zoneService;
	private final UtilisateurService utilisateurService;
	
	@GetMapping("tarifs")
	public List<Tarif> tarifGet(){
		
		return tarifService.listeDesTarifs();
		
	}
	
	@PostMapping(value = "TarifDto")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Tarif ajouterTarif(@Valid @RequestBody TarifDto tarifDto, BindingResult result) {
		Tarif tarif = new Tarif();
		tarif.setPrixEnEuro(tarifDto.getPrixEnEuro());
		tarif.setTrancheHorraire(trancheHorraireService.recupererTrancheHoraire(tarifDto.getIdTrancheHorraire()));
		tarif.setZone(zoneService.recupererZone(tarifDto.getIdZone()));
		tarif.setAdministrateur(utilisateurService.recupererUtilisateur(tarifDto.getIdAdministrateur()));
		tarifService.ajouterTarif(tarif);
		return tarif;
		
		
	}
	
}
