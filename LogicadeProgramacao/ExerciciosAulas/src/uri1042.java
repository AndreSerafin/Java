import java.util.Locale;
import java.util.Scanner;
/*  Leia 2 valores com uma casa decimal (n1 e n2), que devem representar as coordenadas de um ponto em um plano. A seguir, determine qual o quadrante 
ao qual pertence o ponto, ou se está sobre um dos ein1os cartesianos ou na origem (n1 = n2 = 0.0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos ein1os escreva “Ein1o n1” ou “Ein1o n2”, conforme for a situação.*/
public class uri1042{
    public static void main(String[] args){
        
        int n1,n2,n3,maior=0,menor=0,meio=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        if(n1 > n2 && n1 > n3){
            maior = n1;
            if(n2 > n3){
                meio = n2;
                menor = n3;
            }else{
                meio = n3;
                menor = n2;
            }
        }else if(n2 > n1 && n2 > n3){
            maior = n2;
            if(n1 > n3){
                meio = n1;
                menor = n3;
            }else{
                meio = n3;
                menor = n1;
            }
        }else if(n3 > n2 && n3 > n1){
            maior = n3;
            if(n1 > n2){
                meio = n1;
                menor = n2;
            }else{
                meio = n2;
                menor = n1;
            }
        }
        
        System.out.println(menor);
        System.out.println(meio);
        System.out.printf("%d\n\n",maior);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        sc.close();
    }
}
