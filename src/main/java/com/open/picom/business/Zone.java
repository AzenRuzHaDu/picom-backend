package com.open.picom.business;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
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
public class Zone {
    @NotNull
    private Long id;
    @NotBlank
    private String nom;
    private List<Annonce> annonces = new ArrayList<>();
    @NotEmpty
    private List<Arret> arrets = new ArrayList<>();

}
