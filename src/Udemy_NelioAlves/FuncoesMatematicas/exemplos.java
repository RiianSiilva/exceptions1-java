package Udemy_NelioAlves.FuncoesMatematicas;

import java.util.Locale;
import java.util.Scanner;

public class exemplos {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        int soma = a + b;
        System.out.println("soma: " + soma);


        double PI = 3.14159;
        double raio;
        raio = sc.nextDouble();
        double area = PI * (Math.pow(raio, 2));
        System.out.printf("A = %.4f%n", area);

        int valor1, valor2, valor3, valor4, resultado;
        valor1 = sc.nextInt();
        valor2 = sc.nextInt();
        valor3 = sc.nextInt();
        valor4 = sc.nextInt();

        resultado = (valor1 * valor2) - (valor3 * valor4);
        System.out.println("Diferença: " + resultado);


        int NumeroFuncionario;
        double NumeroDeHoras;
        double ValorDaHora;
        double salario;
        NumeroFuncionario = sc.nextInt();
        NumeroDeHoras = sc.nextDouble();
        ValorDaHora = sc.nextDouble();

        salario = NumeroDeHoras * ValorDaHora;

        System.out.printf("Number: %d%nSalary: %.2f", NumeroFuncionario, salario);
        sc.close();

    }
}
