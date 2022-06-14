package application;
/*Faça um programa que ulilize od registros a seguir:
Cliente: codCli, nome, fone, endereço
Documentos: numDoc, codCli, dataVenc, dataPag, valor, juros

Sabe-se que um documento só pode ser cadastrado para um cliente que já exista.Considere que podem
existir,no máximo,15 clientese30 documentos.Crie um vetor para clientes e outro para documentos.Crie
um menu para a realização de cada uma das operações especificadas a seguir.
a)Cadastrar clientes não pode existir mais que um cliente comomesmo código.
b)Cadastrar documentos ao cadastrar um documento,seadata de pagamento for maior queadata de venci
mento,calcular o campo'juros'do registro documentos(5% sobreovalor original do documento).
c)Excluir clientes-um cliente só poderá ser excluído se não existir nenhum documento associado a ele.
d)Excluir documentos individuais-por meio de seu número.Caso o documento não exista,oprograma deverá
mostraramensagem Documento não encontrado.
e)Excluir documentos por cliente-oprograma deverá informarocódigo do clienteeexcluir todos os seus
documentos.Casoocliente não exista,deverá mostraramensagem Cliente não encontrado.
f)Excluir documentos por período-oprograma deverá informaradata inicialeadata finaleexcluir todos os
documentos que possuam data de vencimento nesse período.
g)Alterar as informações sobre os clientes-só não pode ser alteradoocódigo do cliente.
h)Mostrar o total de documentos de determinado cliente.
i)Sair.*/

import entities.Cliente;
import entities.Documentos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int op;
        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        ArrayList<Documentos> documentos = new ArrayList<Documentos>();
        ArrayList<Integer> codsEmUso = new ArrayList<Integer>();
        ArrayList<Integer> numDocEmUso = new ArrayList<Integer>();

        do{

            System.out.println("\n╭─────────────────────────────────────────────────────────────────────────╮");
            System.out.println("│                              Menu de opcoes:                            │");
            System.out.println("│                          0. Finalizar programa:                         │");
            System.out.println("│                          1. Cadastrar clientes:                         │");
            System.out.println("│                        2. Cadastrar documentos:                         │");
            System.out.println("│                 3. Mostar todos clientes cadastrados:                   │");
            System.out.println("│                4. Mostar todos documentos cadastrados:                  │");
            System.out.println("│                          5. Excluir clientes:                           │");
            System.out.println("│                6. Excluir documentos a partir do numero:                │");
            System.out.println("│                    7. Excluir documentos por cliente:                   │");
            System.out.println("│                    8. Excluir documentos por periodo:                   │");
            System.out.println("│                   9. Alterar informacoes de clientes:                   │");
            System.out.println("│         10. Mostrar o total de documentos de determinado cliente:       │");
            System.out.println("╰─────────────────────────────────────────────────────────────────────────╯\n");

            op = sc.nextInt();

            switch (op){
                case 0 -> {

                }
                case 1 -> {

                    System.out.print("Quantos clientes serão cadastrados: ");
                    int quantCli = sc.nextInt();

                    for (int i = 0; i < quantCli; i++) {

                        System.out.print("Codigo cliente: ");
                        int codCli = sc.nextInt();
                        while(codsEmUso.contains(codCli)){
                            System.out.print("Codigo inválido!\nDigite novamente: ");
                            codCli = sc.nextInt();
                        }
                        codsEmUso.add(codCli);

                        System.out.print("Nome cliente: ");
                        sc.nextLine();
                        String nome = sc.nextLine();

                        System.out.print("Telefone (ddd) nnnn-nnnn: ");
                        String telefone = sc.nextLine();

                        System.out.print("Endereço: ");
                        String endereco = sc.nextLine();

                        Cliente cli1 = new Cliente(codCli, nome, telefone, endereco);
                        cliente.add(i,cli1);
                    }

                }
                case 2 -> {

                    System.out.print("Quantos Documentos Serão Cadastrados: ");
                    int quantDocs = sc.nextInt();

                    for (int i = 0; i < quantDocs; i++) {

                        System.out.print("Numero do Documento: ");
                        int numDoc = sc.nextInt();
                        while(numDocEmUso.contains(numDoc)){
                            System.out.print("Numero Inválido!\nDigite novamente: ");
                            numDoc = sc.nextInt();
                        }
                        numDocEmUso.add(numDoc);

                        System.out.print("Codigo do Cliente: ");
                        int codCli = sc.nextInt();

                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                        System.out.print("Data de Vencimento: ");
                        sc.nextLine();
                        String x = sc.nextLine();
                        Date dataVencimento = sdf.parse(x);

                        System.out.print("Data de Pagamento: ");
                        x = sc.nextLine();
                        Date dataPagamento = sdf.parse(x);

                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();

                        Documentos doc1 = new Documentos(numDoc, codCli, dataVencimento, dataPagamento, valor);
                        documentos.add(i, doc1);

                    }
                }
            }

        }while(op != 0);

        sc.close();
    }
}
