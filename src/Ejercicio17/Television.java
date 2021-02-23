package Ejercicio17;

public class Television extends Electrodomestico {

    private int resolucion;
    private boolean TDT;
    private final int RESOLUCION_DEFAULT = 20;
    private final boolean TDT_DEFAULT = false;



    public Television() {
        super();
        this.resolucion = RESOLUCION_DEFAULT;
        this.TDT = TDT_DEFAULT;
    }

    public Television(int precio_base, int peso) {
        super(precio_base, peso);
        this.resolucion = RESOLUCION_DEFAULT;
        this.TDT = TDT_DEFAULT;
    }

    public Television(int precio_base, String color, char consumoe, int peso, int resolucion, boolean TDT) {
        super(precio_base, color, consumoe, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int precioFinal(){
        int pfTV=super.precioFinal();
        if(resolucion > 40) {
            return pfTV + ((30 * pfTV) / 100) + tdtTrue();
        }
        return pfTV + tdtTrue();
    }

    private int tdtTrue(){
        if(TDT == true){
            return 50;
        }
        return 0;
    }


    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
}
