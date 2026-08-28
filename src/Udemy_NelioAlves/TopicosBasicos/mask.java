package Udemy_NelioAlves.TopicosBasicos;

import java.util.Scanner;

public class mask {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  esse programa é uma mascará de rede, onde podemos identificar o valor do 6th bit, podemos adaptar para outros bits
        //  utilzamos os operadores bitwise

        //  & bit a bit só é verdadeiro quando ambos são verdadeiro true == 1
        //  | bit a bi só é verdadeiro quando pelemenos um é verdadeiro
        //  ^ apenas quando um é verdadeiro true & true == false, true & false == true

        int mask = 0b100000; // 0b para indicar a entrada do numro binario, o java aceita == 32
        int n = sc.nextInt();
        if ((n & mask) != 0){
            System.out.println("6th bit is true");
        }else {
            System.out.println("6th bit in false");
        }
    }
}
