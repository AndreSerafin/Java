package exercicios.exerc11_autorELivro.application;

import exercicios.exerc11_autorELivro.entities.Autor;
import exercicios.exerc11_autorELivro.entities.Livro;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Autor
        System.out.print("Nome do autor: ");
        String nomeAutor = sc.nextLine();
        System.out.print("Email do autor: ");
        String email = sc.nextLine();

        Autor autor = new Autor(nomeAutor, email);

        //Livro
        System.out.print("Isbn do livro: ");
        String isbn = sc.nextLine();
        System.out.print("Nome do livro: ");
        String nomeLivro = sc.nextLine();
        System.out.print("Preço: ");
        float preco = sc.nextFloat();
        System.out.print("Deseja inserir uma quantidade(s/n)? ");

        Livro livro = null;
        char op;

        do{
            sc.nextLine();
            op = sc.nextLine().charAt(0);
            switch (op) {
                case 's' -> {
                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    livro = new Livro(isbn, nomeLivro, autor, preco, quantidade);
                }
                case 'n' -> {
                    livro = new Livro(isbn, nomeLivro, autor, preco);
                }
                default -> {
                    System.out.println("Opção Inválida!");
                }
            }
        }while(op != 's' && op != 'n');

        System.out.println("\n" + livro.toString());

        sc.close();

    }
}
