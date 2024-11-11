package com.clinica.veterinaria.service;

import com.clinica.veterinaria.dto.MascotaDuenoDTO;
import com.clinica.veterinaria.model.Dueno;
import java.util.List;

public interface IDuenoService {

    //leer
    public List<Dueno> getDuenos();

    //alta
    public void saveDueno(Dueno duen);

    //modificacion
    public void editDueno(Dueno duen);

    //baja
    public void deleteDueno(Long id_dueno);
}
