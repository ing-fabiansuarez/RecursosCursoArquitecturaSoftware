import java.util.List;

public class Order {
    private List<LineItem> lineItems;
    private String country;
    
    public Order(List<LineItem> lineItems, String country) {
        this.lineItems = lineItems;
        this.country = country;
    }
   
    public double getOrderTotal() {
        double total = 0.0;
        for (LineItem item : this.getLineItems()) {
            total += item.getPrice() * item.getQuantity();
        }
         // Se obtiene la tasa desde un método separado
        total += total * getTaxRate(this.getCountry());
        return total;
    }
    
     // Método separado para obtener la tasa de impuesto
    public double getTaxRate(String country) {

        if ("US".equals(country)) {
            return 0.07; // Impuesto sobre la venta de EUA
        } else if ("EU".equals(country)) {
            return 0.20; // IVA europeo
        } else {
            return 0.0;
        }
    }
    
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public String getCountry() {
        return country;
    }
    
}
