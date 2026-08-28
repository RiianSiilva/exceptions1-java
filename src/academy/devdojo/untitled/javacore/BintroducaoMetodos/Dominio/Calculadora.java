package academy.devdojo.untitled.javacore.BintroducaoMetodos.Dominio;

import java.sql.SQLOutput;

public class Calculadora {
    // Metodo simples, sem paramatros, que realiza uma soma fixa e imprime o resultado
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }
    // metodo simples, sem parametro, que realiza uma subtracao fixa e imprime o resultado
    public void subtrairDoisNumeros() {
        System.out.println(11 - 10);
    }
    // metodo com parametro, que realiza uma multiiplicacao fixa e imprime o resultado
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    /**
     * metodo com retorno (double) que diivide dois numeros
     * possui uma verificacao para evitar uma divisao por zero
     * ou processamento com zero
     */
    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0 || num1 == 0) {
            return 0;
        }
        return num1 / num2;
    }
    // Mesma logica do metodo anterior, porem mostra a estrutura else explicitamente
    public double divideDoisNumeros2(double num1, double num2) {
        if (num2 == 0 || num1 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    /**
     *  metodo void com condicional
     *  que para a operacao de divisao se algum numero for ZERO
     */
    public void dividirDois(double num1, double num2) {
        if (num1 == 0 || num2 == 0) {
            System.out.println("PAROUUUUU!!!");
        }
        System.out.println(num1 / num2);
    }
    /**
     * Demonstração de Passagem por Valor:
     * As alterações em num1 e num2 aqui dentro NÃO afetam as variáveis originais fora do metodo.
     */
    public void alteraDoisNumeros(int num1, int num2) {

        num1 = 99;
        num2 = 33;
        System.out.println("dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
    // metodo que rece um array de inteiros e soma todos os seus elementos
    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int i : numeros) {
            soma += i;
        }
        System.out.println(soma);

    }

    /**
     * exemplo de Varargs (uma variavel de argumento)
     * permite passar varios numeros inteiros separados por virgula ou um array
     *
     */
    public void VarArgs(int... numero) {
        int soma = 0;
        for (int i : numero) {
            soma += i;
            System.out.println(i); // imprime cada numero passado
        }
        System.out.println(soma);
    }
}
