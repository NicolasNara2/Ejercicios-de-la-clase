public class ObjetosGraficos {

    private Integer posicionX;
    private Integer posicionY;
    private char direccion;



    public ObjetosGraficos(Integer posicionX, Integer posicionY, char direccion) {
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.direccion = direccion;
    }

    public void irA (Integer posicionX, Integer posicionY, char direccion) {
         this.posicionX=posicionX;
         this.posicionY=posicionY;
         this.direccion=direccion;
    }

    public Integer getPosicionX() {
        return posicionX;
    }

    public void setPosicionX(Integer posicionX) {
        this.posicionX = posicionX;
    }

    public Integer getPosicionY() {
        return posicionY;
    }

    public void setPosicionY(Integer posicionY) {
        this.posicionY = posicionY;
    }

    public char getDireccion() {
        return direccion;
    }

    public void setDireccion(char direccion) {
        this.direccion = direccion;
    }


}
