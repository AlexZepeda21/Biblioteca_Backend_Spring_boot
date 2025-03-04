package com.biblioteca.biblioteca.controller;

import com.biblioteca.biblioteca.entity.Usuario;
import com.biblioteca.biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAll(){
        return usuarioService.getUsuarios();
    }

    @GetMapping("/{id_usuario}")
    public Optional<Usuario> usuario(@PathVariable("id_usuario")Long id_usuario){
        return usuarioService.getUsuarioById(id_usuario);
    }

    @PostMapping
    public void saveOrUpdate(@RequestBody Usuario usuario){
        usuarioService.saveOrUpdate(usuario);
    }

    @DeleteMapping("/{id_usuario}")
    public void deleteById(@PathVariable("id_usuario")Long id_usuario){
        usuarioService.deleteById(id_usuario);
    }
}
