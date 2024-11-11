
package com.clinica.veterinaria.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class MascotaDuenoDTO {
    private String nombre_mascota;
    private String especie;
    private String raza;
    private String nombre_dueno;
    private String apellido_dueno;

    public MascotaDuenoDTO() {
    }

    public MascotaDuenoDTO(String nombre_mascota, String especie, String raza, String nombre_dueno, String apellido_dueno) {
        this.nombre_mascota = nombre_mascota;
        this.especie = especie;
        this.raza = raza;
        this.nombre_dueno = nombre_dueno;
        this.apellido_dueno = apellido_dueno;
    }

    
    
    
}
