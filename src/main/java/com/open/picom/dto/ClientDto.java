package com.open.picom.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import com.open.picom.business.Annonce;
import com.open.picom.business.Client;
import com.open.picom.business.Utilisateur;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class ClientDto {
	
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
    @NotBlank(message="Merci d'entrer une valeur")
    @NonNull
    private String numeroDeTelephone;
  
    
}
