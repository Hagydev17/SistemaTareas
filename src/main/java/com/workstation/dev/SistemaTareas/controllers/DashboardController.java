package com.workstation.dev.SistemaTareas.controllers;

import com.workstation.dev.SistemaTareas.models.TareaModels;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dashboard")
public class DashboardController {
    private final List<TareaModels> tareas = new ArrayList<>();

    @GetMapping
    public String mostrarDashboard(Model model) {
        model.addAttribute("usuarioAutenticado", "Hagy Hdez");
        model.addAttribute("tareas", tareas);
        return "dashboard";
    }

    @GetMapping("/new_task")
    public String crearTarea(Model model) {
        model.addAttribute("usuarioAutenticado", "Hagy Hdez");
        model.addAttribute("tarea", new TareaModels());
        return "crear_tarea";
    }

    private String capitalizar(String texto) {
        if (texto == null || texto.isBlank()) {
            return texto;
        }

        return texto.substring(0, 1).toUpperCase() + texto.substring(1).toLowerCase();
    }

    @PostMapping("/guardar")
    public String guardarTarea(@ModelAttribute TareaModels tarea) {
        System.out.println(tarea.getTitulo());
        System.out.println(tarea.getDescripcion());
        tarea.setTitulo(capitalizar(tarea.getTitulo()));
        tarea.setDescripcion(capitalizar(tarea.getDescripcion()));
        tareas.add(tarea);
        return "redirect:/dashboard";
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
