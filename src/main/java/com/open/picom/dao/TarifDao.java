package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Tarif;
import com.open.picom.dto.TarifDto;

public interface TarifDao extends JpaRepository<Tarif, Long>{

    TarifDto save(TarifDto tarifdto);
}
