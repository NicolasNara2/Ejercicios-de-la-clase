package com.company;

import java.util.*;

public class Estudiante {

    private String nombres;
    private Set <String> tareas = new HashSet<>();

    private Map <Integer, String> numeroDeCurso = new HashMap<>();

    public Estudiante(String nombres) {
        this.nombres = nombres;
    }

    public void agregarTarea(String tarea) {
       this.tareas.add(tarea);
    }

    public void mostrarTareas() {
        Iterator iterador = tareas.iterator();
        while (iterador.hasNext()){
            System.out.println(iterador.next());
        }
    }

    public void agregarCurso(Integer clave, String valor) {
        this.numeroDeCurso.put(clave, valor);
    }
    // despues del numeroDeCurso esta el values pq tiene que recorrer los valores
    public void mostrarCursos(){
        for (Object o: numeroDeCurso.values()
             ) {
            System.out.println(o);
        }
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "com.company.Estudiante{" +
                "nombres='" + nombres + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Estudiante that)) return false;
        return Objects.equals(nombres, that.nombres);
    }

    @Override
    public int hashCode() {
        int resultado = 17;
        resultado = 31 * resultado + nombres.hashCode();

        return resultado;
    }
}
