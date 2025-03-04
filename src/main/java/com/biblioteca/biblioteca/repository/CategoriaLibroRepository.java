package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.CategoriaLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaLibroRepository extends JpaRepository<CategoriaLibro,Long> {
}
