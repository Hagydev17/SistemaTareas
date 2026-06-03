package com.workstation.dev.SistemaTareas.controllers;

import com.workstation.dev.SistemaTareas.models.UsuarioModels;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {
    @GetMapping("/register")
    public String mostrarFormularioRegistro() {
        return "register";
    }

    @PostMapping("/register")
    public String crearUsuario(UsuarioModels usuario) {
        System.out.println(usuario.getNombre());
        System.out.println(usuario.getEmail());
        System.out.println(usuario.getPassword());
        return "redirect:/dashboard";
    }

    @GetMapping("/terminos")
    public String terminos() {
        return "terminos";
    }

    @GetMapping("/privacidad")
    public String privacidad() {
        return "privacidad";
    }
}
