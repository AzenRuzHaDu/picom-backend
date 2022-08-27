package com.open.picom.service.impl;

import com.open.picom.business.Arret;
import com.open.picom.dao.ArretDao;
import com.open.picom.service.ArretService;

public class ArretServiceImpl implements ArretService {

	ArretDao arretDao;
	
	@Override
	public Arret recupererArret(Long id) {
		return arretDao.findById(id).orElse(null);
	}

}
