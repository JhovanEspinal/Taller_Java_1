package ejercicio11;

import java.util.Locale;
import java.util.Scanner;

public class app11 {

    public static void main(String[] args) {
        String frase;
        int cA = 0;
        int cE = 0;
        int cI = 0;
        int cO = 0;
        int cU = 0;
        Scanner lector = new Scanner(System.in);


        System.out.println("Por favor ingrese una frase");
        frase = lector.nextLine().toLowerCase();

        for (int i = 0; i <frase.length(); i++) {
            if (frase.charAt(i) == 'a') {
                cA += 1;
            } else if (frase.charAt(i) == 'e') {
                cE += 1;
            } else if (frase.charAt(i) == 'i') {
                cI += 1;
            } else if (frase.charAt(i) == 'o') {
                cO += 1;
            } else if (frase.charAt(i) == 'u') {
                cU += 1;
            }

        }

        System.out.println("la frase que ingresaste tiene una longitud de : " + frase.length());
        System.out.println(" contiene "+cA+" a\n contiene "+cE+" e\n contiene "+cI+" i\n contiene" +
                " "+cO+" o\n contiene "+cU+" u");

    }
}
