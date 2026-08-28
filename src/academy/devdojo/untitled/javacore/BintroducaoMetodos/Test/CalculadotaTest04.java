package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadotaTest04 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int num1 = 1;
        int num2 = 2;
        // Fazendo Uma Copia
        calculadora.alteraDoisNumeros(num1, num2);
        System.out.println("dentro da calculadoraTest04");
        System.out.println("Num1: "+num1);
        System.out.println("Num2: "+num2);

    }
}
