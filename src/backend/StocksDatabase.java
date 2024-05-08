package backend;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class StocksDatabase implements Serializable {
    private static final long serialVersionUID = 1L;

    private Map<String, Stock> stocks;
    private String filename = "stocks.dat";
    private static StocksDatabase obj = null;

    private StocksDatabase() {
        this.stocks = loadStocks();
    }

    public static StocksDatabase getInstance(){
        if(obj==null){
            obj = new StocksDatabase();
            return obj;
        }
        return obj;
    }

    private Map<String, Stock> loadStocks() {
        File file = new File(filename);
        if (!file.exists()) {
            return new HashMap<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (Map<String, Stock>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading stocks: " + e.getMessage());
            return new HashMap<>();
        }
    }

    public void saveStocks() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(stocks);
        } catch (IOException e) {
            System.out.println("Error saving stocks: " + e.getMessage());
        }
    }

    public void addStock(String symbol, String name, double price) {
        stocks.put(symbol, new Stock(symbol, name, price));
        saveStocks();
    }

    public Stock getStock(String symbol) {
        return stocks.get(symbol);
    }

    public void printStocks() {
        System.out.println("Stocks Database:");
        for (Map.Entry<String, Stock> entry : stocks.entrySet()) {
            Stock stock = entry.getValue();
            System.out.println("Symbol: " + stock.getSymbol());
            System.out.println("Name: " + stock.getName());
            System.out.println("Price: " + stock.getPrice());
            System.out.println();
        }
    }
}