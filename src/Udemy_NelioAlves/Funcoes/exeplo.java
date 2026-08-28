package Udemy_NelioAlves.Funcoes;

import java.util.Scanner;


public class exeplo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maior = max(a,b,c);
        imprimir(maior);


    }

    public static int max(int x, int y, int z) {
        int maior;
        if (x > y && x > z) {
            maior = x;
        } else if (y > x && y > z) {
            maior = y;
        } else {
            maior = z;
        }
        return maior;

    }

    public static void imprimir(int valor){
        System.out.println("o maior valor: " + valor);
    }
}
