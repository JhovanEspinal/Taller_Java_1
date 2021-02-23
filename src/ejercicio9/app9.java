package ejercicio9;

public class app9 {

    public static void main(String[] args) {
        final String frase = "\"La sonrisa sera la mejor arma contra la tristeza\"";
        String frase2;

        System.out.println("*remplazaremos la vocal a por e de la siguiente frase*");

        frase2 = frase.replaceAll("a", "e");
        frase2 = frase2.concat(" un dia sin sonreir es un dia perdido");

        System.out.println(frase2);
    }
}
