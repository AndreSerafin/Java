import java.util.Locale;
import java.util.Scanner;
/*  Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante 
ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0.0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.*/
public class uri1041 {
    public static void main(String[] args){
        
        double x,y;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        x = sc.nextDouble();
        y = sc.nextDouble();

        if(x == 0.0 && y == 0.0){
            System.out.printf("Origem\n");
        }else if(x == 0.0){
            System.out.printf("Eixo Y\n");
        }else if(y == 0.0){
            System.out.printf("Eixo X\n");
        }else if(x > 0.0 && y > 0.0){
            System.out.printf("Q1\n");
        }else if(x < 0.0 && y > 0.0){
            System.out.printf("Q2\n");
        }else if(x < 0.0 && y < 0.0){
            System.out.printf("Q3\n");
        }else{
            System.out.printf("Q4\n");
        }

        
        
        sc.close();
    }
}
