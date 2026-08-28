package Udemy_NelioAlves.POO;

import java.util.Locale;
import java.util.Scanner;

public class TestEmployee {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee("Rian Silva", 6000, 1000);
        System.out.println(employee.toString());
        System.out.println();
        System.out.println("Employee : " + employee.name + ", $ " + employee.NetSalary());
        System.out.println("whitch percentage to increase salary? ");
        int porcentage = sc.nextInt();
        employee.IncreaseSalary(porcentage);
        System.out.println("Employee : " + employee.name + ", $ " + employee.NetSalary());

    }
}
