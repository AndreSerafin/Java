import java.util.Locale;
import java.util.Scanner;
/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que 
estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:
se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A² = B² + C², apresente a mensagem: TRIANGULO RETANGULO
se A² > B² + C², apresente a mensagem: TRIANGULO OBTUSANGULO
se A² < B² + C², apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES*/
public class uri1045{
    public static void main(String[] args){
        
        double a,b,c,min,mid,max;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        if(a > b && a > c){
            max = a;
            if(b > c){
                mid = b;
                min = c;
            }else{
                mid = c;
                min = b;
            }
        }else if(b > a && b > c){
            max = b;
            if(a > c){
                mid = a;
                min = c;
            }else{
                mid = c;
                min = a;
            }
        }else{
            max = c;
            if(a > b){
                mid = a;
                min = b;
            }else{
                mid = b;
                min = a;
            }
        }

        //System.out.println(max + " " + mid + " " + min);
        
        if(max >= mid + min){
            System.out.printf("NAO FORMA TRIANGULO\n");
        }
        else if(Math.pow(max,2) == Math.pow(mid,2) + Math.pow(min,2)){
            System.out.printf("TRIANGULO RETANGULO\n");
        }
        else if(Math.pow(max,2) == Math.pow(mid,2) + Math.pow(min,2)){
            System.out.printf("TRIANGULO RETANGULO\n");
        }
        else if(Math.pow(max,2) > Math.pow(mid,2) + Math.pow(min,2)){
            System.out.printf("TRIANGULO OBTUSANGULO\n");
        }
        else if(Math.pow(max,2) < Math.pow(mid,2) + Math.pow(min,2)){
            System.out.printf("TRIANGULO ACUTANGULO\n");
        }

        if(max == mid && max == min && mid == min){
            System.out.printf("TRIANGULO EQUILATERO\n");
        }else if(max == mid || max == min || mid == min){
            System.out.printf("TRIANGULO ISOSCELES\n");
        }

        sc.close();
    }
}
