package entities;

import java.util.Date;

public class Documentos {

    //Documentos: numDoc, codCli, dataVenc, dataPag, valor, juros

    private int numDoc;
    private int codCli;
    private Date dataDeVencimento;
    private Date dataDePagamento;
    private  double valor;
    private int juros;

    public Documentos(int numDoc, int codCli, Date dataDeVencimento, Date dataDePagamento, double valor) {
        this.numDoc = numDoc;
        this.codCli = codCli;
        this.dataDeVencimento = dataDeVencimento;
        this.dataDePagamento = dataDePagamento;
        this.valor = valor;
    }
}
