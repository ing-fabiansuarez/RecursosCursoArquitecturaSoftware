import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear productos
        LineItem item1 = new LineItem(100.0, 2); // 200
        LineItem item2 = new LineItem(50.0, 1);  // 50

        List<LineItem> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);

        Order order = new Order(items, "US");
        // Llamar al método dentro de la misma clase
        double total = getOrderTotal(order);
        System.out.println("Total de la orden: $" + total);
    }
    // Método de lógica de negocio dentro del Main
    public static double getOrderTotal(Order order) {
        double total = 0.0;
        for (LineItem item : order.getLineItems()) {
            total += item.getPrice() * item.getQuantity();
        }
        if ("US".equals(order.getCountry())) {
            total += total * 0.07; // Impuesto USA
        } else if ("EU".equals(order.getCountry())) {
            total += total * 0.20; // IVA Europa
        }
        return total;
    }
}