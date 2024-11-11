package com.clinica.veterinaria.service;

import com.clinica.veterinaria.dto.MascotaDuenoDTO;
import com.clinica.veterinaria.model.Mascota;
import java.util.List;

public interface IMascotaService {

    //lectura
    public List<Mascota> getMascotas();

    //alta
    public void saveMascota(Mascota masco);

    //modificacion
    public void editMascota(Mascota masco);

    //baja
    public void deleteMascota(Long id_mascota);

    public List<Mascota> getMascotaEspecieRaza();

    //dto
    public List<MascotaDuenoDTO> getMascotaDueno();

//    //metodo para lectura de un solo objeto 
//    public Mascota findMascota(Long id_mascota);
}
