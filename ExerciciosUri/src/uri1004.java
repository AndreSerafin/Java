import java.util.Scanner;

/*Leia dois valores inteiros, no caso para variáveis A e B. A seguir, 
calcule o produto entre elas e atribua à variável PROD. A seguir escrever o valor desta variável.*/
public class uri1004 {
    public static void main(String[] args){

        int a,b,prod;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        prod = a*b;

        System.out.printf("PRODUTO = %d\n",prod);
        sc.close();

    }
}
