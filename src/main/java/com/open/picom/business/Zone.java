package com.open.picom.business;

import java.util.ArrayList;
import java.util.List;

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

    private Long id; 
    private String nom;
    private List<Annonce> annonces = new ArrayList<Annonce>();
    private List<Arret> arrets = new ArrayList<Arret>();

}
