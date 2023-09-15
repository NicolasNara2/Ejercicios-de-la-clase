public class Mascotas {
    private String nombre;
    private Integer edad;
    private String cantidadDeComida;

    public Mascotas(String nombre, Integer edad, String cantidadDeComida) {
        this.nombre = nombre;
        this.edad = edad;
        this.cantidadDeComida = cantidadDeComida;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", cantidadDeComida='" + cantidadDeComida + '\'' +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCantidadDeComida() {
        return cantidadDeComida;
    }

    public void setCantidadDeComida(String cantidadDeComida) {
        this.cantidadDeComida = cantidadDeComida;
    }
}
