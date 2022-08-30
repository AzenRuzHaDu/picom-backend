package com.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.open.picom.business.TrancheHorraire;
import com.open.picom.dao.TrancheHorraireDao;
import com.open.picom.service.TrancheHorraireService;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class TrancheHorraireServiceImpl implements TrancheHorraireService {

	TrancheHorraireDao trancheHorraireDao;
	@Override
	public TrancheHorraire recupererTrancheHoraire(Long id) {
		return  trancheHorraireDao.findById(id).orElse(null);
		
	}
	@Override
	public List<TrancheHorraire> listeDesTranchesHoraires() {
		// TODO Auto-generated method stub
		return trancheHorraireDao.findAll();
	}

}
