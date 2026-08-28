package Udemy_NelioAlves.EntradaESaidaDeDados;

import java.util.Locale;

public class SaidaDeDados {
    public static void main(String[] args){

        int y = 32;
        double x = 2.32325431;
        System.out.println(y);
        System.out.println("Bom dia!!");
        System.out.println();

        // printf para formatação
        System.out.println(x);
        System.out.printf("%.2f%n", x); // printF para formatação == %.2f para duas casas dps da vírgula
        System.out.printf("%.4f%n", x); // %n para quebrar linha

        System.out.println();
        Locale.setDefault(Locale.US); // isso define a localidade do programa, nesse caso tiramos a vírgula para add o ponto
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println();
        System.out.printf("Duas casas decimais %.2f%nQuatro casas decimais %.4f%n", x, x);

        // Marcadores de Varíaveis == %f == ponto flutuante %s == String/texto %d == inteiro/numero %n == quebra linha
        String nome = "Maria";
        int idade = 31;
        double salario = 4000.0;
        System.out.printf("%s tem %d anos e recebe %.0f Reais%n", nome, idade, salario);

    }
}
