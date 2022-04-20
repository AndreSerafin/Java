import java.util.Locale;
import java.util.Scanner;
/*  Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a média semestral. 
O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
    No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele 
deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de 
todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.*/
public class uri1118{
    public static void main(String[] args) {
        
        double n1,n2;
        int op=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        op = 1;
        
        while(op !=2){


            n1 = sc.nextDouble();
            while(n1 < 0 || n1 > 10){
                System.out.printf("nota invalida\n");
                n1 = sc.nextDouble();
            }
            
            n2 = sc.nextDouble();
            while(n2 < 0 || n2 > 10){
                System.out.printf("nota invalida\n");
                n2 = sc.nextDouble();
            }
    
            double media = (n1 + n2) / 2.0;
    
            System.out.printf("media = %.2f\n",media);
    
            System.out.printf("novo calculo (1-sim 2-nao)\n");
            op = sc.nextInt();
            while(op != 1 && op != 2){
                op = sc.nextInt();
            }
        }

        sc.close();
    }
}
