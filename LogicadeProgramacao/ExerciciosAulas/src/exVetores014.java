import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que receba dez números inteiros e armazene-os em um vetor. Calcule e mostre dois 
vetores resultantes: o primeiro com os números pares e o segundo, com os números ímpares.*/

public class exVetores014 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um tamanho para o vetor: ");
        int n = sc.nextInt();

        System.out.printf("Digite %d numeros para preenchero o vetor: \n", n);
        for(int i = 0; i < n; i++){

        }

        sc.close();
    }
}
