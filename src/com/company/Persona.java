package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private List <Cuenta> cuentaAsociadas = new ArrayList <>();

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
public void agregarCuenta (Cuenta cuentaNueva) {
cuentaAsociadas.add(cuentaNueva);
}

    public String getNombreCompleto() {
        return getNombre() + " " + getApellido();
    }

   public Boolean esMayorEdad() {
       if (this.edad >=60 ) {return true;}
       else {return false;}
    }

    public Double getSaldoTotal () {
        Double sumaTotal = 0.0;
        for (Cuenta cuentaSeleccionada: cuentaAsociadas
             ) {
            sumaTotal += cuentaSeleccionada.getSaldo();
        }
            return sumaTotal;
    }

    public void mostrarCuentas () {
        Iterator iterator = cuentaAsociadas.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
