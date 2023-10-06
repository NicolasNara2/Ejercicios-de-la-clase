import java.awt.*;
import java.util.Objects;

public class Contenedor {
    private Integer numeroIdentificador;
    private String paisDeProcedencia;

    private Boolean peligroso;

    public Contenedor(Integer numeroIdentificador, String paisDeProcedencia, Boolean peligroso) {
        this.numeroIdentificador = numeroIdentificador;
        this.paisDeProcedencia = paisDeProcedencia;
        this.peligroso = peligroso;
        if (paisDeProcedencia.equals(null)) {
            setPeligroso(true);
        }
    }

    @Override
    public String toString() {
        return "Contenedor{" +
                "numeroIdentificador=" + numeroIdentificador +
                ", paisDeProcedencia='" + paisDeProcedencia + '\'' +
                ", peligroso=" + peligroso +
                '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash*37*paisDeProcedencia.hashCode()*numeroIdentificador;
    }

    @Override
    public boolean equals(Object obj) {
       if (!(obj instanceof Contenedor)){
           System.out.println("Ingrese datos validos.");
           return false;
       } else{
           return Objects.equals(this.numeroIdentificador, ((Contenedor) obj).numeroIdentificador);
       }
    }

    public Integer getNumeroIdentificador() {
        return numeroIdentificador;
    }

    public void setNumeroIdentificador(Integer numeroIdentificador) {
        this.numeroIdentificador = numeroIdentificador;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public void setPaisDeProcedencia(String paisDeProcedencia) {
        this.paisDeProcedencia = paisDeProcedencia;
    }

    public Boolean getPeligroso() {
        return peligroso;
    }

    public void setPeligroso(Boolean peligroso) {
        this.peligroso = peligroso;
    }
}
