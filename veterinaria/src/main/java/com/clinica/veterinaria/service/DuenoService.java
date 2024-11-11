package com.clinica.veterinaria.service;

import com.clinica.veterinaria.dto.MascotaDuenoDTO;
import com.clinica.veterinaria.model.Dueno;
import com.clinica.veterinaria.repository.IDuenoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DuenoService implements IDuenoService {

    @Autowired
    private IDuenoRepository duenoRepo;

    @Override
    public List<Dueno> getDuenos() {
        List<Dueno> listaDueno = duenoRepo.findAll();
        return listaDueno;
    }

    @Override
    public void saveDueno(Dueno duen) {
        duenoRepo.save(duen);
    }

    @Override
    public void editDueno(Dueno duen) {
        this.saveDueno(duen);
    }

    @Override
    public void deleteDueno(Long id_dueno) {
        duenoRepo.deleteById(id_dueno);
    }


}
