package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        AreaCirculo objArea = new AreaCirculo();
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el perimetro: ");
        objArea.setPerimetro(lector.nextDouble());
        System.out.println("El área del circulo es: "+objArea.getArea());

    }
}
