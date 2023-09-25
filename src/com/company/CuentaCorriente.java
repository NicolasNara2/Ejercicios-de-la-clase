package com.company;

public class CuentaCorriente extends Cuenta{

    private Double descubierto;

    public CuentaCorriente(Cliente cliente, Double saldo, Double descubierto) {
        super(cliente, saldo);
        this.descubierto = descubierto;
    }

    @Override
    public void extraer(Double extraccion) {

        if( extraccion < 0 ){
            System.out.println("ingrese un monto válido");
        }

        else if(this.getSaldo() >= extraccion){
            this.setSaldo( this.getSaldo()- extraccion); }

        else{

            Double resultado= extraccion - this.getSaldo();
            if (this.getDescubierto() >= resultado ){

                // que aparezca el saldo en negativo
                this.setSaldo(this.getSaldo()-extraccion);
                //this.setSaldo(0.0);
                System.out.println(this.getSaldo());
                this.setDescubierto(this.descubierto - resultado);
                System.out.println("Extrajo la cantidad de " + extraccion + " su saldo final es de " + getDescubierto());
            }else{
                System.out.println("fondos insuficientes");
            }
        }

    }

    public void depositarCheque(Cheque cheque){

        this.setSaldo( this.getSaldo()+ cheque.getMonto());
    }


    public Double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(Double descubierto) {
        this.descubierto = descubierto;
    }
}
