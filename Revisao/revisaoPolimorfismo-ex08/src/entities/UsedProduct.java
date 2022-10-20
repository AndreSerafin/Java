package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private Date manufactureDate;

    public UsedProduct() {

    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    @Override
    public String priceTag() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return name.substring(0,1).toUpperCase() + name.substring(1) + " (usado) $ " + String.format("%.2f", price) + " (Data de manufatura: " + sdf.format(manufactureDate) + ")";
    }
}
