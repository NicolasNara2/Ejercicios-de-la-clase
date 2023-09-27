package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente1 = new Cliente(1, 12345, "Rivas");
        Cuenta cajaAhorro1 = new CajaAhorro(cliente1, 2000.2, 10.00);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(cliente1, 2000.1,100.0);
        Cuenta cuentaComitente1= new CuentaComitente(cliente1, 1000.0, "hola");

        cuentaComitente1.extraer(1000.0);

        cajaAhorro1 = new CuentaCorriente(cliente1, 1000.00, 5000.00);

        ((CuentaCorriente)cajaAhorro1).depositarCheque(new Cheque(500.00, "BBVA", new Date(123,8,27)));
       // System.out.println(cajaAhorro1.toString());
       // cajaAhorro1.extraer(1000.0);
      //  cuentaCorriente1.extraer(500.0);
      //  cuentaCorriente1.getSaldo();

    }
}
