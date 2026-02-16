public class TaxCalculator {

    public double getTaxRate(String country, String state, String product) {

        if ("US".equals(country)) {
            return getUSTax(state);
        } else if ("EU".equals(country)) {
            return getEUTax(country);
        } else if ("CN".equals(country)) {
            return getChineseTax(product);
        }

        return 0.0;
    }

    private double getUSTax(String state) {
        // Ejemplo simple
        if ("CA".equals(state)) {
            return 0.08;
        }
        return 0.07;
    }

    private double getEUTax(String country) {
        return 0.20;
    }

    private double getChineseTax(String product) {
        if ("electronics".equals(product)) {
            return 0.15;
        }
        return 0.10;
    }
}