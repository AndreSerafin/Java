package exemplos.exemplo07_composicao.entities;

public class Circulo {

    private Ponto centro = new Ponto();
    private double raio;

    public Circulo() {

    }

    public Circulo(double x, double y, double raio) {
        centro.setX(x);
        centro.setY(y);
        this.raio = raio;
    }

    public Circulo(Ponto centro, double raio) {
        this.centro = centro;
        this.raio = raio;
    }

    public Ponto getCentro() {
        return centro;
    }

    public void setCentro(Ponto centro) {
        this.centro = centro;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getCentroX(){
        return centro.getX();
    }

    public void setCentroX(double x) {
        centro.setX(x);
    }

    public double getCentroY(){
        return centro.getX();
    }

    public void setCentroY(double y) {
        centro.setX(y);
    }

    public double[] getCentroXY(){
        double[] centro = new double[2];
        centro[0] = this.centro.getX();
        centro[1] = this.centro.getY();
        return centro;
    }

    public void setCentroXY(double x, double y) {
        centro.setX(x);
        centro.setY(y);
    }

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getCircumferencia() {
        return 2 * Math.PI * raio;
    }

    public double distancia(Circulo circulo) {
        return centro.distancia(circulo.centro);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raio: " + raio + ", ");
        sb.append("Centro: " + this.centro.toString());

        return sb.toString();
    }
}
