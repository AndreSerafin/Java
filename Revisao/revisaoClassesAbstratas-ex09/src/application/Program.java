package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1001, "Alex", 500.0, 0.01));
        list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
        list.add(new SavingsAccount(1003, "Bob", 300.0, 0.01));
        list.add(new BusinessAccount(1004, "Anna", 500.0, 500.0));

        double soma = 0;
        for(Account acc : list) {
            soma += acc.getBalance();
        }
        System.out.printf("Saldo total: %.2f\n", soma);

        for(Account acc : list) {
            acc.deposit(10.0);
            System.out.printf("Saldo atualizado para conta %d: %.2f\n", acc.getNumber(), acc.getBalance());
        }
    }
}
