package com.clinica.veterinaria.controller;

import com.clinica.veterinaria.dto.MascotaDuenoDTO;
import com.clinica.veterinaria.model.Mascota;
import com.clinica.veterinaria.service.IMascotaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MascotaController {

    @Autowired
    private IMascotaService mascoServ;

    @PostMapping("/mascota/crear")
    public String createDueno(@RequestBody Mascota masco) {
        mascoServ.saveMascota(masco);
        return "Mascota creado correctamente";
    }

    @GetMapping("/mascota/leer")
    public List readMascota() {
        return mascoServ.getMascotas();
    }

    @PutMapping("/mascota/editar")
    public String editMascota(@RequestBody Mascota masco) {
        mascoServ.editMascota(masco);
        return "mascota editado correctamente";
    }

    @PostMapping("/mascota/borrar/{id_mascota}")
    public String deleteMascota(@PathVariable Long id_mascota) {
        mascoServ.deleteMascota(id_mascota);
        return "Mascota eliminado correctamente";
    }
    
    @GetMapping("/mascota/especie-raza")
    public List<Mascota> getEspecieRaza() {
        return mascoServ.getMascotaEspecieRaza();
    }
    
    @GetMapping("/mascota/mascota-dueno")
    public List<MascotaDuenoDTO> getMascotaDueno(){
        return mascoServ.getMascotaDueno();
    }
}
