package Ejercicio4;

import Ejercicio3.AreaCirculo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        ProductoIva objIva = new ProductoIva();
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingrese el precio del producto: ");
        objIva.setPrecio(lector.nextDouble());
        System.out.println("El valor del iva es: " +objIva.getCaliva()+
                           " y el precio total del producto es: "+objIva.getPreciototal());

    }
}
