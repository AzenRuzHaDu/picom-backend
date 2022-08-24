package com.open.picom.business;

import java.time.LocalDateTime;

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

public class Diffusion {

    private Long id;
    private LocalDateTime dateHeureDiffusion;
    private Arret arret; 
    private Annonce annonce;

}
