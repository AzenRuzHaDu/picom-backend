package com.open.picom.dto;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.NonNull;

@Getter
public class LoginDto {


    @NotBlank
    @NonNull
    private String email;
    @NotBlank
    @NonNull
    @Length(min = 2)
    private String motDePasse;
}
