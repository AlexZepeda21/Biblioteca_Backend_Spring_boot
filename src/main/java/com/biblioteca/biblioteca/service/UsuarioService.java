package com.biblioteca.biblioteca.service;

import com.biblioteca.biblioteca.entity.Usuario;
import com.biblioteca.biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public List<Usuario> getUsuarios(){
      return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long id_usuario){
        return usuarioRepository.findById(id_usuario);
    }

    public void saveOrUpdate(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void deleteById(long id_usuario){
        usuarioRepository.deleteById(id_usuario);
    }
}
