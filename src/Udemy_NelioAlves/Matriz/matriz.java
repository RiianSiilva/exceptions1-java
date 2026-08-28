package Udemy_NelioAlves.Matriz;

import java.util.Locale;
import java.util.Scanner;

public class matriz {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int imput =sc.nextInt();
        int[][] numeros = new int[imput][imput];


        for (int i = 0; i < numeros.length; i++){

            for (int j = 0; j < numeros[i].length; j++ ){
                numeros[i][j] = sc.nextInt();
            }
        }

        System.out.print("Main diagonal = ");
        for (int i = 0; i < imput; i++){
            System.out.print(" " + numeros[i][i]);
        }

        System.out.println();
        System.out.print("Negative numbers = ");
        for (int i = 0; i < numeros.length; i++){

            for (int j = 0; j < numeros[i].length; j++ ){
                if (numeros[i][j] < 0){
                System.out.print(" " + numeros[i][j]);}
            }

        }

    }
}
