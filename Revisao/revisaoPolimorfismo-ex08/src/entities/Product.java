package entities;

public class Product {

    protected String name;
    protected Double price;


    public Product() {

    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String priceTag() {
        return name.substring(0,1).toUpperCase() + name.substring(1) + " R$ " + String.format("%.2f",price);
    }
}
