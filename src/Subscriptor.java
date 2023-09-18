public class Subscriptor {


    private String nombre;
    private Integer telefono;
    private String direccion;

    public Subscriptor(String nombre, Integer telefono, String direccion) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getTelefono() {
        return telefono;
    }
    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Subscriptor{" +
                "nombre='" + nombre + '\'' +
                ", telefono=" + telefono +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
