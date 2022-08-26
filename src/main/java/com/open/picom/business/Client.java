package com.open.picom.business;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@RequiredArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
@ToString
public class Client extends Utilisateur {

    @NotBlank(message="Merci d'entrer une valeur")
    @NonNull
    private String numeroDeTelephone;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Annonce> annonces;
    
}
