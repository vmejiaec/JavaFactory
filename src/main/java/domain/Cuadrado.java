package dominio;

public class Cuadrado implements Figura{
    puble double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public String tipo(){
        return "Cuadrado";
    }

    public double area(){
        return lado * lado;
    }

    public double perimetro(){
        return 4*lado;
    }
}