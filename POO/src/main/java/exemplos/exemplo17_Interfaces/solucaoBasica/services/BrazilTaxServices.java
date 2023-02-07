package exemplos.exemplo17_Interfaces.solucaoBasica.services;

public class BrazilTaxServices {

    public Double tax(Double amount) {
        if(amount <= 100.0) {
            return amount * 0.2;
        }
        return amount * 0.15;
    }
}
