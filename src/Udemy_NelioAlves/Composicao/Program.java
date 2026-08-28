package Udemy_NelioAlves.Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Program {
    static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        System.out.println("Enter department`s name: ");
        String department = sc.nextLine();

        System.out.println("Enter worker date:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Level: ");
        String workLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();


        Worker worker = new Worker(name, WorkerLevel.valueOf(workLevel), baseSalary, new Department(department));
        System.out.println("How many contracts to this worker? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Enter conntract #" + i + " date:");
            System.out.print("Date: ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("value per hour: ");
            double valuePerHour = sc.nextInt();
            System.out.print("Hour: ");
            int hour = sc.nextInt();
            HourContract hourContract = new HourContract(contractDate, valuePerHour, hour);
            worker.addContract(hourContract);
        }
        System.out.println();
        System.out.println("Enter month and year to  calculete income (MM/YYYY):");
        String monthandYear = sc.next();
        int month = Integer.parseInt(monthandYear.substring(0,2));
        int year = Integer.parseInt(monthandYear.substring(3));
        System.out.println("name: "  + worker.getName());
        System.out.println("departement: " + worker.getDepartment().getName());
        System.out.println("income for: " + monthandYear + ": " + worker.inCome(year, month));


    }
}
