package com.workstation.dev.SistemaTareas.models;

public class TareaModels {
    private String titulo;
    private String descripcion;

    public TareaModels() {
    }

    public TareaModels(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
