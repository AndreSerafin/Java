import java.util.Locale;
import java.util.Scanner;
/*Fazer um programa para ler as duas notas que um aluno obteve no primeiro e
segundo semestres de uma disciplina anual. Em seguida, mostrar a nota final que o
aluno obteve no ano juntamente com um texto explicativo. Caso a nota final do aluno
seja inferior a 60.00, mostrar a mensagem "REPROVADO", conforme exemplos. Todos
os valores devem ter uma casa decimal.*/
public class ex005 {
    public static void main(String[] args){
        
        double nota1,nota2,notaFinal;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        nota1 = sc.nextDouble();
        nota2 = sc.nextDouble();

        notaFinal = nota1 + nota2;

        if(notaFinal < 60){
            System.out.printf("NOTA FINAL: %.1f\n",notaFinal);
            System.out.printf("REPROVADO\n");
        }else{
            System.out.printf("NOTA FINAL: %.1f\n",notaFinal);
            System.out.printf("APROVADO\n");
        }

        sc.close();
    }
}
