/*Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa.*/

package exercicios.exerc06_dadosPessoais.application;

import exercicios.exerc06_dadosPessoais.entities.PersonalData;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        PersonalData pessoa = new PersonalData();

        System.out.print("Digite o seu nome: ");
        pessoa.setNome(sc.nextLine());

        System.out.print("\nDigite sua data de nascimento (dd/mm/aaaa): ");
        String[] dataDeNascimeto = sc.nextLine().split("/");
        pessoa.setDia(Integer.parseInt(dataDeNascimeto[0]));
        pessoa.setMes(Integer.parseInt(dataDeNascimeto[1]));
        pessoa.setAno(Integer.parseInt(dataDeNascimeto[2]));

        System.out.print("\nDigite a sua altura em metros: ");
        pessoa.setAltura(sc.nextDouble());

        System.out.println("\n" + pessoa.toString());
        System.out.println(pessoa.calculaIdade());

        sc.close();
    }
}
