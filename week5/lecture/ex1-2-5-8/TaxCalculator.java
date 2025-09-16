import java.util.ArrayList;

public class TaxCalculator {
    public static double calculateTotalPayableTax(ArrayList<TaxableProduct> products) {
        double totalTax = 0.0;
        for (TaxableProduct product : products) {
            totalTax += product.computeTax();
        }
        return totalTax;
    }
}
