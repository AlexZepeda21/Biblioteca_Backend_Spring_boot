package com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "prestamoLibro")
public class PrestamoLibro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_prestamo;

    private Date fecha_prestamo;
    private Date fecha_devolucion;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "libro_id", referencedColumnName = "id_libro")
    private Libro libro;

}
