package ejercicio2;

import java.util.Scanner;

public class app2 {


    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Hola, ingresa el primer numero");
        num1 =  lector.nextInt();

        System.out.println("ingrese el segundo numero");
        num2 =lector.nextInt();

        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor que " + num2);
        } else if (num1 == num2) {
            System.out.println("ambos numeros son iguales");
        } else {
            System.out.println("el numero " + num2 + " es mayor que " + num1);
        }

    }

}
