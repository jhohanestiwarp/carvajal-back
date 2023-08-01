package com.alcaldia.appAlcaldia.controlador;

import com.alcaldia.appAlcaldia.modelos.Evidencia;
import com.alcaldia.appAlcaldia.repositorio.EvidenciaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/evidencia")
@CrossOrigin(origins = "http://localhost:4200")
public class EvidenciaControlador {

    @Autowired
    private EvidenciaRepositorio evidenciaRepositorio;

    @GetMapping
    public List<Evidencia> consultarEvidencia(){
        return evidenciaRepositorio.findAll();
    }

    @PostMapping
    public Evidencia guardarEvidencia(@RequestBody Evidencia evidencia ){
        return evidenciaRepositorio.save(evidencia);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") int id){
        evidenciaRepositorio.deleteById(id);
    }

    @PutMapping
    public Evidencia modificarTipoDocumento(@RequestBody Evidencia evidencia ){
        if(evidenciaRepositorio.existsById(evidencia.getId())){
            return evidenciaRepositorio.save(evidencia);
        }
        return null;
    }
    @GetMapping("/{id}")
    public Optional<Evidencia> consultarevidenciaId(@PathVariable("id") int id){
        return evidenciaRepositorio.findById(id);
    }

}