package exemplos.exemplo07_composicao.entities;

public class Triangulo {

    Ponto v1 = new Ponto();
    Ponto v2 = new Ponto();
    Ponto v3 = new Ponto();

    public Triangulo() {

    }
    public Triangulo(double x1, double y1, double x2 , double y2, double x3, double y3) {
        v1.setX(x1);
        v1.setY(y1);
        v2.setX(x2);
        v2.setY(y2);
        v3.setX(x3);
        v3.setY(y3);

    }

    public Triangulo(Ponto v1, Ponto v2, Ponto v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimetro() {
        double lado1 = v1.distancia(v2);
        double lado2 = v2.distancia(v3);
        double lado3 = v3.distancia(v1);
        return lado1 + lado2 + lado3;
    }

    public boolean existe(){
        double lado1 = v1.distancia(v2);
        double lado2 = v2.distancia(v3);
        double lado3 = v3.distancia(v1);
        if(lado1 + lado2 <= lado3 || lado2 + lado3 <= lado1
                || lado3 + lado1 <= lado2){
            return false;
        }
        return true;
    }

    public String tipo(){
        double lado1 = v1.distancia(v2);
        double lado2 = v2.distancia(v3);
        double lado3 = v3.distancia(v1);
        if(lado1 == lado2 && lado2 == lado3) {
            return "Triangulo equilatero";
        } else if (lado1 == lado2 || lado2 == lado1 || lado3 == lado1) {
            return "Triangulo isosceles";
        }
        return "triangulo escaleno";
    }

    public String toString() {
        return "v1 = " + v1.toString()
                + " v2 = " + v2.toString()
                + " v3 = " + v3.toString();
    }

}

