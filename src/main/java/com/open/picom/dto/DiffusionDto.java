package com.open.picom.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class DiffusionDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    private Long id;
    @NotNull
    @NonNull
    private LocalDateTime dateHeureDiffusion;
    @NotNull
    @NonNull
    private Long idArret; 
    @NotNull
    @NonNull
    private Long idAnnonce;
}