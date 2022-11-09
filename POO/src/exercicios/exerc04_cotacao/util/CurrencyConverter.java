package exercicios.exerc04_cotacao.util;

public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double valorEmReais(double preco, double quantidade){

        double imposto = quantidade + (quantidade * IOF);

        return imposto * preco;
    }

}
