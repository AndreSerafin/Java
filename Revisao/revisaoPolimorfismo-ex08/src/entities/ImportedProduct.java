package entities;

public class ImportedProduct extends Product {

    private Double customsFee;

    public ImportedProduct() {

    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return name.substring(0,1).toUpperCase() + name.substring(1) + " R$ " + String.format("%.2f", price + customsFee) + " (Taxa de Importação: R$ " + String.format("%.2f", customsFee) + ")";
    }
}
