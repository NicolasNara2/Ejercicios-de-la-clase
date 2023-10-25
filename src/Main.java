import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Juan");
        Alumno alumno2 = new Alumno("Pablo");
        Alumno alumno3 = new Alumno("Pedro");

        try {
            alumno1.agregarNotas(5);
            alumno1.agregarNotas(11);
        } catch (NumberFormatException e){
            System.err.println(e.getMessage());
        } finally {
            System.out.println(alumno1.getNotas());
        }

       //Error de que no quiere tomar la clase Alumno en el Main
        // List arrayDeAlumnos <Alumno> = new ArrayList<>();




            }
        }