package Udemy_NelioAlves.EstruturaCondicional;

import java.util.Scanner;

public class exemplosElseIf {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int x = sc.nextInt();

        if (x >= 0){
            System.out.printf("Positivo %d", x);
        }else{
            System.out.printf("Negativo %d", x);
        }


    }
}
