package Udemy_NelioAlves.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exemplo5 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double entrada = sc.nextDouble();

        if (entrada >= 0 && entrada <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (entrada > 25 && entrada <= 50) {
            System.out.println("Intervalo [25,50]");
        } else if (entrada > 50 && entrada <= 75) {
            System.out.println("Intervalo [50,75]");
        } else {
            System.out.println("Fora dos Intervalos");
        }

    }
}
