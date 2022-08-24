package com.open.picom.business;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
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
@EqualsAndHashCode(callSuper = false)
@ToString
public class Client extends Utilisateur {

    @NotBlank(message="Merci d'entrer une valeur")
    private String numeroDeTelephone;
    private List<Annonce> annonces = new ArrayList<>();
    
}
