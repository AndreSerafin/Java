import java.util.Locale;
import java.util.Scanner;
/*Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário. A seguir, calcule o menor 
número de notas e moedas possíveis no qual o valor pode ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas 
possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01. A seguir mostre a relação de notas necessárias. */

public class uri1021 {
    public static void main(String[] args) {
        
        double valor,quantMoedas,quantNotas;
        double[] notas = {100,50,20,10,5,2};
        double[] moedas = {1,0.50,0.25,0.10,0.05,0.01};

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        valor = sc.nextDouble();
    
        System.out.printf("NOTAS:\n");
        for(int i = 0;i <= 5;i ++){
            quantNotas = valor/notas[i];
            System.out.printf("%d nota(s) de R$ %.2f\n",(int) quantNotas,notas[i]);
            valor %= notas[i];
        }

        System.out.printf("MOEDAS:\n");
        for(int i = 0;i <= 5;i ++){
            quantMoedas = valor/moedas[i];
            System.out.printf("%d moedas(s) de R$ %.2f\n",(int) quantMoedas,moedas[i]);
            valor %= moedas[i];
        }

        sc.close();
    }
}
