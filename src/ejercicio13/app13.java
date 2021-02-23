package ejercicio13;

import java.time.LocalDate;
import java.time.LocalTime;

public class app13 {

    public static void main(String[] args) {

        LocalTime horaActual = LocalTime.now();
        LocalDate fechaActual = LocalDate.now();

        System.out.println("   FECHA    /       HORA ");
        System.out.println(fechaActual+ " / " + horaActual);
    }
}
