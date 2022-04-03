import java.util.Scanner;
/*A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:
- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.*/

public class uri1002 {
    public static void main(String[] args){
        
        double area,raio,pi=3.14159;

        Scanner sc = new Scanner(System.in);
        raio = sc.nextDouble();
        area = pi * Math.pow(raio,2);
        System.out.printf("A=%.4f\n",area);

        sc.close();
    }
    
}
