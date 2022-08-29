package com.open.picom.business;

import javax.persistence.Entity;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Administrateur extends Utilisateur {
    private String role = "admin";
}
