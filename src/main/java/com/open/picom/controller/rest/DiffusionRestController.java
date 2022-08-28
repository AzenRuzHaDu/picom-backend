package com.open.picom.controller.rest;

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
import com.open.picom.business.Client;
import com.open.picom.business.Diffusion;
import com.open.picom.business.Tarif;
import com.open.picom.business.TrancheHorraire;
import com.open.picom.business.Zone;
import com.open.picom.dto.DiffusionDto;
import com.open.picom.dto.TarifDto;
import com.open.picom.service.AnnonceService;
import com.open.picom.service.ArretService;
import com.open.picom.service.DiffusionService;
import com.open.picom.service.TrancheHorraireService;
import com.open.picom.service.UtilisateurService;
import com.open.picom.service.ZoneService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/")
@Validated
public class DiffusionRestController {
	private final AnnonceService annonceService;
	//private final ArretService arretService;
	private final DiffusionService diffusionService;
	private final UtilisateurService utilisateurService;
	
	
//	@PostMapping(value = "Diffusion")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public Diffusion ajouterDiffusion(@Valid @RequestBody DiffusionDto diffusionDto, BindingResult result) {
//		Diffusion diffusion = new Diffusion();
//		diffusion.setDateHeureDiffusion(diffusionDto.getDateHeureDiffusion());
//		diffusion.setAnnonce(annonceService.);
//		return null;
//		
//	
//	}
	
	@GetMapping ("diffusion/{idClient}")
	public List<Diffusion> diffusionGet(@PathVariable Long idClient) {
		Client client = new Client();
		client = utilisateurService.recupererClient(idClient);
		return diffusionService.listeDesDiffusions(client);
		
	}
}
