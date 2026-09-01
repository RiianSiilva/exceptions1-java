package Exemplo.application;

import Exemplo.model.Entities.Account;
import Exemplo.model.Exeptions.DomainExeptions;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class contaBancaria {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        try {
            System.out.println("Entre com os dados da conta");
            System.out.print("Numero da conta: ");
            int number = sc.nextInt();
            System.out.print("Nome: ");
            String holder = sc.next();
            System.out.print("Valor inicial: ");
            double balance = sc.nextDouble();
            System.out.print("Limite disponivel: ");
            double withdrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, balance, withdrawLimit );

            System.out.print("Entre com uma quantia para sacar: ");
            double amount = sc.nextDouble();
            account.withDraw(amount);
            System.out.println("Novo saldo: " + account.getBalance());

        } catch (DomainExeptions e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("erro enesperado " + e.getMessage());
        }


    }
}
