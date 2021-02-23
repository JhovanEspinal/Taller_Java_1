package ejercicio5;

public class app5 {

    public static void main(String[] args) {

        int i = 1;
        int j = 1;

        System.out.println();
        System.out.println("*NUMEROS IMPARES*");
        while (j <= 100) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
            j++;

        }

        System.out.println("*NUMEROS PARES*");
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;

        }
    }
}


