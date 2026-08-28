package Udemy_NelioAlves.POO;

import academy.devdojo.untitled.javacore.Hceminario.Domonio.Local;

import java.util.Locale;
import java.util.Scanner;

public class TestRectangle {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle(3,4);
        System.out.println(rectangle.ToString());


    }
}
