package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.PrestamoLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrestamoLibroRepository extends JpaRepository<PrestamoLibro,Long> {
}
