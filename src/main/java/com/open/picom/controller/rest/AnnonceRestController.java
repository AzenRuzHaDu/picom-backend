package com.open.picom.controller.rest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.open.picom.business.Annonce;
import com.open.picom.business.Tarif;
import com.open.picom.business.TrancheHorraire;
import com.open.picom.business.Zone;
import com.open.picom.dto.AnnonceDto;
import com.open.picom.dto.TarifDto;
import com.open.picom.service.AnnonceService;
import com.open.picom.service.TrancheHorraireService;
import com.open.picom.service.UtilisateurService;
import com.open.picom.service.ZoneService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
@Validated
public class AnnonceRestController {

	private final AnnonceService annonceService;
	private final UtilisateurService utilisateurService;
	private final ZoneService zoneService;
	private final TrancheHorraireService trancheHorraireService;
	
	private List<Zone> zones;
	private List<Long> idZone;
	
	private List<TrancheHorraire> trancheHorraires;
	private List<Long> idTrancheHorraire;
	
	@GetMapping ("annonces/{idClient}")
	public List<Annonce> annonceGet(@PathVariable Long idClient) {
		
		return annonceService.listeDesAnnonces(idClient);
		
	}
	
	@PostMapping(value = "Annonce")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Annonce ajouterAnnonce(@Valid @RequestBody AnnonceDto annonceDto, BindingResult result) {
		Annonce annonce = new Annonce();
		
		annonce.setDateHeureCreation(LocalDateTime.now());
		annonce.setDateHeureDebut(annonceDto.getDateHeureDebut());
		annonce.setDateHeureFin(annonceDto.getDateHeureFin());
		annonce.setContenu(annonceDto.getContenu());
		annonce.setNumeroCarte(annonceDto.getNumeroCarte());
		annonce.setAnneeExpiration(annonceDto.getAnneeExpiration());
		annonce.setMoisExpiration(annonceDto.getMoisExpiration());
		annonce.setCryptogramme(annonceDto.getCryptogramme());
		annonce.setMontantRegleEnEuros(annonceDto.getMontantRegleEnEuros());
	
		//recuperation du client
		annonce.setClient(utilisateurService.recupererClient(annonceDto.getIdClient()));
		
//		//récuperation des Zones
		idZone = annonceDto.getIdZones();
		idZone.forEach(zone ->
				zones.add(zoneService.recupererZone(zone))
				);
		annonce.setZones(zones);
		
//		//recupération des trancheHorraires
		idTrancheHorraire = annonceDto.getIdTrancheHorraires() ;
		idTrancheHorraire.forEach(th ->
				trancheHorraires.add(trancheHorraireService.recupererTrancheHoraire(th))
			);
		annonce.setTrancheHorraires(trancheHorraires);
		
		annonceService.ajouterAnnonce(annonce);
		
		return annonce;
	}
		
	
}
