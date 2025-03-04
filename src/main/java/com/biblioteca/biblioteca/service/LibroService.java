package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Libro;
import com.biblioteca.biblioteca.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService {
    @Autowired
    LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.findAll();
    }

    public Optional<Libro> getLibroById(Long id_libro){
        return libroRepository.findById(id_libro);
    }

    public void saveOrUpdate(Libro libro){
        libroRepository.save(libro);
    }

    public void deleteById(Long id_libro){
        libroRepository.deleteById(id_libro);
    }

}
