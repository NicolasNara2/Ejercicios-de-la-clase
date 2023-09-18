public class Revista {

    private String nombre;
    private Integer ID;
    private String tipo;

    public Revista(String nombre, Integer ID, String tipo) {
        this.nombre = nombre;
        this.ID = ID;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getID() {
        return ID;
    }
    public void setID(Integer ID) {
        this.ID = ID;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "nombre='" + nombre + '\'' +
                ", ID=" + ID +
                ", tipo='" + tipo + '\'' +
                '}';
    }


}
