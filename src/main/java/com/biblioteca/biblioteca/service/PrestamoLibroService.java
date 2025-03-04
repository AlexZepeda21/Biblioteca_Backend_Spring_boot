package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.PrestamoLibro;
import com.biblioteca.biblioteca.repository.PrestamoLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoLibroService {
    @Autowired
    PrestamoLibroRepository prestamoLibroRepository;

    public List<PrestamoLibro> getPrestamoLibros(){
        return prestamoLibroRepository.findAll();
    }

    public Optional<PrestamoLibro> getPrestamoLibroById(Long id_prestamo){
        return prestamoLibroRepository.findById(id_prestamo);
    }

    public void saveOrUpdate(PrestamoLibro prestamoLibro){
        prestamoLibroRepository.save(prestamoLibro);
    }

    public  void deleteById(Long id_prestamo){
        prestamoLibroRepository.deleteById(id_prestamo);
    }
}
