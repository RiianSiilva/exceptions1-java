package Udemy_NelioAlves.ExerciciosDeVetor;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class pensionamentoTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionamento[] quartos = new Pensionamento[10];

        System.out.println("quantidade de estudantes:");
        int n = sc.nextInt();


        int posicaoDoquarto = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("estudante " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.next();

            System.out.print("Email: ");
            String email = sc.next();

            System.out.print("quarto: ");
            posicaoDoquarto = sc.nextInt();

            quartos[posicaoDoquarto] = new Pensionamento(nome,email);
        }

        for (int i = 0; i < quartos.length; i ++){
            if (quartos[i] != null){
            System.out.println( i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());}
        }




    }
}
