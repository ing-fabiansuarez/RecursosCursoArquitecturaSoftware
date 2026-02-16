import java.util.List;

public class Order {
    private List<LineItem> lineItems;
    private String country;

    public Order(List<LineItem> lineItems, String country) {
        this.lineItems = lineItems;
        this.country = country;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public String getCountry() {
        return country;
    }
}
