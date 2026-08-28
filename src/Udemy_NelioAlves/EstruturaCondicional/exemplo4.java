package Udemy_NelioAlves.EstruturaCondicional;

import java.util.Scanner;

public class exemplo4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, quantidade;
        double valor = 0;
        id = sc.nextInt();
        quantidade = sc.nextInt();

        if (id == 1){
            valor = quantidade * 4.00;
            System.out.println("Cachorro quente");
            System.out.printf("Total %.2f%n", valor);
        } else if (id == 2) {
            valor = quantidade * 4.50;
            System.out.println("X salada");
            System.out.printf("Total %.2f%n", valor);
        } else if (id == 3) {
            valor = quantidade * 5.00;
            System.out.println("X bacon");
            System.out.printf("Total %.2f%n", valor);
        } else if (id == 4) {
            valor = quantidade * 2.00;
            System.out.println("Torrada simples");
            System.out.printf("Total %.2f%n", valor);
        } else if (id == 5) {
            valor = quantidade * 1.50;
            System.out.println("Refrigerante");
            System.out.printf("Total %.2f%n", valor);
        }
    }
}
