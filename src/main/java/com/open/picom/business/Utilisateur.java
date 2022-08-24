package com.open.picom.business;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Utilisateur {

    @NotNull
    private Long id;
    @NotBlank
    private String nom;
    @NotBlank
    private String prenom;
    @Email
    @NotBlank
    private String email;
    @NotBlank
    @Min(value = 8)
    private String motDePasse;

}
