package Udemy_NelioAlves.POO;

public class ProductTest {
    static void main(String[] args) {

        Product test = new Product("LG tv", 200, 10);
        test.AddProducts(5);
        test.RemoveProducts(15);
        System.out.println(test.getQuantity());
        System.out.println(test.TotalValueStock());

    }
}
