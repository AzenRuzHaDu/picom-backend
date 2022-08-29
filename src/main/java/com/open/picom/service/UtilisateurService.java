package com.open.picom.service;

import javax.validation.Valid;

import com.open.picom.business.Administrateur;
import com.open.picom.business.Client;
import com.open.picom.business.Utilisateur;
import com.open.picom.dto.ClientDto;

public interface UtilisateurService {

	// enregitrement d'un utilisateur administrateur
	Administrateur enregistrerAdministrateur(@Valid Administrateur admin);

	// enregistrement d'un utilisateur client
	Client enregistrerClient(@Valid Client client);

	// enregistrement d'un utilisateur client dto
	//ClientDto enregistrerClient(@Valid ClientDto clientDto);

	// recherche d'un utilisateur avec son mail et mot de passe
	Utilisateur recupererUtilisateur(String email, String motDePasse);

	Utilisateur recupererUtilisateur(String email);
	
	Administrateur recupererUtilisateur(Long id);
	
	Client recupererClient(Long id);

}
