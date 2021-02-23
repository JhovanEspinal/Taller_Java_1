package ejercicio12;

import java.util.Scanner;

public class app12 {

    private static String palabra1;
    private static String palabra2;
    private static String palabra1_2="";
    private static String palabra2_2="";


    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese la primera palabra");
        palabra1 = lector.nextLine();
        System.out.println("ingrese la segunda palabra");
        palabra2 = lector.nextLine();
        System.out.println(equality());
    }

    private static  String equality() {

        if (palabra1.equals(palabra2)) {
            return "las palabras son iguales";
        }

        mostrarDif();
        return "*Diferencias*\n" + palabra1_2 + "\n" + palabra2_2;
    }

    /*Metodo para encontrar diferencia de longitud */
    private static  int Diferencialongi() {

        if (palabra1.length() > palabra2.length()) {
            return palabra1.length();
        }
        return palabra2.length();
    }

    private static void addEspacio() {

        String caracter = " ";
        int diferencia = Math.abs(palabra1.length() - palabra2.length());

        if (palabra1.length() > palabra2.length()) {
            palabra2 = palabra2 + caracter.repeat(diferencia);
        }
        else {
            palabra1 = palabra1 + caracter.repeat(diferencia);
        }
    }

    public static void mostrarDif() {
        addEspacio();
        for (int i = 0; i < Diferencialongi(); i++) {
            if (palabra1.charAt(i) == palabra2.charAt(i)) {
                palabra1_2 += "*";
                palabra2_2 += "*";
            } else {
                palabra1_2 += palabra1.charAt(i);
                palabra2_2 += palabra2.charAt(i);
            }
        }
    }
}




