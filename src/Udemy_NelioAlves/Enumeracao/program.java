package Udemy_NelioAlves.Enumeracao;

import java.util.Date;

public class program {
    static void main(String[] args) {


        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order.toString());

        OrderStatus sd1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); // valueOF serve para pegar oq o usuario digita uma String, e tranforma-lo em um enum

        System.out.println(sd1);
        System.out.println(os2);
    }
}
