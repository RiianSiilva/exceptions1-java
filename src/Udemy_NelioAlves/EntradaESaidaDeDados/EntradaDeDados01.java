package Udemy_NelioAlves.EntradaESaidaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados01 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o seu nome ? ");
        String x = sc.next();
        System.out.println(x);

        System.out.println("qual a sua idade? ");
        int id = sc.nextInt();
        System.out.println(id);

        System.out.println("sua altura ? ");
        double al = sc.nextDouble();
        System.out.println(al);

        System.out.println("Sexualidade ? ");
        char ch = sc.next().charAt(0);
        System.out.println(ch);

        sc.close();
    }
}
