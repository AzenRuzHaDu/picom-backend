package com.open.picom.service;

import java.util.List;

import javax.validation.Valid;

import com.open.picom.business.Annonce;

public interface AnnonceService {
	
	List<Annonce> listeDesAnnonces();
	
	Annonce ajouterAnnonce(@Valid Annonce annonce);
}
