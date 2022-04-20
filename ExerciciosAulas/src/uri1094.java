import java.util.Locale;
import java.util.Scanner;
/*  Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de 
um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual 
de cada tipo de cobaia utilizada.
    Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o 
número de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.
Entrada
    A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um 
inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de 
cobaia (R:Rato S:Sapo C:Coelho).*/
public class uri1094 {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numTestes,numAnimais=0,coelho=0,rato=0,sapo=0,total;
        char animal=' ';

        numTestes = sc.nextInt();

        for(int i = 1;i <= numTestes;i++){
            
            numAnimais = sc.nextInt();
            animal = sc.next().charAt(0);

            if(numAnimais >=1 && numAnimais <= 15 && animal == 'C'){
                coelho += numAnimais;
            }else if(numAnimais >=1 && numAnimais <= 15 && animal == 'R'){
                rato += numAnimais;
            }else if(numAnimais >=1 && numAnimais <= 15 && animal == 'S'){
                sapo += numAnimais;
            }else{
                System.out.printf("entrada invalida\n");
            }
        }

        double percentualCoelho,percentualRato,percentualSapo;

        total = coelho + rato + sapo;
        
        percentualCoelho = (double) coelho / total;
        percentualRato = (double) rato / total;
        percentualSapo = (double) sapo / total;
    
        System.out.printf("Total: %d cobaias\n",total);
        System.out.printf("Total de coelhos: %d\n",coelho);
        System.out.printf("Total de ratos: %d\n",rato);
        System.out.printf("Total de sapos: %d\n",sapo);
        System.out.printf("Percentual de coelhos: %.2f %%\n",percentualCoelho * 100);
        System.out.printf("Percentual de ratos: %.2f %%\n",percentualRato * 100);
        System.out.printf("Percentual de sapos: %.2f %%\n",percentualSapo * 100);

        sc.close();
    }
}
