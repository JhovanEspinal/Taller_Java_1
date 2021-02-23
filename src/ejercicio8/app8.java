package ejercicio8;

import java.util.Scanner;

public class app8 {
    private static String dia;
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("*por favor ingrese un dia de la semana*");
        dia = lector.nextLine().toLowerCase();

        switch (dia) {

            case "lunes":
                yesWork();
                break;

            case "martes":
                yesWork();
                break;

            case "miercoles":
                yesWork();
                break;

            case "jueves":
                yesWork();
                break;

            case "viernes":
                yesWork();
                break;

            case "sabado":
                notWork();
                break;

            case "domingo":
                notWork();
                break;

            default:
                System.out.println(dia +" no es un dia de la semana\n *inténtelo nuevamente*");
        }
    }

    private static  void yesWork(){

         System.out.println(dia+" es un dia laboral");

    }

    private static  void notWork(){

        System.out.println(dia+" no es un dia laboral");

    }


}
