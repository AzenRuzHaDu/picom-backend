package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Diffusion;

public interface DiffusionDao extends JpaRepository<Diffusion, Long>{
    
}
