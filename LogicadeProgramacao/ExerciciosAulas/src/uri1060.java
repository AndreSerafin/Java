import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.*/
public class uri1060{
    public static void main(String[] args){
        
        double[] n1 = new double[6];
        int valorPositivo = 0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        
        for(int i = 0;i < 6;i++){
            
            n1[i] = sc.nextDouble();

            if(n1[i] > 0){
                valorPositivo ++ ; 
            }
        }

        System.out.printf("%d valores positivos\n",valorPositivo);

        sc.close();
    }
}
