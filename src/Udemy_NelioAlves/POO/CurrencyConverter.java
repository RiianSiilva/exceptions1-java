package Udemy_NelioAlves.POO;

public class CurrencyConverter {

    public static double valorAPagar(double valorUnitario, double valorTotal){
        double iof = valorUnitario * valorTotal * 0.06;
        return iof + valorUnitario * valorTotal;
    }

}
