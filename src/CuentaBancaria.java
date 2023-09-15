public class CuentaBancaria {
    private Integer numero;
    protected Double saldo;

    public CuentaBancaria(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void extraer (Double importe) {
        if (importe <= this.saldo){
            this.saldo=-importe;
            System.out.println("Extracción realizada de " + importe);
        } else {
            System.out.println("Saldo insuficiente para realizar esa extracción.");
        }
    };

    public void depositar (Double deposito) {
        if (deposito >0){
        this.saldo = this.saldo+deposito;
        System.out.println("Se deposito " + deposito);
    }
        else
            System.out.println("Ingrese un monto valido");
    }


}
