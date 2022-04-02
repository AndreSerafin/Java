import java.util.Locale; 
import java.util.Scanner;
/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.*/
public class uri1012 {
    public static void main(String[] args){
        double a,b,c,pi=3.14159;
        double areaTri,areaCirc,areaTrap,areaQuad,areaRet; 

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        areaTri = (a * c) / 2;
        areaCirc = pi * Math.pow(c, 2);
        areaTrap = ((a + b) * c)/ 2;
        areaQuad = b * b;
        areaRet = a * b;

        System.out.printf("TRIANGULO: %.3f\n",areaTri);
        System.out.printf("CIRCULO: %.3f\n",areaCirc);
        System.out.printf("TRAPEZIO: %.3f\n",areaTrap);
        System.out.printf("QUADRADO: %.3f\n",areaQuad);
        System.out.printf("RETANGULO: %.3f\n",areaRet);
        
        
        sc.close();
        
    }
}
