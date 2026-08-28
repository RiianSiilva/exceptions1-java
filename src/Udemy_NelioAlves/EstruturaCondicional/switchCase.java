package Udemy_NelioAlves.EstruturaCondicional;

import java.util.Scanner;

public class switchCase {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dia;
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }

        System.out.println("dia da semana " + dia);
    }
}
