package com.open.picom.service;

import java.util.List;

import com.open.picom.business.TrancheHorraire;

public interface TrancheHorraireService {

	public TrancheHorraire recupererTrancheHoraire(Long id);
	
	public List<TrancheHorraire> listeDesTranchesHoraires();
}
