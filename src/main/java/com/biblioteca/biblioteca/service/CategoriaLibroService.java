package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.CategoriaLibro;
import com.biblioteca.biblioteca.repository.CategoriaLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaLibroService {
   @Autowired
    CategoriaLibroRepository categoriaLibroRepository;

   public List<CategoriaLibro> getCategoriaLibros(){
       return categoriaLibroRepository.findAll();
   }

    public Optional<CategoriaLibro> getCategoriaLibroById(Long id_categoria_libro) {
        return categoriaLibroRepository.findById(id_categoria_libro);
    }

    public void saveOrUpdate (CategoriaLibro categoriaLibro){
       categoriaLibroRepository.save(categoriaLibro);
   }

   public void deleteById(Long id_categoria_libro){
       categoriaLibroRepository.deleteById(id_categoria_libro);
   }

}
