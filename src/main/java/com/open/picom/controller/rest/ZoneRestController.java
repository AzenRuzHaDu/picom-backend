package com.open.picom.controller.rest;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.picom.business.Zone;
import com.open.picom.service.ZoneService;

import lombok.AllArgsConstructor;

@RestController
@CrossOrigin(origins = "http://localhost:4200/", maxAge = 3600)
@AllArgsConstructor
@RequestMapping("/api/")

public class ZoneRestController {

    private final ZoneService zoneService;
    
@GetMapping("zones")
public List<Zone> zonesGet() {

    return zoneService.listeDesZones();

}


}
