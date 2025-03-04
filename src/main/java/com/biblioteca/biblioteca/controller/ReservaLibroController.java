package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.entity.ReservaLibro;
import com.biblioteca.biblioteca.service.ReservaLibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/reservaLibro")
public class ReservaLibroController {
    @Autowired
    private ReservaLibroService reservaLibroService;

    @GetMapping
    public List<ReservaLibro> getAll(){
        return reservaLibroService.getReservaLibros();
    }

    @GetMapping("/{id_reserva}")
    public Optional<ReservaLibro> reservaLibro(@PathVariable("id_reserva") Long id_reserva){
        return reservaLibroService.getReservaLibroById(id_reserva);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody ReservaLibro reservaLibro){
        reservaLibroService.saveOrUpdate(reservaLibro);
    }

    @DeleteMapping("/{id_reserva}")
    public void deleteById(@PathVariable("id_reserva")Long id_reserva){
        reservaLibroService.deleteById(id_reserva);
    }
}
