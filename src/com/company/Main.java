package com.company;

import javax.print.attribute.standard.Destination;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Nicolás");
        Estudiante estudiante2 = new Estudiante("Magui");

        List <Estudiante> listaDeEstudiantes = new ArrayList<>();

        listaDeEstudiantes.add(estudiante1);
        listaDeEstudiantes.add(estudiante2);
        System.out.println(listaDeEstudiantes);
        for (Estudiante estudiante: listaDeEstudiantes
             ) {
            System.out.println(estudiante.getNombres());
        }
        // Da la pocisión del estudiante que busques
        System.out.println(listaDeEstudiantes.indexOf(estudiante2));
        // Me avisa si esta el elemento que busque, lo ideal seria que sobreescriba en la clase el hascode y equals
        System.out.println(listaDeEstudiantes.contains(estudiante1));

        estudiante1.agregarTarea("Barrer salon");
        estudiante1.agregarTarea("Barrer salon");

        estudiante1.agregarTarea("Ordenar el salon");
        estudiante1.mostrarTareas();

        estudiante1.agregarCurso(1, "Quimica");
        estudiante1.agregarCurso(2, "Fisica");
        estudiante1.mostrarCursos();


    }
}
