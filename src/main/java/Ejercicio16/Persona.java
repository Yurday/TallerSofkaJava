package Ejercicio16;

import java.util.Scanner;

public class Persona {
    Scanner sc = new Scanner(System.in);
    private String nombre;
    private int edad;
    private int dni;
    private final char sexo;
    private double peso;
    private double altura;


    public Persona(){
        nombre="";
        edad=0;
        sexo='H';
        peso=0;
        altura=0;

    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;

    }


    public Persona(String nombre, int edad, char sexo, int dni, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.dni = dni;
        this.peso = peso;
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public  double calcularIMC(){
        double resultado;
        resultado= getPeso() / Math.pow(getAltura(),2);
        return resultado;
    }

   public String Mostrar(){

        final String peso_ideal="-1";
        final String peso_bajo="0";
        final String sobre_peso="1";
        String Mensaje;
        if (calcularIMC()<20){
            Mensaje="Está en su peso ideal " + peso_ideal;
        }else if(calcularIMC() >= 20 && calcularIMC() <=25){
            Mensaje="Está por debajo de su peso ideal " + peso_bajo;
        }else {
            Mensaje="Usted está sobre peso" + sobre_peso;
        }
        return Mensaje;
    }

    public void MayorEdad(){

        if (getEdad()>= 18){
            System.out.println(nombre+" es mayor de edad ? "+ true);
        }else {
            System.out.println(nombre+" es mayor de edad ? "+ false);
        }
          }


   public int Dni(){
       this.dni = 0;
       this.dni = (int) (Math.random()*10000000);
       return this.dni;
   }

    public String obtenerNumeroID(){
        int operacionDNI;
        String letraDNI = "";
        Dni();
        operacionDNI = this.dni%23;
        String letras[]= {"-T","-R","-W","-A","-G","-M","-Y","-F","-P","-D","-X","-B","-N","-J","-Z","-S","-Q","-V","-H","-L","-C","-K","-E"};
        for (int i = 0; i < letras.length; i++) {
            if (operacionDNI == i){
                letraDNI = letras[i];
                break;
            }
        }
        return letraDNI;
    }


    @Override
    public String toString() {
        return "Persona{" +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni=" + dni + obtenerNumeroID() +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public void persona1() {
        String sexo;
        System.out.println("ingrese su nombre");
        nombre=sc.next();
        System.out.println("ingrese su edad");
        edad= sc.nextInt();
        System.out.println("ingrese su Altura");
        altura = sc.nextDouble();
        System.out.println("ingrese su Peso");
        peso=sc.nextDouble();
        System.out.println("ingrese su Sexo");
        sexo = sc.next();
        System.out.println(Mostrar());

            }

            public void persona2(){
                String sexo;
                System.out.println("ingrese su nombre");
                nombre=sc.next();
                System.out.println("ingrese su edad");
                edad= sc.nextInt();
                System.out.println("ingrese su Sexo");
                sexo = sc.next();
            }

            public void persona3(){

             setNombre("maria");
             setEdad(24);
             setAltura(1.74);
             setPeso(65.8);
             getSexo();

            }
    }




