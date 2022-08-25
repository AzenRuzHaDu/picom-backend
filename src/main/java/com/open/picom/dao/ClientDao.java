package com.open.picom.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.open.picom.business.Client;

public interface ClientDao extends JpaRepository<Client, Long> {
    
}
