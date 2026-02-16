public class LineItem {
    private double price;
    private int quantity;
    private String product;

    public LineItem(double price, int quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public String getProduct() {
        return product;
    }
}
