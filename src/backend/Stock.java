package backend;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private String symbol;
    private String name;
    private double price;

    public Stock(String symbol, String name, double price) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}