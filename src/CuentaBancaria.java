import java.util.Objects;

public class CuentaBancaria {
    private Integer numero;

    private String titular;
    protected Double saldo;

    public CuentaBancaria(Integer numero, Double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public CuentaBancaria(String titular) {
        this.titular = titular;
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


    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numero=" + numero +
                ", saldo=" + saldo +
                '}';
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof CuentaBancaria)){
            return false;
        } else{ // (o.getClass() != this.getClass() )
        CuentaBancaria cuentaBancariaAComparar = (CuentaBancaria) o;
        return this.getNumero().equals(cuentaBancariaAComparar.getNumero());
    }
    }

    @Override
    public int hashCode() {
        Integer numPrimo = 11;
        numPrimo = numPrimo*this.numero*this.titular.hashCode();
        return (numPrimo);
    }
}
