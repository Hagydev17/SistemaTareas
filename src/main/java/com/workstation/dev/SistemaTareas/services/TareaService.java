package com.workstation.dev.SistemaTareas.services;

import com.workstation.dev.SistemaTareas.models.TareaModels;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaService {
    private final List<TareaModels> tareas = new ArrayList<>();

    public void guardarTarea(TareaModels tarea) {
        tareas.add(tarea);
    }

    public void eliminarTarea(Long id) {
        tareas.removeIf(tarea -> tarea.getId().equals(id));
    }
}
