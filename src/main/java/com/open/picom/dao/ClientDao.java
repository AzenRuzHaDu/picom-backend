package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Client;
import com.open.picom.business.Utilisateur;
import com.open.picom.dto.ClientDto;

import lombok.NonNull;

public interface ClientDao extends JpaRepository<Client, Long> {

	Utilisateur findByEmail(@NonNull String email);
    
	ClientDto save(ClientDto clientDto);
}
