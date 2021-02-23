package ejercicio16;

import java.util.Locale;
import java.util.Scanner;

public class ejecutable {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        String nombre ;
        int edad;
        char sexo ;
        int peso;
        Double altura;

        try {

            System.out.println("***BIENVENID(A)***");
            System.out.println("Ingrese su nombre");
            nombre = lector.nextLine();
            System.out.println("Ingrese su edad");
            edad = lector.nextInt();
            System.out.println("Ingrese su sexo 'H'HOMBRE - 'M' MUJER");
            sexo = lector.next().charAt(0);
            System.out.println("ingrese su peso");
            peso = lector.nextInt();
            System.out.println("ingrese su altura");

            altura = Double.parseDouble(lector.next());


            Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
            System.out.println(persona1.toString());
            System.out.println(persona1.MostrarIdealP());
            System.out.println(persona1.MostrarME());

            Persona persona2 = new Persona(nombre,edad,sexo);
            System.out.println(persona2.toString());
            System.out.println(persona2.MostrarIdealP());
            System.out.println(persona2.MostrarME());

            Persona persona3 = new Persona();
            persona3.setNombre("David");
            persona3.setEdad(27);
            persona3.setPeso(76);
            persona3.setAltura(1.78);
            persona3.setSexo('H');
            System.out.println(persona3.toString());
            System.out.println(persona3.MostrarIdealP());
            System.out.println(persona3.MostrarME());

        }catch (Exception e){
            System.err.println("Ingrese los valores de manera correcta");
        }









    }
}
