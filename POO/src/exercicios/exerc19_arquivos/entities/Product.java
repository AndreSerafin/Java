package exercicios.exerc19_arquivos.entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return getQuantity();
    }

    public Double totalValue() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
