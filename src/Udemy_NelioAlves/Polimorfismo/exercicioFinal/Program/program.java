package Udemy_NelioAlves.Polimorfismo.exercicioFinal.Program;

import Udemy_NelioAlves.Polimorfismo.exercicioFinal.Entitie.Company;
import Udemy_NelioAlves.Polimorfismo.exercicioFinal.Entitie.Individual;
import Udemy_NelioAlves.Polimorfismo.exercicioFinal.Entitie.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> taxPayers = new ArrayList<>();

        System.out.print("Enter the number of tax players: ");
        Integer n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Tax players #" + (i +1)  + " date");
            System.out.print("individual or company (i/c)? ");
            Character ic = sc.next().charAt(0);
            if (ic == 'i'){
                System.out.print("name: ");
                String name = sc.next();

                System.out.print("anual income: ");
                Double anualIncome = sc.nextDouble();

                System.out.print("health expenditures: ");
                Double healthexpenditures = sc.nextDouble();

                taxPayers.add(new Individual(name, anualIncome, healthexpenditures));
            }else {
                System.out.print("name: ");
                String name = sc.next();

                System.out.print("anual income: ");
                Double anualIncome = sc.nextDouble();

                System.out.print("number of employeers: ");
                Integer numberOfEmployeers = sc.nextInt();

                taxPayers.add(new Company(name, anualIncome, numberOfEmployeers));
            }
        }
        System.out.println();
        System.out.println("Taxes paid: ");
        double sum = 0.0;
        for (TaxPayer taxPayer : taxPayers){
            System.out.println(taxPayer.getName() + " $" + String.format( "%.2f",taxPayer.tax()));
            sum += taxPayer.tax();
        }
        System.out.println("total taxes: $" + sum);
    }
}
