package com.company;

public class Cuenta implements Comparable <Cuenta> {
    private Integer nroCuenta;
    private Double saldo;

    public Cuenta(Integer nroCuenta, Double saldo) {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    @Override
    public int compareTo(Cuenta o) {
        if (this.getNroCuenta().equals(o.getNroCuenta())) {
            return 0;
        } else if (this.getNroCuenta() > o.getNroCuenta()){
        return 1;
        } else { return -1;

        }
    }

    public Integer getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(Integer nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
