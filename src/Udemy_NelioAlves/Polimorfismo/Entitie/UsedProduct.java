package Udemy_NelioAlves.Polimorfismo.Entitie;

import Udemy_NelioAlves.Composicao.Part3.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product_Used_Imported {
    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return super.getName() + " (Used) $ " + super.getPrice() + " (Manufature date: " + manufactureDate.format(fm1) + ")";
    }
}
