import java.util.ArrayList;

public abstract class Paquete implements Comparable<Paquete> {
    /*
    Cada paquete tiene un identificador, un título, una descripción,
    un precio base, un valor adicional, una cantidad de días,tipo de
    transporte y una serie de nombres de las excursiones incluidas.
     */
    private int id;
    private String nombrePaquete;
    private String descripcionPaquete;
    private Integer precioBase;
    private Integer valorAdicional;
    private Integer CantidadDeDias;
    private String tipoDeTransporte;
    ArrayList <String> excursiones = new ArrayList<>();
    private Guia guia = new Guia();

    public abstract void calcularPrecio();

    @Override
    public int compareTo(Paquete o) {
        if (this.CantidadDeDias.equals(o.CantidadDeDias) && (this.excursiones.equals(o.excursiones))){
            return 0;
        } else if (this.CantidadDeDias > o.CantidadDeDias && this.excursiones.size() > o.excursiones.size()) {
            return 1;}
         else {
             return -1;
                }
        }

    public Paquete(int id, String nombrePaquete, String descripcionPaquete, Integer precioBase, Integer valorAdicional, Integer cantidadDeDias, String tipoDeTransporte) {
        this.id = id;
        this.nombrePaquete = nombrePaquete;
        this.descripcionPaquete = descripcionPaquete;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        CantidadDeDias = cantidadDeDias;
        this.tipoDeTransporte = tipoDeTransporte;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash*31*nombrePaquete.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Paquete(int id, String nombrePaquete, String descripcionPaquete, Integer precioBase, Integer valorAdicional, Integer cantidadDeDias, String tipoDeTransporte, ArrayList<String> excursiones, Guia guia) {
        this.id = id;
        this.nombrePaquete = nombrePaquete;
        this.descripcionPaquete = descripcionPaquete;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        CantidadDeDias = cantidadDeDias;
        this.tipoDeTransporte = tipoDeTransporte;
        this.excursiones = excursiones;
        this.guia = guia;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "id=" + id +
                ", nombrePaquete='" + nombrePaquete + '\'' +
                ", descripcionPaquete='" + descripcionPaquete + '\'' +
                ", precioBase=" + precioBase +
                ", valorAdicional=" + valorAdicional +
                ", CantidadDeDias=" + CantidadDeDias +
                ", tipoDeTransporte='" + tipoDeTransporte + '\'' +
                ", excursiones=" + excursiones +
                ", guia=" + guia +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePaquete() {
        return nombrePaquete;
    }

    public void setNombrePaquete(String nombrePaquete) {
        this.nombrePaquete = nombrePaquete;
    }

    public String getDescripcionPaquete() {
        return descripcionPaquete;
    }

    public void setDescripcionPaquete(String descripcionPaquete) {
        this.descripcionPaquete = descripcionPaquete;
    }

    public Integer getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(Integer precioBase) {
        this.precioBase = precioBase;
    }

    public Integer getValorAdicional() {
        return valorAdicional;
    }

    public void setValorAdicional(Integer valorAdicional) {
        this.valorAdicional = valorAdicional;
    }

    public Integer getCantidadDeDias() {
        return CantidadDeDias;
    }

    public void setCantidadDeDias(Integer cantidadDeDias) {
        CantidadDeDias = cantidadDeDias;
    }

    public String getTipoDeTransporte() {
        return tipoDeTransporte;
    }

    public void setTipoDeTransporte(String tipoDeTransporte) {
        this.tipoDeTransporte = tipoDeTransporte;
    }

    public ArrayList<String> getExcursiones() {
        return excursiones;
    }

    public void setExcursiones(ArrayList<String> excursiones) {
        this.excursiones = excursiones;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }
}