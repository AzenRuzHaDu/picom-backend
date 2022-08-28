package com.open.picom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.open.picom.business.Client;
import com.open.picom.business.Diffusion;

public interface DiffusionDao extends JpaRepository<Diffusion, Long>{
	@Query("SELECT d, a FROM Diffusion d , Annonce a WHERE d.annonce = a.id and a.client = :idClient")
	List<Diffusion> listeDesDiffusionParClient(@Param("idClient") Client client);
			
}
