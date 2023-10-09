import javax.swing.*;
import java.util.*;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws NotaValidaExcepcion {

      /*  Ejercicio 1 Clase de excepciones

      System.out.println(" Ingrese dos números ");
        try{
            Scanner scanner = new Scanner(System.in);

            Integer num1,num2, division;

            System.out.println("Ingrese el primer número ");
            num1= Integer.valueOf(scanner.next());

            System.out.println(" Ingrese el segundo número ");
            num2= Integer.valueOf(scanner.next());

            division= num1/num2;
            System.out.println("La división entre "+ num1 + " y " + num2 + " da como resultado: " + division);

        }
        catch (InputMismatchException excepcion) {
            System.err.println("Se ingresó un tipo de dato incorrecto");
        }
        catch(ArithmeticException excepcion){
            System.err.println("Se intentó dividir por cero");
        } finally{ System.out.println("Ha finalizado el ejemplo");}
*/

        /* Ejercicio 2 Clase de exepciones


        System.out.println(" Ingrese un número.");

            Scanner scanner = new Scanner(System.in);
            String num;

            System.out.println("Ingrese el número.");
            num = scanner.nextLine();
        try{
            Integer stringANumero = Integer.parseInt(num);
            System.out.println("El numero ingresado fue el " + stringANumero);
    } catch (NumberFormatException e) {
            System.err.println("Error en el formato, ingrese numeros");
            throw new RuntimeException(e);

        } */

        Alumnos alumnos1 = new Alumnos("Nicolás", 29);
        Alumnos alumnos2 = new Alumnos("Sofia", 27);
        Alumnos alumnos3 = new Alumnos("Felipe", 28);

        Set <Alumnos> alumnos = new HashSet<>();
         alumnos.add(alumnos1);
         alumnos.add(alumnos2);
         alumnos.add(alumnos3);

         alumnos1.ponerCalificacion();

         elegirAlumno(alumnos);



    }

    public static void elegirAlumno (Set <Alumnos> alumnos) {
        System.out.println("Ingrese el nombre del alumno, para buscarlo en el sistema");
        Scanner scannerAlumno = new Scanner(System.in);
        String nombre = scannerAlumno.nextLine();
        Iterator iterator = alumnos.iterator();
        while (iterator.hasNext()) {
            String nombreIndicado = ((Alumnos) iterator).getNombre();
            if (nombreIndicado.equals(nombre)) ;{
                System.out.println(nombre);
            }
        }
    }
}