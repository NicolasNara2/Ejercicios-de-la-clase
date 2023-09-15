public class CuentaCorriente extends CuentaBancaria {
    private Double descubierto = 10000.00;

    public CuentaCorriente(Integer numero, Double saldo) {
        super(numero, saldo);
    }

    public Double getDescubierto() {
        return descubierto;
    }

    public void setDescubierto(Double descubierto) {
        this.descubierto = descubierto;
    }
public void extraer() {
    if (this.saldo >= 4000.00) {
        this.saldo = this.saldo - 4000.00;
        System.out.println("Realizo un retiro de 4000.0.");
    }
    else {
        if (this.saldo+this.descubierto >= 4000.00) {
          Double saldoRestante = this.saldo-4000.00;
          this.saldo = 0.00;
          this.descubierto= this.descubierto+saldoRestante;}

         else {
                System.out.println("Saldo insuficiente.");
            }
        }
    }
    @Override
    public void extraer(Double importe) {

        Double saldoRestante;
        if (importe > saldo+descubierto) {
            System.out.println("Saldo insuficiente.");
        }
            else {
                if (this.saldo>importe) {
                    this.saldo = saldo-importe;
                    System.out.println("Extracción realizada de" + importe);
                }
                else {
                    saldoRestante = this.saldo-importe;
                    this.saldo =0.0;
                    this.setDescubierto(this.descubierto+saldoRestante);
                    System.out.println("Realizo una extraccion, su saldo final es de " + this.saldo + " y el descubierto " +
                            "quedo en " + this.descubierto + " la extraccion final fue de " +  importe + ".");
                }
        }
    }
}
