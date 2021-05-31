package Ejercicio11;

import java.util.Scanner;

public class ContarVocales {
    private String frase;
    char [] vocales={'a','e','i','o','u'};




    //Método para leer variable día
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("ingrese una frase ");
        frase = lector.nextLine();
    }


    public void ContarVocales() {

        int cantvoc = 0;
        String compf,compv;


        for( int i=0; i<frase.length(); i++){

            for( int a=0; a<vocales.length; a++){
                compf = Character.toString(frase.charAt(i));
                compv = Character.toString(vocales[a]);
                if(compf.equalsIgnoreCase(compv)){
                    cantvoc++;
                }

            }
        }

        System.out.println("la longitud de la frase es de: "+frase.length()
                +" y la cantidad de vocales es de: "+cantvoc);
    }
}

