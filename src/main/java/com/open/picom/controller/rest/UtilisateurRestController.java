package com.open.picom.controller.rest;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.open.picom.business.Administrateur;
import com.open.picom.business.Client;
import com.open.picom.dto.AdministrateurDto;
import com.open.picom.dto.ClientDto;
import com.open.picom.service.UtilisateurService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/")
@AllArgsConstructor
@Validated
public class UtilisateurRestController {

	private final UtilisateurService utilisateurService;
	
	@PostMapping(value = "ClientDto")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Client ajouterClient(@Valid @RequestBody ClientDto clientDto, BindingResult result) {

		Client client = new Client();
		client.setNom(clientDto.getNom());
		client.setPrenom(clientDto.getPrenom());
		client.setEmail(clientDto.getEmail());
		client.setMotDePasse(clientDto.getMotDePasse());
		client.setNumeroDeTelephone(clientDto.getNumeroDeTelephone());
		utilisateurService.enregistrerClient(client);
		return client;
	}
	
//	@PostMapping(value = "AdministrateurDto")
//	@ResponseStatus(code = HttpStatus.CREATED)
//	public Administrateur ajouterAdministrateur(@Valid @RequestBody AdministrateurDto administrateurDto, BindingResult result) {
//
//		Administrateur client = new Administrateur();
//		client.setNom(AdministrateurDto.getNom());
//		client.setPrenom(AdministrateurDto.getPrenom());
//		client.setEmail(AdministrateurDto.getEmail());
//		client.setMotDePasse(clientDto.getMotDePasse());
//		client.setNumeroDeTelephone(clientDto.getNumeroDeTelephone());
//		utilisateurService.enregistrerClient(client);
//		return client;
//	}
}