package Udemy_NelioAlves.TratamentoDeExcecoes.Exemplo.model.Entities;

import Udemy_NelioAlves.TratamentoDeExcecoes.Exemplo.model.Exeptions.DomainExeptions;

public class Account extends Exception {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) throws DomainExeptions {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void deposit(Double amount){
        balance += amount;
    }

    public void withDraw(Double amount) throws DomainExeptions{
        if (amount > withdrawLimit){
            throw new DomainExeptions("voce nao pode sacar alem do seu limit.");
        }else if (amount > balance){
            throw new DomainExeptions("voce nao pode sacar mais dinheiro do que ja tem.");
        }
        balance -= amount;
    }


}
