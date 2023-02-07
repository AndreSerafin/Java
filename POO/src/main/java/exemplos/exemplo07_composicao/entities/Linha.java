package exemplos.exemplo07_composicao.entities;

public class Linha {

    Ponto inicio = new Ponto();
    Ponto fim = new Ponto();

    public Linha() {

    }

    public Linha(double x1, double y1, double x2, double y2) {
        inicio.setX(x1);
        inicio.setY(y1);
        fim.setX(x2);
        fim.setY(y2);
    }

    public Linha(Ponto inicio, Ponto fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public Ponto getInicio() {
        return inicio;
    }

    public void setInicio(Ponto inicio) {
        this.inicio = inicio;
    }

    public Ponto getFim() {
        return fim;
    }

    public void setFim(Ponto fim) {
        this.fim = fim;
    }

    public double getInicioX() {
        return inicio.getX();
    }

    public void setInicioX(double x) {
        inicio.setX(x);
    }

    public double getInicioY(){
        return inicio.getY();
    }

    public void setInicioY(double y){
        inicio.setY(y);
    }

    public double getFimX() {
        return inicio.getX();
    }

    public void setFimX(double x) {
        inicio.setX(x);
    }

    public double getFimY(){
        return inicio.getY();
    }

    public void setFimY(double y){
        inicio.setY(y);
    }

    public double[] getInicioXY() {
        return inicio.getXY();
    }

    public void setInicioXY(double x, double y) {
        inicio.setX(x);
        inicio.setY(y);
    }

    public double[] getFimXY() {
        return fim.getXY();
    }

    public void setFimXY(double x, double y) {
        fim.setX(x);
        fim.setY(y);
    }

    public double getCoprimento() {
        return inicio.distancia(fim);
    }

    public double getGradiente(){
        double xDif = inicio.getX() - fim.getX();
        double yDif = inicio.getY() - fim.getY();

        return Math.atan2(xDif, yDif);
    }

    public String toString() {
        return "Inicio: (" + inicio.getX() + ", "
                + inicio.getY() + "), "
                + "Fim: (" + fim.getX() + ", "
                + fim.getY() + ")";
    }
}
