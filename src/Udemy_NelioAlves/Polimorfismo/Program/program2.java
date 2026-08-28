package Udemy_NelioAlves.Polimorfismo.Program;

import Udemy_NelioAlves.Polimorfismo.Entitie.ImportedProduct;
import Udemy_NelioAlves.Polimorfismo.Entitie.Product_Used_Imported;
import Udemy_NelioAlves.Polimorfismo.Entitie.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class program2 {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product_Used_Imported> products = new ArrayList<>();
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number od products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Comon, used or imported (c/u/i)? ");
            char cui = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            if (cui == 'i') {
                System.out.print("Customs fee: ");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));

            } else if (cui == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();

                LocalDate date1 = LocalDate.parse(date, fm1);
                products.add(new UsedProduct(name, price, date1));
            } else {
                products.add(new Product_Used_Imported(name, price));
            }
        }

        System.out.println();
        System.out.println("PRICE TAG: ");
        for (Product_Used_Imported product : products){
            System.out.println(product.priceTag());
        }

    }

}
