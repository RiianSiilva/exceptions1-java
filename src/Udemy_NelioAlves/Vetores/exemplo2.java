package Udemy_NelioAlves.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class exemplo2 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        classDoExemplo2[] product = new classDoExemplo2[n];

        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String nome = sc.next();
            double valor = sc.nextDouble();
            product[i] = new classDoExemplo2(nome, valor);

        }

        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += product[i].getValor();
        }
        double media = sum /n;
        System.out.printf("media %.2f%n", media);


        sc.close();
    }
}
