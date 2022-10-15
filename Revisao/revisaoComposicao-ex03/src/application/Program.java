package application;

import entities.OrderItem;
import entities.Product;

public class Program {
    public static void main(String[] args) {
        OrderItem orderItem = new OrderItem(12, new Product("Tv",3000.5));

        System.out.println(orderItem);

    }
}
