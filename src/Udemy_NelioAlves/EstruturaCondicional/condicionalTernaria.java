package Udemy_NelioAlves.EstruturaCondicional;

import java.util.Scanner;

public class condicionalTernaria {
    static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        // Uma estrutura opcional ao If-else quando se deseja decidir um VALOR com base em uma condição
        // sintaxe: (condicao) ? valor_se_verdadeiro : valor_se_falso

        double preco = 35.50;
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);

    }
}
