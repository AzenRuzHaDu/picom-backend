package com.open.picom.service.impl;

import java.awt.print.Pageable;
import java.util.List;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.open.picom.business.Tarif;
import com.open.picom.dao.TarifDao;
import com.open.picom.dto.TarifDto;
import com.open.picom.service.TarifService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TarifServiceImpl implements TarifService {

	private final TarifDao tarifDao;
	@Override
	public List<Tarif> listeDesTarifs() {
		return tarifDao.findAll();
	}

	@Override
	public Tarif ajouterTarif(@Valid Tarif tarif) {
		tarifDao.save(tarif);
		return tarif;
	}

}
