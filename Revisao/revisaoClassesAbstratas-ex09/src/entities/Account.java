package entities;

public abstract class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double ammount) {
        balance -= ammount + 5.0;
    }

    public void deposit(Double ammount) {
        balance += ammount;
    }
}

