import java.util.Locale;
import java.util.Scanner;
/*A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:
    Salário	            Percentual de Reajuste
0 - 400.00                      15%
400.01 - 800.00                 12%
800.01 - 1200.00                10%
1200.01 - 2000.00               7%
Acima de 2000.00                4%
Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.*/
public class uri1048{
    public static void main(String[] args){
        
        double salarioInicial,reajuste,salarioFinal,percentual;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        salarioInicial = sc.nextDouble();
        
        if(salarioInicial <= 400.00){

            reajuste = salarioInicial * 0.15;
            salarioFinal = salarioInicial + reajuste;
            percentual = 0.15 * 100;

        }else if(salarioInicial > 400.00 && salarioInicial <= 800.00){

            reajuste = salarioInicial * 0.12;
            salarioFinal = salarioInicial + reajuste;
            percentual = 0.12 * 100;
            
        }else if(salarioInicial > 800.00 && salarioInicial <= 1200.00){

            reajuste = salarioInicial * 0.10;
            salarioFinal = salarioInicial + reajuste;
            percentual = 0.10 * 100;

        }else if(salarioInicial > 1200 && salarioInicial <= 2000.00){

            reajuste = salarioInicial * 0.07;
            salarioFinal = salarioInicial + reajuste;
            percentual = 0.07 * 100;

        }else{

            reajuste = salarioInicial * 0.04;
            salarioFinal = salarioInicial + reajuste;
            percentual = 0.04 * 100;

        }

        System.out.printf("Novo salario: %.2f\n",salarioFinal);
        System.out.printf("Reajuste ganho: %.2f\n",reajuste);
        System.out.printf("Em percentual: %.0f %%\n",percentual);

        sc.close();
    }
}
