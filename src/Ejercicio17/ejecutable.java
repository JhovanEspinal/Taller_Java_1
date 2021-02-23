package Ejercicio17;

import java.util.ArrayList;

public class ejecutable {

    public static void main(String[] args) {

        int Tlavadora=0;
        int Ttelevisor=0;
        int Telectrodomestico=0;
        int totalE=0;


        Electrodomestico listaE[] = new Electrodomestico[10];

        Lavadora lavadora1 =new Lavadora(200,"rojo",'C',35,50);
        Electrodomestico electrodomestico1 = new Electrodomestico(200,"blanco",'F',10);
        Television televisor1 = new Television(350,"azul",'C', 50, 30,true);
        Lavadora lavadora2 =new Lavadora(100,"gris",'A',100,57);
        Electrodomestico electrodomestico2 = new Electrodomestico(500,"gris",'D',150);
        Television televisor2 = new Television(1000,"gris",'B', 500, 150,true);
        Lavadora lavadora3 =new Lavadora(650,"gris",'D',200,100);
        Electrodomestico electrodomestico3 = new Electrodomestico(480,"blanco",'C',280);
        Television televisor3 = new Television(600,"azul",'E', 300, 100,false);
        Electrodomestico electrodomestico4 = new Electrodomestico(700,"negro",'A',300);

        listaE[0] = lavadora1;
        listaE[1] = electrodomestico1;
        listaE[2] = televisor1;
        listaE[3] = lavadora2;
        listaE[4] = electrodomestico2;
        listaE[5] = televisor2;
        listaE[6] = lavadora3;
        listaE[7] = electrodomestico3;
        listaE[8] = televisor3;
        listaE[9] = electrodomestico4;

        for(Electrodomestico lector: listaE){

            if(lector instanceof Television){
              Ttelevisor +=lector.precioFinal();

            }else if(lector instanceof Lavadora){
                Tlavadora +=lector.precioFinal();
            }
            else{
                Telectrodomestico +=lector.precioFinal();
            }
        }
        System.out.println("***PRECIO FINAL***");
        System.out.println("Todos los electrodomesticos :"+(Tlavadora+Ttelevisor+Telectrodomestico)+"€");
        System.out.println("Lavadoras : "+ Tlavadora+"€");
        System.out.println("Televisores: "+ Ttelevisor+"€");

    }
}
