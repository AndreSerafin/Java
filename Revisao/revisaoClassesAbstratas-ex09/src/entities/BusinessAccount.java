package entities;

public class BusinessAccount extends Account {

    private Double loanLimit;

    public BusinessAccount() {

    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void loan(Double ammount) {
        if(ammount <= loanLimit)
            balance += ammount - 10;
    }

    @Override
    public void withdraw(Double ammount){
        super.withdraw(ammount);
        balance -= 2.0;
    }
}
