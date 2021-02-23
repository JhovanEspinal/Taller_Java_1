package ejercicio7;

import java.util.Scanner;

public class app7 {

    public static void main(String[] args) {
        int num;

        do {
            Scanner lector = new Scanner(System.in);
            try {
                System.out.println("Por favor ingrese un numero");
                num = lector.nextInt();
            } catch (Exception e) {
                num = -1;
            }
        } while (num <= 0);

        System.out.println("el numero " + num + " es mayor o igual a 0");

    }
}



