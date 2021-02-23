package ejercicio4;

import java.util.Scanner;

public class app4 {

    float precio;
    private static final int IVA = 21;

    public static void main(String[] args) {

        String producto;
        float precio;
        Scanner lector = new Scanner(System.in);
        try {
            System.out.println("por favor ingrese el producto");
            producto = lector.nextLine();
            System.out.println("por favor ingrese el precio");
            precio = lector.nextFloat();

            float precioF = (IVA * precio) / 100 + precio;
            System.out.println("el precio del producto " + producto + " con IVA ES: " + precioF);
        } catch (Exception e) {
            System.err.println("por favor ingrese un numero");
        }

    }

}
