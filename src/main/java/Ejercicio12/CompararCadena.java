package Ejercicio12;

import java.util.Scanner;

public class CompararCadena {
    private String frase;

    //Método para leer variable día
    public void leerVariable(){
        Scanner lector = new Scanner (System.in);
        System.out.println("ingrese una frase ");
        frase = lector.nextLine();
    }




    public void compararFrase() {
        String fras1,fras2;
        leerVariable();
        fras1=frase;
        leerVariable();
        fras2=frase;

        if(fras1.length() == fras2.length()){
            if(fras1.equals(fras2)){
                System.out.println("Las palabras" + fras1 + " y " + fras2 + " son iguales.");
            }
            else {
                for (int i = 0; i < fras1.length(); i++) {
                    if (fras1.charAt(i) != fras2.charAt(i)) {
                        System.out.println(" Las palabras no coinciden en la posición: " + i );
                        System.out.println("Donde se tiene "+ fras1.charAt(i) + " en vez de " + fras2.charAt(i));
                    }
                }
            }
        }
        else{
            System.out.println("Las palabras no son iguales.");
        }


    }
}
