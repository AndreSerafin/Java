import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram no 1º e 2º semestres.
Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir os nomes dos alunos aprovados,
considerando aprovados aqueles cuja média das notas seja maior ou igual a seis.*/
public class exVetores007 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        String[] vetNomes = new String[n];
        double[] vetNotas1 = new double[n];
        double[] vetNotas2 = new double[n];
        double[] vetMedia = new double[n];

        for(int i = 0; i < n; i++){
            vetNomes[i] = sc.next();
            vetNotas1[i] = sc.nextDouble();
            vetNotas2[i] = sc.nextDouble();

            vetMedia[i] = (vetNotas1[i] + vetNotas2[i]) / 2; 
        }
        
        System.out.printf("Alunos aprovados:\n");

        for(int i = 0; i < n; i++){
            if(vetMedia[i] >= 6.0){
                System.out.printf("%s\n",vetNomes[i]);
            }
        }
        

        sc.close();
    }
}
