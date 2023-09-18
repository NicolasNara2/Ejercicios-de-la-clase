import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ediciones {
    private Integer numero;
    private Date fecha;
    private Double precio;

    private List <Articulos> articulos = new ArrayList<>();

    public Ediciones(Integer numero, Date fecha, Double precio) {
        this.numero = numero;
        this.fecha = fecha;
        this.precio = precio;
    }

    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ediciones{" +
                "numero=" + numero +
                ", fecha=" + fecha +
                ", precio=" + precio +
                '}';
    }

   public void agregarArticulo(Articulos nuevoarticulo) {
        articulos.add(nuevoarticulo);
   };
}
