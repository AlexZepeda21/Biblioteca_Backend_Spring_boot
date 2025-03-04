package com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "categoriaLibro")
public class CategoriaLibro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria_libro;

    private String nombre_categoria;
    private String descripcion;

}
