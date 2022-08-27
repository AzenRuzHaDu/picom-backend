package com.open.picom.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.open.picom.business.Diffusion;
import com.open.picom.dao.AdministrateurDao;
import com.open.picom.dao.ClientDao;
import com.open.picom.dao.DiffusionDao;
import com.open.picom.dao.UtilisateurDao;
import com.open.picom.service.DiffusionService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DiffusionServiceImpl implements DiffusionService {

	DiffusionDao diffusionDao;
	@Override
	public List<Diffusion> listeDesDiffusions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Diffusion recupererDiffusion(Long id) {
		return diffusionDao.findById(id).orElse(null);
	}

}
