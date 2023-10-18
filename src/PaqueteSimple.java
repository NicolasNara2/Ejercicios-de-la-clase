import java.util.ArrayList;

public class PaqueteSimple extends Paquete {

    private Boolean descuento;
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void calcularPrecio() {
        Double valorExcursion = getPrecioBase()*0.1;
        Double precioFinalSimple = (getExcursiones().size())*valorExcursion;
    }

    @Override
    public int compareTo(Paquete o) {
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
/*
    El simple tiene asociado un descuento del 25% que se activa
    en caso de presentar un código particular.
     */


    public PaqueteSimple(int id, String nombrePaquete, String descripcionPaquete, Integer precioBase, Integer valorAdicional, Integer cantidadDeDias, String tipoDeTransporte, Boolean descuento) {
        super(id, nombrePaquete, descripcionPaquete, precioBase, valorAdicional, cantidadDeDias, tipoDeTransporte);
        this.descuento = descuento;
    }


}
