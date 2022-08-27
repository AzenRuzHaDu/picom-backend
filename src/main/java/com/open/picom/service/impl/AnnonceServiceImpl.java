package com.open.picom.service.impl;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.open.picom.business.Annonce;
import com.open.picom.dao.AnnonceDao;
import com.open.picom.dao.TarifDao;
import com.open.picom.service.AnnonceService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AnnonceServiceImpl implements AnnonceService {

	AnnonceDao annonceDao;
	@Override
	public List<Annonce> listeDesAnnonces(Long idClient) {
		return annonceDao.findByIdClient(idClient);
		
	}

	@Override
	public Annonce ajouterAnnonce(@Valid Annonce annonce) {
		annonceDao.save(annonce);
		return annonce;
	}

	
}
