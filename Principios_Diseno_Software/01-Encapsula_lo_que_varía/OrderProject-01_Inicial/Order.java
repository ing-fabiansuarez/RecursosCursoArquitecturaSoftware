import java.util.List;

public class Order {
    private List<LineItem> lineItems;
    private String country;
    private String state;
    private String city;
    
    private TaxCalculator taxCalculator;
    
    public Order(List<LineItem> lineItems, String country) {
        this.lineItems = lineItems;
        this.country = country;
    }
   
    public double getOrderTotal() {

        double total = 0.0;

        for (LineItem item : lineItems) {

            double subtotal = item.getPrice() * item.getQuantity();

            double taxRate = taxCalculator.getTaxRate(
                    country,
                    state,
                    item.getProduct()
            );

            double tax = subtotal * taxRate;

            total += subtotal + tax;
        }

        return total;
    }
    
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public String getCountry() {
        return country;
    }
    
}
