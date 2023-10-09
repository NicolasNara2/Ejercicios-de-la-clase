import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alumnos {

private String nombre;

private int edad;

private List <Double> calificaciones = new ArrayList<>();


    public Alumnos(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public void ponerCalificacion() throws NotaValidaExcepcion {
        System.out.println("Ingrese la calificación del alumno");
        Scanner scannerCalificacion = new Scanner(System.in);
        Double calificacionRecibida = scannerCalificacion.nextDouble();
        if (calificacionRecibida<=0 || calificacionRecibida > 10) {
            throw new NotaValidaExcepcion("Ingrese una nota valida, entre el rango del 1 al 10.");
        } else { calificaciones.add(calificacionRecibida);}

       /* if (calificacionRecibida.getClass().equals(Double) ); {
        }*/
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Alumnos{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
