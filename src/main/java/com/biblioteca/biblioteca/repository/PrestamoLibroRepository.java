package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.PrestamoLibro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoLibroRepository extends JpaRepository<PrestamoLibro,Long> {
}
