package Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Entities;


public class BusnessAccount extends Account {
    private  Double loanLimit;

    public BusnessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <= loanLimit) balance += amount - 10.0;
    }

    @Override
    public void withdraw(Double amount) {
        super.withdraw(amount);
            balance -= 2.0;
    }
}
