public class Asteroide extends ObjetosGraficos {

    private int lesion;

    public Asteroide(Integer posicionX, Integer posicionY, char direccion, int lesion) {
        super(posicionX, posicionY, direccion);
        this.lesion = lesion;
    }
    public void chocar(Nave nave) {
        nave.restarVida(this.lesion);
    }

    public int getLesion() {
        return lesion;
    }

    public void setLesion(int lesion) {
        this.lesion = lesion;
    }
}
