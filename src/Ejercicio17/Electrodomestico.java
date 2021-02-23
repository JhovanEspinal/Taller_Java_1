package Ejercicio17;

public class Electrodomestico {
    private int precio_base  ;
    private String color ;
    private char consumoenergético ;
    private int peso ;
    private final String COLOR_DEFAULT = "blanco";
    private final char COSUMOE_DEFAULT = 'F';
    private final int PRECIOB_DEFAULT = 100;
    private final int PESO_DEFAULT = 5;

    String colors[] = {"negro","rojo","azul","gris","blanco"};


    public Electrodomestico() {
        this.precio_base = PRECIOB_DEFAULT;
        this.color = COLOR_DEFAULT;
        this.consumoenergético = COSUMOE_DEFAULT;
        this.peso = PESO_DEFAULT;
    }

    public Electrodomestico(int precio_base, int peso) {
        this();
        this.precio_base = precio_base;
        this.peso = peso;
    }

    public Electrodomestico(int precio_base, String color, char consumoe, int peso) {
        this.precio_base = precio_base;
        this.color = comprobarColor(color);
        this.consumoenergético =comprobarConsumoEnergetico(consumoe);
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra){

        if(letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E'|| letra == 'F'){
            return letra;
        }
        return 'F';

    }

    private String comprobarColor(String color){

        if(color == colors[0] || color == colors[1] || color == colors[2]){
            return color;
        }
 return COLOR_DEFAULT;
    }

    public int precioFinal(){

       int precioF = this.precio_base + tipoConsumo() +pesoTama();

       return precioF;
    }

    private int tipoConsumo() {

        int tipoC=0;

        switch (consumoenergético) {

            case 'A':
                tipoC = 100;
                break;
            case 'B':
                tipoC = 80;
                break;
            case 'C':
                tipoC = 60;
                break;
            case 'D':
                tipoC = 50;
                break;
            case 'E':
                tipoC = 30;
                break;
            case 'F':
                tipoC = 10;
                break;

        }
        
        return tipoC;
    }

    public int pesoTama(){
        if(peso >=0 && peso <=19){
            return 10;
        }else if(peso >=20 && peso <=49){
            return 50;
        }else if(peso >=50 && peso <=79){
            return 80;
        }
        return 100;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoenergético() {
        return consumoenergético;
    }

    public int getPeso() {
        return peso;
    }
}
