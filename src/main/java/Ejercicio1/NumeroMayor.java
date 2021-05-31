package Ejercicio1;

public class NumeroMayor {
    private int numero1;
    private int nuemro2;

    public NumeroMayor(){
        numero1 = 0;
        nuemro2 = 40;
    }

    public NumeroMayor(int numero1, int nuemro2 ) {
        this.numero1 = numero1;
        this.nuemro2 = nuemro2;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNuemro2() {
        return nuemro2;
    }

    public void setNuemro2(int nuemro2) {
        this.nuemro2 = nuemro2;
    }

    public String mayor(){
        String msj= "";

        if (numero1 > nuemro2){
            msj="El número1 que es "+numero1+" es mayor que número2 que es "+nuemro2;
        }else{
            msj="El número2 que es "+nuemro2 +" es mayor que número1 que es "+numero1;
        }
        if (numero1 == nuemro2){
            msj="El número1 que es "+numero1 +" y el número2 que es "+nuemro2 + " son iguales.";
        }
        return msj;
    }
}
