package Ejercicio2;

import Ejercicio1.NumeroMayor;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        NumeroMayor objnum = new NumeroMayor();
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el numero1: ");
        objnum.setNumero1(lector.nextInt());
        System.out.println("Ingrese el numero2: ");
        objnum.setNuemro2(lector.nextInt());
        System.out.println(objnum.mayor());
    }
}
