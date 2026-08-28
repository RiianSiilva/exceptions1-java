package Udemy_NelioAlves.POO;

public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double TotalValueStock() {

        return price * quantity;

    }

    public void AddProducts(int quantity) {

        this.quantity += quantity;

    }

    public void RemoveProducts(int quantity) {

        this.quantity -= quantity;

    }

    public void setNome(String nome) {
        this.name = nome;
    }

    public String getNome() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity(){
        return quantity;
    }

    public String Tostring(){
        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total: $ "
                + String.format("%.2f",TotalValueStock());
    }

}
