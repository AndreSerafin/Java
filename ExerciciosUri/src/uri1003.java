import java.util.Scanner;
/*Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. 
A seguir escrever o valor desta variável..*/
public class uri1003 {
    public static void main(String[] args){
        int a,b,soma;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        
        soma = a + b;

        System.out.printf("SOMA = %d\n", soma);

        sc.close();

    }
    
}
