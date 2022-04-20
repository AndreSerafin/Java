import java.util.Locale;
import java.util.Scanner;
/*Um comerciante deseja fazer o levantamento do lucro das mercadorias que ele comercializa. Para isto, mandou digitar
um conjunto de N mercadorias, cada uma contendo nome, preço de compra e preço de venda das mesmas. Fazer um
programa que leia tais dados e determine e escreva quantas mercadorias proporcionaram:
• lucro< 10%
• 10% ≤ lucro ≤ 20%
• lucro> 20%
Determine e escreva também o valor total de compra e de venda de todas as mercadorias, assim como o
lucro total.*/
public class exVetores009 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] produto = new String[n];
        double[] precoDeCompra = new double[n];
        double[] precoDeVenda = new double[n];

        for(int i = 0; i < n; i++){
            produto[i] = sc.next();
            precoDeCompra[i] = sc.nextDouble();
            precoDeVenda[i] = sc.nextDouble();
        }

        double lucro = 0;
        double[] porcentagemLucro = new double[n];
        int menorQue10 = 0;
        int entre10e20 = 0;
        int maiorQue20 = 0;

        for(int i = 0; i < n; i++){
            lucro = precoDeVenda[i] - precoDeCompra[i];
            porcentagemLucro[i] = (lucro/precoDeCompra[i])*100.0;
            System.out.printf("Lucro = %.2f%%\n",porcentagemLucro[i]);
            if(porcentagemLucro[i] < 10.0){
                menorQue10++;
            }else if(porcentagemLucro[i] <= 20.0){
                entre10e20++;
            }else{
                maiorQue20++;
            }
        }

        System.out.printf("Lucro abaixo de 10%%: %d\n",menorQue10);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n",entre10e20);
        System.out.printf("Lucro acima de 20%%: %d\n",maiorQue20);


        sc.close();
    }
}
