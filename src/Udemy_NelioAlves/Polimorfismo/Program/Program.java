package Udemy_NelioAlves.Polimorfismo.Program;

import Udemy_NelioAlves.Polimorfismo.Entitie.Employee;
import Udemy_NelioAlves.Polimorfismo.Entitie.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Funcionario #" + (i + 1));

            System.out.print("Funcionario tercerizado? (s/n): ");
            Character ch = sc.next().charAt(0);

            System.out.print("Nome do funcionario: ");
            String name = sc.next();

            System.out.print("Horas trabalhadas: ");
            Integer hours = sc.nextInt();

            System.out.print("Valor por hora: ");
            Double valuePorHours = sc.nextDouble();

            Double adicional = 0.0;
            if (ch.equals('s')) {
                System.out.print("Digite o valor adicional: ");
                adicional = sc.nextDouble();
            }

            System.out.println();

            if (ch.equals('n')){
                Employee employee = new Employee(name, hours, valuePorHours);
                employees.add(employee);
            }else {
                Employee employee = new OutsourcedEmployee(name, hours, valuePorHours,adicional);
                employees.add(employee);
            }

        }

        System.out.println();
        System.out.println("PAYMENTS");

        for (Employee employee : employees){
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

    }

}
