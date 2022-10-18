package entities;

public class SavingsAccount extends Account {

    private Double interestRate;

    SavingsAccount() {

    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double ammount) {
        balance -= ammount;
    }
}
