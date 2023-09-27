package com.company;

import java.util.Scanner;

public class CuentaComitente extends Cuenta {
    private String ClaveCnv;

    public CuentaComitente(Cliente cliente, Double saldo, String claveCnv) {
        super(cliente, saldo);
        ClaveCnv = claveCnv;
    }

    @Override
    public void extraer(Double extraccion) {
        if (extraccion > this.getSaldo()) {System.out.println("Saldo insuficiente");
    }
    else {
        Scanner scanner = new Scanner(System.in);
        String claveCnvIngresada = scanner.nextLine();
        if (claveCnvIngresada.equals(ClaveCnv)){
            this.setSaldo(this.getSaldo() - extraccion)  ;
            System.out.println("Extrajo la cantidad de " + extraccion + " su saldo final es de " + getSaldo());
        } else {
            if (this.getSaldo()*0.5 >= extraccion) {
                this.setSaldo( this.getSaldo() - extraccion);
                System.out.println("Extrajo la cantidad de " + extraccion + " su saldo final es de " + getSaldo());
            } else {
                System.out.println("Fondos insuficientes.");
            }
        }
    }
    }

    @Override
    public void depositarEfectivo(Double ingreso) {
      if ( ingreso > 0) {this.setSaldo(this.getSaldo() + (ingreso - (ingreso*0.01)));
        System.out.println("Hizo un deposito de " + ingreso + ", que tuvo una comision de " + (ingreso*0.01) + ". Su saldo actual es de: " + getSaldo());}
         else {
                System.out.println("Ingrese un monto valido.");
            }
    }

}
