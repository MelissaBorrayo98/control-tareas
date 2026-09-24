package com.estudiante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el ArrayList para almacenar objetos de tipo Tarea
        ArrayList<Tarea> listaTareas = new ArrayList<>();

        // 2. Crear por lo menos tres objetos de tipo Tarea
        Tarea tarea1 = new Tarea(1L, "Comprar alimentos", "Ir al supermercado a comprar viveres", "ALTA", false);
        Tarea tarea2 = new Tarea(2L, "Realizar ejercicios", "Hacer rutina de cardio por 30 min", "MEDIA", true);
        Tarea tarea3 = new Tarea(3L, "Estudiar Programación II", "Repasar POO y colecciones en Java", "ALTA", false);

        // 3. Almacenarlos en la colección ArrayList
        listaTareas.add(tarea1);
        listaTareas.add(tarea2);
        listaTareas.add(tarea3);

        // Variables para los contadores
        int pendientes = 0;
        int completadas = 0;

        System.out.println("===== LISTADO DE TAREAS =====\n");

        // 4 y 5. Recorrer la colección y mostrar la información de todas las tareas
        for (Tarea tarea : listaTareas) {
            String estado = tarea.isCompletada() ? "Completada" : "Pendiente";

            // Imprimir línea formateada
            System.out.println(tarea.getId() + " | " + tarea.getTitulo() + " | " + tarea.getPrioridad() + " | " + estado);

            // 6 y 7. Contar tareas pendientes y completadas
            if (tarea.isCompletada()) {
                completadas++;
            } else {
                pendientes++;
            }
        }

        // Mostrar resultados de los contadores
        System.out.println("\nTareas pendientes: " + pendientes);
        System.out.println("Tareas completadas: " + completadas);
    }
}