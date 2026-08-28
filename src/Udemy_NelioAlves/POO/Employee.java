package Udemy_NelioAlves.POO;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public Employee(String name, double grossSalary, double tax) {
        this.name = name;
        this.grossSalary = grossSalary;
        this.tax = tax;
    }

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        grossSalary += grossSalary * percentage / 100;


    }

    public String toString() {
        return "Name: " + name + " \nGroos salary: " + String.format("%.2f", grossSalary) + " \nTax: " + String.format("%.2f", tax);
    }


}
