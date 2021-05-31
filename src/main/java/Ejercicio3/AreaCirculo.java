package Ejercicio3;

public class AreaCirculo {
    private double Perimetro;
    private double area;

    public AreaCirculo(){
    }

    public AreaCirculo(double perimetro) {
        this.Perimetro = perimetro;

    }

    public void setPerimetro(double perimetro) {
        Perimetro = perimetro;
    }

    public double getArea() {

        area= Math.PI * Math.pow(2,Perimetro);

        return area;
    }
}
