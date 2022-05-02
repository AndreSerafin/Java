import java.util.Locale; 
import java.util.Scanner;
/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
public class uri1013 {
    public static void main(String[] args){
        int a,b,c,maior; 

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        
        maior = a;
        
        if(b > a && b > c){
            maior = b;
        }else if(c > a && c > b){
            maior = c;
        }

        System.out.printf("%d eh o maior\n",maior);
        
        sc.close();
        
    }
}
