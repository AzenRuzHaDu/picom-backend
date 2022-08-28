package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Utilisateur;

import lombok.NonNull;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {

	Utilisateur findByEmail(@NonNull String email);

	Utilisateur findLastByEmailAndMotDePasse(String email, String motDePasse);
    
}
