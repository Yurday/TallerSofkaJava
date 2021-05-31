package Ejercicio4;

public class ProductoIva {
    private  double iva,caliva;
    private double precio;
    private double preciototal;

    public ProductoIva(){
        iva = 21;
    }

    public ProductoIva(double iva, double precio, double preciototal, double caliva) {
        this.iva = iva;
        this.precio = precio;
        this.preciototal = preciototal;
        this.caliva = caliva;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCaliva() {
        caliva = precio * iva/100;
        return caliva;
    }

    public double getPreciototal() {

        preciototal = precio + caliva;
        return preciototal;
    }
}
