package com.biblioteca.biblioteca.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name="libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_libro;

    private String titulo;
    private String autor;
    private String editorial;
    private Date year_publicacion;
    private Integer stock;
    private String estado;

    @ManyToOne
    @JoinColumn(name = "categoria_id", referencedColumnName = "id_categoria_libro")
    private CategoriaLibro categoriaLibro;


}
