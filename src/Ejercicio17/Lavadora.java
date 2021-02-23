package Ejercicio17;

public class Lavadora extends Electrodomestico{
    private int carga;
    private final int CARGA_DEFAULT = 5;

    public Lavadora() {
        super();
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(int precio_base, int peso) {
        super(precio_base, peso);
        this.carga = CARGA_DEFAULT;
    }

    public Lavadora(int precio_base, String color, char consumoe, int peso, int carga) {
        super(precio_base, color, consumoe, peso);
        this.carga = carga;
    }


    public int precioFinal() {
        if (carga > 30) {
            return super.precioFinal() + 50;
        }
        return super.precioFinal();

    }

    public int getCarga() {
        return carga;


    }
}
