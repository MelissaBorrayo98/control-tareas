package com.estudiante;
public class Tarea {

    // Atributos privados
    private Long id;
    private String titulo;
    private String descripcion;
    private String prioridad;
    private boolean completada;

    // Constructor sin parámetros (recomendado)
    public Tarea() {
    }

    // Constructor con todos los parámetros
    public Tarea(Long id, String titulo, String descripcion, String prioridad, boolean completada) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.completada = completada;
    }

    // Métodos Get y Set para 'id'
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Métodos Get y Set para 'titulo'
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos Get y Set para 'descripcion'
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    // Métodos Get y Set para 'prioridad'
    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    // Métodos Get y Set para 'completada' (Nota: por convención en Java, el get de un boolean usa 'is')
    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Sobrescritura del método toString()
    @Override
    public String toString() {
        return "Tarea [" +
                "ID=" + id +
                ", Título='" + titulo + '\'' +
                ", Descripción='" + descripcion + '\'' +
                ", Prioridad='" + prioridad + '\'' +
                ", Completada=" + (completada ? "Sí" : "No") +
                ']';
    }

    // Método mostrarInformacion() (opcional, ya que se implementó toString, pero incluido para cubrir ambas opciones)
    public void mostrarInformacion() {
        System.out.println(this.toString());
    }
}