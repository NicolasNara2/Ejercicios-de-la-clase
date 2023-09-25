package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cliente cliente1 = new Cliente(1, 12345, "Rivas");
        CajaAhorro cajaAhorro1 = new CajaAhorro(cliente1, 2000.2, 10.00);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(cliente1, 2000.1,100.0);
        Cuenta cuentaComitente1= new CuentaComitente(cliente1, 1000.0, "hola");
        cuentaComitente1.extraer(1000.0);

       // System.out.println(cajaAhorro1.toString());
       // cajaAhorro1.extraer(1000.0);
      //  cuentaCorriente1.extraer(500.0);
      //  cuentaCorriente1.getSaldo();
    }
}
