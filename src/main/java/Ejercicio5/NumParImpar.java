package Ejercicio5;

public class NumParImpar {
    private double par, impar;
    private int num;

    public NumParImpar(){
    }

    public NumParImpar(double par, double impar, int num) {
        this.par = par;
        this.impar = impar;
        this.num = num;
    }



    public void setNum(int num) {
        this.num = num;
    }

    public double getPar() {
        if((num % 2 ) ==0 ){
            par=num;
            System.out.println(par);
        }
        return par;
    }

    public double getImpar() {
        if((num % 2 ) != 0 ){
            impar=num;
            System.out.println(impar);
        }
        return impar;
    }
}
