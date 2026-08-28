package Udemy_NelioAlves.EstruturasRepetitivas;

import java.util.Scanner;

public class EnquantoWhile {
    static void main(String[] args) {
        // é uma estrutura de controle que repete um bloco de comandos enquanto uma codição for verdadeira.
        // quando usar: quando ñ se sabe previamente a quantidade de repetições que será realizada

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int caixa = 0;
        while (0 < x){
            caixa = x + caixa;
            x = sc.nextInt();
        }

        System.out.println("Resultado: " + caixa);
    }
}
