import java.util.Locale;
import java.util.Scanner;
/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. 
Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). 
Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). 
O programa será encerrado quando o código informado for o número 4.*/
public class uri1134{
    public static void main(String[] args) {
        
        int op=0,alcool=0,gasolina=0,diesel=0;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        while(op != 4){
            
            System.out.printf("1.Álcool 2.Gasolina 3.Diesel 4.Fim\n");
            op = sc.nextInt();

            while(op != 1 && op != 2 && op !=3 & op != 4){
                System.out.printf("1.Álcool 2.Gasolina 3.Diesel 4.Fim\n");
                op = sc.nextInt();
    
            }
            if(op == 1){
                alcool++;
            }else if(op == 2){
                gasolina++;
            }else if(op == 3){
                diesel++;
            }
        }   

        System.out.printf("MUITO OBRIGADO\n");
        System.out.printf("Alcool: %d\n",alcool);
        System.out.printf("Gasolina: %d\n",gasolina);
        System.out.printf("Diesel: %d\n",diesel);


        sc.close();
    }
}