package Udemy_NelioAlves.POO;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterTest {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("what is the dollar price? ");
        double DollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought?");
        double DollarQuantity = sc.nextDouble();
        System.out.println(CurrencyConverter.valorAPagar(DollarPrice, DollarQuantity));
    }
}
