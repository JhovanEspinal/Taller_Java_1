package ejercicio14;

import java.util.Scanner;

public class app14 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int num;

        try {
            System.out.println("*Por favor ingrese un numero*");
            num = lector.nextInt();

            for (int i = num; i <= 1000; ) {
                System.out.println(i);
                i += 2;
            }
        } catch (Exception e) {
            System.out.println("ingrese un numero correcto");
        }
    }
}
