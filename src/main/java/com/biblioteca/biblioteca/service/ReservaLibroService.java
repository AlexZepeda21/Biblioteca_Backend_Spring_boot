package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.ReservaLibro;
import com.biblioteca.biblioteca.repository.ReservaLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservaLibroService {
    @Autowired
    ReservaLibroRepository reservaLibroRepository;

    public List<ReservaLibro> getReservaLibros(){
        return reservaLibroRepository.findAll();
    }

    public Optional<ReservaLibro> getReservaLibroById(Long id_reserva){
        return reservaLibroRepository.findById(id_reserva);
    }

    public void saveOrUpdate(ReservaLibro reservaLibro){
       reservaLibroRepository.save(reservaLibro);
    }

    public void deleteById(Long id_reserva){
        reservaLibroRepository.deleteById(id_reserva);
    }

}
