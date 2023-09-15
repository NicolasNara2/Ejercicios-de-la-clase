import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CuentaCorriente cuenta1 = new CuentaCorriente(1, 4000.00);
        cuenta1.setDescubierto(10000.00);
        cuenta1.extraer(5000.00);
        cuenta1.extraer();
        System.out.println(cuenta1.getDescubierto());


            }
        }