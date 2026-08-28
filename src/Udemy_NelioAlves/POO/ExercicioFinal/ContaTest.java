package Udemy_NelioAlves.POO.ExercicioFinal;

import java.util.Locale;
import java.util.Scanner;

public class ContaTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        int numeroDaConta = sc.nextInt();

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        double quantidadeDeDinheiro = 0;
        System.out.println("Quer adicionar um deposito inicial ? (s/n)");
        String SimOuNao = sc.next();
        if (SimOuNao.equals("s")) {
            System.out.println("Digite o valor para deposito");
            quantidadeDeDinheiro = sc.nextDouble();
        }

        Conta conta = new Conta(numeroDaConta, nome, quantidadeDeDinheiro);
        System.out.println(conta.toString());

        System.out.println();
        System.out.println("deposite um valor:");
        double deposito = sc.nextDouble();
        conta.deposito(deposito);
        System.out.println(conta.toString());

        System.out.println();
        System.out.println("tire um valor:");
        double sacar = sc.nextDouble();
        conta.saque(sacar);
        System.out.println(conta.toString());


    }
}
