package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Order {

    private Date moment;
    private OrderStatus status;

    private ArrayList<OrderItem> items = new ArrayList<>();
    private Client client;

    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

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

    public Double total() {
        Double soma = 0.0;
        for(OrderItem x : items) {
            soma += x.subTotal();
        }
        return soma;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Order Summary: \n");
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append(client);
        for(OrderItem x : items) {
            sb.append(x);
        }
        sb.append("\nTotal price $" + String.format("%.2f",total()) +  "\n");
        return sb.toString();
    }
}
