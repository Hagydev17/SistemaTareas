package com.workstation.dev.SistemaTareas.controllers;

import com.workstation.dev.SistemaTareas.models.TareaModels;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
    @GetMapping
    public String mostrarDashboard(Model model) {
        model.addAttribute("usuarioAutenticado", "Hagy Hdez");
        model.addAttribute("tareas", new ArrayList<>());
        return "dashboard";
    }

    @GetMapping("/new_task")
    public String crearTarea(Model model) {
        model.addAttribute("usuarioAutenticado", "Hagy Hdez");
        model.addAttribute("tarea", new TareaModels());
        return "crear_tarea";
    }

    @GetMapping("/logout")
    public String logout() {
        return "logout";
    }

    @PostMapping("/logout/confirmar")
    public String finalizarSesion(HttpSession session) {
        if (session != null) {
            session.invalidate();
        }
        return "redirect:/";
    }
}
