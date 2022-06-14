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
            System.out.println("╰─────────────────────────────────────────────────────────────────────────╯\n");

            op = sc.nextInt();

            switch (op){
                case 0 -> {
                }
                case 1 -> {

                    System.out.print("Quantos clientes serão cadastrados: ");
                    int quantCli = sc.nextInt();

                    for (int i = 0; i < quantCli; i++) {

                        System.out.print("\nCodigo cliente: ");
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

                        System.out.print("\nNumero do Documento: ");
                        int numDoc = sc.nextInt();
                        while(numDocEmUso.contains(numDoc)){
                            System.out.print("Numero Inválido!\nDigite novamente: ");
                            numDoc = sc.nextInt();
                        }
                        numDocEmUso.add(numDoc);

                        System.out.print("Codigo do Cliente: ");
                        int codCli = sc.nextInt();

                        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

                        System.out.print("Data de Vencimento(dd/mm/aaaa): ");

                        String x;
                        Date dataVencimento = null;
                        boolean eValido;

                        sc.nextLine();
                        do{

                            try{
                                x = sc.nextLine();
                                dataVencimento = sdf.parse(x);
                                eValido = true;
                            }catch (Exception e){
                                System.out.println("Data invalida!");
                                eValido = false;
                            }
                        }while (!eValido);

                        System.out.print("Data de Pagamento(dd/mm/aaaa): ");
                        Date dataPagamento = null;
                        do{

                            try{
                                x = sc.nextLine();
                                dataPagamento= sdf.parse(x);
                                eValido = true;
                            }catch (Exception e){
                                System.out.println("Data invalida!");
                                eValido = false;
                            }
                        }while (!eValido);

                        System.out.print("Valor: ");
                        double valor = sc.nextDouble();

                        Documentos doc1 = new Documentos(numDoc, codCli, dataVencimento, dataPagamento, valor);
                        documentos.add(i, doc1);

                    }
                }
                case 3 -> {

                    for (Cliente cli : cliente) {
                        System.out.print("\n\n" + cli.toString());
                    }
                }
                case 4 -> {

                    for (Documentos doc : documentos) {
                        System.out.println("\n" + doc.toString());
                    }
                }
                case 5 -> {
                    System.out.print("Nome do cliente: ");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    for (int i = cliente.size() - 1; i >= 0; i--){
                        if(!documentos.isEmpty()){
                            for (int j = 0; j < documentos.size(); j++){
                                if(cliente.get(i).getNome().equals(nome)){
                                    cliente.remove(i);
                                }
                            }
                        }else if (cliente.get(i).getNome().equals(nome)) {
                            cliente.remove(i);
                        }
                    }
                }
                case 6 -> {
                    System.out.print("Digite o numero do documento: ");
                    int numDoc = sc.nextInt();

                    documentos.removeIf(doc -> doc.getNumDoc() == numDoc);
                }
                case 7 -> {
                    System.out.print("Nome do cliente: ");
                    sc.nextLine();
                    String nomeCli = sc.nextLine();
                    for (int i = documentos.size() - 1; i >= 0; i--){
                        for (Cliente value : cliente) {
                            if (value.getNome().equals(nomeCli)
                                    && documentos.get(i).getCodCli() == value.getCodCLi()) {
                                documentos.remove(i);
                            }
                        }
                    }

                }
                case 8 -> {

                    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                    System.out.print("Data inicial (dd/mm/aaaa): ");
                    sc.nextLine();
                    String x = sc.nextLine();
                    Date dataInicial = sdf.parse(x);

                    System.out.print("Data final (dd/mm/aaaa)");
                    x = sc.nextLine();
                    Date dataFinal = sdf.parse(x);

                    for (int i = documentos.size() - 1; i >= 0; i--) {
                        if(dataInicial.before(documentos.get(i).getDataDeVencimento())
                                && dataFinal.after(documentos.get(i).getDataDeVencimento())){
                            documentos.remove(documentos.get(i));
                        }
                    }

                }
                case 9 -> {

                    if(!cliente.isEmpty()) {
                        System.out.print("Codigo do cliente: ");
                        int codCli = sc.nextInt();

                        for (Cliente cli : cliente) {
                            if (cli.getCodCLi() == codCli) {
                                int op1;
                                do {
                                    System.out.println("\n╭──────────────────────╮");
                                    System.out.println("│       Alterar:       │");
                                    System.out.println("│      0. Voltar:      │");
                                    System.out.println("│       1. Nome:       │");
                                    System.out.println("│     2. Telefone:     │");
                                    System.out.println("│     3. Endereco:     │");
                                    System.out.println("╰──────────────────────╯");

                                    op1 = sc.nextInt();

                                    switch (op1) {
                                        case 0 -> {

                                        }
                                        case 1 -> {
                                            sc.nextLine();
                                            cli.setNome(sc.nextLine());
                                        }
                                        case 2 -> {
                                            sc.nextLine();
                                            cli.setTelefone(sc.nextLine());
                                        }
                                        case 3 -> {
                                            sc.nextLine();
                                            cli.setEndereco(sc.nextLine());
                                        }
                                        default -> {
                                            System.out.print("Opção Invalida!");
                                        }
                                    }
                                } while (op1 != 0);
                            }
                        }
                    }else{
                        System.out.println("Nenhum cliente cadastrado!");
                    }
                }
                default -> {
                    System.out.print("Opção Invalida!");
                }
            }

        }while(op != 0);

        sc.close();
    }
}
