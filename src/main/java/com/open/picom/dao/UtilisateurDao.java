package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Utilisateur;

public interface UtilisateurDao extends JpaRepository<Utilisateur, Long> {
    
}
