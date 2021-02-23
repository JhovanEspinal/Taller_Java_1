package ejercicio10;

import java.util.Scanner;

public class app10 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String frase;

        System.out.println("*ingrese una frase*");
        frase = lector.nextLine();
        System.err.println("*sin espacios*");
        System.out.println(frase.replace(" ", ""));
    }
}
