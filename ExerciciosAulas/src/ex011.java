import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler um número N, depois nome (apenas uma
palavra sem espaços), idade e altura de N pessoas, conforme exemplo.
Depois, mostrar na tela a altura média das pessoas, e mostrar também a
porcentagem de pessoas com menos de 16 anos.*/
public class ex011 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] nome = new String[n];
        int[] idade = new int[n];
        double[] altura = new double[n];


        double mediaAltura = 0;
        double menosDe16 = 0;
        for(int i = 0; i < n; i++){
            nome[i] = sc.next();
            idade[i] = sc.nextInt();
            altura[i] = sc.nextDouble();
            mediaAltura += altura[i];
            if(idade[i] < 16){
                menosDe16 ++;
            }
        }

        mediaAltura /= n;
        double porcentagem = (menosDe16*100) / n;
        System.out.printf("Altura Média = %.2f\n",mediaAltura);
        System.out.printf("Porcentagem com menor de 16 = %.2f %%\n",porcentagem);





        sc.close();
    }
}
