package academy.devdojo.untitled.javacore.Gassociacao.Test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite o seu sexo: ");
        //next le apenas a primeira palavra, seu espaço ele ignora o resto
        //charAt(0) imaginamos uma palavra como vetor = rian == r posicao 0, i posicao 1, a posicao 2, n posicao 3
        // por isso definimos o 0, para pegar a primeira letra, pois é um um tipo char
        char sexo = sc.next().charAt(0);

        System.out.println("-----------------------");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Sexo: "+sexo);
    }
}
