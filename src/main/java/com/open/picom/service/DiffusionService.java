package com.open.picom.service;

import java.util.List;

import com.open.picom.business.Diffusion;

public interface DiffusionService {

	List<Diffusion> listeDesDiffusions();
	
	Diffusion recupererDiffusion (Long id);
	
	
}
