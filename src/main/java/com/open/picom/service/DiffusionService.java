package com.open.picom.service;

import java.util.List;

import com.open.picom.business.Client;
import com.open.picom.business.Diffusion;

public interface DiffusionService {

	List<Diffusion> listeDesDiffusions(Client client);
	
	Diffusion recupererDiffusion (Long id);
	
	
}
