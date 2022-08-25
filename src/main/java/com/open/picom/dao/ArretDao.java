package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Arret;

public interface ArretDao extends JpaRepository<Arret, Long> {
    
}
