package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.TrancheHorraire;

public interface TrancheHorraireDao extends JpaRepository<TrancheHorraire, Long> {
    
}
