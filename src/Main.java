import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Ingreso de contenedores.
        Map<Integer, Contenedor> listaDeContenedores = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero identificador");
        Integer numeroIdentificadorIngresado = scanner.nextInt();
        System.out.println("Ingrese el pais de procedencia");
        String paisdeprocedenciaIngresado = scanner.next();
        System.out.println("Indique si el contenedor es peligroso, escriba true si si lo es y false si no lo es");
        Boolean peligrosoONo = scanner.nextBoolean();

        //Contenedor contenedor1 = new Contenedor(1, "Argentina", false);
       // Contenedor contenedor2 = new Contenedor(2, null, false);

        listaDeContenedores.put(numeroIdentificadorIngresado, new Contenedor(numeroIdentificadorIngresado, paisdeprocedenciaIngresado, peligrosoONo));

        Iterator iterator = listaDeContenedores.values().iterator();
        while (iterator.hasNext()) ;
        System.out.println(iterator.next());

        Integer inicial = 0;
        for ( Contenedor cont: listaDeContenedores.values())
        {
        if ( cont.getPaisDeProcedencia().equals ("Desconocido") || cont.getPeligroso().equals(true)) {
            inicial +=1;
            System.out.println(inicial);

        }
        }
            }
        }