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

    public void buyStock(String symbol, int quantity) {
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

    public boolean sellStock(String symbol, int quantity) {
        if (stocksOwned.containsKey(symbol)) {
            int existingQuantity = stocksOwned.get(symbol);
            if (existingQuantity >= quantity) {
                stocksOwned.put(symbol, existingQuantity - quantity);
                return true;
            } else {
                System.out.println("Not enough stocks to sell");
                return false;
            }
        } else {
            System.out.println("You don't have this stock in your stocks wallet");
            return false;
        }

    }

    public void removeStock(String symbol) {
        stocksOwned.remove(symbol);
    }

    public Map<String, Integer> getStocksOwned() {
        return stocksOwned;
    }

}