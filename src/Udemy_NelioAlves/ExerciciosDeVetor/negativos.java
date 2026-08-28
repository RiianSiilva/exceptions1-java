package Udemy_NelioAlves.ExerciciosDeVetor;

import java.util.Scanner;

public class negativos {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numeros= new int[n];

        for (int i = 0; i < numeros.length; i++){
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){
            if(numeros[i] < 0) System.out.println("Valores negativos : " + numeros[i]);
        }
    }
}
