package Udemy_NelioAlves.EstruturasRepetitivas;

import java.util.Scanner;

public class exemplo02 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int Alcool = 0;
        int Gasolina = 0;
        int Diesl = 0;

        while (x != 4) {


            if (x == 1) {
                Alcool += 1;
            } else if (x == 2) {
                Gasolina += 1;
            } else if (x == 3) {
                Diesl += 1;
            }
            x = sc.nextInt();

        }
        System.out.println("Alcool = " + Alcool );
        System.out.println("Gasolina = " + Gasolina );
        System.out.println("Diesel = " + Diesl );
        System.out.printf("Obrigado");
    }
}
