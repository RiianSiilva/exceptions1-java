package Udemy_NelioAlves.Composicao.Storage;
import academy.devdojo.untitled.javacore.Hceminario.Domonio.Local;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class program {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Nome do colaborador: ");
        String name = sc.next();

        System.out.print("Salario Base: ");
        double baseSalary = sc.nextDouble();

        System.out.print("Loja de Atuação: ");
        String nameStorage = sc.next();

        System.out.print("modelo de contratação TRAINEE/CLT/LEADER: ");
        String salesLevel = sc.next();

        SalesPerson salesPerson = new SalesPerson(name, new Store(nameStorage), baseSalary, SalesLevel.valueOf(salesLevel));

        System.out.println();
        System.out.print("Numero de vendas: ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++){
            System.out.println("Venda " + (i + 1) + "#");
            System.out.print("Digite uma data dd/MM/yyyy: ");
            String data = sc.next();

            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(data, dtf);

            System.out.print("Nome do produto: ");
            String product = sc.next();

            System.out.print("Valor total de vendas: ");
            double amountQuantia = sc.nextDouble();

            System.out.print("Comissao do vendedor: ");
            double comminsionRateTaxaDeComissao = sc.nextDouble();

            Sale sale = new Sale(localDate, product, amountQuantia, comminsionRateTaxaDeComissao);
            salesPerson.addSales(sale);
            System.out.println();

        }

        System.out.print("Digite um mes (numero): ");
        int month = sc.nextInt();
        System.out.print("Digite um ano: ");
        int year = sc.nextInt();
        System.out.println("Salario base + comissoes: " + salesPerson.incone(month, year));

    }
}
