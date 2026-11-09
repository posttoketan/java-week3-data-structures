import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, Double> stockPrices = new HashMap<>();

        stockPrices.put("Apple", 180.50);
        stockPrices.put("Google", 140.25);
        stockPrices.put("Microsoft", 420.75);

        System.out.println("Stock Prices:");

        for (Map.Entry<String, Double> entry : stockPrices.entrySet()) {
            System.out.println(entry.getKey() + ": $" + entry.getValue());
        }

        System.out.println("Apple Stock Price: $" + stockPrices.get("Apple"));
    }
}
