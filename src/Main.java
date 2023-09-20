import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave(14,2,'N',20.00,50);
        Nave nave2 = new Nave(12, 1, 'S', 20.00, 15);
        Asteroide asteroide1 = new Asteroide(1,1,'S', 20);
        Asteroide asteroide2 = new Asteroide(1, 2, 'S',10);

        asteroide1.chocar(nave1);
        asteroide2.chocar(nave1);
        System.out.println(nave1.getVida());
            }
        }