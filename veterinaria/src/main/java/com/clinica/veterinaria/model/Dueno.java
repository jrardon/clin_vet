package com.clinica.veterinaria.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Dueno {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String dni;
    private String nombreDueno;
    private String apellido;
    private String celular;

    public Dueno() {
    }

    public Dueno(Long id, String dni, String nombreDueno, String apellido, String celular) {
        this.id = id;
        this.dni = dni;
        this.nombreDueno = nombreDueno;
        this.apellido = apellido;
        this.celular = celular;
    }


}
