import java.util.Locale;
import java.util.Scanner;
/*A Federação Gaúcha de Futebol contratou você para escrever um programa para fazer uma estatística do resultado de vários GRENAIS. 
Escreva um programa para ler o número de gols marcados pelo Inter e pelo Grêmio em um GRENAL. Logo após escrever a mensagem "Novo grenal 
(1-sim 2-nao)" e solicitar uma resposta. Se a resposta for 1, o algoritmo deve ser executado novamente solicitando o número de gols marcados 
pelos times em uma nova partida, caso contrário deve ser encerrado imprimindo:
- Quantos GRENAIS fizeram parte da estatística.
- O número de vitórias do Inter.
- O número de vitórias do Grêmio.
- O número de Empates.
- Uma mensagem indicando qual o time que venceu o maior número de GRENAIS (ou "Nao houve vencedor", caso termine empatado).*/
public class uri1131 {
    public static void main(String[] args){

        int golsInter,golsGremio,vitoriaInter=0,vitoriaGremio=0,empates=0,grenais=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int op=1;
        while(op !=2){
            
            grenais++;

            golsInter = sc.nextInt();
            golsGremio = sc.nextInt();
    
            if(golsInter > golsGremio){
                vitoriaInter++;
            }else if(golsInter == golsGremio){
                empates++;
            }else{
                vitoriaGremio++;
            }

            System.out.printf("Novo grenal (1-sim 2-nao)\n");
            op = sc.nextInt();
            
            while(op != 1 && op != 2){
                System.out.printf("Novo grenal (1-sim 2-nao)\n");
                op = sc.nextInt();
            }
        }

        System.out.printf("%d grenais\n",grenais);
        System.out.printf("Inter: %d\n",vitoriaInter);
        System.out.printf("Gremio: %d\n",vitoriaGremio);
        System.out.printf("Empates: %d\n",empates);

        if(vitoriaInter > vitoriaGremio){
            System.out.printf("Inter venceu mais\n");
        }else if(vitoriaInter == vitoriaGremio){
            System.out.printf("Nao houve vencedor\n");
        }else{
            System.out.printf("Gremio venceu mais\n");
        }

        sc.close();

    }
}
