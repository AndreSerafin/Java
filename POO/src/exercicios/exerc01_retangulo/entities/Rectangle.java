package exercicios.exerc01_retangulo.entities;

public class Rectangle {

    public double altura;
    public double largura;

    public double area(){

        return altura * largura;
    }

    public double perimetro() {

        return (altura * 2) + (largura * 2);
    }

    public double diagonal() {

        return Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2));
    }

    public String toString(){

        return  "Area = "
                + String.format("%.2f",area())
                + "\n"
                + "Perimetro = "
                + String.format("%.2f", perimetro())
                + "\n"
                + "Diagonal = "
                + String.format("%.2f",diagonal());
    }

}
