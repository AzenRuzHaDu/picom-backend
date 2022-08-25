package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Zone;

public interface ZoneDao extends JpaRepository<Zone, Long> {
    
}