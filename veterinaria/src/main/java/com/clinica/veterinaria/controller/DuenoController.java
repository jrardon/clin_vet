
package com.clinica.veterinaria.controller;

import com.clinica.veterinaria.model.Dueno;
import com.clinica.veterinaria.service.IDuenoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DuenoController {
    @Autowired
    private IDuenoService duenoServ;
    
    @PostMapping("/dueno/crear")
    public String createDueno(@RequestBody Dueno duen){
        duenoServ.saveDueno(duen);
        return "Dueno creado correctamente";
    }
    
    @GetMapping("/dueno/leer")
    public List readDueno(){
        List<Dueno> listaDueno = duenoServ.getDuenos();
        return listaDueno;
    }
    
    @PutMapping("/dueno/editar")
    public String editDueno(@RequestBody Dueno duen){
        duenoServ.editDueno(duen);
        return "Dueno editado correctamente";
    }
    
    @PostMapping("/dueno/borrar/{id_dueno}")
    public String deleteDueno(@PathVariable Long id_dueno){
        duenoServ.deleteDueno(id_dueno);
        return "Dueno eliminado correctamente";
    }
}
