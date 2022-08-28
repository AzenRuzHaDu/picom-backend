package com.open.picom.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.open.picom.business.Annonce;

public interface AnnonceDao extends JpaRepository<Annonce, Long> {

	@Query ("select a from Annonce a where a.client.id= :idClient")
	List<Annonce> findByIdClient(@Param("idClient") Long idClient);
    
}
