package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.CategoriaLibro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaLibroRepository extends JpaRepository<CategoriaLibro,Long> {
}
