package Udemy_NelioAlves.ExerciciosDeVetor;

import java.util.Locale;
import java.util.Scanner;

public class somaDeVetores {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] numeros = new double[n];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = sc.nextDouble();
        }

        double soma = 0;
        double media = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
            soma += numeros[i];
        }

        media = soma / numeros.length;
        System.out.println();
        System.out.println("Soma : " + soma);
        System.out.println("Media : " + media);
    }
}
