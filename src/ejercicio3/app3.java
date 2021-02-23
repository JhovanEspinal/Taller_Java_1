package ejercicio3;
import java.util.Scanner;

public class app3 {

    private static final double pi = 3.1416;
    private static double radio;
    private static double area;

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        System.out.println("*Encontraremos el area de un circulo*\n ingresa el radio");
        try {
            radio = Double.parseDouble(lector.nextLine());
            area = pi * Math.pow(radio, 2);
            System.out.println(String.format("%.2f", area));
        }catch (Exception e) {
            System.err.println("por favor ingrese un numero correcto");
        }
    }




}
