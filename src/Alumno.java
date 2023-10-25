import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas = new ArrayList<>();

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public void agregarNotas(Integer nota){
        if (nota < 1 || nota > 10){
            throw new NumberFormatException("Valores no permitidos");
        }
        notas.add(nota);
    }
    public void eliminarNotas(Integer nota){
        notas.remove(nota);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + notas +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
}
