package Ejercicio15;

import java.util.Scanner;

public class MenuOpc {

    public void MenuOpciones() {

        System.out.println("****** GESTION CINEMATOGRAFICA ********\n "
                +"1: NUEVO ACTOR\n "
                +"2: BUSCAR ACTOR\n "
                +"3: ELIMINAR ACTOR\n "
                +"4: MODIFICAR ACTOR\n "
                +"5: VER TODOS LOS ACTORES\n "
                +"6: VER PELICULAS DE LOS ACTORES\n "
                +"7: VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES\n "
                +"8: Salir\n");
    }

    public void Menu() {
        Scanner lector = new Scanner (System.in);
        int opc;

        try {
            do{
                MenuOpciones();
                System.out.println("Digite una opción del menú ");

                opc=lector.nextInt();
                switch(opc)
                {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        System.out.println("Opción no valida \n");
                }
            }while(opc!=8);
        }catch (Exception e){
            System.out.println("la opción ingresada debe ser numerica \n");
            Menu();
        }

    }
}
