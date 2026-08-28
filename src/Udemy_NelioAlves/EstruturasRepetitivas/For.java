package Udemy_NelioAlves.EstruturasRepetitivas;

import java.util.Scanner;

public class For {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = 0;
        for (int i = 0; i < x; i++) {
            y = sc.nextInt();
            soma += y;
        }
        System.out.println(soma);
    }
}
