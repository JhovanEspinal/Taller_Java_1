package ejercicio6;

public class app6 {


    public static void main(String[] args) {

        System.out.println("*NUMEROS IMPARES*");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("*NUMEROS PARES*");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}