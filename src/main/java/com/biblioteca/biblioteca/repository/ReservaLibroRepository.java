package com.biblioteca.biblioteca.repository;

import com.biblioteca.biblioteca.entity.ReservaLibro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaLibroRepository extends JpaRepository<ReservaLibro, Long> {
}
