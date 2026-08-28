package Udemy_NelioAlves.TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {

        Metodo1();
        System.out.println("end of program");




    }

    public static void Metodo1(){
        System.out.println("***Metodo1 comeco***");
        Metodo2();
        System.out.println("***Metodo1 fim***");
    }

    public static void Metodo2(){
        System.out.println("***Metodo2 comeco***");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!");
            e.printStackTrace(); // rastrear o caminho, mostrando toda a chama de metodos que acarretou uma excecao
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("***Metodo2 fim***");
    }
}
