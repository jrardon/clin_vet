package com.clinica.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Mascota {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombreMascota;
    private String especie;
    private String raza;
    private String color;

    @OneToOne
    @JoinColumn(name = "dueno_id", referencedColumnName = "id")
    private Dueno dueno;

    public Mascota() {
    }

    public Mascota(Long id, String nombreMascota, String especie, String raza, String color) {
        this.id = id;
        this.nombreMascota = nombreMascota;
        this.especie = especie;
        this.raza = raza;
        this.color = color;
    }

}
