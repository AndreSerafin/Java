package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Order order1 = new Order(new Date(), OrderStatus.valueOf("Processing".toUpperCase()),new Client("Andre Pereira", "andre@gmail.com", sdf.parse("23/04/2000")));
        order1.addItem(new OrderItem(3,new Product("TV",3000.0)));
        order1.addItem(new OrderItem(1,new Product("Cell",2000.0)));
        order1.addItem(new OrderItem(2,new Product("Xbox",3600.0)));
        order1.addItem(new OrderItem(1,new Product("Pc",9000.0)));

        System.out.println(order1);

        Order order2 = new Order(new Date(), OrderStatus.valueOf("delivered".toUpperCase()),new Client("Alex Green", "alexgreen@gmail.com", sdf.parse("15/03/1985")));
        order2.addItem(new OrderItem(1,new Product("TV",1000.0)));
        order2.addItem(new OrderItem(2,new Product("Mouse",40.0)));

        System.out.println(order2);


    }
}
