package Udemy_NelioAlves.EntradaESaidaDeDados;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDado02 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String s1, s2, s3;
        x = sc.nextInt();
        sc.nextLine(); // para consumir o vazio
        s1 = sc.nextLine(); // ao inves de colocar tudo na mesma linha, colocamos o nextLine para adicionar os valores
        s2 = sc.nextLine(); // ao quebrar as linhas no terminal
        s3 = sc.nextLine();

        System.out.println("Valores digitados: ");
        System.out.println(x);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
