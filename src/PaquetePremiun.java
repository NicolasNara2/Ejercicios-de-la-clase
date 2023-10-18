import java.util.ArrayList;

public class PaquetePremiun extends Paquete{

    /*
    Existen dos variantes de paquetes, el premium tiene una serie de beneficios
    con los que el simple no cuenta como la acumulación de puntos por excursión
    contratada y un voucher de descuentos para el próximo viaje.
     */
/*15% por excursion */
    @Override
    public void calcularPrecio() {
        Double valorExcursion = getPrecioBase()*0.15;
        Double precioFinalPremium = (getExcursiones().size())*valorExcursion;
    }

    @Override
    public int compareTo(Paquete o) {
        return super.compareTo(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void acumulacionDePuntos() {

    }

    public PaquetePremiun(int id, String nombrePaquete, String descripcionPaquete, Integer precioBase, Integer valorAdicional, Integer cantidadDeDias, String tipoDeTransporte, ArrayList<String> excursiones, Guia guia) {
        super(id, nombrePaquete, descripcionPaquete, precioBase, valorAdicional, cantidadDeDias, tipoDeTransporte, excursiones, guia);
    }

    @Override
    public String toString() {
        return "PaquetePremiun{}";
    }
}
