package Ejercicio7;

import java.util.Scanner;

public class Comparar {
    private int numero1;

    //Método para leer variable número
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese un Numero mayor o igual que cero: ");
        numero1 =lector.nextInt();
    }

    public void Comparar() {
        do{
            if (numero1 >= 0){
                System.out.println("El número ingresado fue: " +numero1);
                break;
            }
            leerVariable();

        }while(numero1 < 0);


    }

}
