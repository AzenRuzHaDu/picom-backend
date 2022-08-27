package com.open.picom.service.impl;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.open.picom.business.Administrateur;
import com.open.picom.business.Client;
import com.open.picom.business.Utilisateur;
import com.open.picom.dao.AdministrateurDao;
import com.open.picom.dao.ClientDao;
import com.open.picom.dao.UtilisateurDao;
import com.open.picom.dto.ClientDto;
import com.open.picom.service.UtilisateurService;

import exception.clientExistantException;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements UtilisateurService {

	private final AdministrateurDao administrateurDao;
	private final ClientDao clientDao;
	private final UtilisateurDao utilisateurDao;
	
	

	@Override
	public Utilisateur recupererUtilisateur(String email, String motDePasse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Administrateur enregistrerAdministrateur(@Valid Administrateur admin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client enregistrerClient(@Valid Client client) {
		if (clientDao.findByEmail(client.getEmail())!=null) {
			throw new clientExistantException();
		}
		clientDao.save(client);
		return client;
		
	}

	@Override
	public Utilisateur recupererUtilisateur(String email) {
		return utilisateurDao.findByEmail(email);
		
	}

	@Override
	public ClientDto enregistrerClient(@Valid ClientDto clientDto) {
		if (clientDao.findByEmail(clientDto.getEmail())!=null) {
			throw new clientExistantException();
		}
		clientDao.save(clientDto);
		return clientDto;		
	}

	@Override
	public Administrateur recupererUtilisateur(Long id) {
		return administrateurDao.findById(id).orElse(null);
		
	}

	@Override
	public Client recupererClient(Long id) {
		return clientDao.findById(id).orElse(null);
	}

}
