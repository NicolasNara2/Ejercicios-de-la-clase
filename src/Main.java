import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Articulos articulo1 = new Articulos("uno", "Miguel Perez", "ley", new Date(123,8,6));
        System.out.println(articulo1.getAutor());
        System.out.println(articulo1.getTitulo());
        System.out.println(articulo1.getTema());
        System.out.println(articulo1.getFecha());
        }
    }




