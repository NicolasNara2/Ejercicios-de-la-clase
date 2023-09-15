public class Variables {
    private Integer numeroEntero;
    private Double numeroConComa;
    private String numero;

    public Variables(Integer numeroEntero, Double numeroConComa, String numero) {
        this.numeroEntero = numeroEntero;
        this.numeroConComa = numeroConComa;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Variables{" +
                "numeroEntero=" + numeroEntero +
                ", numeroConComa=" + numeroConComa +
                ", numero='" + numero + '\'' +
                '}';
    }

    public Integer getNumeroEntero() {
        return numeroEntero;
    }

    public void setNumeroEntero(Integer numeroEntero) {
        this.numeroEntero = numeroEntero;
    }

    public Double getNumeroConComa() {
        return numeroConComa;
    }

    public void setNumeroConComa(Double numeroConComa) {
        this.numeroConComa = numeroConComa;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}



