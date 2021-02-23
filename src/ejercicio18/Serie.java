package ejercicio18;

public class Serie implements Entregable{

    private String titulo;
    private int numero_tempo;
    private boolean entregado;
    private String genero;
    private String creador;
    private final String TITULO_DEFAULT = "";
    private final int NTEMPORADAS_DEFAULT = 3;
    private final boolean ENTREGADO_DEFAULT = false;
    private final String GENERO_DEFAULT = "";
    private final String CREADOR_DEFAULT = "";


    public Serie() {
        this.titulo = TITULO_DEFAULT;
        this.numero_tempo = NTEMPORADAS_DEFAULT;
        this.entregado = ENTREGADO_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.creador = CREADOR_DEFAULT;
    }

    public Serie(String titulo, String creador) {
        this();
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numero_tempo, String genero, String creador) {
        this();
        this.titulo = titulo;
        this.numero_tempo = numero_tempo;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie { " +
                "titulo= '" + titulo + '\'' +
                ", numero_tempo= " + numero_tempo +
                ", entregado= " + entregado +
                ", genero= '" + genero + '\'' +
                ", creador= '" + creador + '\'' +
                '}';
    }

    //METODOS GET AND SET
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero_tempo() {
        return numero_tempo;
    }

    public void setNumero_tempo(int numero_tempo) {
        this.numero_tempo = numero_tempo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
