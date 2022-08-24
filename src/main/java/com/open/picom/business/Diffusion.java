package com.open.picom.business;

import java.time.LocalDateTime;

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

public class Diffusion {
@NotNull
    private Long id;
    @NotNull
    private LocalDateTime dateHeureDiffusion;
    @NotNull
    private Arret arret; 
    @NotNull
    private Annonce annonce;

}
