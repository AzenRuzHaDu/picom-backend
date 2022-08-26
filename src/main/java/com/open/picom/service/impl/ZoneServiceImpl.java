package com.open.picom.service.impl;

import org.springframework.stereotype.Service;

import com.open.picom.business.Zone;
import com.open.picom.dao.ZoneDao;
import com.open.picom.service.ZoneService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ZoneServiceImpl implements ZoneService {

	ZoneDao zoneDao;
	@Override
	public Zone recupererZone(Long id) {
		return zoneDao.findById(id).orElse(null);
			
	}

}
