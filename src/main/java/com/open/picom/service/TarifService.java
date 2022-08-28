package com.open.picom.service;

import java.util.List;

import javax.validation.Valid;

import com.open.picom.business.Tarif;
import com.open.picom.dto.TarifDto;

public interface TarifService {

	public List<Tarif> listeDesTarifs();
	
	public Tarif ajouterTarif(@Valid Tarif tarif);

	
	
	
}
