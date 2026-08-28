package Udemy_NelioAlves.ExerciciosDeVetor;

import java.util.Locale;
import java.util.Scanner;

public class pessoaTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quandidade de Pessoas: ");
        int n = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[n];



        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("nome: ");
            String nome = sc.next();

            System.out.println("idade: ");
            int idade = sc.nextInt();

            System.out.println("altura: ");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoas(nome, idade, altura);

        }
        double soma = 0;
        int contador = 0;
        for (int i = 0; i < pessoas.length; i++){
            soma += pessoas[i].getAltura();
            if (pessoas[i].getIdade() < 16){
                contador++;
            }


        }

        double media = soma / pessoas.length;
        double porcentagem =  (contador * 100) / pessoas.length;
        System.out.printf("Media: %.2f" , media);
        System.out.println();
        System.out.println(porcentagem + "%");

        for (int i = 0; i < pessoas.length; i++){
            if (pessoas[i].getIdade() < 16){
                System.out.println(pessoas[i].getNome());
            }
        }
    }
}
