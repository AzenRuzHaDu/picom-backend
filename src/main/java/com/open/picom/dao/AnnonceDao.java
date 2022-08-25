package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Annonce;

public interface AnnonceDao extends JpaRepository<Annonce, Long> {
    
}
