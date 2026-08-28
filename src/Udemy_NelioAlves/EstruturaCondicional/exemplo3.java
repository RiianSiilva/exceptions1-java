package Udemy_NelioAlves.EstruturaCondicional;

import java.util.Scanner;

public class exemplo3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        if (x % y == 0 || y % x == 0){
            System.out.println("sao multiplos");
        }else {
            System.out.println("N sao multiplos");
        }


    }
}
