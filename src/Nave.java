public class Nave extends ObjetosGraficos {

private Double velocidad;
private Integer vida;

    public Nave(Integer posicionX, Integer posicionY, char direccion, Double velocidad, Integer vida) {
        super(posicionX, posicionY, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    @Override
    public void irA(Integer posicionX, Integer posicionY, char direccion) {
         if (direccion != 'N' || direccion != 'S' || direccion != 'O' || direccion != 'E') {
            System.out.println("Indique una dirección para ir a ella");
        }
        else {
            if (direccion != this.getDireccion()){
                this.girar(direccion);
            }
            this.setPosicionY(posicionY);
            this.setPosicionX(posicionX);
        }
    }

    public void girar (char direccion) {
        this.setDireccion(direccion);
    }

    public void restarVida (int lesion) {
        this.vida -= lesion;
    }
}
