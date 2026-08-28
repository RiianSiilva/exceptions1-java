package Udemy_NelioAlves.Composicao.Storage;


import java.util.ArrayList;
import java.util.List;

public class SalesPerson {
    private String name;
    private SalesLevel lavel;
    private Double baseSalary;

    private List<Sale> sales = new ArrayList<>();
    private Store store;

    public SalesPerson() {
    }

    public SalesPerson(String name, Store store, Double baseSalary, SalesLevel lavel) {
        this.name = name;
        this.store = store;
        this.baseSalary = baseSalary;
        this.lavel = lavel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public SalesLevel getLavel() {
        return lavel;
    }

    public void setLavel(SalesLevel lavel) {
        this.lavel = lavel;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void addSales(Sale sale){
        sales.add(sale);
    }


    public Double incone(int month, int year){
        double som = baseSalary;

        for (Sale s : sales){
            if (s.getDate().getMonthValue() == month && s.getDate().getYear() == year){
                som += s.commision();
            }
        }
        return som;
    }

}
