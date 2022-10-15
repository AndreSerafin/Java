package entities;

public class OrderItem {

    private Integer quantity;
    private Product product;

    public OrderItem() {

    }

    public OrderItem(Integer quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Product getProduct() {
        return product;
    }

    public Double subTotal(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return product
                + "Sub Total: " + String.format("%.2f",subTotal()) + "\n";
    }
}
