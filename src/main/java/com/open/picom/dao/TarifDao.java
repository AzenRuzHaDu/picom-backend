package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Tarif;

public interface TarifDao extends JpaRepository<Tarif, Long>{
    
}
