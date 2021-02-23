package ejercicio15;

import java.util.Scanner;

public class app15 {

    public static void main(String[] args) {
        boolean detener = true;
        int opc;

        do {
            Scanner lector = new Scanner(System.in);
            try {
                System.out.println("****** GESTION CINEMATOGRÁFICA ********");
                System.out.println("1-NUEVO ACTOR");
                System.out.println("2-BUSCAR ACTOR");
                System.out.println("3-ELIMINAR ACTOR");
                System.out.println("4-MODIFICAR ACTOR");
                System.out.println("5-VER TODOS LOS ACTORES");
                System.out.println("6-VER PELICULAS DE LOS ACTORES");
                System.out.println("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
                System.out.println("8-SALIR");


                opc = lector.nextInt();
                detener = opciones(opc);
            } catch (Exception e) {
                System.err.println("ingrese una opción correcta");
            }

        } while (detener);
    }

    private static boolean opciones(int opcion) {

        switch (opcion) {

            case 1:
                return true;

            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                return true;
            case 6:
                return true;
            case 7:
                return true;
            case 8:
                return false;

            default:
                System.err.println("ingrese una opción correcta");
                return true;
        }
    }
}

