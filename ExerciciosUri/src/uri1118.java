import java.util.Locale;
import java.util.Scanner;
/*  Escreva um programa para ler as notas da primeira e a segunda avaliação de um aluno. Calcule e imprima a média semestral. 
O programa só deverá aceitar notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota deve ser validada separadamente.
    No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”, solicitando ao usuário que informe um código (1 ou 2) indicando se ele 
deseja ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se for informado o código 1 deve ser repetida a execução de 
todo o programa para permitir um novo cálculo, caso contrário o programa deve ser encerrado.*/
public class uri1118{
    public static void main(String[] args) {
        
        double nota,media=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int i=0,cont=0,op=0;

        while(op != 2){
            
            while(i != 2){
                nota = sc.nextDouble();
                if(nota >= 0 && nota <= 10){
                    media += nota;
                    i++;
                }else{
                    System.out.printf("nota invalida\n");
                }
            }
            
            media /= i;

            System.out.printf("media = %.2f\n",media);
            
            System.out.printf("novo calculo (1-sim 2-não)\n");
            op = sc.nextInt();
            
            if(op == 1){
                i -= 2;
                media = 0;
            }
            
        }


        

        sc.close();
    }
}