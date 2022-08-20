package ex03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Emprestimo> emprestimos = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.print("Digite a quantidade de emprestimos: ");
        int qtddEmprestimo = sc.nextInt();

            sc.nextLine();
        for (int i = 0; i < qtddEmprestimo; i++) {

            System.out.printf("---Emprestimo %d---\n", i + 1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Cpf: ");
            String cpf = sc.nextLine();
            System.out.print("Codigo de cadastro: ");
            int codCadastro = sc.nextInt();

            Pessoa pessoa = new Pessoa(nome, cpf, codCadastro);

            System.out.print("Quantidade Livros: ");
            int qtddLivros = sc.nextInt();

            ArrayList<Livro> livros = new ArrayList<>();

                sc.nextLine();
            for (int j = 0; j < qtddLivros; j++) {
                System.out.printf("--Livro %d--\n", j + 1);
                System.out.print("Titulo do Livro: ");
                String titulo = sc.nextLine();
                System.out.print("Autor: ");
                String autor = sc.nextLine();

                livros.add(new Livro(titulo, autor));
            }
            Date dataEmp, dataDev, dataVenc;
            System.out.print("Data de Emprestimo(dd/mm/aaaa): \n");
            dataEmp = sdf.parse(sc.nextLine());
            System.out.print("Data de Vencimento(dd/mm/aaaa): \n");
            dataVenc = sdf.parse(sc.nextLine());
            System.out.print("Data de Devolucao(dd/mm/aaaa): \n");
            dataDev = sdf.parse(sc.nextLine());

            emprestimos.add(new Emprestimo(pessoa,dataEmp,dataDev,dataVenc,qtddLivros,livros));
        }
        System.out.println("---------------------------------");
        for(Emprestimo x : emprestimos) {
            System.out.printf("%s\n", x.toString());
            System.out.println("---------------------------------");
        }
    }
}
