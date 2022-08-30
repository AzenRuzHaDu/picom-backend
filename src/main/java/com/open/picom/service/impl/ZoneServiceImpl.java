package com.open.picom.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.open.picom.business.Zone;
import com.open.picom.dao.ZoneDao;
import com.open.picom.service.ZoneService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ZoneServiceImpl implements ZoneService {

	
	private final ZoneDao zoneDao;

	@Override
	public Zone recupererZone(Long id) {
		return zoneDao.findById(id).orElse(null);
			
	}

	@Override
	public List<Zone> listeDesZones() {
		
		return zoneDao.findAll();
	}

	

}
