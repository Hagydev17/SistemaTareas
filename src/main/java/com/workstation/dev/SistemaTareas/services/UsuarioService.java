package com.workstation.dev.SistemaTareas.services;

import com.workstation.dev.SistemaTareas.models.UsuarioModels;

import java.util.ArrayList;
import java.util.List;

public class UsuarioService {

    public List<UsuarioModels> listarUsuario() {
        List<UsuarioModels> nuevoUsuario = new ArrayList<>();

        nuevoUsuario.add(new UsuarioModels(1, "Hagy dev", "hagy@email.com", "1234"));

        return nuevoUsuario;
    }
}
