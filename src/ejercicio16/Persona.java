package ejercicio16;

public class Persona {

    private String nombre;
    private int edad;
    private String DNI;
    private  char sexo ;
    private int peso ;
    private double altura;
    private final char SEXO_DEFAULT = 'H';
    private final int BAJO_PESO = -1;
    private final int NORMAL_PESO = 0;
    private final int SOBRE_PESO = 1;



    public Persona() {
        this.nombre="";
        this.edad=0;
        this.DNI=generaDNI();
        this.sexo='M';
        this.peso=0;
        this.altura=0;
    }

    public Persona(String nombre, int edad, char sexo) {
        this();
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }

    public Persona(String nombre, int edad, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = generaDNI();
        this.sexo = ComprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }

    //Metodo para calcular peso ideal
    public int CalcularMC(){

        double MC= peso/Math.pow(altura, 2);
        if(MC < 20) {
            return BAJO_PESO;
        }
        else if(MC >=20 && MC <=25){
            return NORMAL_PESO;
        }else if(MC > 25){
            return SOBRE_PESO;
        }
        return 2;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean esMayorDeEdad(){

        if(edad >= 18) {
            return true;
        }
        return false;
    }

    public char ComprobarSexo(char sexo) {

        if (sexo == 'M') {
            return 'M';
        }
        return SEXO_DEFAULT;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + '\'' +
                ", edad= " + edad +
                ", DNI= " + DNI +
                ", sexo= " + sexo +
                ", peso= " + peso +
                ", altura= " + altura +
                '}';
    }

    private  char calcularLetra(int dni) {
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int resto = dni % 23;
        return caracteres.charAt(resto);
    }
    private String generaDNI(){
        int aleatorio;
        String DNIF;
        String aleatorioF;

         aleatorio =(int) (Math.random() *10000000 +1 + 9999999);
         aleatorioF = String.valueOf(aleatorio);
         DNIF = aleatorioF+calcularLetra(aleatorio);

         return DNIF;
    }

    public String MostrarIdealP() {
        int vPeso = CalcularMC();

        if (vPeso == -1){
            return  "Se encuentra bajo su peso ideal";
        }else if (vPeso == 0) {
            return "Se encuentra en su peso ideal";
        }else if (vPeso == 1){
            return "Se encuentra en sobrepeso";
        }

        return "sin peso definido";
        }


    public String MostrarME(){
        boolean MD = esMayorDeEdad();
        if(MD){
            return "Es mayor de edad";
        }
        return "No es mayor de edad";
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}













