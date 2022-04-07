import java.util.Locale;
import java.util.Scanner;
/*Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e 
imprima a média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida 
deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.*/
public class uri1117{
    public static void main(String[] args) {
        
        double nota,media=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int i=0;
        
        while(i != 2){
            nota = sc.nextDouble();
            if(nota >= 0 && nota <= 10){
                media += nota;
                i++;
            }else{
                System.out.printf("nota invalida\n");
            }
            //System.out.printf("i = %d\n",i);
        }

        media /= i;

        System.out.printf("media = %.2f\n",media);

        sc.close();
    }
}