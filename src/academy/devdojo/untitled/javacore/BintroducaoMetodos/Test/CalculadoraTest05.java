package academy.devdojo.untitled.javacore.BintroducaoMetodos.Test;

import academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int[] num = {1, 2, 3, 4, 5};
        calculadora.somaArray(num); //calculadora.somaArray(new int[]{1,2,3,4,5}); tbm funciona dessa maneira
        calculadora.VarArgs(1,2); // calculadora.VarArgs(1,2,3,4,5,6,7) grande vantagem

    }
}
