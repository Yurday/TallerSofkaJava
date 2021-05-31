package Ejercicio6;

import Ejercicio5.NumParImpar;

public class Main {
    public static void main(String[] args){


        int x;
        NumParImpar objParImp = new NumParImpar();

        System.out.println("\nlos número pares del 1 - 100 son :");

        for(x =1 ;x <=100; x++){

            objParImp.setNum(x);
            objParImp.getPar();

        }

        System.out.println("\nlos número impares del 1 - 100 son :");

        for(x =0 ;x <100; x++){

            objParImp.setNum(x);
            objParImp.getImpar();

        }
    }
}
