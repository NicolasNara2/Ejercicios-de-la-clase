import java.util.Date;
import java.util.Objects;

public abstract class Vehiculo implements Comparable <Vehiculo> {

    private int Id;
    private String marca;
    private String modelo;
    private Date fechaInicioAlquiler;
    private Double precioAlquilerDia;
    private Double velocidad;

    public Vehiculo(int id, String marca, String modelo, Date fechaInicioAlquiler, Double precioAlquilerDia, Double velocidad) {
        Id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaInicioAlquiler = fechaInicioAlquiler;
        this.precioAlquilerDia = precioAlquilerDia;
        this.velocidad = velocidad;
    }

    public abstract void acelerar();
    public abstract void frenar();

    @Override
    public int compareTo(Vehiculo o) {
        if (this.marca.equals(o.marca) && this.precioAlquilerDia <=(o.precioAlquilerDia)) {
            return 1; }
        else {return -1 ;}
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaInicioAlquiler() {
        return fechaInicioAlquiler;
    }

    public void setFechaInicioAlquiler(Date fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    public Double getPrecioAlquilerDia() {
        return precioAlquilerDia;
    }

    public void setPrecioAlquilerDia(Double precioAlquilerDia) {
        this.precioAlquilerDia = precioAlquilerDia;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }
}
