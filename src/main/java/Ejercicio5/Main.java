package Ejercicio5;



public class Main {
    public static void main(String[] args){


        int x=0;
        NumParImpar objParImp = new NumParImpar();

        System.out.println("\nlos número pares del 1 - 100 son :");
        while (x <= 100){
            x += 1;
            objParImp.setNum(x);
            objParImp.getPar();
        }

        System.out.println("\nlos número impares del 1 - 100 son :");
        x=0;
        while (x < 100){
            x += 1;
            objParImp.setNum(x);
            objParImp.getImpar();

        }
    }
}
