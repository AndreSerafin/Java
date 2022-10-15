package entities;

import entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private Date moment;
    private OrderStatus status;

    private ArrayList<OrderItem> items = new ArrayList<>();
    private Client client;

    public Order() {

    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public Client getClient() {
        return client;
    }

    public void addItem(OrderItem item){
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }


}
