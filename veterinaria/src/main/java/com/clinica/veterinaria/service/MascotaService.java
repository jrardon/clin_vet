package com.clinica.veterinaria.service;

import com.clinica.veterinaria.dto.MascotaDuenoDTO;
import com.clinica.veterinaria.model.Mascota;
import com.clinica.veterinaria.repository.IMascotaRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MascotaService implements IMascotaService {

    @Autowired
    private IMascotaRepository mascoRepo;

    @Override
    public List<Mascota> getMascotas() {
        List<Mascota> listaMascota = mascoRepo.findAll();
        return listaMascota;
    }

    @Override
    public void saveMascota(Mascota masco) {
        mascoRepo.save(masco);
    }

    @Override
    public void editMascota(Mascota masco) {
        this.saveMascota(masco);
    }

    @Override
    public void deleteMascota(Long id_mascota) {
        mascoRepo.deleteById(id_mascota);
    }

    @Override
    public List<Mascota> getMascotaEspecieRaza() {

        String especie = "perro";
        String raza = "caniche";
        String textoComparar1;
        String textoComparar2;

        List<Mascota> listaMascotas = this.getMascotas();
        List<Mascota> listaMascotaEspecieRaza = new ArrayList<>();

        for (Mascota masco : listaMascotas) {
            textoComparar1 = masco.getEspecie();
            textoComparar2 = masco.getRaza();
            boolean contieneEspecie = textoComparar1.equalsIgnoreCase(especie);
            boolean contieneRaza = textoComparar2.equalsIgnoreCase(raza);
            if (contieneEspecie == true && contieneRaza == true) {
                listaMascotaEspecieRaza.add(masco);
            }
        }
        return listaMascotaEspecieRaza;

    }

    @Override
    public List<MascotaDuenoDTO> getMascotaDueno() {

        List<Mascota> listaMascotas = this.getMascotas();//obtener todas mascotas
        List<MascotaDuenoDTO> listaMascotaDueno = new ArrayList<>();
        MascotaDuenoDTO mascota_dueno = new MascotaDuenoDTO();

        for (Mascota masco : listaMascotas) {

            System.out.println(masco.getNombreMascota());
            mascota_dueno.setNombre_mascota(masco.getNombreMascota());
            mascota_dueno.setEspecie(masco.getEspecie());
            mascota_dueno.setRaza(masco.getRaza());
            mascota_dueno.setNombre_dueno(masco.getDueno().getNombreDueno());
            mascota_dueno.setApellido_dueno(masco.getDueno().getApellido());
            listaMascotaDueno.add(mascota_dueno);
            mascota_dueno = new MascotaDuenoDTO();//reseteo
        }
        return listaMascotaDueno;
    }

}
