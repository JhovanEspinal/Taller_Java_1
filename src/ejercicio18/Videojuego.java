package ejercicio18;

public class Videojuego implements Entregable{

   private String titulo;
   private int horas_estimadas;
   private boolean entregado;
   private String genero;
   private String compañia;
    private final String TITULO_DEFAULT = "";
    private final int HORAS_DEFAULT = 10;
    private final boolean ENTREGADO_DEFAULT = false;
    private final String GENERO_DEFALUT = "";
    private final String COMPAÑIA_DEFAULT= "";


    public Videojuego() {
       this.titulo = TITULO_DEFAULT;
       this.horas_estimadas = HORAS_DEFAULT;
       this.entregado = ENTREGADO_DEFAULT;
       this.genero = GENERO_DEFALUT;
       this.compañia =COMPAÑIA_DEFAULT;
    }

    public Videojuego(String titulo, int horas_estimadas) {
        this();
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
    }

    public Videojuego(String titulo, int horas_estimadas, String genero, String compañia) {
        this();
        this.titulo = titulo;
        this.horas_estimadas = horas_estimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    @Override
    public String toString() {
        return "Videojuego { " +
                "titulo =' " + titulo + '\'' +
                ", horas_estimadas= " + horas_estimadas +
                ", entregado = " + entregado +
                ", genero = '" + genero + '\'' +
                ", compañia =' " + compañia + '\'' +
                '}';
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras_estimadas() {
        return horas_estimadas;
    }

    public void setHoras_estimadas(int horas_estimadas) {
        this.horas_estimadas = horas_estimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    @Override
    public void entregar() {
        this.entregado = true;
    }

    @Override
    public void devolver() {
        this.entregado = false;
    }

    @Override
    public Boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public void compareTo(Object a) {

    }
}
