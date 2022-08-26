package com.open.picom.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.NonNull;

public class AdministrateurDto {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NonNull
    private String nom;
    @NotBlank
    @NonNull
    private String prenom;
    @Email(message = "Merci d'entrer un mail")
    @NotBlank
    @NonNull
    private String email;
    @NotBlank
    @NonNull
    @Length(min = 2)
    private String motDePasse;
}
