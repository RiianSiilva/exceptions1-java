package Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Program;

import Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Entities.Account;
import Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Entities.BusnessAccount;
import Udemy_NelioAlves.UpcastingAndDowncastingAndOverrrideAndFinal.Entities.SavingsAcount;

public class ProgramOVERRIDE {
    static void main(String[] args) {
        Account acc = new Account(1,"rian", 500.0);
        SavingsAcount sav = new SavingsAcount(2, "test", 500.0,0.01);
        BusnessAccount bus = new BusnessAccount(3, "Matue", 500.0, 100.0);


        acc.withdraw(100.0);
        System.out.println(acc.getBalance());

        sav.withdraw(100.0);
        System.out.println(sav.getBalance());

        bus.withdraw(100.0);
        System.out.println(bus.getBalance());
    }
}
