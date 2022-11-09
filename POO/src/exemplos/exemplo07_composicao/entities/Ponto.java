package exemplos.exemplo07_composicao.entities;

public class Ponto {

    private double x;
    private double y;
    private double[] xy = new double[2];

    public Ponto(){

    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double[] getXY() {
        double[] xy = new double[2];
        xy[0] = x;
        xy[1] = y;
        return xy;
    }

    public void setXY(double x, double y) {
         this.xy[0] = x;
         this.xy[1] = y;
    }

    public double distancia(double xb, double yb){
        return Math.sqrt(Math.pow((this.x - xb) , 2) + Math.pow((this.y - yb) , 2));
    }

    public double distancia(Ponto ponto) {
        return Math.sqrt(Math.pow((this.x - ponto.getX()) , 2) + Math.pow((this.y - ponto.y) , 2));
    }

    public double distancia(){
        return Math.sqrt(Math.pow((this.x) , 2) + Math.pow((this.y) , 2));
    }


    public String toString(){
        return "(" + x + ", " + y + ")";
    }
}
