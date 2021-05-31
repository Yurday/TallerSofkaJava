package Ejercicio8;

import java.util.Scanner;

public class DiaSemana {
    private String dia;


    //Método para leer variable día
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese un día de la semana: ");
        dia = lector.nextLine().toLowerCase();
    }


    public void Comparar() {

        switch(dia)
        {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("El "+dia+" es un día laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("El "+dia+" no es un día laboral");
                break;
            default:
                System.out.println("Opción no valida ");
        }


    }
}
