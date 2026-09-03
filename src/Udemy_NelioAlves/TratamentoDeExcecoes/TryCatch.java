package Udemy_NelioAlves.TratamentoDeExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    static void main(String[] args) {
        // o bloco try (tentar) contem o codigo que representa a execucao normal
        // do trecho do codigo que pode acarretar em uma excecao

        // o bloco catch (capturar) contem o codigo a ser executado caso uma excecao ocorra
        // deve ser especificado o tipo da excecao a ser tratada (upcasting e permitido)

        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("invalid position!");
        } catch (InputMismatchException e) {
            System.out.println("Input error");
        }
        System.out.println("end of program");
    }
}
