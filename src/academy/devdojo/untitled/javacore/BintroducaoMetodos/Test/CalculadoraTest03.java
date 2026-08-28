package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20, 12);

        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros2(20, 0));
        calculadora.dividirDois(20, 0);
    }
}
