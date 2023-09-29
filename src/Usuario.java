import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Usuario implements Comparable<Usuario> {
private String nombre;
private String apellido;
private int dni;
private int tiempoSocio;
private String direccion;
private int telefono;
private List listaVehiculo;

    public Usuario(String nombre, String apellido, int dni, int tiempoSocio, String direccion, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.tiempoSocio = tiempoSocio;
        this.direccion = direccion;
        this.telefono = telefono;
        this.listaVehiculo = new ArrayList<Vehiculo>();
    }
    public abstract void contratarVehiculo();

    public int compareTo(Usuario o){
        if (Objects.equals(this.getDni(), o.getDni())) {
            return 0 ;}
            else if (this.getDni() > o.getDni() ) {
                return 1 ;}
            else {return -1 ;}
        }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTiempoSocio() {
        return tiempoSocio;
    }

    public void setTiempoSocio(int tiempoSocio) {
        this.tiempoSocio = tiempoSocio;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}
