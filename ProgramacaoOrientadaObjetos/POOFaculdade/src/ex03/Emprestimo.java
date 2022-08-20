package ex03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Emprestimo {
    private Pessoa pessoa;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private Date dataVencimento;
    private double multa;
    private int qtddLivros;
    ArrayList<Livro> livros = new ArrayList<>();

    public Emprestimo() {

    }

    public Emprestimo(Pessoa pessoa, Date dataEmprestimo, Date dataDevolucao,
                      Date dataVencimento, int qtddLivros, ArrayList<Livro> livros) {
        this.pessoa = pessoa;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.dataVencimento = dataVencimento;
        this.livros = livros;
        this.qtddLivros = qtddLivros;
        multa = calculaMulta(qtddLivros);
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public double getMulta() {
        return multa;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public double calculaMulta(int qtddLivros){
        double multa = 0;
        if(dataDevolucao.after(dataVencimento)){
            multa += 50.0 * qtddLivros;
        }
        return multa;
    }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String data1 = sdf.format(dataEmprestimo);
        String data2 = sdf.format(dataVencimento);
        String data3 = sdf.format(dataDevolucao);

        StringBuilder sb = new StringBuilder();
        for(Livro x : livros){
            sb.append(String.format("%s\n", x.toString()));
        }
        if(multa > 0){
            return pessoa.toString() + "\n"
                    + "Data de Emprestimo: " + data1 + "\n"
                    + "Data de Vencimento: " + data2 + "\n"
                    + "Data de Devolucao: " + data3 + "\n"
                    + "Livros Emprestados: " + sb + "\n"
                    + "Multa: R$ " + String.format("%.2f", multa);
        }
        return pessoa.toString() + "\n"
                + "Data de Emprestimo: " + data1 + "\n"
                + "Data de Vencimento: " + data2 + "\n"
                + "Data de Devolucao: " + data3 + "\n"
                + "Livros Emprestados: " + sb + "\n";
    }

}
