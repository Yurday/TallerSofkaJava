package Ejercicio9;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Cadena {
    private String frase;



    //Método para leer variable día
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("ingrese una frase ");
        frase = lector.nextLine();
    }


    public void reemplazar() {
        String cadena ="La sonrisa sera la mejor arma contra la tristeza ";
        System.out.println(cadena.replace("a","e").concat(frase));
    }
}


