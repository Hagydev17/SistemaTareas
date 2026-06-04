package com.workstation.dev.SistemaTareas.services;

import com.workstation.dev.SistemaTareas.models.UsuarioModels;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {
    private final List<UsuarioModels> usuarios = new ArrayList<>();

    public List<UsuarioModels> listarUsuarios() {
        return listarUsuarios();
    }

    public void guardarUsuario(UsuarioModels usuario) {
        usuarios.add(usuario);
    }

    public UsuarioModels buscarPorId(Long id) {
        return usuarios.stream()
                .filter(usuario -> usuario.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public void eliminarUsuario(Long id) {
        usuarios.removeIf(usuario -> usuario.getId().equals(id));
    }
}
