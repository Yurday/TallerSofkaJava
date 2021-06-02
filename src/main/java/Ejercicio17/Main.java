package Ejercicio17;

import Ejercicio171.Electrodomestico;
import Ejercicio171.Lavadora;
import Ejercicio171.Television;

public class Main {

    public static void main(String[] args) {
        double preciototallavadoras=0;
        double preciototaltv=0;
        double preciototalelectro=0;
        Ejercicio171.Electrodomestico lista_elect[] = new Ejercicio171.Electrodomestico[10];
        Ejercicio171.Electrodomestico lav1 = new Ejercicio171.Lavadora();
        Ejercicio171.Electrodomestico lav2 = new Ejercicio171.Lavadora(10,20);
        Ejercicio171.Electrodomestico lav3 = new Ejercicio171.Lavadora(20,30,'A',"Blanco",20);
        Ejercicio171.Electrodomestico tel1 = new Television();
        Ejercicio171.Electrodomestico tel2 = new Television(30,40,'B',"Negro",65,true);
        Ejercicio171.Electrodomestico tel3 = new Television(35,30);
        Ejercicio171.Electrodomestico elect = new Ejercicio171.Electrodomestico();
        Ejercicio171.Electrodomestico elect2 = new Ejercicio171.Electrodomestico(60,10);
        Ejercicio171.Electrodomestico elect3 = new Ejercicio171.Electrodomestico(45,40,'E',"violeta");
        Ejercicio171.Electrodomestico elect4 = new Ejercicio171.Electrodomestico(75,20,'K',"gris");

        lista_elect[0] = lav1;
        lista_elect[1] = lav2;
        lista_elect[2] = lav3;
        lista_elect[3] = tel1;
        lista_elect[4] = tel2;
        lista_elect[5] = tel3;
        lista_elect[6] = elect;
        lista_elect[7] = elect2;
        lista_elect[8] = elect3;
        lista_elect[9] = elect4;

        for (Ejercicio171.Electrodomestico elemento: lista_elect) {
            // System.out.println(elemento.precioFinal());
            if(elemento instanceof Lavadora){
                preciototallavadoras+=elemento.precioFinal();
                continue;
            }
            else if(elemento instanceof Television){
                preciototaltv+=elemento.precioFinal();
                continue;
            }
            else if(elemento instanceof Electrodomestico){
                preciototalelectro+=elemento.precioFinal();
            }
        }
        System.out.println("Precio total televisores: $"+preciototaltv);
        System.out.println("Precio total lavadoras: $"+preciototallavadoras);
        System.out.println("Precio total electrodomesticos: $"+preciototalelectro);
        System.out.println("Precio total compra: $"+(preciototalelectro+preciototallavadoras+preciototaltv));
    }
}
