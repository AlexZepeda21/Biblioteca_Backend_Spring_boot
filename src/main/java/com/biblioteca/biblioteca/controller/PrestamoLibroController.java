package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.entity.PrestamoLibro;
import com.biblioteca.biblioteca.service.PrestamoLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/prestamoLibro")
public class PrestamoLibroController {
    @Autowired
    private PrestamoLibroService prestamoLibroService;

    @GetMapping
    public List<PrestamoLibro> getAll(){
        return prestamoLibroService.getPrestamoLibros();
    }

    @GetMapping("/{id_prestamo}")
    public Optional<PrestamoLibro> prestamoLibro(@PathVariable("id_prestamo")Long id_prestamo){
        return prestamoLibroService.getPrestamoLibroById(id_prestamo);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody PrestamoLibro prestamoLibro){
        prestamoLibroService.saveOrUpdate(prestamoLibro);
    }

    @DeleteMapping("/{id_prestamo}")
    public void deleteById(@PathVariable("id_prestamo")Long id_prestamo){
        prestamoLibroService.deleteById(id_prestamo);
    }
}
