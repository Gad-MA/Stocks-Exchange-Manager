package backend;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class OrdersDatabase implements Serializable{
    private static final long serialVersionUID = 1L;

    private static String filename = "orders.dat";
    private ArrayList<Stock> orders;
    private static OrdersDatabase obj = null;
    private StocksWalletsDatabase wallets = StocksWalletsDatabase.getInstance();

    private OrdersDatabase() {
        orders = loadOrders();
    }

    public static OrdersDatabase getInstance() {
        if (obj == null) {
            obj = new OrdersDatabase();
        }
        return obj;
    }

    @SuppressWarnings("unchecked")
    private ArrayList<Stock> loadOrders() {
        File file = new File(filename);
        if (!file.exists()) {
            return new ArrayList<>();
        }

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (ArrayList<Stock>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading orders: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public void saveOrders() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(orders);
        } catch (IOException e) {
            System.out.println("Error saving orders: " + e.getMessage());
        }
    }

    public ArrayList<Stock> getOrders() {
        return orders;
    }

    public void addOrder(Stock order) {
        orders.add(order);
    }

    public void printOrders() {
        for (Stock order : orders) {
            // to be implemented
            System.out.printf("Symbol %s, price %d, quantity %d", order.getSymbol(), order.getPrice(), order.getQuantity());
        }
    }

    public boolean placeSellingOrder(String symbol, String name, int quantity, String owner, double price) {
        StocksWallet wallet = wallets.getWallet(owner);
        if (wallet.sellStock(symbol, quantity)) {
            addOrder(new Stock(symbol, name, price, owner, quantity));
            return true;
        }
        return false;
    }
}
