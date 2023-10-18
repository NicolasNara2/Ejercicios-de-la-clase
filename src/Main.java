import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Paquete paquete1 = new PaqueteSimple(1,"Ushuai", "Viaje a Ushuai", 150, 0, 5, "Bus",true);
        Paquete paquete2 = new PaqueteSimple(2,"Ushuai", "Viaje a Ushuai", 150, 0, 7, "Bus",true);

        List<Paquete> paquetes = new ArrayList<>();

        paquetes.add(paquete1);
        paquetes.add(paquete2);

        for (Paquete paquete:paquetes
             ) {
            System.out.println(paquetes);
        }




        /*


        El sistema debe permitir visualizar la información de todos los paquetes disponibles y buscarlos.
        Debe permitirse la incorporación, la eliminación y  búsqueda de una excursión dentro de un paquete.
        Deben poder compararse los paquetes entre sí teniendo en cuenta que un
        paquete es mejor si tiene mayor cantidad de días y excursiones.
*/

    }
        }