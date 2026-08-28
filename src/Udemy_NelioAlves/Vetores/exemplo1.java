package Udemy_NelioAlves.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exemplo1 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n ; i++){
            vect[i] = sc.nextDouble();
        }

        double som = 0.0;
        for (int i = 0; i < n; i++){
            som += vect[i];
        }
        double media = som / n;
        System.out.printf("media %.2f%n", media);

    }
}
