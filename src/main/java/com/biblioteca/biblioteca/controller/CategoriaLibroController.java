package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.entity.CategoriaLibro;
import com.biblioteca.biblioteca.service.CategoriaLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/categoriaLibro")
public class CategoriaLibroController {
    @Autowired
    private CategoriaLibroService categoriaLibroService;

    @GetMapping
    public List<CategoriaLibro> getAll(){
        return categoriaLibroService.getCategoriaLibros();
    }

    @GetMapping("/{id_categoria_libro}")
    public Optional<CategoriaLibro> categoriaLibro(@PathVariable("id_categoria_libro") long id_categoria_libro){
        return categoriaLibroService.getCategoriaLibroById(id_categoria_libro);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody CategoriaLibro categoriaLibro){
        categoriaLibroService.saveOrUpdate(categoriaLibro);
    }

    @DeleteMapping("/{id_categoria_libro}")
    public void deleteById (@PathVariable("id_categoria_libro") long id_categoria_libro){
        categoriaLibroService.deleteById(id_categoria_libro);
    }
}
