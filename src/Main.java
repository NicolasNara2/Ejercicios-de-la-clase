import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente(1, 4000.00);
        cuenta1.setDescubierto(10000.00);
        cuenta1.extraer(5000.00);
        cuenta1.extraer();
        System.out.println(cuenta1.getDescubierto());

        CuentaCorriente cuenta2 = new CuentaCorriente(2,3000.00);

        cuenta2.setTitular("Juan");

        System.out.println(cuenta2.toString());

        System.out.println(cuenta1.equals(cuenta2));

        System.out.println(cuenta2.hashCode());

            }
        }