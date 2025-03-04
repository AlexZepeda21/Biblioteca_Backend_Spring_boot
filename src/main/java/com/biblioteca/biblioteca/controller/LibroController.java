package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.entity.Libro;
import com.biblioteca.biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/libro")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> getAll(){
        return libroService.getLibros();
    }

    @GetMapping("/{id_libro}")
    public Optional<Libro> libro (@PathVariable("id_libro") Long id_libro){
        return libroService.getLibroById(id_libro);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Libro libro){
        libroService.saveOrUpdate(libro);
    }

    @DeleteMapping("/{id_libro}")
    public void deleteById(@PathVariable("id_libro") Long id_libro){
        libroService.deleteById(id_libro);
    }
}
