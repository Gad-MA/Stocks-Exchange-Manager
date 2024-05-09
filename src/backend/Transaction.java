package backend;

import java.io.Serializable;

public class Transaction implements Serializable {
    private static final long serialVersionUID = 1L;

    private String oldOwner;
    private String newOwner;
    private String stockSymbol;
    private int quantity;

    public Transaction(String oldOwner, String newOwner, String stockSymbol, int quantity) {
        this.oldOwner = oldOwner;
        this.newOwner = newOwner;
        this.stockSymbol = stockSymbol;
        this.quantity = quantity;
    }

    public String getOldOwner() {
        return oldOwner;
    }

    public String getNewOwner() {
        return newOwner;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public int getQuantity() {
        return quantity;
    }

    
}
