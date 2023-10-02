package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Cuenta cuenta1= new Cuenta(123, 200.0);
        Cuenta cuenta2= new Cuenta(123, 200.0);


        System.out.println("traer el hashcode " + cuenta1.hashCode());
        Persona persona= new Persona("Juan","Perez",70);

        persona.agregarCuenta(cuenta1);
        persona.agregarCuenta(cuenta2);

        persona.mostrarCuentas();
    }
}
