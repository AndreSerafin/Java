import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia 6 valores. Estes valores serão somente negativos ou positivos (desconsidere os valores nulos). 
A seguir, mostre a quantidade de valores positivos digitados.*/
public class uri1066{
    public static void main(String[] args){
        
        int[] n1 = new int[5];
        int pares = 0,impar = 0,positivos = 0, negativos = 0;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i < 5;i++){
            n1[i] = sc.nextInt();
            
            if(n1[i] % 2 == 0){
                
                pares ++;
            }
            else if(n1[i] % 2 != 0){
                
                impar ++;
            }
            if(n1[i] < 0){
                
                negativos ++;
            }else if(n1[i] > 0){
                
                positivos ++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n",pares);
        System.out.printf("%d valor(es) impar(es)\n",impar);
        System.out.printf("%d valor(es) positivo(s)\n",positivos);
        System.out.printf("%d valor(es) negativo(s)\n",negativos);

        sc.close();
    }
}
