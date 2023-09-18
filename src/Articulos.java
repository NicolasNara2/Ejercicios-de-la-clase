import java.util.Date;

public class Articulos {
    private String titulo;
    private String autor;
    private String tema;
    private Date fecha;

    public Articulos(String titulo, String autor, String tema, Date fecha) {
        this.titulo = titulo;
        this.autor = autor;
        this.tema = tema;
        this.fecha = fecha;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getTema() {
        return tema;
    }
    public void setTema(String tema) {
        this.tema = tema;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Articulos{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", tema='" + tema + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
