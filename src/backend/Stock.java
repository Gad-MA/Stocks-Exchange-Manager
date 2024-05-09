package backend;

import java.io.*;

public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;

    private String symbol;
    private String name;
    private double price;
    private String owner;
    private int quantity;


    public Stock(String symbol, String name, double price, String owner, int quantity) {
        this.symbol = symbol;
        this.name = name;
        this.price = price;
        this.owner = owner;
        this.quantity = quantity;
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

    public void setOwner(String newOwner) {
        owner = newOwner;
    }

    public String getOwner() {
        return owner;
    }

    public double getQuantity() {
        return quantity;
    }
}