package Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Program;

import Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Entities.Account;
import Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Entities.BusnessAccount;
import Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Entities.SavingsAcount;

public class program {
    static void main(String[] args) {
        Account acc = new Account(1001, "Alex", 0.0 );
        BusnessAccount bacc = new BusnessAccount(1002,"Maria", 0.0, 500.0 );

        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusnessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAcount(1004, "Anna", 0.0, 0.01);

        // DOWNCASTING
        BusnessAccount acc4 = (BusnessAccount) acc2;
        acc4.loan(100.0);

        //BusnessAccount acc5 = (BusnessAccount) acc3;
        if(acc3 instanceof  BusnessAccount){ // o que estiver no obj acc3 for uma instância de BusnessAccount
            BusnessAccount acc5 = (BusnessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!!");
        }

        if (acc3 instanceof SavingsAcount){
            SavingsAcount acc5 = (SavingsAcount) acc3;
            acc5.updateBalance();
            System.out.println("Update! ");
        }
    }
}
