import java.util.Locale;
import java.util.Scanner;
/*  Leia 2 valores com uma casa decimal (n1 e n2), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante 
ao qual pertence o ponto, ou se está sobre um dos ein1os cartesianos ou na origem (n1 = n2 = 0.0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos ein1os escreva “Ein1o n1” ou “Ein1o n2”, conforme for a situação.*/
public class uri1043{
    public static void main(String[] args){
        
        double ab,cd,ef,area,perim;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        ab = sc.nextDouble();
        cd = sc.nextDouble();
        ef = sc.nextDouble();

        if(ab + ef > cd || ab + cd > ef || ef + cd > ab){
            System.out.printf("Forma um trinagulo\n");
            perim = ab + cd + ef;
        }else{
            System.out.printf("Nao forma um triangulo\n");
            area
        }

        sc.close();
    }
}
