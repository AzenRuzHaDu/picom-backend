package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Administrateur;

public interface AdministrateurDao extends JpaRepository<Administrateur, Long> {
    
}
