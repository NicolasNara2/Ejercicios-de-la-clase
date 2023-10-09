public class NotaValidaExcepcion extends Exception {

    public NotaValidaExcepcion() {
    }

    public NotaValidaExcepcion(String message) {
        System.err.println(message);
    }
}
