package Udemy_NelioAlves.EntradaESaidaDeDados;

import java.util.Locale;

public class ExerciciSaidaDeDados {
    public static void main(String[] args){
        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 54.5345;

        System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%nRecord: %d years old, code %d and gender: %s", product1, price1, product2, price2, age, code, gender);
        Locale.setDefault(Locale.US);
        System.out.printf("Measue with eight decimal palces: %.4f%n", measure);

        


    }
}
