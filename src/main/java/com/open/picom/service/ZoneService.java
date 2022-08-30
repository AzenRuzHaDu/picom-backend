package com.open.picom.service;

import java.util.List;

import com.open.picom.business.Zone;

public interface ZoneService {

	public Zone recupererZone(Long id);
		
	public List<Zone> listeDesZones(); 
}
