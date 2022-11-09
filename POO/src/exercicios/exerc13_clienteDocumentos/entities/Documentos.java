package exercicios.exerc13_clienteDocumentos.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Documentos {

    private int numDoc;
    private int codCli;

    public int getNumDoc() {
        return numDoc;
    }

    public int getCodCli() {
        return codCli;
    }

    private Date dataDeVencimento;
    private Date dataDePagamento;
    private  double valor;
    private final double JUROS = 0.05;

    public Date getDataDeVencimento() {
        return dataDeVencimento;
    }

    public Date getDataDePagamento() {
        return dataDePagamento;
    }

    public Documentos(int numDoc, int codCli, Date dataDeVencimento, Date dataDePagamento, double valor) {
        this.numDoc = numDoc;
        this.codCli = codCli;
        this.dataDeVencimento = dataDeVencimento;
        this.dataDePagamento = dataDePagamento;
        this.valor = valor;
        this.valor = verificaVencimento();
    }

    public double verificaVencimento() {
        if(dataDePagamento.after(dataDeVencimento)) {
            valor += valor * JUROS;
        }

        return valor;
    }
    public String toString() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        return "Numero do Documento: " + numDoc
                + ", Codigo do Cliente: " + codCli
                + ", Data de Vencimento: " + sdf.format(dataDeVencimento)
                + ", Data de Pagamento: " + sdf.format(dataDePagamento)
                + ", Valor: " + valor;
    }
}
