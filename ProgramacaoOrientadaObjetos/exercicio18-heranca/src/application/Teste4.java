package application;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Teste4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        ArrayList<Conta> listaContas = new ArrayList<Conta>();

        listaContas.add(new ContaPoupanca(1001, "Alex", 500.0, 0.01));
        listaContas.add(new ContaComercial(1002, "Maria", 1000.0, 400.0));
        listaContas.add(new ContaPoupanca(1004, "Bob", 300.0,0.01));
        listaContas.add(new ContaComercial(1005, "Anna", 500.0, 500.0));

        double soma = 0.0;
        for(Conta c : listaContas) {
            soma += c.getSaldo();
        }

        System.out.printf("Saldo total: %.2f\n", soma);

        for(Conta c : listaContas) {
            c.deposito(10.0);
        }

        for(Conta c : listaContas) {
            System.out.printf("#%d Saldo atualizado: %.2f\n", c.getNumero(), c.getSaldo());
        }

    }
}
