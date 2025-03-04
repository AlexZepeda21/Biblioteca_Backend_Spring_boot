package com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "reservaLibro")
public class ReservaLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_reserva;
    private Date fecha_reserva;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "libro_id", referencedColumnName = "id_libro")
    private Libro libro;


}
