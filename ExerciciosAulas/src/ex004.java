import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler o nome (apenas uma palavra) e idade de duas pessoas.
Ao final mostrar uma mensagem com os nomes e a idade média entre essas pessoas,
com uma casa decimal, conforme exemplo.*/
public class ex004 {
    public static void main(String[] args){
        
        String nome1,nome2;
        int idade1,idade2;
        double media;
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        nome1 = sc.next();
        idade1 = sc.nextInt();
        nome2 = sc.next();
        idade2 = sc.nextInt();

        media = (idade1 + idade2) / 2.0;

        System.out.printf("A idade média de %s e %s é de %.1f\n",nome1,nome2,media);
              
        sc.close();
    }   
}
