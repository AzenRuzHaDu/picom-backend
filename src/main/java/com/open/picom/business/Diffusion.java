package com.open.picom.business;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Diffusion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
    @NotNull
    @NonNull
    private LocalDateTime dateHeureDiffusion;
    @NotNull
    @NonNull
    private Arret arret; 
    @NotNull
    @NonNull
    private Annonce annonce;
//TODO add messages and many to one
}
