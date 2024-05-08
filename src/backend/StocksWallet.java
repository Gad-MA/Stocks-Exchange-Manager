package backend;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StocksWallet implements Serializable {
    private static final long serialVersionUID = 1L;

    private Map<String, Integer> stocksOwned;

    public StocksWallet() {
        this.stocksOwned = new HashMap<>();
    }

    public void addStock(String symbol, int quantity) {
        // Check if the stock already exists in the wallet
        if (stocksOwned.containsKey(symbol)) {
            // If it exists, update the quantity
            int existingQuantity = stocksOwned.get(symbol);
            stocksOwned.put(symbol, existingQuantity + quantity);
        } else {
            // If it doesn't exist, add a new entry
            stocksOwned.put(symbol, quantity);
        }
    }

    public void removeStock(String symbol) {
        stocksOwned.remove(symbol);
    }

    public Map<String, Integer> getStocksOwned() {
        return stocksOwned;
    }


}